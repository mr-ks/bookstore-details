# bookstore-details

This application is inspired by [istios bookinfo](https://istio.io/latest/docs/examples/bookinfo/) example app.
It is intended to demonstrate modern development practices such as microservices and containerization. The code accompanies a lecture held at TUM Heilbronn.

Main purpose of the application is to expose static information about books via a restful API.

API Spec:

```
Request:
GET details/{producId}

Response:
{
    "id": null,
    "author": null,
    "year": null,
    "type": "",
    "publisher": "",
    "language": "",
    "isbn13": "",
    "pages": 0
}
```

# spring boot app

Dependencies / build management is done with gradle. To build the self-contained `jar` artifact all you need to do is:
```
./gradlew bootJar
```
The build output can then be found at `build/libs`.

To run the app locally execute

```
./gradlew bootRun
```
if not specified otherwise the embedded tomcat server will listen on port `8081`. Changing the default behaviour can either be done by specifing a new port in `application.yml` or setting an environment variable called `PORT`.

The only endpoint the application exposes can then be consumend via curl like so:

```
curl http://localhost:8081/details/1
```

Regardless of what you send as an id (`details/{producId}`) you will always get the same result.
