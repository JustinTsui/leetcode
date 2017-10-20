#!/bin/bash

egrep -o "\b[[:alpha:]]+\b"  words.txt | sort | uniq -c | sort -k1,1nr | awk '{print $2 " " $1}'
