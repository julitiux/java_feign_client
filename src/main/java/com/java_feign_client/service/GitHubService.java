package com.java_feign_client.service;

import com.java_feign_client.client.GitHubClient;
import com.java_feign_client.model.Repository;
import com.java_feign_client.model.User;
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

  public User getUser(String username){
    return gitHubClient.getUser(username);
  }

}
