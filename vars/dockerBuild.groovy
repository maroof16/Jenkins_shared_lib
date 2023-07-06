
def call(String ImageName, String ImageTag, String DockerHubUser){  
    sh """
     sudo chmod 777 /var/run/docker.sock
     docker build -t ${DockerHubUser}/${ImageName} .
     docker image tag ${DockerHubUser}/${ImageName} ${DockerHubUser}/${ImageName}:${ImageTag}
     docker image tag ${DockerHubUser}/${ImageName} ${DockerHubUser}/${ImageName}:latest
     docker rmi ${DockerHubUser}/${ImageName} ${DockerHubUser}/${ImageName}:${ImageTag}
     //docker rmi ${DockerHubUser}/${ImageName} ${DockerHubUser}/${ImageName}:latest
     """
}