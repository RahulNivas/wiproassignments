#!/bin/bash
read -p "enter nuumber one: " num1
read -p "enter nuumber two: " num2
read -p "enter nuumber three: " num3
if (($num1>$num2 & $num1>$num3 ))
then
 echo "num1 is greater "
elif (($num2>$num3))
then
 echo "num2 is greater "
else
 echo "num3 is greater "
fi
echo "thanks"
