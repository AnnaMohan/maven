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
                    checkout([$class: 'GitSCM', branches: [[name: '*/main']], doGenerateSubmoduleConfigurations: false, extensions: [], gitTool: 'Default', submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'Gitcred', url: 'https://github.com/AnnaMohan/maven.git' ]]])
            }
        }
        stage('complie') {
            steps {
              
                   bat 'mvn clean install'
              
            }
        }
    }
}
