package com.creants.mufantasy.entities.heroes;

import com.creants.mufantasy.entities.HeroClass;
import com.creants.mufantasy.entities.HeroClassType;

/**
 * @author LamHM
 *
 */
public class DarkKnight extends HeroClass {

	@Override
	public void init() {
		id = HeroClassType.DARK_KNIGHT.id;
		name = HeroClassType.DARK_KNIGHT.name;
	}
	
	

}
