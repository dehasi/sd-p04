#!/bin/bash

java -jar schemaspy-6.2.4.jar \
  -t sqlite-xerial \
  -db /Users/ravil/experimental/sd-course/sd-p04/src/main/resources/db/db  \
  -dp sqlite-jdbc-3.45.1.0.jar \
  -u root \
  -p root \
  -o output \
  -s public  \
   -debug -cat "%"

# http://localhost:63342/sd-p04/src/main/resources/schemaspy/output/tables/users.html
# https://schemaspy.org/samples/epivirusurf/
# https://schemaspy.org/samples/epivirusurf/tables/sequence.html