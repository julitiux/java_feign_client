package com.java_feign_client.client;

import com.java_feign_client.model.Repository;
import com.java_feign_client.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "githubClient", url = "https://api.github.com")
public interface GitHubClient {

  @GetMapping("/repos/{owner}/{repo}")
  Repository getRepository(@PathVariable String owner, @PathVariable String repo);

  @GetMapping("/users/{username}")
  User getUser(@PathVariable("username") String username);

}
