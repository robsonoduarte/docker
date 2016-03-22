FROM ubuntu:14.04
MAINTAINER robsonoduarte




RUN apt-get update
RUN apt-get install -y python-software-properties software-properties-common
RUN apt-get install -y wget
RUN add-apt-repository ppa:openjdk-r/ppa
RUN apt-get update
RUN apt-get install -y openjdk-8-jre
RUN wget http://IP-NEXUS/nexus/content/repositories/releases/br/com/ontracker/ontracker-echo-web/0.0.3/ontracker-echo-web-0.0.3-jar-with-dependencies.jar
CMD ["java", "-jar", "ontracker-echo-web-0.0.3-jar-with-dependencies.jar"]




# This lines is one example how we can build the apps in image
#RUN apt-get install -y maven
#RUN apt-get install -y git-core
#RUN git clone https://github.com/robsonoduarte/docker.git
#RUN cd /docker/docker-scala && mvn clean install