package com.creants.mufantasy.managers;

import java.util.HashMap;
import java.util.Map;

import com.creants.mufantasy.entities.HeroClass;

/**
 * @author LamHM
 *
 */
public class HeroClassManager {
	private static HeroClassManager instance;
	private Map<String, HeroClass> heroes;


	public static HeroClassManager getInstance() {
		if (null == instance) {
			instance = new HeroClassManager();
		}

		return instance;
	}


	private HeroClassManager() {
		heroes = new HashMap<>();
	}


	public void initHero(HeroClass hero) {
		heroes.put((String) hero.getId(), hero);
	}


	public void initHero(Map<String, HeroClass> heroes) {
		this.heroes = heroes;
	}


	public void initHero(HeroClass... heroes) {
		for (HeroClass t : heroes) {
			this.heroes.put(t.getId(), t);
		}
	}


	@SuppressWarnings("unchecked")
	public <T extends HeroClass> T getHero(Class<T> clazz) {
		return (T) heroes.get(clazz.getSimpleName());
	}

}
