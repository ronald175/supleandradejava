# Utiliza una imagen base de OpenJDK 17 (la que es compatible con Spring Boot)
FROM openjdk:17

# Establece el directorio de trabajo dentro del contenedor
WORKDIR /examensupletorioandrade

# Copia el archivo JAR generado en el directorio /examensupletorioandrade dentro del contenedor
COPY target/microservicio-api-1.0-SNAPSHOT.jar /examensupletorioandrade/microservicio-api.jar

# Expón el puerto 8080 para que se pueda acceder al microservicio
EXPOSE 8080

# Comando para ejecutar la aplicación Spring Boot
ENTRYPOINT ["java", "-jar", "microservicio-api.jar"]
