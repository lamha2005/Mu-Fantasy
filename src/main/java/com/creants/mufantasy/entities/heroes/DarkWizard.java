package com.creants.mufantasy.entities.heroes;

import com.creants.mufantasy.entities.HeroClass;
import com.creants.mufantasy.entities.HeroClassType;

/**
 * @author LamHM
 *
 */
public class DarkWizard extends HeroClass {

	@Override
	public void init() {
		this.id = HeroClassType.DARK_WIZARD.id;
		this.name = HeroClassType.DARK_WIZARD.name;

	}

}
