#Resources

https://helidon.io/#/ (if there is nothing else to do)
https://github.com/samolisov/spring-vs-ejb-vs-cdi-benchmark
http://fnproject.io 
https://www.jaegertracing.io
https://www.hawkular.org (old / redhat)
https://opentracing.io
https://github.com/OpenLiberty/guide-microprofile-opentracing

# Archetype

#!/bin/sh
PROJECT_NAME=$1
mvn archetype:generate -o -DarchetypeGroupId=com.airhacks -DarchetypeArtifactId=javaee8-essentials-archetype -DarchetypeVersion=0.0.2 -DgroupId=com.airhacks -Dversion=0.0.1 -Darchetype.interactive=false --batch-mode -DartifactId=${PROJECT_NAME} 

http://www.adam-bien.com/roller/abien/entry/java_ee_8_essentials_archetype