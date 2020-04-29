pipeline {
    agent any

    stages {
        stage('Compile') {
            steps {
                echo '==== Compiling project ===='
            }
        }
        stage('Unit Tests') {
            steps {
                echo '==== Running unit testing ===='
            }
        }
        stage('Functional Tests') {
            steps {
                echo '==== Running functional tests ===='
            }
        }
        stage('Building artifact') {
           steps {
               echo '==== Building artifact ===='
           }
        }
        stage('Deploying artifact') {
             steps {
                 echo '==== Deploying artifact ===='
             }
        }
    }
}