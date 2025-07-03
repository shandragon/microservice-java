#!/bin/bash
set -e  # Faz o script parar se algum comando falhar

echo ">>> 1. Rodando mvn clean install em /core"
cd /core
mvn clean install

cd /app

echo ">>> 2. Rodando mvn clean em /app"
mvn clean package -DskipTests

echo ">>> 3. Rodando spring-boot:run em /app"
mvn spring-boot:run