package com.java_feign_client.model;

import lombok.Data;

@Data
public class User {

  private String login;
  private Long id;
  private String nodeId;
  private String avatarUrl;
  private String gravatarId;
  private String url;
  private String htmlUrl;
  private String followersUrl;
  private String followingUrl;
  private String gistsUrl;
  private String starredUrl;
  private String subscriptionsUrl;
  private String organizationsUrl;
  private String reposUrl;
  private String eventsUrl;
  private String receivedEventsUrl;
  private String type;
  private String siteAdmin;
  private String name;
  private String company;
  private String blog;
  private String location;
  private String email;
  private String notificationEmail;
  private Boolean hireable;
  private String bio;
  private String twitterUsername;
  private Integer publicRepos;
  private Integer publicGists;
  private Integer followers;
  private Integer following;
  private String createdAt;
  private String updatedAt;
  private Integer privateGists;
  private Integer totalPrivateRepos;
  private Integer ownedPrivateRepos;
  private Integer diskUsage;
  private Integer collaborators;
  private Integer twoFactorAuthentication;
  private Plan plan;
  private String suspendedAt;
  private String businessPlus;
  private String ldapDn;



}
