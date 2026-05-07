# Write your script here
read a
read b
read c
if [ "$a" -ge "$b" ] && [ "$a" -ge "$c" ] ; then
echo $a
elif [ "$b" -ge "$a" ] && [ "$b" -ge "$c" ] ; then 
echo $b
else
echo $c
fi