package com.java_feign_client.controller;

import com.java_feign_client.model.Repository;
import com.java_feign_client.model.User;
import com.java_feign_client.service.GitHubService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api")
public class GitHubController {

  private final GitHubService gitHubService;

  public GitHubController(GitHubService gitHubService) {
    this.gitHubService = gitHubService;
  }

  @GetMapping("info_repo/{owner}/{repo}")
  public ResponseEntity<Repository> getRepository(@PathVariable String owner, @PathVariable String repo) {
    return ResponseEntity.ok(gitHubService.getRepository(owner, repo));
  }

  @GetMapping("/users/{username}")
  public ResponseEntity<User> getUser(@PathVariable("username") String username) {
    return ResponseEntity.ok(gitHubService.getUser(username));
  }

}
