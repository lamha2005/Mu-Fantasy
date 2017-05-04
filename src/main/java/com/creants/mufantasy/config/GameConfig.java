package com.creants.mufantasy.config;

import java.io.FileInputStream;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;

import com.creants.mufantasy.entities.HeroClassType;
import com.creants.mufantasy.entities.heroes.DarkKnight;
import com.creants.mufantasy.entities.heroes.DarkWizard;
import com.creants.mufantasy.entities.heroes.FairyElf;
import com.creants.mufantasy.managers.HeroClassManager;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

/**
 * @author LamHM
 *
 */
public class GameConfig {
	private static final String HEROES_CONFIG = "resources/heroes.xml";
	private static final String MONSTERS_CONFIG = "resources/monsters.xml";


	public static void init() {
		loadHeros();
		loadMonsters();
	}


	public static void loadHeros() {
		try {
			XMLInputFactory f = XMLInputFactory.newFactory();
			XMLStreamReader sr = f.createXMLStreamReader(new FileInputStream(HEROES_CONFIG));
			XmlMapper mapper = new XmlMapper();
			sr.next(); // to point to <Heros>
			sr.next(); // to point to root-element under Heros
			DarkKnight darkKnight = mapper.readValue(sr, DarkKnight.class);
			DarkWizard darkWizard = mapper.readValue(sr, DarkWizard.class);
			FairyElf fairyElf = mapper.readValue(sr, FairyElf.class);
			HeroClassManager.getInstance().initHero(darkKnight, darkWizard, fairyElf);
			sr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}


	public static void loadMonsters() {

	}


	public static void main(String[] args) {
		GameConfig.init();
		DarkKnight hero = HeroClassManager.getInstance().getHero(HeroClassType.DARK_KNIGHT);
		System.out.println(hero);
	}

}
