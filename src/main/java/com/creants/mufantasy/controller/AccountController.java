package com.creants.mufantasy.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.creants.mufantasy.entities.Message;

/**
 * @author LamHM
 *
 */
@RestController("account")
public class AccountController {

	@PostMapping(value = "login", produces = "application/json;charset=UTF-8")
	public @ResponseBody Message login(@RequestParam(value = "server_name", required = false) String serverName,
			@RequestParam String token) throws Exception {

		return new Message();
	}

	@PostMapping(value = "create", produces = "application/json;charset=UTF-8")
	public @ResponseBody Message create(@RequestParam(value = "server_name", required = false) String serverName,
			@RequestParam String token) throws Exception {
		
		return new Message();
	}

}
