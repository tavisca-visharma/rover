#TODO
FROM java:8
COPY build/libs/*.jar var/www/java/src/
WORKDIR var/www/java
RUN curl -fsSLO https://get.docker.com/builds/Linux/x86_64/docker-17.04.0-ce.tgz \
  && tar xzvf docker-17.04.0-ce.tgz \
  && mv docker/docker /usr/local/bin \
  && rm -r docker docker-17.04.0-ce.tgz
CMD ["java","-jar", "*.jar"]
