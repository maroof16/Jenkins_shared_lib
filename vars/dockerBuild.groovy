def call(String hubUser, String ImageTag, String project) {
    def imageName = "${hubUser}/${project}"
    
    sh """
    sudo chmod 777 /var/run/docker.sock
    docker build -t ${imageName} .
    docker image tag ${imageName} ${imageName}:${ImageTag}
    docker image tag ${imageName} ${imageName}:latest
    """
}
