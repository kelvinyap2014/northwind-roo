#!/bin/sh

cd ../app/application
./mvnw -Drun.jvmArguments="-Dspring.profiles.active=test" clean package spring-boot:run

