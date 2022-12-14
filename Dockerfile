FROM openjdk:17-ea-11-jdk-slim
VOLUME /tmp
COPY build/libs/orderService-1.0.jar orderservice.jar
ENTRYPOINT ["java","-jar","/orderservice.jar"]