#!/usr/bin/bash

echo $0 $1 $2 $3

if [ $1 = + ];
then echo $(($2+$3));
elif [ $1 = - ];
then echo $(($2-$3));
else echo error;
fi
