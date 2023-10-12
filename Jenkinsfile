// authored by : Nimit
pipeline {
    agent any
    environment {
        BUILD_TIMESTAMP = "${new java.text.SimpleDateFormat('yyyyMMddHHmm').format(new Date())}"
        DOCKERHUB_PASS = credentials('docker-cred') 
    }
    stages {
        stage("Checkout") {
            steps {
                checkout scm
                sh 'ls -al'
                sh 'pwd'
                sh 'cd src/main/webapp && jar -cvf Student_Survey.war *'
                sh("docker build --tag njogani/swe645_hw2:${BUILD_TIMESTAMP} .")
                sh("echo ${BUILD_TIMESTAMP}")
                sh('sudo docker login -u njogani -p "${DOCKERHUB_PASS}"')
            }   
        }
        stage("Push docker image") {
            steps {
                sh("sudo docker push njogani/swe645_hw2:${BUILD_TIMESTAMP}")
            }
        }
        stage("Deploy docker image to rancher cluster with 3 pod using nodeport") {
            steps {
                sh("kubectl set image deployment/survey container-0=njogani/swe645_hw2:${BUILD_TIMESTAMP} -n hw2")
            }
        }
    }
}
