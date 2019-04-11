#!/bin/sh
mvn clean package && docker build -t com.airhacks/hello .
docker rm -f hello || true && docker run -d -p 8080:8080 -p 4848:4848 --name hello com.airhacks/hello 
