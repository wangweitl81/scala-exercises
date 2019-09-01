// Comment to get more information during initialization
logLevel := Level.Debug

//resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"
resolvers += Resolver.typesafeIvyRepo("releases")

// The Typesafe repository
//resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

// Typesafe snapshots
//resolvers += "Typesafe Snapshots" at "https://repo.typesafe.com/typesafe/snapshots/"

resolvers += Resolver.sbtPluginRepo("releases")

// Use the Play sbt plugin for Play projects
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.5.18")