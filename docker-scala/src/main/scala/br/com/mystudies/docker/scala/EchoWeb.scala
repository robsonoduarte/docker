package br.com.mystudies.docker.scala

import java.nio.channels.SocketChannel

import java.net.InetSocketAddress
import java.net.ConnectException
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit._


object EchoWeb extends App {

     val ex  = Executors.newScheduledThreadPool(1)

     ex scheduleAtFixedRate(Echo("http://httpstat.us") , 0L, 10L, SECONDS)

}