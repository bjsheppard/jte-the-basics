void call(app_env){
    stage "Deploy ${app_env.long_name} to Local Docker", {
        node{
            sh "docker pull localhost:5000/sdp-labs-sample-app:${env.GIT_SHA}"
        }
    }
}