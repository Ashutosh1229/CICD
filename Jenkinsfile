pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
        stage('Test') {
            steps {
                echo 'Test World'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploy World'
            }
        }
    }
    
    post
    {
        always{
            echo 'post working'
        }
    }
}
