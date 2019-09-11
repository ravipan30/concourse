#!/bin/sh

set -e -x
Chmod +X build.sh
cd source-code
  ./mvnw clean package
cd ..

cp concourse/target/demo_ravi_h2-0.0.1-SNAPSHOT.jar  build-output/.
