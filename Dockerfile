FROM openjdk:17-jdk-alpine
MAINTAINER caster.com
COPY target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]