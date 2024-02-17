## Table of Contents

- [Contributors](#contributors)
- [AWS URLs](#aws-urls)
- [Installation and Setup](#installation-and-setup)
  - [Prerequisites](#prerequisites)
  - [Installation Steps](#installation-steps)
- [Kubernetes Ingress with Nginx Controller](#kubernetes-ingress-with-nginx-controller)
- [Helm Chart and Argo CD](#helm-chart-and-argo-cd)

## Contributors

    - Nimit Jogani (G01379296)
    - Sourav Singh  (G01390520)
    - Divyansh Joshi (G01399172)

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
   
    ```bash
    sudo apt-get update
    sudo apt-get install -y docker.io

4. **Install Rancher**
   
    ```bash
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

    ```bash
    sudo cat /var/lib/jenkins/secrets/initialAdminPassword

## Step 3: Set Up CI/CD Pipeline with Jenkinsfile and Dockerfile

1. Create Dockerfile

2. Create Jenkinsfile

3. Integrate with Git Repository

4. Trigger the Pipeline

## Kubernetes Ingress with Nginx Controller

## Implementation Steps

**1. Acquire Domain Name:** Obtain a domain name from a reputable domain registrar to access the deployed applications via the internet.

**2. DNS Configuration:** Create a hosted zone in AWS Route 53 and configure the DNS settings to link the acquired domain name to the hosted zone.

**3. Ingress Object Creation:** Develop an Ingress manifest file specifying routing rules that map the domain name to the relevant services within the Kubernetes cluster.

**4. Deploy Hello-World Application:** Deploy a containerized Nginx web server serving a basic web page in a namespace named nginx.

**5. Ingress Updation:** Ensure the Ingress object routes traffic to the Survey API Service and the Hello-World Application.

## Verification

- Verify the accessibility of both the survey API and the hello-world application by navigating to the configured DNS name.
Ensure the routing rules in the Ingress object correctly forward traffic to the respective Kubernetes services.

## Helm Chart and Argo CD

## Setup Steps
**1. Create a New EC2 Instance and Set Up a New Cluster:** Follow the steps from the lecture slides to create a new cluster using Rancher command.

**2. Install Helm:** Use the helm create chart-name command to create necessary files and directories, then upload them to a new GitHub repository.

**3. Install ArgoCD:** Install ArgoCD on the new Kubernetes cluster in the argocd1 namespace.

**4. Configure EC2 Security Group:** Add necessary port numbers to access the ArgoCD application UI.

**5. Create a New App in ArgoCD:** Configure the app with the GitHub repository link, specifying the source and destination for the deployment.

**6. Monitor Changes with ArgoCD:** Ensure ArgoCD monitors any changes in the GitHub repository, maintaining synchronization between the desired and current state.

## Contributing

    - Nimitkumar Jogani
    - Sourav Singh  
    - Divyansh Joshi
