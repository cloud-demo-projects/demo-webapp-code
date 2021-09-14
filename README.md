# Introduction

This is a very simple SpringBoot application project highlighting how can we work out a Springboot web dependency project all the way to Azure webapp using Azure DevOps CI/CD pipeline.

## Prerequisites

## Getting Started 
1. Download the Springboot skelton from Spring initializer with web dependency, Java 8 & Maven
2. Import in IDE (Eclipse) and made a simple Rest controller to return text on root request
3. Test the project locally
4. Configur the Azure webapp maven plugin and deploy the project in Azure subscription through authenticated client (Azure CLI)
5. Run cicd pipeline to build, deploy the code.
6. Aha! We are done.

## Elements
* Springboot maven project with web dependency
* Azure webapp 
* Azure DevOps CI/CD pipeline to Azure webapp
* Code coverage by Cobertura
* Code quality check - checkstyle, PMD, findbugs
* CI/CD pipeline with JFrog artifactory integration
