pipeline {
   agent { label 'child' }

    stages {
        stage('Hello') {
            steps {
                echo 'Hello, Jenkins Pipeline!'
            }
        }

        stage('Deployment') {
            steps {
                echo 'Deployment step running...'
            }
        }
    }
}
