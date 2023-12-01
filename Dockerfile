#Dockerfile
# Containerization of our service
FROM maven:3.8.5-openjdk-17-slim AS build
COPY src /src
COPY pom.xml /pom.xml
RUN mvn -f /pom.xml clean package

FROM openjdk:17-jdk-slim

WORKDIR /opt/app

COPY --from=build /target/spring-boot-hw3.jar spring-boot-hw3.jar

ENTRYPOINT ["java","-jar","spring-boot-hw3.jar"]
