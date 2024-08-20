package com.java_feign_client;

import org.springframework.stereotype.Service;

@Service
public class GitHubService {

  private final GitHubClient gitHubClient;

  public GitHubService(GitHubClient gitHubClient) {
    this.gitHubClient = gitHubClient;
  }

  public Repository getRepository(String owner, String repo){
    return gitHubClient.getRepository(owner, repo);
  }

}
