# Write your script here
#!/bin/bash
read n
count=0
for (( i=0; i<n;  i++ ))
do
    read inp
    if [ $((inp % 2)) -eq 0 ]; then
        ((count++))
    fi
done
echo $count