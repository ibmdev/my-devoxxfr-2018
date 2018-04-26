# my-devoxxfr-2018

# Monitoring en pratique d'une architecture microservice JHipster

## 1) Prérequis : 

Mise à jour de npm : npm i -g npm
Installation de Yarn :  npm install --global yarn
Mise à jour de Yarn :  npm upgrade --global yarn
Installation du générateur JHipster : yarn global add generator-jhipster

## 2) Création d'un projet JHipster

Ligne de commande : yo jhipster

## 3) Mavenisation et démarrage de l'application Spring Boot 2 

Ligne de commande : mvnw.cmd (Windows), ./mvnw (Mac OsX)

## 4) Accès à l'application

Url : http://localhost:8080/#/

# Spring Initializr : Spring Security and Angular

Création de l'application : https://start.spring.io/

Ressources tutoriel : http://spring.io/guides/tutorials/spring-security-and-angular-js/

# Micro Benchmarking avec JMH

https://antoniogoncalves.org/2015/01/15/micro-benchmarking-with-jmh-measure-dont-guess/

http://blog.soat.fr/2015/07/benchmark-java-introduction-a-jmh/

http://java-performance.info/jmh/

https://www.retit.de/continuous-benchmarking-with-jmh-and-junit/

# First TensorFlow application

Mise à jour de TensorFlow :  pip install tensorflow --upgrade

Invocation du programme : python my_first_estimator.py --batch_size=200 --train_steps=200



Getting started : https://www.tensorflow.org/get_started/premade_estimators

## The Tensorflow programming stack

![picture](my_first_tensorflow/images/tensorflow_programming_environment.png)

## The Deep Neural Network classifier model

![picture](my_first_tensorflow/images/full_network.png)

## Entraîner un modèle

Méthode "train" du classifieur/ Réseau de neurones DNNClassifier :

train(input_fn,hooks=None,steps=None,max_steps=None,saving_listeners=None)

input_fn : Fonction qui fournit les données (Datasets) sous forme de Tuples (features, labels) en entrée pour l'apprentissage en mode minibatchs

steps : Nombre d'étapes pour lesquels on entraîne le modèle. Si NONE alors on entraîne jusqu'à ce que la fonction input_fn génère une erreur "OutOfRange" ou une exception "StopIteration". 

max_steps : Nombre total d'étapes pour lesquels on entraîne le modèle. Si renseigné, alors steps = NONE
Si steps = 100, alors 2 appels à train signifie 200 itérations
Si max_steps = 100, alors 2 appels à train signifie 100 itérations
























