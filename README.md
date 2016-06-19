# First-Continental-Congress
Experimentation involving the aggregation of different government-tracking APIs

##Requirements
[Apache Maven](https://maven.apache.org/ "Apache Maven Homepage")

##Helpful Links
[Spring Documentation](https://spring.io/docs "Spring Documentation")

[Spring REST API Guide](https://spring.io/guides/gs/rest-service/ "Spring REST API Guide")

##Building the Project
1. Navigate to First-Continental-Congress project directory
2. `mvn clean package`
3. Navigate to /target directory
4. `java -jar [[.jar file]]`

##API
### /greeting
**Method:** GET

**Local link:** [http://localhost:8080/greeting](http://localhost:8080/greeting "/greeting")

**Input:** 

| Parameter    | Type    | Default    | Example                  |
| ------------ | ------- | ---------- | ------------------------ |
| name         | String  | World      | /greeting?name=User      |


Basic endpoint built from the Spring REST API Guide. Returns "Hello, [[name]]" and the number of times this endpoint has been called while the server has been up.