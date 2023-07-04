def call(sonar-pass){
    withSonarQubeEnv(credentialsId: 'sonar-pass') {
    sh 'mvn clean package sonar:sonar' 
    }
}