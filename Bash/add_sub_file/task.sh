#! /usr/bin/bash
#Write a programm that finds files named add and sub,
#if file is named add, add numbers in that file to the result
#if file is named sub, subtract numbers in that file from the result
#print result


res=0
#getting file with names starting with add
aaa=$(find example/ $1 -name add* -type f)
for line in $(cat $aaa)
do
	res=$(($res+$line))
done

#getting file with names starting with add
aaa=$(find example/ $1 -name sub* -type f)
for line in $(cat $aaa)
do
	res=$(($res-$line))
done

echo $res




