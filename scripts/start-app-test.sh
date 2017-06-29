#!/bin/sh

cd ../app/application
rm -rf nwdb
ln -s ../../acceptance-tests/nwdb
./mvnw -Drun.jvmArguments="-Dspring.profiles.active=test" clean package spring-boot:run

