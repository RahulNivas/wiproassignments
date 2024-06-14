#!/bin/bash

fruits=("mango" "apple" "orange")
echo  "${fruits[0]}"
echo "${fruits[@]}"

for fruit in "${fruits[@]}"
  do
    echo "elements are $fruit"
  done

