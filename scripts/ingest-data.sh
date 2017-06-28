#!/bin/sh

cd ../acceptance-tests
rm -rf nwdb
./mvnw clean package -DskipTests
./mvnw exec:java
