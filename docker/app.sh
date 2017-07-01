#!/bin/sh

cd /opt/northwind-roo/app/application && \
./mvnw -o -Drun.jvmArguments="-Dspring.profiles.active=dev" spring-boot:run
