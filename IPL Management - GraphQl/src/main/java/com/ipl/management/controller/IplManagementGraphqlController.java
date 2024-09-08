package com.ipl.management.controller;

import com.ipl.management.entity.Player;
import com.ipl.management.entity.Team;
import com.ipl.management.model.PlayerInput;
import com.ipl.management.service.IplManagementService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class IplManagementGraphqlController {

    private final IplManagementService iplManagementService;


    public IplManagementGraphqlController(IplManagementService iplManagementService) {
        this.iplManagementService = iplManagementService;
    }

    @QueryMapping
    public List<Player> getAllPlayers() {
        return iplManagementService.getAllPlayers();
    }

    @QueryMapping
    public Player getPlayerById(@Argument String id) {
        return iplManagementService.getPlayerById(id);
    }

    @MutationMapping
    public String addPlayer(@Argument String name, @Argument int age, @Argument String role, @Argument Team team, @Argument Boolean isOverseas, @Argument Boolean isUncapped) {
        return iplManagementService.addPlayer(name, age, role, team, isUncapped, isOverseas);
    }

    @MutationMapping
    public String savePlayer(@Argument PlayerInput player) {
        return iplManagementService.savePlayer(player);
    }

    @MutationMapping
    public String updatePlayer(@Argument String id, @Argument String name, @Argument int age, @Argument String role, @Argument Team team, @Argument Boolean isOverseas, @Argument Boolean isUncapped) {
        return iplManagementService.updatePlayer(id, name, age, role, team, isUncapped, isOverseas);
    }

    @MutationMapping
    public String deletePlayer(@Argument String id) {
        return iplManagementService.deletePlayer(id);
    }

    @MutationMapping
    public String deleteAllPlayers() {
        return iplManagementService.deleteAllPlayers();
    }

}
