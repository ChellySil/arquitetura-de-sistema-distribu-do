FROM openjdk:21-jdk-slim
VOLUME /tmp
COPY target/pagar-0.0.1-SNAPSHOT.jar microservice1.jar
ENTRYPOINT ["java", "-jar", "/microservice1.jar"]