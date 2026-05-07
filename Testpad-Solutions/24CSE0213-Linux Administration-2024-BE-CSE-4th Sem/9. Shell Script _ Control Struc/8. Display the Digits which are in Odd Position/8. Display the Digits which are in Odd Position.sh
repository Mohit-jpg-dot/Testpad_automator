read num
len=${#num}
for ((i=0; i<len; i+=2))
do
    echo "${num:i:1}"
done