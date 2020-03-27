# autothon-trial
For Stockbit Login UI Automated Test

Environment Requirement :
1. java version "1.8.0_211"
2. Apache Maven 3.6.1
3. Intellij IDE 2019.3.3 or Latest Eclipse IDE (preffer IntelliJ, because I'm code in IntelliJ)
4. Chromedriver 80.0.3987.106 (don't forget to start chromedriver)
5. Browser Chrome version 80
6. Selenium 3.14.0 (will import automatically via internet connection when project loaded to IDE)
7. Internet Connection

How To Run :
1. Open Terminal / CMD
2. going to project folder
3. type "mvn clean verify"

or

How To Run via IDE :
1. Load project in IDE
2. Load / import maven dependency automatically
3. run via "play" button (jUnit runner) or type command via terminal window "mvn clean verify" 

Question : Where automation test report location ?
Answer : /target/site/serenity/index.html

Question : Where scenario / test case file location ?
Answer : /src/test/resources/features/consult_dictionary
