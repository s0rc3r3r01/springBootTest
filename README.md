Simple Spring Boot App with a few components of the Spring ecosystem to test:

* API
* API Contracts
* OpenAPI 
* swagger-diffs and verifying that apis version upgrades do not break existing clients in CI/CD pipelines (
 - deploy version 1.0 in prod
 - write  code for 2.0
 - commit the code
 - pipeline runs
 - test run and deploys the app locally, swagger-diffs runs, connects to the openapi spec live deployed in production and matches it with the
 version running locally and returns an output...
)
* API gateways for spring boot


Based on: https://github.com/jpgough/api-workshop