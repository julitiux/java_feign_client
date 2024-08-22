package com.java_feign_client.model;

import lombok.Data;

@Data
public class User {

  private String login;
  private Long id;
  private String avatarUrl;
  private String url;
  private String htmlUrl;
  private String name;
  private String company;
  private String blog;
  private String location;
  private String email;
  private String bio;
  private Integer publicRepos;
  private Integer followers;
  private Integer following;

}
