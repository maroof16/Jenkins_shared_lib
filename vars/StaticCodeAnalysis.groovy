def call(){
    withSonarQubeEnv(credentialsId: 'sonar-token') {
    sh 'mvn clean package sonar:sonar' 
    }
}