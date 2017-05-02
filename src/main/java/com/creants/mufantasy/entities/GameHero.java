package com.creants.mufantasy.entities;

/**
 * @author LamHM
 *
 */
public class GameHero {
	// server_id#user_id#hero_no
	private String id;
	private String name;
	private int level;
	private long zen;
	private long soul;
	private int exp;


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public int getLevel() {
		return level;
	}


	public void setLevel(int level) {
		this.level = level;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public long getZen() {
		return zen;
	}


	public void setZen(long zen) {
		this.zen = zen;
	}


	public long getSoul() {
		return soul;
	}


	public void setSoul(long soul) {
		this.soul = soul;
	}


	public int getExp() {
		return exp;
	}


	public void setExp(int exp) {
		this.exp = exp;
	}

}
