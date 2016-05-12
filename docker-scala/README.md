Docker - Scala
======================

* Simple example how create one Scala App and run It in Docker


*To Build Image:*


1. Create jar

```mvn clean install
```
2. Create Docker Image

```	docker build -t docker-scala .
```
3. Run Docker Image

```	docker run --name docker-scala docker-scala
```




