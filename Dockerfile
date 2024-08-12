# Use the official OpenJDK 21 image
FROM openjdk:21-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the Maven project descriptor files to the container
COPY pom.xml ./

# Install Maven and download dependencies
RUN apt-get update && \
    apt-get install -y maven && \
    mvn dependency:go-offline && \
    apt-get clean && \
    rm -rf /var/lib/apt/lists/*

# Copy the rest of the project files
COPY src ./src

# Build the project
RUN mvn -B -DskipTests clean package

# Set the entry point to run the application
CMD ["java", "-jar", "target/calc-java-1.0-SNAPSHOT.jar"]
