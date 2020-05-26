name := "dfdl-iso8583"
 
organization := "com.ibm"
 
version := "0.0.1-SNAPSHOT"
 
scalaVersion := "2.12.11"
 
libraryDependencies ++= Seq(
  "org.apache.daffodil" %% "daffodil-tdml-processor" % "2.6.0" % "test",
  "com.novocode" % "junit-interface" % "0.11" % "test",
  "junit" % "junit" % "4.12" % "test",
)

testOptions += Tests.Argument(TestFrameworks.JUnit, "-v")

crossPaths := false
