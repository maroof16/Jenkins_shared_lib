def call(sonarpass){
    withSonarQubeEnv(credentialsId: 'sonarpass') {
    sh 'mvn clean package sonar:sonar' 
    }
}