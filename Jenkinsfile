pipeline {
    agent any
    stages {
        stage('Setup parameters') {
            steps {
                script {
                    properties([
                        string(
                        defaultValue: 'no-Universe-version',
                        name: 'universe_version'),
                        trim: true
                    ])
                }
            }
        }
        stage('First Stage') {
            steps {
                echo "Hello Jenkins Pipeline!"
            }
        }
        stage('Second Stage') {
            steps {
                echo "I'm in the second Stage."
            }
        }
    }
}