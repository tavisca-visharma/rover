#TODO
FROM java:8
COPY src/ var/www/java/src/
COPY gradle/ var/www/java/gradle/
COPY gradlew var/www/java
COPY gradlew.bat var/www/java
COPY settings.gradle var/www/java
COPY build.gradle.kts var/www/java
WORKDIR var/www/java
CMD ["java","-jar", "00.jsr"]
