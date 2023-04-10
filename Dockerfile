FROM openjdk:17
EXPOSE 8080
COPY target/Qc-0.0.1-SNAPSHOT.jar Qc-0.0.1-SNAPSHOT.jar
CMD [ "java","-jar","Qc-0.0.1-SNAPSHOT.jar" ]