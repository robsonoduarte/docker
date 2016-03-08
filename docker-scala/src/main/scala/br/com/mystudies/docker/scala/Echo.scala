package br.com.mystudies.docker.scala

import java.nio.channels.SocketChannel
import java.net.InetSocketAddress
import com.typesafe.scalalogging.Logger
import org.slf4j.LoggerFactory
import scalaj.http.Http

case class Echo(val host: String) extends Runnable{


  var logger = Logger(LoggerFactory.getLogger("Echo"))


  def run = {

     try {

    	 val response = Http(host) asString

    	 log

     } catch {
       case t: Throwable => logger error(s"ECHO IN WEB APP $host IS FAILURE -> ", t)
     }
  }





  private def log() = {
    logger info(s"Echo successful in the $host")
  }




  override def toString() = {
      s"Echo in $host"
  }


}
