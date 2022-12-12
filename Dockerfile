FROM openjdk
WORKDIR /app
COPY /target/hospital-0.0.1-SNAPSHOT.jar /app/hospital.jar
ENTRYPOINT ["java", "-jar", "/app/hospital.jar"]