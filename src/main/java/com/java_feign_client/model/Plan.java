package com.java_feign_client.model;

import lombok.Data;

@Data
public class Plan {

  private Integer collaborators;
  private String name;
  private String space;
  private Integer privateRepos;

}
