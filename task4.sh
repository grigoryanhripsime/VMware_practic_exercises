#! /usr/bin/bash

declare -i border1=$1
declare -i border2=$2
declare -i num=$RANDOM%$border2+1
declare -i count=0
echo "First: " $num
select name in equal more less
do
	count+=1
	if [ ${name} == "equal" ]
	then 
		echo "Congrates!!!"
		break
	elif [ ${name} == "less" ]
	then 
		border2=$num
	elif [ ${name} == "more" ]
	then
		border1=$num	
	fi
	num=$RANDOM%$(($border2-$border1))+$border1
	echo $num
done
echo "Number of steps:" $count
