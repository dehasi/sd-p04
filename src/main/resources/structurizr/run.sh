#!/bin/bash

docker pull structurizr/lite:2024.01.02

docker run -it --rm -p 8080:8080 -v ./workspace2:/usr/local/structurizr structurizr/lite:2024.01.02
