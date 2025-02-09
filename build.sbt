name := "AuthorExtractor"

organization := "nl.tvogels"

version:= "2.0-SNAPSHOT"

scalaVersion := "2.11.6"

cancelable in Global := true
fork in run := true

libraryDependencies += "org.scalatest" % "scalatest_2.10" % "2.2.4" % "test"

libraryDependencies += "org.apache.spark" %% "spark-core" % "1.4.1"

libraryDependencies += "org.apache.spark" %% "spark-mllib" % "1.4.1"

libraryDependencies += "org.mongodb" %% "casbah" % "3.1.0"

excludeFilter in Runtime in unmanagedResources := "*.html" || "*.csv"
//javaOptions in Universal ++= Seq("-J-Xms512M", "-J-Xmx6g",  "-Xss2M", "-J-XX:MaxMetaspaceSize=1024M")

