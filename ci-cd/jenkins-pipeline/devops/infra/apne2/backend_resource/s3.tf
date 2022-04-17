data "aws_canonical_user_id" "current" {}

resource "aws_s3_bucket" "ch-devops-backend" {
  bucket = "ch-devops-backend"
  tags = {
    Name = "devops-backend-bucket",
    Environment = "Dev"
  }
}

resource "aws_s3_bucket_public_access_block" "example" {
  bucket = aws_s3_bucket.ch-devops-backend.id

  block_public_acls   = true
  block_public_policy = true
}
