FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
COPY /build/libs/cat-dog.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8080