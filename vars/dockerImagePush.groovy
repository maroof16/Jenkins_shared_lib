def call(String ImageName, String ImageTag, String DockerHubUser){  
    withCredentials([usernamePassword(
        credentialsId: 'docker-credentials', 
        passwordVariable: 'docker-pass', 
        usernameVariable: 'docker-user'
    )]) {
        docker-pass = env.docker_pass
        docker-user = env.docker_user
        sh " docker login -u '$docker_user' -p '$docker_pass'"
        }
    sh " docker image push ${DockerHubUser}/${ImageName}:${ImageTag} "
    sh " docker image ${DockerHubUser}/${ImageName}:latest "
}