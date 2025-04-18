set -u # or set -o nounset
: "$VERSION"


docker build -t ghcr.io/anderblm/arithmatic-service:$VERSION -- file ./Dockerfile
