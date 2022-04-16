/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 *This file creates a list of all the monster in game to be pulled from later.
 */
package monsters;

import java.util.ArrayList;

public class MonsterList {
	
	Bunny bunny = new Bunny(); // this is a bunny #1
	Chicken chicken = new Chicken(); // this is a chicken #1
	DrunkDwarf drunkDwarf = new DrunkDwarf(); // this is a drunk dwarf #1
	Giant giant = new Giant(); // this is a giant #3
	GiantSpider giantSpider = new GiantSpider(); // this is a giant spider #2
	Goblin goblin = new Goblin(); // this is a goblin #2
	GoblinKing goblinKing = new GoblinKing(); // this is a golbin but hes also a king #4
	Orc orc = new Orc(); // this an orc #3
	Spider spider = new Spider(); // this is an itsy bitsy spider #1
	Troll troll = new Troll(); // this is a troll #2
	WereWolf wereWolf = new WereWolf(); // this is a mythical creature #3
	AwakenedShrub awakenedShrub = new AwakenedShrub(); // this is a shrub #1
	Badger badger = new Badger(); // its a badger #1
	Bat bat = new Bat(); // bat #1
	BrownBear brownBear = new BrownBear(); // ooohhh scary bear #3
	Cyclops cyclops = new Cyclops(); // it has 1 eye #3
	FlyingSword flyingSword = new FlyingSword(); // why? #2
	Frog frog = new Frog(); // yup a frog #1
	Ghost ghost = new Ghost(); // they're fake #2
	GiantScorpion giantScorpion = new GiantScorpion(); // scorpion! #3
	GiantWolfSpider giantWolfSpider = new GiantWolfSpider(); // even scarier #3
	Hawk hawk = new Hawk(); // just a bird #1
	HoneyBadger honeyBadger = new HoneyBadger(); // don't mess with it #3
	Lizard lizard = new Lizard(); // just tiny lizard #1
	Mimic mimic = new Mimic(); // #2
	Owl owl = new Owl(); // #1
	ShadowDemon shadowDemon = new ShadowDemon(); // #3
	SkeletonWarrior skeletonWarrior = new SkeletonWarrior(); // #2
	StoneGiant stoneGiant = new StoneGiant(); // #3
	Thug thug = new Thug(); // #2
	Vampire vampire = new Vampire(); // #3
	Vulture vulture = new Vulture(); // #1
	Wolf wolf = new Wolf(); // #2
	
	/**
	 * list of all mosnters in game
	 */
	private ArrayList<Monster> monster = new ArrayList<Monster>() {
		/**
		 * 
		 */
		private static final long serialVersionUID = 2745153490486859538L;

		{			
			add(goblinKing); //0
			add(bunny); // 1           dif 1 start
			add(chicken); // 2
			add(drunkDwarf); // 3
 			add(spider); // 4
			add(awakenedShrub); // 5
			add(badger); // 6
			add(bat); // 7
			add(frog); // 8
			add(hawk); // 9
			add(lizard); // 10
			add(owl); // 11
			add(vulture); // 12
			add(wolf); // 13                dif 2 start
			add(thug); // 14
			add(skeletonWarrior); // 15
			add(mimic); // 16
			add(ghost); // 17
			add(flyingSword); // 18
			add(troll); // 19
			add(goblin); // 20
			add(giantSpider); // 21
			add(giant); // 22        dif 3 start
			add(orc); // 23
			add(wereWolf); // 24
			add(cyclops); // 25
			add(giantScorpion); // 26
			add(giantWolfSpider); // 27
			add(honeyBadger); // 28
			add(shadowDemon); // 29
			add(stoneGiant); // 30
			add(vampire); // 31
			
		}
		
	};

	/**
	 * 
	 * @return list of all monsters
	 */
	public ArrayList<Monster> getMonster() {
		return monster;
	}
	/**
	 * sets monster list
	 * @param monster
	 */
	public void setMonster(ArrayList<Monster> monster) {
		this.monster = monster;
	}

}
