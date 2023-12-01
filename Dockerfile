FROM openjdk:17
COPY --from=build /home/app/target/spring-boot-hw3.jar spring-boot-hw3.jar
ENTRYPOINT ["java","-jar","/spring-boot-hw3.jar"]
