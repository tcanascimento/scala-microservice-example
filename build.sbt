// resolvers += Resolver.bintrayIvyRepo("sbt-plugins")
resolvers += Resolver.jcenterRepo
resolvers += Resolver.url("iheart-sbt-plugin-releases", url("https://dl.bintray.com/iheartradio/sbt-plugins"))
resolvers +=  Resolver.bintrayRepo("scalaz", "releases")

name := """example"""
organization := "tcanascimento"

version := "1.0-SNAPSHOT"

lazy val root = (project in file("."))
  .enablePlugins(PlayScala, SwaggerPlugin)
  .settings(
    // Make sure you set the swaggerDomainNameSpaces according to your package structure.
    // You'll need this setting, otherwise swagger will fail.
    //
    swaggerDomainNameSpaces := Seq("models")
  )

scalaVersion := "2.12.8"

libraryDependencies ++= Seq("com.iheart" %% "play-swagger" % "0.7.6",
  "org.webjars" % "swagger-ui" % "3.10.0",
  "org.scalatestplus.play" %% "scalatestplus-play" % "4.0.3" % Test,
  guice
)

// Adds additional packages into Twirl
// TwirlKeys.templateImports += "tcanascimento.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "tcanascimento.binders._"
