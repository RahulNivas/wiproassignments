#!/bin/bash


func()
{
read -p "enter the filename " filename
  if [ -e $filename ]
then
  echo "file exist"
  else
  echo "file not found"
fi
}

func

