#!/bin/bash

MAJOR_RELEASE=3
MINOR_RELEASE=0
COMMIT_ID=`git log -1 --pretty=%h` # last commit-id in short form

# To be executed from project root

docker build -t dockerhub.iudx.io/iudx/cat-prod:$MAJOR_RELEASE.$MINOR_RELEASE-$COMMIT_ID -f docker/prod.dockerfile . && \
docker push dockerhub.iudx.io/iudx/cat-prod:$MAJOR_RELEASE.$MINOR_RELEASE-$COMMIT_ID

docker build -t dockerhub.iudx.io/iudx/cat-dev:$MAJOR_RELEASE.$MINOR_RELEASE-$COMMIT_ID -f docker/dev.dockerfile . && \
docker push dockerhub.iudx.io/iudx/cat-dev:$MAJOR_RELEASE.$MINOR_RELEASE-$COMMIT_ID
