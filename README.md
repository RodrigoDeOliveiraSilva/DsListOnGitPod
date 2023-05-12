# Ds List On GitPod
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/RodrigoDeOliveiraSilva/DsListOnGitPod/blob/main/LICENSE) 


# Sobre o projeto
API REST, com o  MVC, JPA, DTO, Docker na semana Java Spring intensiva do DevSuperior.

## Modelo de domínio DSList
![dslist-model](https://github.com/RodrigoDeOliveiraSilva/DsListOnGitPod/assets/97246882/44e69a71-a6b3-4597-ad5a-9f03baf67d94)

# Como executar o projeto

# entrar na pasta do projeto back end
```bash
cd listgame
```
### saí da pasta do back end
```bash
cd ..
```
#### subir containers 
na raiz do projeto onde se encontra o arquivo "docker-compose.yml", utilize no terminal:
```bash
docker-compose up -d
```
#### executar o projeto
```bash
./mvnw spring-boot:run
```
#### parar Projeto
Utilizar o Atalho do Teclado no terminal "Ctrl + C"
##### Spring localization bug fix - GitPod
Utilize no terminal na raiz na pasta /listgame
```bash
mvn clean
```
```bash
mvn install
```

