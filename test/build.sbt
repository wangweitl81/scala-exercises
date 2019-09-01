name:="hello-world"
organization:="com.xiaomi.ai"
version:="0.1-SNAPSHOT"
scalaVersion:="2.11.0"

libraryDependencies ++= Seq(
  jdbc,
  cache
)

lazy val root = (project in file(".")).enablePlugins(PlayScala)

