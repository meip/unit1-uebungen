name := "hsr-uint-skeleton"

version := "0.0.1"

organization := "ch.hsr.p1meier"

unmanagedBase <<= baseDirectory { base => base / "custom_lib" }


libraryDependencies ++= {
  Seq(
    "ch.qos.logback"    % "logback-classic"     % "1.0.6"
  )
}

