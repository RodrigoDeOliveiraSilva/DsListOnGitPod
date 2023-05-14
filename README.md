# Ds List On GitPod
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/RodrigoDeOliveiraSilva/DsListOnGitPod/blob/main/LICENSE) 


# About the project
REST API, with MVC, JPA, DTO, Docker, CORS config Spring in DevSuperior intensive Java Spring week.

## Domain Model DSList
![dslist-model](https://github.com/RodrigoDeOliveiraSilva/DsListOnGitPod/assets/97246882/44e69a71-a6b3-4597-ad5a-9f03baf67d94)

# How to run the project

### Enter the backend project folder
```bash
cd backend
```
#### Run The roject
```bash
./mvnw spring-boot:run
```
### Stop Project using Keyboard Shortcut in terminal
#### "Ctrl + C"



# GitPod Bug Fixes
##### Spring localization bug fix - GitPod - Using terminal in root in /backend folder

```bash
mvn clean
```
```bash
mvn install
```

# for testing in development, create database "dslist" 
### so that the property configured in the resource does not give an error.
#### I left the back end folder to run docker for testing in development
```bash
cd ..
```
#### Upload containers at the root of the project where the "docker-compose.yml" file is located, use in the terminal:
```bash
docker-compose up -d
```


