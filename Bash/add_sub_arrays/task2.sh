#! /usr/bin/bash

"""
Gets as an argument file name, checks if that file exists or not
loops file and if line's first element is: 
	add, then adds next element to 'add' array
	sub, then adds snext element to 'sub' array
if line's first element is print, then prints add and sub arrays
at the end returns sum of add array's elements and subtracts elements from sum that are in sub array
prints add array, sub array and result
"""

if [ $# -lt 1 ] || [ ! -f $1 ]
then 
	echo Usage: ./task2.sh filename
	exit
fi
k=0
q=0
res=0
IFS=$'\n'
for line in $(cat $1)
do
	IFS=" "
	read var1 var2 < <(echo $line)

	if [ $var1 == "print" ]
	then
		echo "Add:" ${add[*]}
                echo "Sub:" ${sub[*]}
		echo "Result:" $res
	fi


	if [  $var1 == "add" ]
	then
		add[$k]=$var2
		k=$(($k+1))
		res=$(($res+$var2))
	elif [ $var1 == "sub" ]
	then
		sub[$q]=$var2
		q=$(($q+1))
		res=$(($res-$var2))
	fi

done

echo "Add:" ${add[*]}
echo "Sub:" ${sub[*]}
echo "Result:" $res
