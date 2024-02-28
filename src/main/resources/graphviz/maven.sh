#!/bin/bash

# https://github.com/ferstl/depgraph-maven-plugin

cd /Users/ravil/experimental/sd-course/sd-p04

# outputs in /target/dependency-graph.dot
mvn com.github.ferstl:depgraph-maven-plugin:3.3.0:graph \
  -DshowGroupIds=true      \
  -DshowClassifiers=true   \
  -DshowVersions=true      \
  -DshowConflicts=true     \
  -DshowDuplicates=true
#  -Dscope=compile
 #-DoutputFileName=dependency-graph.json \
  #-DoutputDirectory=target \
#  -DgraphFormat=json       \
#  -Dincludes=me.dehasi    \
