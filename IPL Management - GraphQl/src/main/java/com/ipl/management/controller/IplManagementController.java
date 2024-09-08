package com.ipl.management.controller;

import com.ipl.management.entity.Player;
import com.ipl.management.service.IplManagementService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class IplManagementController {
//
//  @Autowired private IplManagementService iplManagementService;
//
//  @PostMapping("/addPlayer")
//  public ResponseEntity<String> addPlayer(@RequestBody Player player) {
//    return iplManagementService.addPlayer(player);
//  }
//
//  @GetMapping("/getPlayer")
//  public ResponseEntity<List<Player>> getAllPlayers() {
//    return iplManagementService.getAllPlayers();
//  }
//}
