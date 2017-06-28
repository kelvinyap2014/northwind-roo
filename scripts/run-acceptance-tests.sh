#!/bin/sh

cd ../acceptance-tests
./mvnw -Dtest=SystemTests clean test
