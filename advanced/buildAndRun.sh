#!/bin/sh
mvn clean package && docker build -t com.airhacks/advanced .
docker rm -f advanced || true && docker run -d -p 8080:8080 -p 4848:4848 --name advanced com.airhacks/advanced 
