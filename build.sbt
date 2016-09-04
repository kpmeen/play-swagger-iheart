name := """play-swagger-iheart"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala, SwaggerPlugin)

scalaVersion := "2.11.8"

swaggerDomainNameSpaces := Seq("models.api")

resolvers += Resolver.jcenterRepo

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  "org.webjars" % "swagger-ui" % "2.2.0",
  "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.1" % Test
)

