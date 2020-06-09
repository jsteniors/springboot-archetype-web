# springboot-archetype-web

An archetype which contains a starter SpringBoot Microservice. More specifically, this archetype creates a project with the following layout:

```
my-app
|-- pom.xml
|-- src
|   -- main
|      -- resources
|         -- application.yml
|      -- java
|         -- com
|            -- yourcompany
|               -- config
|                  -- RestTemplateConfig.java
|               -- domain
|                  -- ApiErrorResponse.java
|                  -- BusinessNotification.java
|                  -- ObjectError.java
|               -- exception
|						-- ApiException.java
|						-- BusinessException.java
|						-- NotFoundException.java
|						-- RepositoryException.java
|                  -- DemoNotFoundException.java
|               -- handler
|                  -- ApiControllerAdivice.java
|                  -- ApiErrorResponseExceptionExtractor.java
|					-- util
|						-- StringUtil.java
|               -- Application.java
|   -- test
|      -- resources
|         -- application.yml
|         -- data.sql
|      -- java
|         -- com
|            -- yourcompany
|               -- config
|                  -- JpaConfiguration.java
|               -- controller
|                  -- DemoController.java
|                  -- DemoControllerTest.java
|               -- domain
|                  -- DemoEntity.java
|                  -- DemoResponseDTO.java
|               -- repository
|                  -- DemoRepository.java
|               -- service
|                  -- DemoService.java
```

## Getting Started

Clone from Github

`$ git clone https://github.com/jsteniors/springboot-archetype-web.git`

Then install to your local repo

`mvn install archetype:update-local-catalog`

## Generate Your Project

```
$ mvn archetype:generate 
-DarchetypeGroupId=br.com.aceleradev 
-DarchetypeArtifactId=springboot-archetype-web
-DarchetypeVersion=0.0.1-SNAPSHOT 
-DgroupId=<your-group-id> 
-DartifactId=<your-artifcat-id> 
-Dversion=1.0-SNAPSHOT
```

## Copyright

Released under the Apache License 2.0. See the LICENSE file.
