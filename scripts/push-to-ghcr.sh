set -u
: "$VERSION"

echo ${{secrets.ACCESS_TOKEN}} | docker login ghcr.io --username anderblm --password-stdin
docker push ghcr.io/anderblm/arithmatic-service:$VERSION

