package com.creants.mufantasy.entities;

import com.creants.mufantasy.entities.states.AdditionStats;
import com.creants.mufantasy.entities.states.BaseStats;
import com.creants.mufantasy.entities.states.SubStats;

/**
 * @author LamHM
 *
 */
public abstract class HeroClass {
	protected int id;
	protected String name;
	protected int level;
	protected int exp;
	private BaseStats baseStats;
	private SubStats subStats;
	private AdditionStats additionStats;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getLevel() {
		return level;
	}


	public void setLevel(int level) {
		this.level = level;
	}


	public BaseStats getBaseStats() {
		return baseStats;
	}


	public void setBaseStats(BaseStats baseStats) {
		this.baseStats = baseStats;
	}


	public SubStats getSubStats() {
		return subStats;
	}


	public void setSubStats(SubStats subStats) {
		this.subStats = subStats;
	}


	public AdditionStats getAdditionStats() {
		return additionStats;
	}


	public void setAdditionStats(AdditionStats additionStats) {
		this.additionStats = additionStats;
	}


	public int getExpPoolSize() {
		return -1;
	}
	

}
