 Spring Boot 2.2.5 and Spring Security 5.2.2 app
I used PSQL with url in application.properties.
(there is also h2 db).
 
Example endpoints:  
```html 
POST /api/register HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Content-Type: application/json

{"username": "acailic", "email": "aca@email.com", "password": "acailic"} 
 ```
```html 
POST /api/authenticate HTTP/1.1
Host: localhost:8080
Content-Type: application/json

{
    "username": "acailic",
    "password": "acailic"
}

Response token in header: Bearer token
```
