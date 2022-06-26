# building

Creating a docker container can be done be either using the `Dockerfile` or by
executing the respective gradle task `bootBuildImage`. Using the `Dockerfile`that can
be found in this directory is not recommended as it only contains the bare minimum that
is needed to create a working container.

## docker
Build a container by executing (see below) in the __root__ directory.

```
docker build -t tum/details -f builders/Dockerfile .
```
