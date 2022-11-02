#!/usr/bin/env bash
mvn archetype:generate \
-DgroupId=com.yangzk.services \
-DartifactId=simple \
-Dpackage=com.yangzk.services.simple \
-Dversion=1.0.0-SNAPSHOT \
-DarchetypeGroupId=com.yangzk \
-DarchetypeArtifactId=springboot-ddd-archetype \
-DarchetypeVersion=1.0.0-SNAPSHOT
