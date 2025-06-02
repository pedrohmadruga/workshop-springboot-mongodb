# 📘 Project: MongoDB Springboot
## 📖 Project Overview:
> This project is a RESTFUL API designed to manage posts and comments in a social media, developed in Java 21 and using the Mongo database. It was designed to offer safe endpoints to CRUD operations regarding the posts and comments.

## Project Structure
├── workshopmong/

│   ├── config/

│   ├── domain/

│   ├── dto/

│   └── repository/

│   └── resources/

│   └── services/

The project was created to manage HTTP requests. The config package is responsible for loading the needed information for testing in the Mongo database, while the others are responsible for managing the application itself.

The domain package contains the data related to the entities that will be saved in the database, which are the user and the posts. The comments are in this package as a One-to-Many association to Post (meaning a Post can have multiple comments).

The dto package contains the necessary data of each entity (plus the comments). They will be used in the services package to perform CRUD operations.

The repositories package contains the operations necessary for CRUD operations. Every repository class inherits from the MongoRepository, making it easy and intuitive to do so.

The resources package is the controller package. Within it the GET, POST, PUT and DELETE operations are defined for each relevant entity.

The services package acts as an in-betweener between the repository and the resource. Within it I can call the MongoRepository methods (such as findById) and throw custom exceptions in case it was not possible to do so.

## ⚙️ Features
* REST controllers to control CRUD operations
* Validation to insert or update an entity
* Integration with MongoDB
* Date converter for easier search
* Query search with multiple parameters in the URL 

## 🚀 Tecnologies
* Language: Java 21
* Framework: Springboot3
* Database: MongoDB
