#!/bin/bash
count()
{
 filename=$1
 if [ -e $filename ]
   then
      echo "file exist"
      lines=$(wc -l < "$filename")
      echo "the number of lines in $filename is $lines"
      words=$(wc -w < "$filename")
      echo "the number of words in $filename is $words"
     else
      echo "file not exist"
     fi
}
count "variable.sh"
count "largest.sh"
