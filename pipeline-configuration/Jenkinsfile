on_commit {
  static_code_analysis()
}

on_pull_request to: develop, {
  static_code_analysis()
  build()
}

on_merge to: develop, {
  static_code_analysis()
  build()
  //deploy_to dev
}