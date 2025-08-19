pipeline {
	agent any

    tools {
		maven 'Maven3'   // Make sure you installed Maven under Jenkins -> Global Tool Configuration
        jdk 'jdk11'      // Or jdk17, depending on your project
    }

    stages {
		stage('Checkout') {
			steps {
				git branch: 'main', url: 'https://github.com/biswajittech99/springboot-microservices-CourseApp.git'
            }
        }

        stage('Build') {
			steps {
				sh 'mvn clean package -DskipTests'
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
    }

    post {
		success {
			echo 'Build Successful 🚀'
        }
        failure {
			echo 'Build Failed ❌'
        }
    }
}
