def call(String aws_account_id, String region, String ECR_repo_name){
     sh """
    //     aws ecr get-login-password --region ${region} | docker login --username AWS --password-stdin ${aws_account_id}.dkr.ecr.${region}.amazonaws.com
        docker push ${ECR_repo_name}:latest ${aws_account_id}.dkr.ecr.${region}.amazonaws.com/${ECR_repo_name}:latest 
    """
}