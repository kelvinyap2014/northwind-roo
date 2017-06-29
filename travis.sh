#!/bin/sh

BASE_DIR=`pwd`

cd "$BASE_DIR/scripts" && \
chmod a+x *.sh && \
bash run-unit-test-and-sonar.sh && \
cd "$BASE_DIR/scripts" && \
bash ingest-data.sh && \
cd "$BASE_DIR/scripts" && \
bash start-app-test-background.sh && \
cd "$BASE_DIR/scripts" && \
bash run-acceptance-tests.sh