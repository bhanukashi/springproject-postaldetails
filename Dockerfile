FROM openjdk:8-jdk-alpine

# For Java 11, try this
# FROM adoptopenjdk/openjdk11:alpine-jre

# cd /opt/app
WORKDIR /opt/app

# Refer to Maven build -> finalName
ARG JAR_FILE=target/app.jar

# cp target/spring-boot-web.jar /opt/app/app.jar
COPY ${JAR_FILE} app.jar

# java -jar /opt/app/app.jar
ENTRYPOINT ["java","-jar","app.jar"]