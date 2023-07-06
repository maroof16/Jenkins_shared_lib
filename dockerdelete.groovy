#!/bin/bash

# Run the Docker image details command and store the output
docker_image_details=$(docker images)

# Extract the IMAGE ID from the first line using awk
first_line_image_id=$(echo "$docker_image_details" | awk 'NR==2 {print $3}')

# Extract the IMAGE ID from the second line using awk
second_line_image_id=$(echo "$docker_image_details" | awk 'NR==3 {print $3}')

# Display the extracted IMAGE IDs
echo "First Line Image ID: $first_line_image_id"
echo "Second Line Image ID: $second_line_image_id"

# Delete the Docker images using the extracted IMAGE IDs
echo "Deleting Docker images..."
docker rmi "$first_line_image_id" "$second_line_image_id"