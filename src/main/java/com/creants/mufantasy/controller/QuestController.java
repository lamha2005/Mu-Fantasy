package com.creants.mufantasy.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.creants.mufantasy.entities.Message;
import com.creants.mufantasy.services.MessageFactory;

/**
 * @author LamHM
 *
 */
@RestController()
@RequestMapping(value = "/quest")
public class QuestController {

	@PostMapping(value = "list", produces = "application/json;charset=UTF-8")
	public @ResponseBody Message getMissions(@RequestParam(value="cid") String chapterId) throws Exception {
		
		return MessageFactory.createMessage(null);
	}
}
