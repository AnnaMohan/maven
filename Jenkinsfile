pipeline {
    agent any
    stages {
        stage('start') {
            steps {
               echo 'This is a minimal pipeline.'
               
            }
        }
        stage('fetch') {
            steps {
               git url: 'https://github.com/AnnaMohan/maven.git'
            }
        }
        stage('complie') {
            steps {
              
                   bat 'mvn clean install'
              
            }
        }
    }
}