def call() {
    sh """
        docker_image_details=\$(docker images)

        first_line_image_id=\$(echo "\$docker_image_details" | awk 'NR==2 {print \$3}')
        second_line_image_id=\$(echo "\$docker_image_details" | awk 'NR==3 {print \$3}')

        echo "First Line Image ID: \$first_line_image_id"
        echo "Second Line Image ID: \$second_line_image_id"

        echo "Deleting Docker images..."
        docker rmi -f "\$first_line_image_id" "\$second_line_image_id"
    """
}
