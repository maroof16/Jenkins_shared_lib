def call(String ImageName, String ImageTag, String DockerHubUser) {
    sh """
        trivy image ${DockerHubUser}/${ImageName}:latest > trivyscan.txt
        cat trivyscan.txt
    """
}