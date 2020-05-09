pipeline {
    agent any
    
    def gv
    
    parameters {
            choice(name: 'VERSION', choices: ['1.1.0', '1.2.0', '1.3.0'], description: 'Version to deploy on prod.')
            booleanParam(name: 'executeTests', defaultValue: true, description: 'Run tests or not.')
    }
    environment {
        SERVER_CREDENTIALS = credentials('49950104-adc0-46c1-9e03-6aec5b478ec4')
    }
    stages {
        stage("init") {
            steps {
                script {
                    gv = load "myScript.groovy"
                }
            }
        }
        
        stage("build") {
            steps {
                script {
                    gv.buildApp()
                }
            }
        }

        stage("test") {
            when {
                expression {
                    params.executeTests == true
                }
            }
            steps {
                script {
                    gv.testApp()
                }
            }
        }

        stage("deploy") {
            steps {
                script {
                    gv.deployApp()
                }
            }
        }
    }
}

