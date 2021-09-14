# Introduction

This is a very simple SpringBoot application project highlighting how can we work out a Springboot web dependency project all the way to Azure webapp using Azure DevOps CI/CD pipeline.

## Getting Started 
1. Downloaded the Springboot skelton from Spring initializer with web dependency, Java 8 & Maven
2. Imported in IDE (Eclipse) and made a simple Rest controller to return text on root request
3. Tested the project locally
4. Configured the Azure webapp maven plugin 
5. Deployed the project in Azure subscription through authenticated client (Azure CLI)
6. Aha! We are done, verified !

## Elements
* Springboot maven project with web dependency
* Azure webapp 
* Azure DevOps CI/CD pipeline to Azure webapp
* Code coverage by Cobertura
* Code quality check - checkstyle, PMD, findbugs
* CI/CD pipeline with JFrog artifactory integration
