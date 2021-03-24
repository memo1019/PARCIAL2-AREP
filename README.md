# AREP PARCIAL 2 AWS

se realizo el parcial propuesto de "PARCIAL PRACTICO " con un contenedor en Docker y despliegue en aws.


### PREREQUISITOS

Los prerrequisitos que manejaremos para lograr con exito el desarrollo del laboratorio son:
- Maven
- Git
- MongoDB
- Aws
- Docker
- Docker-Compose
## DOCKER IMAGES

 vemos las imagenes en las siguientes webs:

- Web:
    https://hub.docker.com/repository/docker/memo1019/parcial2arep


### Ejecucion e instalacion
se debe clonar el proyecto con el siguiente comando:

```
git clone https://github.com/memo1019/PARCIAL2-AREP
```
luego ingresaremos a la carpeta dede el cmd o la consola:
```
cd /PARCIAL2-AREP
```
Finalmente coonstruiremos y compilaremos el proyecto para asi poder ejecutarlo.
```
 docker pull memo1019/parcial2arep:latest
```

Si desea ejecutar los contenedores directamente desde las imágenes de DockerHub, ejecute el siguiente comando:
```
docker-compose up -d --scale web=3
```
Si estás trabajando en una máquina Linux o Mac, [instala docker-compose](https://docs.docker.com/compose/install/).
En windows, docker-compose ya está en docker desktop.

entonces ve a localhost:34000 para acceder directamente al contenedor del Load Balancer.la aplicación seguirá esta arquitectura en AWS(Para más información sobre cómo funcionaba en AWS plese visitar el archivo de documentación):

## Pruebas

***Web-App corriendo localmente con la arquitectura descrita***

![Diagrama de Clases](/images/prueba1cos.png)
![Diagrama de Clases](/images/prueba1acos.png)

***instancia ejecutada***


![Diagrama de Clases](/images/prueba3.png)

***Grupo de seguridad***


![Diagrama de Clases](/images/prueba5.png)

***Web-App corriendo en AWS con la arquitectura descrita***


![Diagrama de Clases](/images/prueba2cos.png)
![Diagrama de Clases](/images/prueba2acos.png)

***imagenes del docker y contenedores de la instancia de EC2 corriendo con ssh***


![Diagrama de Clases](/images/prueba4.png)

## Video
### AWS EC2 Console: [Full Video On YouTube](https://youtu.be/wpiPijoD4uM)****
### Browser: [Full Video On YouTube](https://youtu.be/eLO9HN3C80s)****
## Documentacion
para realizar la documentacion de javadoc use estos comandos y aqui podra llevar acabo el proceso de creacion de esta documentacion.
```
$ mvn javadoc:javadoc
$ mvn javadoc:jar
$ mvn javadoc:aggregate
$ mvn javadoc:aggregate-jar
$ mvn javadoc:test-javadoc
$ mvn javadoc:test-jar
$ mvn javadoc:test-aggregate
$ mvn javadoc:test-aggregate-jar
```
si desea ver el javadoc se encuentra en el directorio
```
/target/site
```


## Construido con

* [Maven](https://maven.apache.org/) - Dependency Management
* Git - Version Control    
* Apache Maven 3.6.3
* Docker
* Spark web
* Java 1.8.0_211
* Git 2.26.2
* AWS (EC2)
   
  ## Comandos a Usar
  
  ***Listar todos los contenedores***
  
   ```sh
    $ docker container ls 
    $ docker ps -a (List all containers not just running)
   ```
     
    ***Listar imagenes***

      ```sh
      $ docker images  
      ```

  ***Contruir una imagen de un Dockerfile***

     ```sh
    $ docker build -t <myimage> 
     ```
   ***Correr un contenedor***

    ```sh
    $ docker run -d -p <localport>:<containerport> --name firstdockercontainer <image> 
  ```
   ***Correr docker-compose con 1 instancias web***

  ```sh
    $ docker-compose up -d --scale web=1
  ```

   ***Obtener un shell del contenedor***

  ```sh
    $ docker exec -it <docker ID> /bin/bash
  ```

## Autor

* **Guillermo Alfonso Castro Camelo** - [Memo1019](https://github.com/memo1019)

## Licencia

This project is licensed under the GNU v3.0 License - see the [LICENSE](LICENSE.txt) file for details
