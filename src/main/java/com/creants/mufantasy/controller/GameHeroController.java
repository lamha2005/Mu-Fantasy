package com.creants.mufantasy.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.creants.mufantasy.dao.GameHeroRepository;
import com.creants.mufantasy.entities.ErrorCode;
import com.creants.mufantasy.entities.GameHero;
import com.creants.mufantasy.entities.Message;
import com.creants.mufantasy.services.MessageFactory;

/**
 * @author LamHM
 *
 */
@RestController
@RequestMapping(value = "/gamehero")
public class GameHeroController {
	@Autowired
	private GameHeroRepository repository;


	@PostMapping(value = "create", produces = "application/json;charset=UTF-8")
	public @ResponseBody Message create(@RequestParam(value = "server_name", required = false) String serverName,
			@RequestParam(value = "hero_name") String heroName, HttpSession session) throws Exception {
		String serverId = "mus1";
		long userId = (long) session.getAttribute("USER_ID");

		GameHero gameHero = repository.findOne(serverId + "#" + userId);
		if (gameHero != null) {
			return MessageFactory.createMessage(gameHero);
		}

		gameHero = new GameHero(serverId, userId);
		gameHero.setExp(0);
		gameHero.setLevel(1);
		gameHero.setName(heroName);
		gameHero.setSoul(0);
		gameHero.setStatmina(0);
		gameHero.setZen(0);

		try {
			repository.save(gameHero);
		} catch (Exception e) {
			return MessageFactory.createErrorMessage(ErrorCode.BAD_REQUEST);
		}

		return MessageFactory.createMessage(gameHero);
	}


}
