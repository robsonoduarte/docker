FROM ubuntu:latest
MAINTAINER robsonoduarte




# jdk 8 oracle
RUN \
	apt-get install -y software-properties-common && \
	echo oracle-java8-installer shared/accepted-oracle-license-v1-1 select true | debconf-set-selections && \
	add-apt-repository -y ppa:webupd8team/java && \
	apt-get update && \
	apt-get install -y oracle-java8-installer


RUN apt-get install -y wget
RUN wget http://52.11.110.52:8081/nexus/content/repositories/releases/br/com/ontracker/ontracker-echo-web/0.0.3/ontracker-echo-web-0.0.3-jar-with-dependencies.jar
CMD ["java", "-jar", "-Dcom.sun.management.jmxremote", "-Dcom.sun.management.jmxremote.local.only=false", "-Dcom.sun.management.jmxremote.port=1098", "-Dcom.sun.management.jmxremote.ssl=false", "-Dcom.sun.management.jmxremote.authenticate=false", "-Dcom.sun.management.jmxremote.rmi.port=1098", "-Djava.rmi.server.hostname=192.168.99.100", "ontracker-echo-web-0.0.3-jar-with-dependencies.jar"]


# This lines is one example how we can build the apps in image
#RUN apt-get install -y maven
#RUN apt-get install -y git-core
#RUN git clone https://github.com/robsonoduarte/docker.git
#RUN cd /docker/docker-scala && mvn clean install