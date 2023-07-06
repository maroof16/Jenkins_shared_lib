def call(String ImageName, String ImageTag, String DockerHubUser){  
    withCredentials([usernamePassword(
        credentialsId: 'docker-credentials', 
        passwordVariable: 'docker-pass', 
        usernameVariable: 'docker-user'
    )]) {
        def docker_pass = env.docker-pass
        def docker_user = env.docker-user
        sh " docker login -u '$docker_user' -p '$docker_pass'"
        }
    sh " docker image push ${DockerHubUser}/${ImageName}:${ImageTag} "
    sh " docker image push ${DockerHubUser}/${ImageName}:latest "
}