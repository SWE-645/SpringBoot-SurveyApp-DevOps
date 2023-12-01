FROM openjdk:17
COPY --from=build /target/spring-boot-hw3.jar spring-boot-hw3.jar
ENTRYPOINT ["java","-jar","/spring-boot-hw3.jar"]
