package com.creants.mufantasy.entities.states;

/**
 * Những chỉ số chính của nhân vật
 * 
 * @author LamHM
 * 
 */
public class BaseStats {
	private int atk;
	private int mag;
	private int hp;
	private int mp;
	private int def;
	private int res;


	public int getAtk() {
		return atk;
	}


	public void setAtk(int atk) {
		this.atk = atk;
	}


	public int getMag() {
		return mag;
	}


	public void setMag(int mag) {
		this.mag = mag;
	}


	public int getHp() {
		return hp;
	}


	public void setHp(int hp) {
		this.hp = hp;
	}


	public int getMp() {
		return mp;
	}


	public void setMp(int mp) {
		this.mp = mp;
	}


	public int getDef() {
		return def;
	}


	public void setDef(int def) {
		this.def = def;
	}


	public int getRes() {
		return res;
	}


	public void setRes(int res) {
		this.res = res;
	}


	@Override
	public String toString() {
		return "[BaseStats] {PhysicAttack:" + atk + ", MagicPower:" + mag + ", HealthPoint:" + hp + ", ManaPoint:" + mp
				+ ", Defense:" + def + ", MagicResistance:" + res + "}";
	}

}
