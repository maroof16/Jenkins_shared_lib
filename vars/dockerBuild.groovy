def call(String hubUser, String ImageTag, String project) {
    //def imageName = "${hubUser}/${project}"
    
    sh """
    sudo chmod 777 /var/run/docker.sock
    docker build -t ${hubUser}/${project} .
    docker image tag ${hubUser}/${project} ${hubUser}/${project}:${ImageTag}
    docker image tag ${hubUser}/${project} ${hubUser}/${project}:latest
    """
}
