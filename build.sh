#!/bin/sh

set -e -x

cd source-code
  ./mvnw clean package
cd ..

cp demo_ravi_h2/target/demo_ravi_h2-0.0.1-SNAPSHOT.jar  build-output/.
