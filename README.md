- Setup instructions
For Intelij IDE
Steps:
1.open your IDE and choose New >File > Project 
2. from Generators tab choose Maven Archetype
3. fill name of project in Name field
4. from Archetype press Add
5. fill Groupid, Artifactid, Version and press Add button
6. press create
7. in new created project press POM.xml
8. add dependencies for selenium java, selenium chrome driver, testng
9. in src > test > java press righ muse button New > Java Class
10 create class Login
11 create class UserCreation

- Technology stack overview
I used Java as programming language
For browser automation I used Selenium WebDriver
I used TestNG for testing framework to strucure my tests
For dependency management I used Maven
I used POM(Page Object Model) as design pattern to keep code clean and maintainable

- Test execution guide
When project been created(use Setup instruction)

In created class Login paste the source code from the public repository and execute it

In created class UserCreation paste the source code from the public repository and execute it

NOTE!! If you want to execute UserCreation test more than 1 time, you should change the username(in row 34) and email(in row 37) to new ones that were not used before. 
The username should be a minimum of 3 characters



  
