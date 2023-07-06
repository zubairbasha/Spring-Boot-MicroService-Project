FROM eclipse-temurin:17

LABEL maintainer="Zubair"

WORKDIR /app

ARG jarfile=target/eurekaserver-0.1.jar

COPY ${jarfile} /app/eureka.jar

RUN echo "Hello Docker"

ENTRYPOINT [ "java","-jar","eureka.jar"]

