FROM openjdk:17
ADD /target/spring-boot-hw3.jar spring-boot-hw3.jar
ENTRYPOINT ["java","-jar","/spring-boot-hw3.jar"]
