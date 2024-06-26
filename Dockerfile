FROM gradle:8.7.0-jdk17-alpine AS builder
COPY --chown=gradle:gradle . /gradle
WORKDIR /gradle
RUN gradle build --no-daemon

FROM openjdk:17-alpine
RUN mkdir /app
LABEL description="Von"
VOLUME /tmp
COPY --from=builder /gradle/build/libs/*.jar app.jar
ARG PROFILE
EXPOSE 8020
ENTRYPOINT ["java", "-jar", "app.jar"]