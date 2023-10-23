## Projet Java de Gestion de Salles et de Machines

Ce projet Java a été conçu pour gérer des salles et des machines à l'aide d'une interface graphique Swing. Il utilise Hibernate comme couche de persistance pour stocker les données de manière efficace et RMI (Remote Method Invocation) pour permettre la communication entre le client et le serveur. Le projet est divisé en deux parties distinctes : le serveur RMI et le client RMI. Chacune de ces parties joue un rôle spécifique dans le fonctionnement de l'application.

### Organisation du Projet
### schema de la base de donée
![shema de base de donee](https://github.com/ayouboifikEnsaj/Tp_RMI/assets/107751911/e71a9144-d9f0-463a-aa9c-1f6e95942c57)

#### Serveur RMI
- Le serveur RMI est responsable de la logique métier et de la persistance des données.
- Utilisation de Hibernate : Hibernate est utilisé pour stocker et récupérer des données dans une base de données de manière efficace. Le serveur RMI interagit avec la base de données via Hibernate pour effectuer des opérations CRUD sur les salles et les machines.
- Exposition d'interfaces RMI : Le serveur expose des interfaces RMI qui définissent les méthodes que le client peut appeler à distance. Ces interfaces permettent au client d'effectuer des opérations telles que la création de nouvelles salles, l'ajout de machines, la récupération de la liste des salles, etc.
- Gestion de la sécurité : Le serveur RMI peut mettre en place des mécanismes de sécurité pour contrôler l'accès aux fonctionnalités.
![server structure](https://github.com/ayouboifikEnsaj/Tp_RMI/assets/107751911/fc319304-bb54-408f-abc0-dc05b28ef732)

#### Client RMI
- Le client RMI est l'interface utilisateur de l'application, permettant aux utilisateurs de gérer les salles et les machines de manière conviviale.
- Interface graphique Swing : Le client utilise Swing pour créer une interface utilisateur attrayante. Les utilisateurs peuvent interagir avec l'application à travers des fenêtres, des boutons, des champs de texte, etc.
- Communication RMI : Le client communique avec le serveur en utilisant RMI. Il invoque les méthodes exposées par le serveur RMI pour effectuer des opérations telles que la création de nouvelles salles, l'ajout de machines, etc.
- Affichage des données : Le client récupère les données de la base de données via le serveur RMI et les affiche de manière structurée à l'utilisateur.
  
![structure client server](https://github.com/ayouboifikEnsaj/Tp_RMI/assets/107751911/7ee31c63-572b-4f65-b196-b1c2385f0b85)

### Fonctionnalités Clés
### Création, modification, suppression de salles.
---création:
![ajoute d'une salle](https://github.com/ayouboifikEnsaj/Tp_RMI/assets/107751911/baed66c1-f1f0-4a97-b1e7-6bb3c9266a86)

---modification :
![image](https://github.com/ayouboifikEnsaj/Tp_RMI/assets/107751911/f0934293-7540-4fdd-b8ec-0ca60b1ab4a8)

--supression :
![suppression des salles](https://github.com/ayouboifikEnsaj/Tp_RMI/assets/107751911/fdaadf10-d09c-4f88-a254-f52af92635c7)


### Ajout, modification, suppression de machines dans une salle.

-- ajoute :

![addmachine](https://github.com/ayouboifikEnsaj/Tp_RMI/assets/107751911/0c9aa4be-7635-4c12-a919-4abd5da294f0)

--modification -----

![update machine](https://github.com/ayouboifikEnsaj/Tp_RMI/assets/107751911/05d8a73b-0d71-4a92-93d8-90c200e73868)


--supression

![delete machine](https://github.com/ayouboifikEnsaj/Tp_RMI/assets/107751911/59612fb7-cffc-4bf0-a257-e9099cede89d)

### trouver des machines par des salles.
![recherche by salle](https://github.com/ayouboifikEnsaj/Tp_RMI/assets/107751911/f74576e0-ee53-4f43-800f-6c2f16871f83)


Ce projet Java combine la puissance de Hibernate pour la gestion de données et RMI pour la communication client-serveur, offrant ainsi une solution complète de gestion de salles et de machines avec une interface utilisateur conviviale. La division du projet en composantes serveur et client permet une séparation claire des responsabilités et facilite la maintenance et le déploiement.


by Ayoub OIFIK
