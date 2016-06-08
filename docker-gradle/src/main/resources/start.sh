#!/bin/bash


JAVA_OPTS="
-server \
-Xms56m \
-Xmx56m \
-Denvironment=@environment@ \
-Dcom.sun.management.jmxremote \
-Dcom.sun.management.jmxremote.port=1098 \
-Dcom.sun.management.jmxremote.rmi.port=1098 \
-Dcom.sun.management.jmxremote.authenticate=false \
-Dcom.sun.management.jmxremote.ssl=false \
-Djava.rmi.server.hostname=@hostname@"


java -jar $JAVA_OPTS @archiveName@



