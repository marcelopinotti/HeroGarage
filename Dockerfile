FROM amazoncorretto:21
LABEL maintainer="marcelopinotti"
WORKDIR /app
COPY target/HeroGarage-0.0.1-SNAPSHOT.jar /app/GaragemHub.jar
ENTRYPOINT ["java","-jar","GaragemHub.jar"]
