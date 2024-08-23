package com.java_feign_client.model;

import lombok.Data;

@Data
public class Repository {

  private Long id;
  private String nodeId;
  private String name;
  private String fullName;
  private Owner owner;
  private String htmlUrl;
  private String description;
  private Boolean fork;
  private String url;
  private String archiveUrl;
  private String assigneesUrl;
  private String blobsUrl;
  private String branchesUrl;
  private String collaboratorsUrl;
  private String commentsUrl;
  private String commitsUrl;
  private String compareUrl;
  private String contentsUrl;
  private String contributorsUrl;

}
