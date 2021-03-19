pipeline {
    agent any
    tools
    {
        jdk 'jdk'
        maven 'Maven'
    }
    
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
         stage ('Sonar Analysis') {
            steps {
                withSonarQubeEnv('sonar'){
                    bat 'sonar-scanner.bat -Dsonar.projectKey=MyGit -Dsonar.projectName=MyGIt -Dsonar.projectVersion=1.0'
                }
            }
        }
    }
}
