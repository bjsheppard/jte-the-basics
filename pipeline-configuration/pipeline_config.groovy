libraries{
  sdp{
    images{
      registry = "http://0.0.0.0:5000" // registry url
      cred = "sdp-docker-registry"// jenkins cred id to authenticate
      docker_args = "--network=try-it-out_sdp"  // docker runtime args
    }
  }
  github{
    source_type = "github"
  }
  sonarqube{
    enforce_quality_gate = true
  }
  docker{
    registry = "0.0.0.0:5000"
    cred = "sdp-docker-registry"
    remove_local_image = true
  }
  docker_local
}

stages{
    continuous_integration{
        static_code_analysis
        build
    }
}

application_environments{
    dev{
        long_name = "Development"
        docker_network = "dev"
        docker_prt = "8081"
    }
    prod{
        long_name = "Production"
        docker_network = "prod"
        docker_port = "8082"
    }
}