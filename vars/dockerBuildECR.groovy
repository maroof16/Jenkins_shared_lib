def call(String aws_account_id, String region, String ECR_repo_name){
    sh """
        docker build -t ${ECR_repo_name} .
        docker tag ${ECR_repo_name}:latest ${aws_account_id}.dkr.ecr.${region}.amazonaws.com/${ECR_repo_name}:latest
    """
}