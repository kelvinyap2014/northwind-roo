#!/bin/sh

cd app

if [ "${TRAVIS_PULL_REQUEST}" != "false" ] 
then
    echo "Running build and Sonar analysis for Pull Request '${TRAVIS_PULL_REQUEST}'"
    ./mvnw clean test sonar:sonar -Dsonar.host.url=https://sonarqube.com -Dsonar.analysis.mode=preview
elif [ "${TRAVIS_BRANCH}" = "master" ]
then
    echo "Running build and Sonar analysis for ${TRAVIS_BRANCH} branch"
    ./mvnw clean test sonar:sonar \
        -Dsonar.host.url=https://sonarqube.com \
        -Dsonar.login=${SONAR_TOKEN} \
        -Dsonar.organization=kelvinyap2014-github
else
    echo "Running build for ${TRAVIS_BRANCH} branch"
	./mvnw clean test
fi