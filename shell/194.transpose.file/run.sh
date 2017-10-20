#!/usr/bin/env bash

while read -a line
do
    for (( i=0; i < "${#line[@]}"; i++ ))
    do
        word[$i]="${word[i]} ${line[$i]}"
    done
done < file.txt

for (( i=0; i < "${#word[@]}"; i++ ))
do
   echo ${word[i]}
done