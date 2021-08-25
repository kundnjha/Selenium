- Surefire plugin is being used to run test cases from maven.

Cucumber-testng =
. We create runner class which extends AbsctractTestNGCucumberTest class and override method scenarios which return 2-dimentional array objects.
. Similarly Junit, testNG have cucumber Options annotations which is used to configure cucumber options.
. When we run test with mvn test command look for file with Test name and as it find file with test name it executes that file.
. Junit Runner file  is annotated with @RunWith Junit annotation.
When a class is annotated with <code>&#064;RunWith</code> or extends a class annotated
 * with <code>&#064;RunWith</code>, JUnit will invoke the class it references to run the
 * tests in that class instead of the runner built into Junit
. TestNG runner file extends AbsctractTestNGCucumberTest.
