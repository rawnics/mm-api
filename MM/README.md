# MM REST API Micro-Like-Service

### Pre-requisite
- A development environment setup with [Nexus & Maven](https://rahulvishwakarma.wordpress.com/2017/06/13/repository-management-with-nexus-3-for-your-mavenized-project-including-release-and-snapshot-distribution/) should be available at http://localhost:8081/repository
- Mysql Database [Development Setup](https://rahulvishwakarma.wordpress.com/2015/01/19/want-to-setup-your-own-xampp-installation-in-a-local-development-vm-here-are-the-simple-steps-to-do-so/)
- Its optional to go with a full fledged [Jenkins environment](https://rahulvishwakarma.wordpress.com/2017/06/12/continuous-integration-development-environment-with-jenkins-pipeline-jacoco-and-sonarqube/)

### Configuration
- Properties in the [mm-controller/src/main/resources](mm-controller/src/main/resources) folder
- Edit datasource in the config folder
- Edit logger config in the log4j2-spring.xml 

### Test
- `mvn install` (Build all sub modules and run unit tests)

### Build
- `mvn package -DskipTests` (and all other usage docs in this `README` apply).

### Run
- Change directory to the [mm-controller](mm-controller) folder
- Execute `mvn spring-boot:run`



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