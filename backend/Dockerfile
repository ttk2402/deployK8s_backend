FROM openjdk:17
ENV SPRING_OUTPUT_ANSI_ENABLED=ALWAYS \
    JHIPSTER_SLEEP=0
RUN mkdir -p /app
WORKDIR /app
COPY target/Backend-0.0.1-SNAPSHOT.jar /app/Backend-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/app/Backend-0.0.1-SNAPSHOT.jar"]
