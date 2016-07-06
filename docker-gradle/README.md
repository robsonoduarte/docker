Docker - Gradle ( In Construction )
======================
   The simple example how create....


 - [Install Docker](https://docs.docker.com/engine/installation/)

 - [Install Gradle](https://docs.gradle.org/current/userguide/installation.html)

 - [Gradle Docker Plguin](https://github.com/Transmode/gradle-docker)

 - [Docker Hub Java](https://hub.docker.com/_/java/)


**Build Image:**
```
gradle dockerImage -Denvironment=lo
```

**Run Image:**
```
docker run --name docker-gradle docker-gradle:0.1.0
```


**Extras**

- VisualVM

- Alpine Linux + Bash


