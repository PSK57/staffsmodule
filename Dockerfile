FROM openjdk:8
ADD target/StaffsModule.jar StaffsModule.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","StaffsModule.jar"]