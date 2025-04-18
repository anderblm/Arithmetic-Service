set -u
: "$CONTAINER_REGISTRY"
: "$VERSION"
: "$CONTAINER_REGISTRY_UN"
: "$CONTAINER_REGISTRY_PW"

echo $REGISTRY_PW | docker login --username $CONTAINER_REGISTRY_UN --password-stdin $CONTAINER_REGISTRY
docker tag ghcr.io/anderblm/arithmatic-service:$VERSION   $CONTAINER_REGISTRY/arithmatic-service:$VERSION
docker push $CONTAINER_REGISTRY/arithmatic-service:$VERSION