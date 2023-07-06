def call() {
    sh """
        trivy image ${DockerHubUser}/${ImageName}:latest > trivyscan.txt
        cat trivyscan.txt
    """
}