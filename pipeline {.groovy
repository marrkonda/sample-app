pipeline {
    agent any
    stages {
        stage('checkout') {
            steps{
                checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/marrkonda/sample-app.git']]])
            }
        }
        stage('build'){
            dir('sources') {
                steps{
                    sh 'python sample-app.py'
                }
            }
        }
        stage('test'){
            steps{
                echo 'The job is successfully running'
            }
        }
    }
}