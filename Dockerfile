FROM openjdk:8
ADD target/philipl-springboot-docker.jar philipl-springboot-docker.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","philipl-springboot-docker.jar"]