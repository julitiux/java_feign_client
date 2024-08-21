package com.java_feign_client;

import com.java_feign_client.model.Repository;
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
