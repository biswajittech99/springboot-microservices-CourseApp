pipeline {
	agent any
    stages {
		stage('Build') {
			steps {
				echo 'Building...'
                sh './mvnw clean package -DskipTests'   // if Maven wrapper
            }
        }
        stage('Test') {
			steps {
				echo 'Running tests...'
                sh './mvnw test'
            }
        }
        stage('Deploy') {
			steps {
				echo 'Deploying...'
            }
        }
    }
}
