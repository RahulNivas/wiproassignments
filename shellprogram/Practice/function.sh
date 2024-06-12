#!/bin/bash
sum()
{
a=$1
b=$2
result=$(($a+$b))
echo "result :  $result"
}
sum 3 15

read -p "enter 1st parameter " arg1
read -p "enter 2nd parameter " arg2
sum $arg1 $arg2

sub()
{
a=$1
b=$2
result=$(($a-$b))
return $result
}
sub 3 2
res=$?
echo "result $res"
