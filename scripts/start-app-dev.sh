#!/bin/sh

cd ../app/application
./mvnw -Drun.jvmArguments="-Dspring.profiles.active=dev" clean package spring-boot:run

