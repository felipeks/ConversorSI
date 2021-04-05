FROM openjdk

WORKDIR /app

COPY target/Conversor-0.0.1-SNAPSHOT.jar /app/Conversor-app.jar

ENTRYPOINT [ "java", "-jar", "Conversor-app.jar"]