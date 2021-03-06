organization := "org.flywaydb"

name := "flyway-sbt-test1"

libraryDependencies ++= Seq(
  "org.springframework" % "spring-jdbc" % "3.0.5.RELEASE",
  "org.hsqldb" % "hsqldb" % "2.2.8",
  "org.flywaydb" % "flyway-core" % "4.2.0"
)

flywayUrl := "jdbc:hsqldb:file:target/flyway_sample;shutdown=true"
flywayUser := "SA"
flywayLocations += "db/sbt"
flywayUrl in Test := "jdbc:hsqldb:file:target/flyway_sample;shutdown=true"
flywayUser in Test := "SA"
