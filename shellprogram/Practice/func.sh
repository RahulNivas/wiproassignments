#!/bin/bash
sum()
{
echo "this is rahul"
return 10
}
sum
result=$?
echo "result is $result"

greet()
{
a=$1
b=$2
c=$@
echo " a $a b $b c $c "
}
greet 4
greet 3 6 8
greet 2 4
