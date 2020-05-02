pipeline {
    agent any
    sendMail("roussi.learning@gmail.com", "", "Started")
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
                 sendMail("roussi.learning@gmail.com", "", "Finished")
             }
        }
    }
}

def sendMail(to,msg,status) {
    emailext(
            to: "${to}",
            subject: " ${env.JOB_NAME}[${env.BUILD_NAME}] is ${status}",
            body: """
                ${msg}, to see complete details about the build see <a href='${env.BUILD_URL}'> ${env.BUILD_NAME} </a>
            """
    )
}