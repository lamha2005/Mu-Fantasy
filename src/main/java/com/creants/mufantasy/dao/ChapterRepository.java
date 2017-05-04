package com.creants.mufantasy.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.creants.mufantasy.entities.GameHero;

/**
 * @author LamHM
 * id: gameHeroId#chapterId(server_id#user_id#hero_no#chapterId)
 */
@Repository
public interface ChapterRepository extends MongoRepository<GameHero, String> {

}
