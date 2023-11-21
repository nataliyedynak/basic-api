# Use AdoptOpenJDK's OpenJDK 11 base image
FROM openjdk:21-jdk

# Set the working directory in the container
WORKDIR /app

# Copy the Spring Boot application JAR file into the container at /app
COPY build/libs/basic-api-0.0.1-SNAPSHOT.jar /app

# Expose the port the app runs on
EXPOSE 8080

# Define the command to run your application
CMD ["java", "-jar", "basic-api-0.0.1-SNAPSHOT.jar"]
