# Prepare environment
FROM alpine:3.17
RUN apk add openjdk16

# Download source code
RUN git clone https://github.com/MCBanners/eureka-server.git /app
WORKDIR /app

# Build the source into a binary
RUN ./gradlew clean build shadowJar

# Package the application
CMD /bin/sh -c "java -Xms64M -Xmx64M -jar build/libs/eureka.jar"