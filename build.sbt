import sbt._

val scalaV = "2.11.8"

val root = (project in file("."))
  .settings(
    organization := "github.xsistens",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := scalaV,
    scalacOptions ++= Seq("-deprecation", "-unchecked", "-feature",
      "-language:postfixOps", "-language:implicitConversions",
      "-language:higherKinds", "-language:existentials"),
    scalaJSUseRhino in Global := false,
    emitSourceMaps := false,
    artifactPath in (Compile, fullOptJS) := file("gh-pages/res/ghpages.js"),
    libraryDependencies ++= Seq(
      "org.scala-js" %%% "scalajs-dom" % "0.9.0"
    )
  )
  .enablePlugins(ScalaJSPlugin)