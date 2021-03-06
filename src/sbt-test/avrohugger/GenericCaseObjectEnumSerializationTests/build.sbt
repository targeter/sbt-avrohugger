sourceGenerators in Compile += (avroScalaGenerate in Compile).taskValue

avroScalaCustomTypes in Compile := {
  avrohugger.format.Standard.defaultTypes.copy(
    enum = avrohugger.types.ScalaCaseObjectEnum)
}

organization := "com.julianpeeters"

name := "datatype-avro-serializaton-tests"

version := "0.4-SNAPSHOT"

crossScalaVersions := Seq("2.12.4", "2.13.1")

scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature", "-Ywarn-value-discard")

libraryDependencies += "com.sksamuel.avro4s" %% "avro4s-core" % "3.0.4"

libraryDependencies += "org.apache.avro" % "avro" % "1.9.1"

libraryDependencies += "org.specs2" %% "specs2-core" % "4.6.0" % Test
