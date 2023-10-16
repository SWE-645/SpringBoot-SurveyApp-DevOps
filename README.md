## Table of Contents

- [AWS URLs](#aws-urls)
- [Installation and Setup](#installation-and-setup)
  - [Prerequisites](#prerequisites)
  - [Installation Steps](#installation-steps)
- [Contributing](#contributing)

## AWS URLs

- [Homepage](https://54.165.119.39/k8s/clusters/c-m-mvwnzsqq/api/v1/namespaces/hw2/services/http:survey:8080/proxy/Student_Survey/)
- [Kubernetes Application](https://54.165.119.39/dashboard/home)
- [Jenkins](http://3.92.250.69:8080/)


## Installation and Setup

## Prerequisites

- AWS account with appropriate permissions to create EC2 instances.
- EC2 instance running with a compatible Linux distribution (e.g., Ubuntu 20.04 LTS).

## Step 1: Install Rancher on AWS EC2 Instance

1. **SSH into your EC2 Instance:**

   ```bash
   ssh -i /path/to/your-key.pem ec2-user@ec2-instance-public-ip

2. **Install Docker**

    sudo apt-get update
    sudo apt-get install -y docker.io

3. **Install Rancher**

    sudo docker run -d --restart=unless-stopped -p 80:80 -p 443:443 rancher/rancher

## Step 2: Install Rancher on AWS EC2 Instance

    -Access Rancher Web UI using your EC2 instance's public IP address.
    -Follow Rancher's on-screen instructions to set up the custom Kubernetes cluster.
    -After the cluster is set up, ensure it is in a healthy state before proceeding to the next step.

## Step 3: Jenkins Setup and CI/CD Pipeline with Docker and Git

This guide will walk you through setting up Jenkins on an AWS EC2 instance, establishing a CI/CD pipeline using a Jenkinsfile and Dockerfile, and integrating the pipeline with a Git repository.

1. **Install Jenkins on AWS EC2 Instance**

   ```bash
   ssh -i /path/to/your-key.pem ec2-user@ec2-instance-public-ip

    sudo apt-get update
    sudo apt-get install -y openjdk-11-jdk
    wget -q -O - https://pkg.jenkins.io/debian/jenkins.io.key | sudo apt-key add -
    sudo sh -c 'echo deb http://pkg.jenkins.io/debian-stable binary/ > /etc/apt/sources.list.d/jenkins.list'
    sudo apt-get update
    sudo apt-get install -y jenkins
    sudo systemctl start jenkins

2. **Retrieve the initial admin password:**

    sudo cat /var/lib/jenkins/secrets/initialAdminPassword

## Step 3: Set Up CI/CD Pipeline with Jenkinsfile and Dockerfile

1. Create Dockerfile

2. Create Jenkinsfile

3. Integrate with Git Repository

4. Trigger the Pipeline

## Contributing

    - Nimitkumar Jogani
    - Sourav Singh  
    - Divyansh Joshi



