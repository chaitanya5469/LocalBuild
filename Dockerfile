FROM thyrlian/android-sdk:latest

WORKDIR /app

# Copy project files
COPY . /app

# Ensure Gradle wrapper is executable
RUN chmod +x ./gradlew

# Download dependencies first (layer caching)
RUN ./gradlew dependencies

# Build debug APK
RUN ./gradlew assembleDebug
