FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/laws-1.0.0.jar app.jar
EXPOSE 8082
CMD ["java", "-jar", "app.jar"]
