FROM openjdk:8-jdk-alpine
COPY target/SpringDevopsApplication-1.0.jar SpringDevopsApplication.jar
ENTRYPOINT ["java", "-jar", "/SpringDevopsApplication.jar"]