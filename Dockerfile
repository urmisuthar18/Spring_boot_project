FROM eclipse-temurin:17-jdk

WORKDIR /app

# Copy only pom first (better caching)
COPY pom.xml .

RUN apt-get update && apt-get install -y maven

RUN mvn dependency:go-offline

# Now copy source
COPY src ./src

# Build
RUN mvn clean package -DskipTests

# Debug (optional)
RUN ls -l target

# Run jar
CMD ["sh", "-c", "java -jar target/*.jar"]
