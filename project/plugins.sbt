logLevel := Level.Warn

resolvers ++= Seq(
  Resolver.bintrayIvyRepo("sbt", "sbt-plugin-releases"),
  Resolver.typesafeRepo("releases")
)

// The Play plugin
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.5.6")

// iHeart Radio swagger plugin
addSbtPlugin("com.iheart" % "sbt-play-swagger" % "0.5.1")

