# Use official OpenJDK base image (using Java 22 since your Maven uses 22)
FROM openjdk:22-jdk

# Create app directory
WORKDIR /app

# Copy the compiled JAR file into the container
COPY target/LibraryManagementSystem-1.0-SNAPSHOT.jar app.jar

# Set the entry point
ENTRYPOINT ["java", "-jar", "app.jar"]
