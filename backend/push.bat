@echo off
type key.json | docker login -u _json_key --password-stdin https://asia-southeast1-docker.pkg.dev
docker tag redygg-backend asia-southeast1-docker.pkg.dev/numeric-dialect-410315/cloud-run-source-deploy/redygg
docker push asia-southeast1-docker.pkg.dev/numeric-dialect-410315/cloud-run-source-deploy/redygg