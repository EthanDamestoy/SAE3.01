#!/bin/bash

# Vérifier que src existe
[ ! -d src ] && { echo "Le dossier src n'existe pas."; exit 1; }

# Supprimer l'ancien fichier dans le dossier parent
[ -f compile.list ] && rm compile.list

# Générer compile.list dans le dossier parent
find src -type f -name "*.java" | sed 's|^|./|' > compile.list