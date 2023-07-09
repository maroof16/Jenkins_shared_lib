def call(String aws_account_id, String region, String ECR_repo_name){
    sh """
        trivy image ${aws_account_id}.dkr.ecr.${region}.amazonaws.com/${ECR_repo_name}:latest > scan.txt
        cat scan.txt 
    """
}