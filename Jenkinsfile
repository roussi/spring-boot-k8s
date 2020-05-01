pipeline {
    agent any

    stages {
        stage('Compile') {
            steps {
                sh './mvnw clean compile'
            }
        }
        stage('Unit Tests') {
            steps {
                sh './mvnw clean test'
            }
        }
        stage('Functional Tests') {
            steps {
                echo '==== Running functional tests ===='
            }
        }
        stage('Sonar checks') {
            steps {
                echo '==== Running sonar checks ===='
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