package com.java_feign_client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "githubClient", url = "https://api.github.com")
public interface GitHubClient {

  @GetMapping("/repos/{owner}/{repo}")
  Repository getRepository(@PathVariable String owner, @PathVariable String repo);

}
