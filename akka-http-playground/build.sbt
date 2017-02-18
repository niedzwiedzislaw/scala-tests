name := "Akka HTTP Playground"
version := "1.0"
scalaVersion := "2.12.1"

val akkaStreamsVersion = "2.4.16"
val scalazVersion = "7.2.8"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-http" % "10.0.1" ,
  "org.scalatest" %% "scalatest" % "3.0.0" % "test",
  "org.scalaz" %% "scalaz-core" % scalazVersion,
  "ch.qos.logback" % "logback-classic" % "1.1.8",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.5.0",
  "com.chuusai" %% "shapeless" % "2.3.2",
  "org.scalaj" %% "scalaj-http" % "2.3.0",
  "io.shaka" %% "naive-http" % "90",
  "org.asynchttpclient" % "async-http-client" % "2.0.29"
)

resolvers += "Tim Tennant's repo" at "http://dl.bintray.com/timt/repo/"