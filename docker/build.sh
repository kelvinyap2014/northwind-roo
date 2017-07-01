#!/bin/sh

cd /opt && \
git clone https://github.com/kelvinyap2014/northwind-roo.git && \
cd /opt/northwind-roo/app && \
./mvnw dependency:go-offline clean install && \
rm -rf ~/.m2/repository/roo/nw/application && \
rm -rf /opt/northwind-roo/app/application/target/*.war