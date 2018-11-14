pipeline {
    agent none 
    stages {
        stage('Build') {
            agent none 
             echo 'Maven package'
            steps {
                echo 'Hello, Maven'
                sh 'mvn --version'
            }
        }
        stage('Test') {
            agent  none 
            steps {
                echo 'Hello World!'
                sh 'java -version'
            }
        }
    }
}
