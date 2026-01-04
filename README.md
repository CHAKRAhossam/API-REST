# TP 9 : Client React pour API REST

> **Cours** : Architecture Microservices : Conception, Déploiement et Orchestration

Application React pour la gestion des comptes bancaires, connectée à une API REST.

## 🎬 Démo

[![Demo Video](https://img.shields.io/badge/▶️-Voir_la_démo-red?style=for-the-badge)](https://www.youtube.com/watch?v=VOTRE_VIDEO_ID)

## 📋 Fonctionnalités

- **Affichage des comptes** : Liste tous les comptes existants dans un tableau Bootstrap
- **Ajout de compte** : Formulaire pour créer un nouveau compte (solde, date, type)
- **Types de compte** : Courant ou Épargne

## 🛠️ Technologies

React | Axios | Bootstrap

## 📁 Structure

```
src/
├── components/
│   ├── CompteForm.js
│   └── CompteList.js
├── config.js
└── App.js
```

## 🚀 Installation

```bash
git clone https://github.com/CHAKRAhossam/compte-client.git
cd compte-client
npm install
npm start
```

L'application sera disponible sur [http://localhost:3000](http://localhost:3000)

## 🔧 Configuration

Modifier l'URL backend dans `src/config.js` :

```javascript
const API_BASE_URL = "http://localhost:8082/api";
```

## 👤 Auteur

**CHAKRAhossam**
