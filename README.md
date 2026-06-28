Products App — Spring Boot & JPA

Projet réalisé dans le cadre du TP JPA avec Spring Boot.

Technologies utilisées


Java 17
Spring Boot 4.1.0
Spring Data JPA
H2 Database (base de données en mémoire)
Lombok
Maven
Opérations testées

OpérationMéthode Spring DataAjouter un produitrepo.save(product)Consulter tous les produitsrepo.findAll()Consulter un produit par IDrepo.findById(id)Rechercher par nomrepo.findByNameContainingIgnoreCase(keyword)Mettre à jour un produitrepo.save(productModifié)Supprimer un produitrepo.deleteById(id)
Comment lancer le projet


Cloner le repository :


bashgit clone https://github.com/eyaelha/products-app.git


Ouvrir dans IntelliJ IDEA
Lancer ProductsAppApplication.java
Voir les résultats dans la console IntelliJ


Auteur

Eya Elha

ENSET — TP Spring Data JPA
