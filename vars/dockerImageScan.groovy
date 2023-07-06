def call() {
    trivy image tag ${DockerHubUser}/${ImageName} ${DockerHubUser}/${ImageName}:latest > trivyscan.txt
    cat trivyscan.txt
}