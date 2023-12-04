FROM maven:3.9.1-eclipse-temurin-11-alpine
WORKDIR /app
COPY ./finants-api ./finants-api
COPY ./finants-boot ./finants-boot
COPY ./finants-model ./finants-model
COPY ./finants-ws ./finants-ws
COPY pom.xml .
EXPOSE 33333
RUN mvn install
WORKDIR /app/finants-boot
CMD mvn spring-boot:run