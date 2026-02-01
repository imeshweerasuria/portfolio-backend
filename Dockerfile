# ---- Build stage ----
FROM eclipse-temurin:17-jdk AS build

WORKDIR /app

# Copy everything
COPY . .

# ✅ FIX: give execute permission to mvnw
RUN chmod +x mvnw

# Build the application
RUN ./mvnw -DskipTests package

# ---- Run stage ----
FROM eclipse-temurin:17-jre

WORKDIR /app

COPY --from=build /app/target/*.jar app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]
