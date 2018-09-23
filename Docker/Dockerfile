FROM openjdk:8-jre-alpine
ADD service-consulta-pessoa-0.0.1-SNAPSHOT.jar service-consulta-pessoa.jar
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/service-consulta-pessoa.jar"]
