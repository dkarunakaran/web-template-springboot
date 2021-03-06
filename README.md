# Springboot Web Template
This is the template to get started on any web related project that involves spring boot. 
This contains standard libraries for building a site.

### Libraries included:

* Spring boot

* Hibernate

* Apache Freemaker(Java template engine)

* Bootstrap

* jQuery

* Font Awesome

* Less

* Grunt(to compile less and minify assets)

* NPM(Node package manager it will install js realted dependencies)

* AngularJS 2(Included as part of the npm package, but not used in this template. But you can use it when you develop your project. All the dependecies will be downloaded when you follow the below steps)

* PostgreSQL connector(You may need to install PostgreSQL DB seperately as it is not part of the template and add the credentails in src/main/resources/application.properties)

### Steps to get started on the projects:

* Import the spring boot project to IDE. Gradle is the package manger for java which will ensure all the dependencies are installed once you import the project.

* Install Node.js globally if it is not yet installed. You can use the reference link mentioned in NodeJS section to see how it can be done.

* Install grunt globally by running below command
```
npm install -g grunt-cli
```
* Navigate to src/main/resources/static through terminal

* Then run below command on terminal
```
sudo npm install
```
* Then run grunt on terminal to compile less and minify css
```
grunt
```
* Run the project using spring bootapp  

* Running localhost:8080 on browser will give you a template website. 

#### NodeJS

How to install NodeJS is explained in below URL.

Ref: https://nodejs.org/en/download/package-manager/#osx

#### Angular2 

If you are planning to use Angular2, then all the required files will be installed as part of above steps. You need to follow instruction metioned in below site.

Ref: https://angular.io/docs/ts/latest/quickstart.html

If you dont want to use Angualr2, then remove the angular reference from package.json and delete node_modules, systemjs.config.js, tsconfig.json, and typings.json and Run npm install again.

#### Freemaker and Spring boot  

The below url explains how to add Freemaker to Spring boot and create a template.

Ref: https://richardbarabe.wordpress.com/2009/03/19/freemarker-a-brief-example

#### Grunt

The below links describes about how can we use Grunt

Ref: http://ericnish.io/blog/compile-less-files-with-grunt

Ref: https://www.sitepoint.com/5-grunt-tasks-improve-performance-website

#### IDEs
Use Visual Studio Code IDE for TypeScript, JavaScript, Angular2(Froent-end framework), and CSS. Use STS or Eclipse for java files.

Ref: https://code.visualstudio.com

#### Tested OS: MacOS
#### Compatible OS: MacOS, Linux, and Windows 


#### Developer: Dhanoop Karunakaran

