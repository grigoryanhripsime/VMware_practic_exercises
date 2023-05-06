#! /usr/bin/bash

#to change

if [ $# -lt 1 ] || [ ! -f $1 ]
then 
	echo Usage: ./task3.sh filename
	exit
fi

res=0
k_a=0
k_b=0
q_a=0
q_b=0
for x in $(cat $1)
do
	if [ $x == "print" ]
	then
		echo -n "add "  	
                echo ${add[@]}
                
                echo -n "sub "
                echo ${sub[@]}
	fi
	if [ $k_a == 1 ]
	then
		add[$q_a]=$x
		q_a=$(($q_a+1))
		res=$(($res+$add[$q_a]))
		k_a=0		
	fi
	if [ $k_b == 1 ]
	then
		sub[$q_b]=$x
		q_b=$(($q_b+1))
		res=$(($res-$sub[$q_b]))
		k_b=0
	fi	

	if [ $x == "add" ]
	then
		k_a=1
	fi

	if [  $x == "sub" ]
	then
		k_b=1
	fi
done
echo -n "add " 
echo ${add[@]}

echo -n "sub "
echo ${sub[@]}

echo $res
