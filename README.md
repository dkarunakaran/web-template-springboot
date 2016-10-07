# Springboot Web Template
This is the template to get started on any web related project that involves spring boot. 
This contains standard libraries for building a site.

### Libraries included:

1) Spring boot

2) Hibernate

3) Apache Freemaker(Java template engine)

4) Bootstrap

5) jQuery

6) Font Awesome

7) Less

8) Grunt(to compile less and minify assets)

9) NPM(Node package manager it will install js realted dependencies)

10) AngularJS 2(Included as part of the npm package, but not used in this template. But you can use it when you develop your project. All the dependecies will be downloaded when you follow the below steps)

11) PostgreSQL connector(You may need to install PostgreSQL DB seperately as it is not part of the template and add the credentails in src/main/resources/application.properties)

### Steps to get started on the projects:

1) Import the spring boot project to IDE. Gradle is the package manger for java which will ensure all the dependencies are installed once you import the project.

2) Install Node.js globally if it is not yet installed
```
  Ref: https://nodejs.org/en/download/package-manager/#osx
```
3) Install grunt globally by running below command
```
npm install -g grunt-cli
```
4) Navigate to src/main/resources/static through terminal

5) Then run below command on terminal
```
sudo npm install
```
6) Then run grunt on terminal to compile less and minify css
```
grunt
```
7) Run the project using spring bootapp  

8) Running localhost:8080 on browser will give you a template website. 

##### Angular2 

If you are planning to use Angular2, then all the required files will be installed as part of above steps. Now, you need to follow instruction metioned in below site.

Ref: https://angular.io/docs/ts/latest/quickstart.html


#### Tested OS: MacOS
#### Compatible OS: MacOS, Linux, and Windows 


#### Developer: Dhanoop Karunakaran

