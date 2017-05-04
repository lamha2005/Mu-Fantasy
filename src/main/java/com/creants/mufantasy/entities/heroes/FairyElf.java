package com.creants.mufantasy.entities.heroes;

import com.creants.mufantasy.entities.HeroClass;
import com.creants.mufantasy.entities.HeroClassType;

/**
 * @author LamHM
 *
 */
public class FairyElf extends HeroClass {

	@Override
	public void init() {
		this.id = HeroClassType.FAIRY_ELF.id;
		this.name = HeroClassType.FAIRY_ELF.name;
	}

}
