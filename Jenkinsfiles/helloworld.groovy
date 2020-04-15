@Library('dcube-library@master') _

pipeline {
    agent any
    stages {
        stage('build') {
            steps {
               echo "HelloWorld 'testing'"
            }
        }
    }
}
