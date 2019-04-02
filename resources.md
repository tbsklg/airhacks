#Resources

https://helidon.io/#/ (if there is nothing else to do)
https://github.com/samolisov/spring-vs-ejb-vs-cdi-benchmark
http://fnproject.io 
https://www.jaegertracing.io
https://www.hawkular.org (old / redhat)
https://opentracing.io
https://github.com/OpenLiberty/guide-microprofile-opentracing

https://wad.sh

# Archetype

#!/bin/sh
PROJECT_NAME=$1
mvn archetype:generate -o -DarchetypeGroupId=com.airhacks -DarchetypeArtifactId=javaee8-essentials-archetype -DarchetypeVersion=0.0.2 -DgroupId=com.airhacks -Dversion=0.0.1 -Darchetype.interactive=false --batch-mode -DartifactId=${PROJECT_NAME} 

http://www.adam-bien.com/roller/abien/entry/java_ee_8_essentials_archetype

http://localhost:8080/hello/resources/ping

Multiple roots with one JAX-RS

http://www.adam-bien.com/roller/abien/entry/multiple_jax_rs_uris_in


# servers

https://openliberty.io
http://tomee.apache.org
https://www.tomitribe.com
https://wildfly.org
https://www.payara.fish

# misc

https://jcp.org/en/jsr/detail?id=316 (why Java EE 6 was late)
https://jcp.org/en/jsr/detail?id=330 (@Inject)

# JSON-B with private (nice to have)

http://www.adam-bien.com/roller/abien/entry/private_fields_serialization_with_json

# CURL 

curl -i -H"Content-type: application/json" -d'{"hugo":"m","proxyClass":"p"}' http://localhost:8080/hello/resources/ping


If you forget to start transactions:

HTTP/1.1 500 Internal Server Error
Server: Payara Server  5.184 #badassfish
X-Powered-By: Servlet/4.0 JSP/2.3 (Payara Server  5.184 #badassfish Java/Oracle Corporation/1.8)
Content-Type: application/json
Connection: close
Content-Length: 46
X-Frame-Options: SAMEORIGIN

javax.persistence.TransactionRequiredException%    


# Metrics

curl -i -H"Accept: application/json" http://localhost:8080/metrics/application/

https://prometheus.io

http://localhost:8080/openapi

http://localhost:9080/openapi/ui/

http://www.adam-bien.com/roller/abien/entry/service_s_new_serviceimpl_why

https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Cache-Control

https://varnish-cache.org

http://www.squid-cache.org

https://httpd.apache.org/docs/2.4/mod/mod_cache.html

http://www.adam-bien.com/roller/abien/entry/a_java_ee_7_alternative

# start liberty

#!/bin/sh
cd $LIBERTY_HOME/bin
./server run%   

http://www.adam-bien.com/roller/abien/entry/client_side_http_basic_access


https://en.wikipedia.org/wiki/Role-based_access_control

https://jwt.io

https://www.eclipse.org/community/eclipse_newsletter/2017/september/article2.php

https://www.keycloak.org

https://www.forgerock.com

https://www.graalvm.org