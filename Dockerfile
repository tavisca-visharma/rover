#TODO
FROM java:8
COPY build/libs/*.jar var/www/java/src/
WORKDIR var/www/java
CMD ["java","-jar", "*.jar"]
