#!/bin/bash

while true
do
read -p "enter the number(0 to exit) " num
 if [ "$num" -eq 0 ]
   then
   echo "exiting.."
   break
 elif [ "$((num%2))" -eq 0 ]
   then
   echo "$num is even"
 else
   echo "$num is odd"
fi
done

output:

enter the number(0 to exit) 3
3 is odd
enter the number(0 to exit) 0

