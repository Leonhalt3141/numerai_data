ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

javaOptions += s"-Dconfig.file=${sourceDirectory.value}/main/resources/application.conf"

lazy val root = (project in file("."))
  .settings(
    name := "numerai_data",
    libraryDependencies ++= Seq(
      "com.typesafe" % "config" % "1.4.2"
    )
  )
