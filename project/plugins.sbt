addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.7.3")
addSbtPlugin("org.foundweekends.giter8" % "sbt-giter8-scaffold" % "0.11.0")
// addSbtPlugin("com.sohoffice" %% "sbt-descriptive-play-swagger" % "0.7.5")
addSbtPlugin("com.iheart" %% "sbt-play-swagger" % "0.7.6")
// resolvers += Resolver.bintrayIvyRepo("sbt-plugins")
resolvers += Resolver.jcenterRepo
resolvers +=  Resolver.bintrayRepo("scalaz", "releases")
resolvers += "iheart-sbt-plugin-releases" at "https://dl.bintray.com/iheartradio/sbt-plugins"
