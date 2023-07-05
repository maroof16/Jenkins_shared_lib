def call( String javaApp, String Dockerfile , String dockerRegistry) {
    //def imageName = "${hubUser}/${project}"
    
    // sh """
    // sudo chmod 777 /var/run/docker.sock
    // docker build -t ${hubUser}/${project} .
    // docker image tag ${hubUser}/${project} ${hubUser}/${project}:${ImageTag}
    // docker image tag ${hubUser}/${project} ${hubUser}/${project}:latest
    // """
    docker.withRegistry(dockerRegistry) {
              def dockerImage = docker.build(javaApp, "-f ${Dockerfile} .")
              dockerImage.push()
            }

}
