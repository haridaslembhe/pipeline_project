pipeline {
    agent any

    tools {
        jdk 'jdk17'        // Define in Jenkins Global Tool Config
        maven 'maven3'     // Define in Jenkins Global Tool Config
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/your-repo/hello-jenkins.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                sh 'mvn package'
            }
        }

        stage('Run App') {
            steps {
                sh 'java -cp target/hello-jenkins-1.0-SNAPSHOT.jar com.example.HelloWorld'
            }
        }
    }

    post {
        success {
            echo '✅ Build and execution successful!'
        }
        failure {
            echo '❌ Build failed!'
        }
    }
}
