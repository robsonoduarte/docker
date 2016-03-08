package br.com.mystudies.docker.scala



import org.scalatest.FlatSpec
import java.nio.channels.ServerSocketChannel
import java.net.InetSocketAddress
import org.scalatest.BeforeAndAfter
import org.scalatest.BeforeAndAfterAll
import org.scalatest.Matchers

class EchoSpec extends FlatSpec with Matchers{



   "A Echo" should "is a Runnable and connect using the http protocol" in {
	   val echo = Echo("http://httpstat.us")
	   echo shouldBe a [Runnable]
	   echo run
   }


   it should "communicator when any exeption occur to connection of echo" in {
     val echo = Echo("http://localhost:5000")
     echo run
    }



   it should "communicator when status code is diferent of 200 in echo " in {
			val echo = Echo("http://httpstat.us/500")
			echo run
   }


}










