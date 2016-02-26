FROM lwieske/java-8:latest
ADD carmax-${project.version}.jar /opt/carmax-docker/
EXPOSE 7777
WORKDIR /opt/carmax-docker/
CMD ["java", "-jar", "carmax-${project.version}.jar"]