#Introduction

This is a very simple SpringBoot application project highlighting how can we work out a Springboot web dependency project all the way to Azure webapp.

##Steps 
1. Downloaded the Springboot skelton from Spring initializer with web dependency, Java 8 & Maven
2. Imported in IDE (Eclipse) and made a simple Rest controller to return text on root request
3. Tested the project locally
4. Configured the Azure webapp maven plugin 
5. Deployed the project in Azure subscription through authenticated client (Azure CLI)
6. Aha! We are done, verified !

##Elements
1. Springboot maven project with web dependency
2. Azure webapp 
3. Azure DevOps CI/CD pipeline to Azure webapp
4. Code coverage by Cobertura
5. Code quality check - checkstyle, PMD, findbugs
