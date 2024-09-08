package com.ipl.management.model;

import com.ipl.management.entity.Team;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PlayerInput {

  private String id;
  private String name;
  private String role;
  private int age;
  private boolean isOverseas;
  private boolean isUncapped;
  private Team team;
}
