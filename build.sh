#!/bin/sh

set -e -x
cd source-code
chmod +x mvnw
  ./mvnw clean package
cd ..

cp source-code/target/demo_ravi_h2-0.0.1-SNAPSHOT.jar  build-output/.
