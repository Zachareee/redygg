@echo off
call ./mvnw package -Dmaven.test.skip && ^
docker build . -t redygg-backend