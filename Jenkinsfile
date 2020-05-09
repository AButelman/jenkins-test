pipeline {
    agent any
    
    environment {
        SERVER_CREDENTIALS = credentials('49950104-adc0-46c1-9e03-6aec5b478ec4')
    }
    stages {
        stage("build") {
            steps {
                echo 'Build stage...'
            }
        }

        stage("test") {
            steps {
                echo 'Test stage...'            
            }
        }

        stage("deploy") {
            steps {
                echo 'Deploy stage...'
                echo "Deploying with ${SERVER_CREDENTIALS}"
            }
        }
    }
}

