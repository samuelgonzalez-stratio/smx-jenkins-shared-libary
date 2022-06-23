pipeline {
    agent any
    parameters {
        string(name: 'universe_version', defaultValue: 'no-Version', description: 'This is the universe version.')
    }
    stages {
        stage('First Stage') {
            steps {
                echo "Running ${env.BUILD_ID} on ${env.JENKINS_URL}"
                echo "Ejecutando Job para el universo ${params.universe_version}."
                echo "Hello Jenkins Pipeline!"
            }
        }
        stage('Second Stage') {
            steps {
                echo "I'm in the second Stage."
                doSmx()
            }
        }
    }
}