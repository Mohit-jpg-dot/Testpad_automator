# Write your script here
read fileName
if [ -f "$fileName" ] ; then
echo "Exists"
else
echo "Not Exists" 
fi