@Library('smx-shared-library')_
import smx.Util

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
                doSmx() // Esta instrucción, aunque físicamente en este proyecto, está expuesta en Jenkins como biblioteca común.
                Util ut = new Util()
                ut.myEcho("Echo me!")
                print ut.mySumOne(3)
            }
        }
    }
}