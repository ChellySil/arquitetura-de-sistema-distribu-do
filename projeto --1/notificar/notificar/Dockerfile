FROM openjdk:21-jdk-slim
VOLUME /tmp
COPY target/notificar-0.0.1-SNAPSHOT.jar microservice2.jar
ENTRYPOINT ["java", "-jar", "/microservice2.jar"]