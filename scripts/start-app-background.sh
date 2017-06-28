#!/bin/sh

BASE_DIR=`pwd`
NW_LOG="$BASE_DIR/nw-app.log"

./start-app.sh > $NW_LOG 2>&1 &
for (( c=1; c<=360; c++ ))
do
	if grep 'Started NorthwindApplication in' $NW_LOG
	then
		echo "NorthwindApplication READY !!!"
	    break
	else
	    tail -n 5 $NW_LOG
	    sleep 1
	    echo "Seconds: $c"
	fi
done
