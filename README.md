# test_framework

Sample testing project on Java 8 with Gradle, TestNG, Allure, Lombok and Log4j integration

This is a sample project with 1 test that can be run with IDEA runner or by 
  /gradlew test
  
Allure integration allows to see test results in nice looking form

Before generating the report you need to download Allure. This can be done by
  /gradlew downloadAllure

After this '/gradlew allureServe' will generate a report and show it in your default browser and '/gradlew allureReport' will save this
report into your repository
