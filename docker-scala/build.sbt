lazy val root = (project in file(".")).settings(
  organization := "br.com.mystudies",
  name := "docker-scala",
  version := "0.1.0-SNAPSHOT",
  scalaVersion := "2.11.8",
  scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature"),
  libraryDependencies ++= Seq(
  	"org.scalaj"               %% "scalaj-http"         % "2.3.0",
	
  	"com.typesafe.scala-logging" %% "scala-logging_2.11" % "3.1.0",
  	"ch.qos.logback" %% "logback-classic" % "1.1.5"  	
  )
).settings()
