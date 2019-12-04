void call(app_env) {
    stage "Deploy ${app_env.long_name} to Local Docker", {
        sh "docker pull localhost:5000/sdp-labs-sample-app:${env.GIT_SHA}"
    }
}
// docker pull localhost:5000/sdp-labs-sample-app:2f51ad978a5db23dd191799b4ea92941dd7a8c0e
// docker run -d -p 8081:8080 localhost:5000/sdp-labs-sample-app:2f51ad978a5db23dd191799b4ea92941dd7a8c0e