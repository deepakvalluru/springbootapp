FROM alpine/git as clone
WORKDIR /app
RUN git clone -b dev https://deepakvalluru:Vdilip_7github@github.com/deepakvalluru/springbootapp.git

FROM maven:3.5-jdk-8-alpine as build
WORKDIR /app
COPY --from=clone /app/springbootapp /app
RUN mvn install

FROM openjdk:8-jre-alpine
WORKDIR /app
COPY --from=build /app/target/springbootapp*.jar /app.jar
CMD ["/usr/bin/java", "-jar", "-Dspring.profiles.active=prod", "/app.jar"]