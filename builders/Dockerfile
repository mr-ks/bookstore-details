# Do not use this Dockerfile for production. It is for lectural purpuses only.
# For prod use cases gradle bootBuildImage / mvn spring-boot:build-image is the way to go
FROM eclipse-temurin:17-focal
LABEL project="tum-bookstore"

ARG JAR_FILE=build/libs/boot-app.jar
ENV PORT=8080
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]