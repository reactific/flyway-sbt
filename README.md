
# [![Build Status](https://travis-ci.org/flyway/flyway-sbt.svg?branch=master)](https://travis-ci.org/davidmweber/flyway-sbt)

### Sbt 1.x plugin for [Flyway](https://flywaydb.org)

Welcome to the home for the `sbt` v1.x plugin for flyway. The [user manual](https://flywaydb.org/documentation/sbt/)
will tell you how to get started. This project is based on the original [flyway-sbt](https://github.com/flyway/flyway/tree/master/flyway-sbt) that is in the flyway repository.
The build procedure now uses `sbt` instead of `maven` and integrates testing into the build using `sbt`'s 
[testing framework](http://www.scala-sbt.org/1.x/docs/Testing-sbt-plugins.html). The test cases are pretty basic 
(hint: we need more of those). Unfortunately, there is no scripted test framework for sbt 0.13.x which makes cross 
building the plugin tricky. For now, we will rely on the [legacy plugin](https://github.com/flyway/flyway/tree/master/flyway-sbt).

Build and test the plugin using

```bash
sbt scripted
```

Early adopters should just publish a clone or fork of this repository locally:
```bash
git clone https://github.com/flyway/flyway-sbt.git
cd flyway-sbt
sbt publishLocal
```

Deployment is via Flyway's website (https://github.com/flyway/flywaydb.org). Build as above for early adopters and then:

```bash
./local-deploy.sh
```

This will copy the artefacts to the right place in the flywaydb.org repo. Commit flywaydb.org and make a pull request.

The plugin can also be obtained by adding the following to your `project/plugin.sbt` file:

```scala
resolvers += "Flyway" at "https://davidmweber.github.io/flyway-sbt.repo"

addSbtPlugin("org.flywaydb" % "flyway-sbt" % "4.2.0")
```

