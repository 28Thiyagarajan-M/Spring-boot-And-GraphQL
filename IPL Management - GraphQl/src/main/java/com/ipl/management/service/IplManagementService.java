package com.ipl.management.service;

import com.ipl.management.entity.Player;
import com.ipl.management.entity.Team;
import com.ipl.management.model.PlayerInput;
import com.ipl.management.repository.IplManagementRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IplManagementService {

    private final IplManagementRepository iplManagementRepository;

    public IplManagementService(IplManagementRepository iplManagementRepository) {
        this.iplManagementRepository = iplManagementRepository;
    }

    public List<Player> getAllPlayers() {
        return iplManagementRepository.findAll();
    }

    public Player getPlayerById(String id) {
        return iplManagementRepository.findById(id).orElse(null);
    }

    public String addPlayer(String name, int age, String role,Team team, Boolean isOverseas, Boolean isUncapped) {
        Player player = new Player();
        player.setName(name);
        player.setAge(age);
        player.setRole(role);
        player.setTeam(team);
        player.setUncapped(isUncapped);
        player.setOverseas(isOverseas);
        iplManagementRepository.save(player);
        return "Player added successfully"+ player.getId();
    }

    public String savePlayer(PlayerInput playerInput) {
        Player player = Player.builder()
                .age(playerInput.getAge())
                .role(playerInput.getRole())
                .name(playerInput.getName())
                .team(playerInput.getTeam())
                .isOverseas(playerInput.isOverseas())
                .isUncapped(playerInput.isUncapped())
                .build();
        iplManagementRepository.save(player);
        return "Player saved successfully "+ player.getId() + " " + player.getName();
    }

    public String updatePlayer(String id, String name, int age, String role,Team team, Boolean isOverseas, Boolean isUncapped ) {
        Player player = iplManagementRepository.findById(id).orElse(null);
        if(player == null) {
            return "Player not found";
        }
        player.setAge(age);
        player.setRole(role);
        player.setName(name);
        player.setTeam(team);
        player.setUncapped(isUncapped);
        player.setOverseas(isOverseas);
        iplManagementRepository.save(player);
        return "Player updated successfully "+ player.getId() + " " + player.getName();
    }

    public String deletePlayer(String id) {
        Player player = iplManagementRepository.findById(id).orElse(null);
        if(player == null) {
            return "Player not found";
        }
        iplManagementRepository.delete(player);
        return "Player deleted successfully "+ player.getId() + " " + player.getName();
    }

    public String deleteAllPlayers() {
        iplManagementRepository.deleteAll();
        return "All players deleted successfully";
    }

}
