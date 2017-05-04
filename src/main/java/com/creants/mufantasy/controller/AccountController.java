package com.creants.mufantasy.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.couchbase.client.java.document.json.JsonObject;
import com.creants.mufantasy.dao.GameHeroRepository;
import com.creants.mufantasy.entities.GameHero;
import com.creants.mufantasy.entities.Message;
import com.creants.mufantasy.services.MessageFactory;
import com.creants.mufantasy.services.WebService;

/**
 * @author LamHM
 *
 */
@RestController()
@RequestMapping(value = "/account")
public class AccountController {
	private static final String SERVER_NAME = "mus1";
	
	@Autowired
	private GameHeroRepository repository;

	@PostMapping(value = "login", produces = "application/json;charset=UTF-8")
	public @ResponseBody Message login(@RequestParam String token) throws Exception {
		String verify = WebService.getInstance().verify(token);
		JsonObject jo = JsonObject.fromJson(verify);
		JsonObject userInfo = jo.getObject("data");
		Long userId = userInfo.getLong("userId");
		GameHero gameHero = repository.findOne(SERVER_NAME+"#"+userId);
		
		
		// TODO kiểm tra server mà user vừa chơi để lấy nhân vật đã tạo
		Map<String, Object> params = new HashMap<>();
		params.put("servers", "[Mu Fantasy S1]");
		params.put("creants2x_url", "192.168.1.22:8889");
		params.put("media_url", "192.168.1.22:8889");
		params.put("hero", gameHero);
		return MessageFactory.createMessage(params);
	}

}
