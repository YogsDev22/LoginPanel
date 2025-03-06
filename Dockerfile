# Gunakan base image OpenJDK
FROM openjdk:17-jdk-alpine AS build

# Tentukan working directory dalam container
WORKDIR /app

# Copy semua file source code ke dalam container
COPY . .

# Beri izin eksekusi ke mvnw agar bisa dijalankan
RUN chmod +x mvnw

# Build aplikasi menggunakan Maven
RUN ./mvnw clean package -DskipTests

# Gunakan stage runtime yang lebih ringan
FROM openjdk:17-jdk-alpine
WORKDIR /app

# Copy file JAR hasil build dari tahap sebelumnya
COPY --from=build /app/target/*.jar app.jar

# Jalankan aplikasi
CMD ["sh", "-c", "java -jar /a
