package com.ipl.management.repository;

import com.ipl.management.entity.Player;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IplManagementRepository extends MongoRepository<Player, String> {}
