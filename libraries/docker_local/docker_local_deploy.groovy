void call(app_env){
    stage "Deploy ${app_env.long_name} to Local Docker", {
        node{
            sh "docker pull 172.21.0.2:5000/sdp-labs-sample-app:${env.GIT_SHA}"
        }
    }
}