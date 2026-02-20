val root = (project in file("."))
  .settings(
    name := "dfdl-iso8583",

    organization := "com.ibm",

    version := "0.0.1-SNAPSHOT"
  )
  .daffodilProject()
