pipeline {
    agent any
    
   
    

    stages {
	    
	    
        stage('Pull GIT') {
            steps {
                echo 'Pulling...';
                  git branch: 'Skander',
                  url : 'https://github.com/aziz122/springdevops.git',
                  credentialsId: 'github';
            }
        }
        
	    
	    
        stage('Maven Package') {
            steps {
                sh "chmod +x mvnw "
                sh "./mvnw package"
            }
        }

	    
	    
  stage('Test') {
            steps {
                sh "./mvnw test"  
                junit '*/target/surefire-reports/TEST-.xml'
            }  
        }
        
        
           
        
        stage('SonarQube analysis') {
            steps {
              withSonarQubeEnv (installationName:'sonar'){
              sh """./mvnw sonar:sonar \
  -Dsonar.projectKey=project \
  -Dsonar.host.url=http://localhost:9000 \
                  }
                                                         }   
							 
                                    }
				    
				    
				    
    }   

