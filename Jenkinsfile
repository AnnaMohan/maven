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
                //    checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], gitTool: 'Default', submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'Gitcred', url: 'https://github.com/AnnaMohan/maven.git' ]]])
                checkout scm
            }
        }
        stage('complie') {
            steps {
              
                   bat 'mvn clean install'
              
            }
        }
    }
}
