# Introduction
Sample SpringBoot application deployed to Azure webapp using Azure DevOps CI/CD pipeline.

# Prerequisites
## Getting Started 
1. Download the Springboot skelton from Spring initializer with web dependency, Java 8 & Maven
2. Import in IDE (Eclipse) and made a simple Rest controller to return text on root request
3. Test the project locally
4. (Optional) Configure the Azure webapp maven plugin and deploy the project in Azure subscription through authenticated client (Azure CLI)
5. Run CICD pipeline to build, deploy the code.
6. Aha! We are done.

## Elements
- Springboot maven project with web dependency
- Azure webapp 
- Azure DevOps CI/CD pipeline to Azure webapp
- Code coverage by Cobertura
- Code quality check - checkstyle, PMD, findbugs
- CI/CD pipeline with JFrog artifactory integration

## Logging
- Application logs -> Application insights
- Request/HTTP access logs -> Storage account
- Exceptions/error -> Application insights
- Deployment logs -> KUDU console
- Network/traffic logs -> Azure firewall logs in Central log analytics workspace
- Reactive Measures -> Can configure alerts on logs and matrices via Kusto queries; can create SNow incidents for follow up
