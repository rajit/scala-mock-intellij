A simple, runnable project that uses ScalaTest, ScalaMock and sbt.

When this project is imported into IntelliJ, the `.expects()` on line 14 of
`service-test.scala` is highlighted in red indicating an error.  However `sbt run`
and `sbt test` execute fine and without errors or warnings.
