FROM openjdk:17-ea-11-jdk-slim
VOLUME /tmp
COPY build/libs/orderService-1.0.jar OrderService.jar
ENV SPRING_PROFILES_ACTIVE prod
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/OrderService.jar"]