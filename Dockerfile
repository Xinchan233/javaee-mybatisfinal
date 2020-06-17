FROM java:8
VOLUME /tmp
ADD mybatis-0.0.1-SNAPSHOT.jar front.jar
RUN bash -c 'touch /front.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/front.jar"]

