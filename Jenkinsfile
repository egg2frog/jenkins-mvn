pipeline{
    agent any
    stages {
        stage("Git clone") {
            steps {
                git branch: 'main', url: 'https://github.com/egg2frog/jenkins-mvn.git'
            }
        }
        stage("MVN test") {
            steps {
                sh 'mvn test'
            }
        }
        stage("MVN build") {
            steps {
                sh 'mvn package'
            }
        }
        stage("MVN deploy") {
            steps {
                echo "Deploying war file to Tomcat"
            }
        }
    }
}