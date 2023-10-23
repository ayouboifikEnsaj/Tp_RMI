## Projet Java de Gestion de Salles et de Machines

Ce projet Java a été conçu pour gérer des salles et des machines à l'aide d'une interface graphique Swing. Il utilise Hibernate comme couche de persistance pour stocker les données de manière efficace et RMI (Remote Method Invocation) pour permettre la communication entre le client et le serveur. Le projet est divisé en deux parties distinctes : le serveur RMI et le client RMI. Chacune de ces parties joue un rôle spécifique dans le fonctionnement de l'application.

### Organisation du Projet

#### Serveur RMI
- Le serveur RMI est responsable de la logique métier et de la persistance des données.
- Utilisation de Hibernate : Hibernate est utilisé pour stocker et récupérer des données dans une base de données de manière efficace. Le serveur RMI interagit avec la base de données via Hibernate pour effectuer des opérations CRUD sur les salles et les machines.
- Exposition d'interfaces RMI : Le serveur expose des interfaces RMI qui définissent les méthodes que le client peut appeler à distance. Ces interfaces permettent au client d'effectuer des opérations telles que la création de nouvelles salles, l'ajout de machines, la récupération de la liste des salles, etc.
- Gestion de la sécurité : Le serveur RMI peut mettre en place des mécanismes de sécurité pour contrôler l'accès aux fonctionnalités.

#### Client RMI
- Le client RMI est l'interface utilisateur de l'application, permettant aux utilisateurs de gérer les salles et les machines de manière conviviale.
- Interface graphique Swing : Le client utilise Swing pour créer une interface utilisateur attrayante. Les utilisateurs peuvent interagir avec l'application à travers des fenêtres, des boutons, des champs de texte, etc.
- Communication RMI : Le client communique avec le serveur en utilisant RMI. Il invoque les méthodes exposées par le serveur RMI pour effectuer des opérations telles que la création de nouvelles salles, l'ajout de machines, etc.
- Affichage des données : Le client récupère les données de la base de données via le serveur RMI et les affiche de manière structurée à l'utilisateur.

### Fonctionnalités Clés
- Création, modification, suppression de salles.
- Ajout, modification, suppression de machines dans une salle.
- Récupération des détails des machines dans une salle spécifique.
- Affichage d'une liste de salles avec des informations de base.
- Gestion de la sécurité pour restreindre l'accès non autorisé.

Ce projet Java combine la puissance de Hibernate pour la gestion de données et RMI pour la communication client-serveur, offrant ainsi une solution complète de gestion de salles et de machines avec une interface utilisateur conviviale. La division du projet en composantes serveur et client permet une séparation claire des responsabilités et facilite la maintenance et le déploiement.

