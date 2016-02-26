FROM lwieske/java-8:latest
ADD carmax-${project.version}.jar /opt/carmax-docker/
EXPOSE ${server.port}
WORKDIR /opt/carmax-docker/
CMD ["java", "-jar", "carmax-${project.version}.jar"]