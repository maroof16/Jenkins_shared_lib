def call(String ImageName, String ImageTag, String DockerHubUser){  
    withCredentials([usernamePassword(
        credentialsId: 'docker-credentials', 
        passwordVariable: 'docker_pass', 
        usernameVariable: 'docker_user'
    )]) {
        sh " docker login -u '$docker_user' -p '$docker_pass'"
        }
    sh " docker image push ${DockerHubUser}/${ImageName}:${ImageTag} "
    sh " docker image push ${DockerHubUser}/${ImageName}:latest "
}