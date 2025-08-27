# 📚 Guía rapida de Git

## 🚀 Inicialización
- git init                        # Inicializa un nuevo repositorio Git
- git clone <repo-url>            # Clona un repositorio desde una URL

## 🔄 Desarrollo diario
- git status                      # Muestra el estado de los cambios
- git add <archivo>               # Añade cambios al area de preparacion
- git commit -m "Mensaje"         # Confirma los cambios con un mensaje

## 🌿 Gestion de ramas
- git branch                      # Lista las ramas
- git branch <nombre-rama>        # Crea una nueva rama
- git switch <nombre-rama>        # Cambia a una rama
- git branch -d <nombre-rama>     # Elimina una rama

## 🤝 Integración y colaboración
- git merge <rama>                # Fusiona los cambios de una rama
- git remote add <nombre> <url>   # Añade un repositorio remoto
- git push <remoto> <rama>        # Envia los cambios a un repositorio remoto
- git pull <remoto> <rama>        # Obtiene y fusiona cambios desde un repo remoto

## 🧹 Recuperacion y limpieza
- git fetch                       # Recupera cambios sin fusionar
- git reset --hard HEAD           # Desecha todos los cambios locales
- git revert <hash-commit>        # Revierte los cambios de un commit

## ✨ Avanzado y utilidades
- git diff <a> <b>                # Compara dos commits, ramas o archivos
- git show <hash>                 # Muestra detalles de un commit
- git stash                       # Guarda cambios temporales y limpia el working tree
- git stash pop                   # Restaura los cambios guardados del stash
- git cherry-pick <hash>          # Aplica un commit especifico en la rama actual
- git rebase <base>               # Reaplica commits sobre otra base
