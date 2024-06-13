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

Output
file exist
Number of lines present in largest.sh file is 16
Number of Words present in largest.sh  file is 37
file exist
Number of lines present in variable.sh file is 17
Number of Words present in variable.sh  file is 48
