# issue_2
Describe Swagger custom file issue

## Problem Statement

> based on this [url](https://springdoc.org/#how-can-use-custom-jsonyml-file-instead-of-generated-one) I should be able to use a custom json file (with the Open 3 specification) but i'm unable to, my code keeps giving me 404 not found. The path placed is correct btw.
> why is this feature not working?

### Requirement

- Java 17
- maven 

### RUN

commad to build and run
```
 mvn spring-boot:run
 ```
 
 api to run
 
 ```
 curl -L "http://localhost:9090/test/user/get"
 ```
 
 Issue POV:
 -----------
 
 __Statement:__
 
 It is exptected that the json from `apidocs.json` should be taken and the api docs should come for something like `/user/somethingElse` and not `/user/get` but what we are getting is the latter, it is not considering the custom json provided (which is what is exptected). (also not all the permutated changes have been tried to no avail)
 
 __API:__
 
 ```
 http://localhost:9090/test/webjars/swagger-ui/index.html
 ```
