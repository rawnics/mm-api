# MM REST API Micro-Like-Service
------------------------------------------
- Name    : README for MM API
- Date    : 17/07/2017
- Owner   : Rahul
- Purpose : Summarize the modules & usage
------------------------------------------

### Pre-requisite
- A development environment setup with [Nexus & Maven](https://rahulvishwakarma.wordpress.com/2017/06/13/repository-management-with-nexus-3-for-your-mavenized-project-including-release-and-snapshot-distribution/) should be available at http://localhost:8081/repository
- Mysql Database [Development Setup](https://rahulvishwakarma.wordpress.com/2015/01/19/want-to-setup-your-own-xampp-installation-in-a-local-development-vm-here-are-the-simple-steps-to-do-so/)
- Its optional to go with a full fledged [Jenkins environment](https://rahulvishwakarma.wordpress.com/2017/06/12/continuous-integration-development-environment-with-jenkins-pipeline-jacoco-and-sonarqube/)
- Setup Java JDK 1.8 with JAVA_HOME environment variable configured in your PATH
- Setup Apache Maven and have MAVEN_HOME environment variable configured in your PATH
- Network access to the MySQL and MongoDB servers

### Organization
- MM is a multi-module project with mm-controller having the tests and main entry-point
- mm-controller is the Spring Boot Application that contains the REST interfaces and is bundled as a WAR with its dependencies
- *-service are the service sub-modules for the application bundled as a JAR dependency
- *-domain are the repository sub-modules for the application bundled as a JAR dependency
- *-config sub-module contains the application and database java configuration
- *-tools sub-module contains the various application-wide utilities


### Configuration
- Properties in the [mm-controller/src/main/resources](mm-controller/src/main/resources) folder. The active.profile properties in this file determine which other application-{active.profile}.properties file it loads.
- Edit datasource in the config folder. application-{active.profile}.properties contains the database connection information
- Edit logger config in the log4j2-spring.xml 

### Test
- `mvn install` (Build all sub modules and run unit tests)

### Report
Surefire report plugin is used to export the tests into HTML format in targets site folder
- $ `mvn site`
- $ `mvn surefire-report:report` 

An aggregated javadocs will be exported in the folder  ~/MM/target/site folder
- $ `mvn javadoc:javadoc`

### Build
- `mvn package -DskipTests` (and all other usage docs in this `README` apply).

### Run
- Change directory to the [mm-controller](mm-controller) folder
- Execute `mvn spring-boot:run`

### Actuator
Upon running the server successfully spring actuator configured on local port 8081 can be queried
```
- http://localhost:8081/info
- http://localhost:8081/health
- http://localhost:8081/metrics
- http://localhost:8081/env
- http://localhost:8081/mappings
- http://localhost:8081/dump
- http://localhost:8081/loggers
```

## How to update?
```
### Work with the AWNICS DEVELOP 

## Clone repo after forking it
git clone https://github.com/rawnics/mm-api

## Pull the upstream repository
git remote add upstream-awn https://github.com/AWNICS/mm-api.git
git pull upstream-awn master

## Start working with the develop branch with a pull-merge
git checkout -b develop
git pull upstream-awn develop

## Commit and push branches to your origin
git add .
git commit -m "Updated the code" --author="Rahul Vishwakarma <rahul@awnics.com>"
git push origin develop
git push origin master

## Create a pull request for AWNICS repo from your forked branch

```

### Collaboration Shortcuts
```
Development shortcut when you dont need merge

git pull origin develop & git add . & git commit -m "Updated the README" --author="Rahul Vishwakarma <rahul@awnics.com>" & git push origin develop

In case there is a versioning scheme then do not forget to tag and push it 
git tag -a v0.1 -m "SpringBoot JDBC v0.1"
git push origin --tags

In case you need to work n a particular tag then checkout that specifically
git show v0.1
git checkout -b version0.1 v0.1

```
