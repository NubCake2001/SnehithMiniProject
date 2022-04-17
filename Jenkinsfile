pipeline {
  tools {
    jdk 'JDK'
    maven 'MAVEN'
  }
  environment {
    repoid = "snehithsai/mini_proj"
    dockerid = 'Ramam Raghavam'
    image = ''
  }
  agent any
  stages {
    stage('GIT CLONE') {
      steps {
        git 'https://github.com/NubCake2001/SnehithMiniProject'
      }
    }
    stage('MVN INSTALL') {
      steps {
        echo "Install and Build the Sci-Calculator"
        sh "mvn clean install"
      }
    }
    stage('Building Docker image') {
      steps{
        script {
          echo "Building Docker image"
          image = docker.build repoid + ":latest"
        }
      }
    }
    stage('Deploy Docker Image') {
      steps{
        script {
          echo "Deploying Docker Image to " + repoid
          docker.withrepoid( '', dockerid ) {
            image.push()
          }
        }
      }
    }
    stage('Ansible') {
      steps{
        ansiblePlaybook becomeUser: null, colorized: true, disableHostKeyChecking: true, installation: 'Ansible',  playbook: 'scical.yml', sudoUser: null
      }
    }    
  }
}
