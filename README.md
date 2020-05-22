Spring boot app.
I used PSQL with url in application.properties.
(there is also h2 db, i didnt use it so im not sure it will work as well).
 
Example endpoints:  
 
POST /api/register HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Content-Type: application/json

{"username": "acailic", "email": "aca@email.com", "password": "acailic"} 
 
POST /api/authenticate HTTP/1.1
Host: localhost:8080
Content-Type: application/json

{
    "username": "acailic",
    "password": "acailic"
}

Response token in header: Bearer token