def call(sonarpass){
    withSonarQubeEnv(credentialsId: 'sonar-pass') {
    sh 'mvn clean package sonar:sonar' 
    }
}