package com.ipl.management.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Player {
  private String id;
  private String name;
  private String role;
  private int age;
  private boolean isOverseas;
  private boolean isUncapped;
  private Team team;
}
