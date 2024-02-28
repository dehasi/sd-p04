# https://schemaspy.org/samples/epivirusurf/
# https://schemaspy.org/samples/epivirusurf/tables/sequence.html

SCHEMA=schema_name
rm -rf ${PWD}/${SCHEMA}
mkdir ${PWD}/${SCHEMA} && chmod 777 ${PWD}/${SCHEMA}
cat schema_name.properties ${SCHEMA}.properties > build.properties

docker run \
-v "${PWD}/${SCHEMA}:/output"  \
-v "${PWD}/build.properties:/schemaspy.properties" \
-v "${PWD}:/drivers" \
--network="host" \
schemaspy/schemaspy:6.2.4 #latest

# java -jar schemaSpy.jar -t sqlite -db <your file> -o <output>
# java -jar schemaspy-6.2.4.jar -t sqlite -dp /Users/ravil/experimental/sd-course/sd-p04/src/main/resources/db/db  -db dbName -host server -port 1433 -noschema -u root -p root -o output