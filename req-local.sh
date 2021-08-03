## script para invocar al servicio mutant corriendo en localhost


if [ -n "$1" ]
then
	payload=$1
else
	echo ""
	echo "uso: "
	echo ""
	echo "$0   '{ \"dna\": [ \"CGC\", \"GTA\" ] }' "
	echo ""
	exit 1
fi


RET=$(curl -X   POST http://localhost:8090/mutant    -H 'Content-Type: application/json'    -d "${payload}")

echo ""
echo $RET
echo ""



