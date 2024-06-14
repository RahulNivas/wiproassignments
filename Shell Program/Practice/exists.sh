#!/bin/bash
read -p "enter the file " filename
if [[ -r $filename ]]
then
 echo "file has read ability "
else
 echo "file not have read "
fi
