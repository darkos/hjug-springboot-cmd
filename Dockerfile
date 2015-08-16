FROM java:8
MAINTAINER stefanovic.darko@gmail.com
EXPOSE 8080
ADD build/libs/hjug-springboot-cmd-0.0.1-SNAPSHOT.jar /hjug-springboot-cmd-0.0.1-SNAPSHOT.jar
CMD java -jar -Dspring.profiles.active=$ACTIVE_PROFILE /hjug-springboot-cmd-0.0.1-SNAPSHOT.jar

