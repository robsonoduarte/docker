package br.com.mystudies.docker.gradle

import org.junit.runner.RunWith
import org.scalatest.FlatSpec
import org.scalatest.junit.JUnitRunner
import org.scalatest.Matchers


@RunWith(classOf[JUnitRunner])
class AppSpec extends FlatSpec with Matchers{



  "it" should "do something" in {
      val s = 3
      s should equal(3)
  }



}