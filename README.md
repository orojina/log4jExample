# log4jExample

1. Build the docker image

````
docker build -t log4j:2.15.0-playground .
````

2. Run the docker container

````
docker run -it -p 80:80 log4j:2.15.0-playground
````

3. From a new terminal window curl apache2 server
````
curl http://localhost/
````

4. Access docker container to test log4j, first get container ID with:
````
docker ps
````

5. Then use docker exec to access the running container
````
docker exec -it <container ID> sh
````

6. Once inside the container
````
cd log4jExample
mvn compile exec:java -Dexec.mainClass="com.log4jExample.log4jExample.Log4jExample"
````

Expected output
````
[INFO] Scanning for projects...
[INFO]
[INFO] -------------< com.log4jExample.log4jExample:log4jExample >-------------
[INFO] Building log4jExample 1.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] --- maven-resources-plugin:3.0.2:resources (default-resources) @ log4jExample ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /log4jExample/src/main/resources
[INFO]
[INFO] --- maven-compiler-plugin:3.8.0:compile (default-compile) @ log4jExample ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- exec-maven-plugin:1.6.0:java (default-cli) @ log4jExample ---
06:43:42.988 [com.log4jExample.log4jExample.Log4jExample.main()] INFO  HelloWorld - Hello, World!
06:43:42.993 [com.log4jExample.log4jExample.Log4jExample.main()] DEBUG HelloWorld - Hello, World!
06:43:42.993 [com.log4jExample.log4jExample.Log4jExample.main()] ERROR HelloWorld - Hello, World!
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.381 s
[INFO] Finished at: 2021-12-18T06:43:42Z
[INFO] ------------------------------------------------------------------------
````
