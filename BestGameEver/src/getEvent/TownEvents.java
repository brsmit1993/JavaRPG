/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 * File gets events randomly if random event is actived and player is in a town local.
 */
package getEvent;

import algorithms.Chance;
import battleMode.MonsterBattle;
import console.PlayerEntry;
import gameMethods.DeathCheck;
import getsetStats.StatAdd;
import getsetStats.StatSub;
import inventory.InventoryMethod;
import ui.StatDisplay;

public class TownEvents {
	private static ChoiceEventGui eventWind = new ChoiceEventGui();
	protected static  MonsterBattle battle = new MonsterBattle(); // used to start battle sequence
	private static  PlayerEntry enter = new PlayerEntry(); // used to get palyers choice in events
	private static  Chance chance = new Chance(); // used to get event randomly
	private static  StatAdd add = new StatAdd(); // used to add stats to palyer
	private static  StatSub sub = new StatSub(); // used to sub stats from player
	private static  StatDisplay dsp = new StatDisplay(); // used to display players name and stats
	private static  InventoryMethod inv = new InventoryMethod(); // used to add random items to inventory
	private static DeathCheck death = new DeathCheck(); // used to check for death at end of event

	private static StringBuffer outcomesTxt = new StringBuffer( "  " );
	
	public static void getEvent(int cha, int playResp, boolean newEvent)
	{
		int chancePer; // used to store chance percentage for last 5 events
	
		if(newEvent)
		{
		eventWind.eventChoiceWindow(cha,  "Town" );
		}
		
		// pulls event based on random number stores in cha
		switch (cha) 
		{
		//event 1
		case 1:
			// dispalys event and options and may alter outcome based on stats
			ChoiceEventGui.eventLbl.setText(dsp.getName() +  " Enters town to find that it is under siege by goblins. " );
			ChoiceEventGui.choice1.setText( "  Help Defend The Town " );
			ChoiceEventGui.choice2.setText( "  Hide In A Building " );
			ChoiceEventGui.choice3.setText( "  Escape Town  " );
			
			switch(playResp) {
			case 1:
				if (dsp.getStr() > 7)
				{
					outcomesTxt.append( "  "  + dsp.getName() +  "  Successfully helped defend the town and gained 100Xp. " );
					add.setXp(100);
				}
				else
				{
					outcomesTxt.append( "  "  + dsp.getName() +  "  Tried valulantly to help but accidently failed miserably. " );
					outcomesTxt.append(  dsp.getName() +  "  lost 10 HP. " );
					sub.setHp(10);
				}
				break;
			case 2:
				if (dsp.getLuc() > 7)
				{
					outcomesTxt.append( "  "  + dsp.getName() +  "  succesfully hid inside an abandoned building. " );
					outcomesTxt.append(  dsp.getName() +  "  gained 50Xp. " );
					add.setXp(50);
				}
				else
				{
					outcomesTxt.append( "  "  + dsp.getName() +  "  Wasn't so lucky. The golbins found his hiding spot and he barely escaped. " );
					outcomesTxt.append( dsp.getName() +  "  lost 20Hp. " );
					sub.setHp(20);
				}
				break;
			case 3:
				if (dsp.getSpd() > 7)
				{
					outcomesTxt.append( " Thankfully  "  + dsp.getName() +  "  is extremely fast and managed to escape. " );
					outcomesTxt.append(  dsp.getName() +  "  gained 50Xp. " );
					add.setXp(50);
				}
				else
				{
					outcomesTxt.append( "  "  + dsp.getName() +  "  barely escaped. He didn't escape unscathed though. " );
					outcomesTxt.append(dsp.getAbil1() +  "  lost 10Hp. " );
					sub.setHp(10);
				}
				break;
			}
		break;
		//event 2
		case 2:
			// dispalys event and options and may alter outcome based on stats
			ChoiceEventGui.eventLbl.setText(dsp.getName() +  "  sees a goat walking down the street as if though it might be drunk. " );
			
			ChoiceEventGui.choice1.setText( "  Kick The Goat! " );
			ChoiceEventGui.choice2.setText( "  Avoid The Goat! " );
			ChoiceEventGui.choice3.setText( "  Pet The Goat " );
			
			
			switch(playResp) {
			case 1:
				outcomesTxt.append( "  "  + dsp.getName() +  "  kicks the goat! The goat bites back. " );
				outcomesTxt.append(  dsp.getName() +  "  loses 10Hp... serves you right. Jerk. " );
				sub.setHp(10);
				break;
			case 2:
				outcomesTxt.append( "  "  + dsp.getName() +  "  manged to avoid the goat and get away. " );
				break;
			case 3:
				outcomesTxt.append( "  "  + dsp.getName() +  "  pets the goat and notices something caught on its fur. " );
				outcomesTxt.append(  dsp.getName() +  "  helps the goat remove the item from it's fur. " );
				inv.addRandItem();
				break;
			}
		break;
		//event 3
		case 3:
			// dispalys event and options and may alter outcome based on stats
			ChoiceEventGui.eventLbl.setText(dsp.getName() +  "  notices a dog barking at the tavern door. " );
			
			ChoiceEventGui.choice1.setText( "  PET DOGGY! " );
			ChoiceEventGui.choice2.setText( "  DON'T PET DOGGY! " );
			ChoiceEventGui.choice3.setText( "  TRY NOT TO PET DOGGY BUT PET DOGGY ANYWAYS! " );
			
			
			switch(playResp) {
			case 1:
				outcomesTxt.append( "  "  + dsp.getName() +  "  attempts to pet the dog and it bites you. " );
				outcomesTxt.append(  dsp.getName() +  "  loses 10hp. " );
				sub.setHp(10);
				break;
			case 2:
				outcomesTxt.append( "  "  + dsp.getName() +  "  doesn't pet the dog... that's probably best. You smell of bacon. " );
				outcomesTxt.append( " The dog might have tried to eat you.  "  + dsp.getName() +  "  gained 25Xp. " );
				add.setXp(25);
				break;
			case 3:
				outcomesTxt.append( "  "  + dsp.getName() +  "  tries to resist petting the dog but gives in. " );
				outcomesTxt.append(dsp.getName() +  "  the dog appreciates the pets.  "  + dsp.getName() +  "  gains 10Xp " );
				add.setXp(10);
				break;
			}
		break;
		//event 4
		case 4:
			// dispalys event and options and may alter outcome based on stats
			ChoiceEventGui.eventLbl.setText(dsp.getName() +  "  finds a random bag laying in the middle of the street. " );
			
			ChoiceEventGui.choice1.setText( "  search the bag " );
			ChoiceEventGui.choice2.setText( "  leave the bag " );
			ChoiceEventGui.choice3.setText( "  kick the bag " );
			
			
			switch(playResp) {
			case 1:
				outcomesTxt.append( "  "  + dsp.getName() +  "  finds an interesting item inside the bag. " );
				inv.addRandItem();
				break;
			case 2:
				outcomesTxt.append( "  "  + dsp.getName() +  "  walks away and doens't look back. Well maybe just once. " );
				break;
			case 3:
				outcomesTxt.append( "  "  + dsp.getName() +  "  kicks the bag. The bag is magic and tries to suffocate  "  + dsp.getName() +  " . " );
				outcomesTxt.append(  dsp.getName() +  "  loeses 10Hp. " );
				sub.setHp(10);
				break;
			}
		break;
		//event 5
		case 5:
			// dispalys event and options and may alter outcome based on stats
			ChoiceEventGui.eventLbl.setText( " Oh no it seems like a farmers chicken got lose. " );
			
			ChoiceEventGui.choice1.setText( "  Kick the chicken! " );
			ChoiceEventGui.choice2.setText( "  Run away from the chicken! " );
			ChoiceEventGui.choice3.setText( "  Pet the chicken. " );
			
			
			switch(playResp) {
			case 1:
				outcomesTxt.append( "  "  + dsp.getName() +  "  kicked the chicken. The chicken didn't appreciate that. " );
				outcomesTxt.append( " The chicken fights back.  "  + dsp.getName() +  "  loses 5Hp " );
				sub.setHp(5);
				break;
			case 2:
				if (dsp.getSpd() > 5) {
					outcomesTxt.append( "  "  + dsp.getName() +  "  managed to escape the chicken. " );
				}
				else
				{
					outcomesTxt.append( " The chicken is faster than  "  + dsp.getName() +  "  and manages to attack  "  + dsp.getName());
					outcomesTxt.append(  dsp.getName() +  "  loses 10hp. " );
					sub.setHp(10);
				}
				break;
			case 3:
				outcomesTxt.append( "  "  + dsp.getName() +  "  pets the chicken. Petting chickens help heal the soul. " );
				outcomesTxt.append(  dsp.getName() +  "  gains 10Hp. " );
				add.setHp(10);
				break;
			}
		break;
		//event 6
		case 6:
			// dispalys event and options and may alter outcome based on stats
			ChoiceEventGui.eventLbl.setText(dsp.getName() +  "  comes across an alter to the gods. " );
			
			ChoiceEventGui.choice1.setText( "  Pray to the alter. " );
			ChoiceEventGui.choice2.setText( "  Avoid the alter. " );
			ChoiceEventGui.choice3.setText( "  Spit on the alter " );
			
			
			switch(playResp) {
			case 1:
				outcomesTxt.append( " The gods take notice of  "  + dsp.getName() +  "  faith and grant a reward. " );
				outcomesTxt.append(  dsp.getName() +  "  gains 1 strength and an item. " );
				add.setStr(1);
				inv.addRandItem();
				break;
			case 2:
				outcomesTxt.append( "  "  + dsp.getName() +  "  walks away from the alter. " );
				break;
			case 3:
				outcomesTxt.append( " HOW DARE YOU DISRESPECT THE GODS!! " );
				outcomesTxt.append( " THE GODS SMITE YOU BY TAKING ONE POINT FROM EACH STAT! " );
				sub.setStr(1);
				sub.setDef(1);
				sub.setSpd(1);
				sub.setSma(1);
				sub.setLuc(1);
				break;
			}
		break;
		//event 7
		case 7:
			// dispalys event and options and may alter outcome based on stats
			ChoiceEventGui.eventLbl.setText(dsp.getName() +  "  comes accross a drunk dwarf. " );
			
			ChoiceEventGui.choice1.setText( "  pick a fight " );
			ChoiceEventGui.choice2.setText( "  walk away " );
			ChoiceEventGui.choice3.setText( "  pickpocket the dwarf " );
			
			
			switch(playResp) {
			case 1:
				if (dsp.getStr() > 7)
				{
					outcomesTxt.append( "  "  + dsp.getName() +  "  implies the dwarfs mother is a donkey. The dwarf attacks. " );
					outcomesTxt.append(  dsp.getName() +  "  is stronger however and wins the bout.  "  + dsp.getName() +  "  gains 50XP. " );
					add.setXp(50);
				}
				else
				{
					outcomesTxt.append( "  "  + dsp.getName() +  "  compares the dwarfs mother to a whale. The dwarf proceeds to whale on  "  + dsp.getName());
					outcomesTxt.append(  dsp.getName() +  "  loses 25Hp. " );
					sub.setHp(25);
				}
				break;
			case 2:
				outcomesTxt.append( "  "  + dsp.getName() +  "  chooses to avoid the dwarf. " );
				break;
			case 3:
				if (dsp.getLuc() > 5)
				{
					outcomesTxt.append( "  "  + dsp.getName() +  "  takes advantage of the dwarfs innebriated state and steals an item. " );
					outcomesTxt.append(  dsp.getName() +  "  also gains 50Xp " );
					inv.addRandItem();
					add.setXp(50);
				}
				else
				{
					outcomesTxt.append( "  "  + dsp.getName() +  "  isn't so lucky and the drunk dwarf catches  "  + dsp.getName() +  " . " );
					outcomesTxt.append( " The dwarf attacks  "  + dsp.getName() +  "  and  "  + dsp.getName() +  "  loses 20Hp. " );
					sub.setHp(20);
				}
				break;
			}
		break;
		//event 8
		case 8:
			// dispalys event and options and may alter outcome based on stats
			ChoiceEventGui.eventLbl.setText(dsp.getName() +  "  sees a tavern and debates going for a drink. " );
			
			ChoiceEventGui.choice1.setText( "  GET SMASHED " );
			ChoiceEventGui.choice2.setText( "  Drink responsibly " );
			ChoiceEventGui.choice3.setText( "  Don't drink " );
			
			
			switch(playResp) {
			case 1:
				outcomesTxt.append( "  "  + dsp.getName() +  "  has a few too many and kills a few brain cells. " );
				outcomesTxt.append(  dsp.getName() +  "  loses 1 intelligence. " );
				sub.setSma(1);
				break;
			case 2:
				outcomesTxt.append( "  "  + dsp.getName() +  "  has a beer... maybe two. " );
				break;
			case 3:
				outcomesTxt.append( "  "  + dsp.getName() +  "  feels smart for not drinking. " );
				outcomesTxt.append(  dsp.getName() +  "  gains 1 intteligence. " );
				add.setSma(1);
				break;
			}
		break;
		//event 9
		case 9:
			// dispalys event and options and may alter outcome based on stats
			ChoiceEventGui.eventLbl.setText(dsp.getName() +  "  sees a couple of dwarfs arguing over whether trees can eat you. " );
			
			ChoiceEventGui.choice1.setText( "  Tell the dwarfs there stupid " );
			ChoiceEventGui.choice2.setText( "  Don't get involved " );
			ChoiceEventGui.choice3.setText( "  Explain intelligently how trees can not eat humans. " );
			
			
			switch(playResp) {
			case 1:
				if (dsp.getStr() > 7) 
				{
					outcomesTxt.append( " The dwarfs were not amused by the comments made and attack  "  + dsp.getName());
					outcomesTxt.append(dsp.getName() +  "  manages to beat the dwarfs and gain 100Xp " );
					add.setXp(100);
				}
				else
				{
					outcomesTxt.append( "  "  + dsp.getName() +  " informs the dwarfs they are stupid. The dwarfs proceed to show  "  +dsp.getName());
					outcomesTxt.append( " he is weak.  "  + dsp.getName()+  "  loses 25Hp " );
					sub.setHp(25);
				}
				break;
			case 2:
				outcomesTxt.append( "  "  + dsp.getName() +  "  walks away from the conversation. " );
				break;
			case 3:
				if (dsp.getSma() > 5)
				{
					outcomesTxt.append( "  "  + dsp.getName() +  "  manages to convince the dwarfs trees don't eat people. " );
					outcomesTxt.append(  dsp.getName() +  "  gains 50Xp and one of the dwarfs gives him an item. " );
					add.setXp(50);
					inv.addRandItem();
				}
				else
				{
					outcomesTxt.append( "  "  + dsp.getName() +  "  tries to convince the dwarfs but lacks the intelligence. " );
					outcomesTxt.append( " one of the dwarfs becomes annoyed and sucker punches  "  + dsp.getName());
					outcomesTxt.append(  dsp.getName() +  "  loses 25Hp. " );
					sub.setHp(25);
				}
				break;
			}
		break;
		//event 10
		case 10:
			// dispalys event and options and may alter outcome based on stats
			ChoiceEventGui.eventLbl.setText(dsp.getName() +  "  comes across a drunk alchemist offering free samples. " );
			
			ChoiceEventGui.choice1.setText( "  Accept sample " );
			ChoiceEventGui.choice2.setText( "  Don't talk to alchemist " );
			ChoiceEventGui.choice3.setText( "  Decline sample " );
			
			
			switch(playResp) {
			case 1:
				outcomesTxt.append( "  "  + dsp.getName() +  "  gets a free sample. " );
				inv.addRandItem();
				break;
			case 2:
				outcomesTxt.append( "  "  + dsp.getName() +  "  Doesn't talk to the alchemist. " );
				break;
			case 3:
				outcomesTxt.append( " The drunk alchemist becomes enraged and throws a potion on  "  + dsp.getName());
				outcomesTxt.append(  dsp.getName() +  "  becomes ill and loses 100Hp " );
				sub.setHp(100);
				break;
			}
		break;
		//event 11
		case 11:
			// dispalys event and options and may alter outcome based on stats
			ChoiceEventGui.eventLbl.setText( " A villager named Bob asks for help moving some hay bales. " );
			
			ChoiceEventGui.choice1.setText( "  Help Bob " );
			ChoiceEventGui.choice2.setText( "  Don't Help Bob " );
			ChoiceEventGui.choice3.setText( "  Mug Bob " );
			
			
			switch(playResp) {
			case 1:
				outcomesTxt.append( " Bob appreaciates the help and gives  "  + dsp.getName() + "  a reward. " );
				inv.addRandItem();
				break;
			case 2:
				outcomesTxt.append( " Bob is dissapointed but understands. " );
				break;
			case 3:
				if (dsp.getStr() > 7)
				{
					outcomesTxt.append( " Bob being afraid off  "  + dsp.getName() +  " s strenght complies. " );
					inv.addRandItem();
				}
				else
				{
					outcomesTxt.append( " Bob recongizes a panzy when he sees one and chooses to fight back. " );
					outcomesTxt.append(dsp.getName() + "  loses the fight and 25Hp " );
					sub.setHp(25);
				}
				break;
			}
		break;
		//event 12
		case 12:
			// dispalys event and options and may alter outcome based on stats
			ChoiceEventGui.eventLbl.setText(dsp.getName() +  "  notices the sidewalk ahead looks scorched. " );
			
			ChoiceEventGui.choice1.setText( "  Take A Detour " );
			ChoiceEventGui.choice2.setText( "  Proceed Normally " );
			ChoiceEventGui.choice3.setText( "  Sprint Across " );
			
			
			switch(playResp) {
			case 1:
				outcomesTxt.append( "  "  + dsp.getName() +  "  decides to take a detour. " );
				break;
			case 2:
				outcomesTxt.append( " As  "  + dsp.getName() +  "  beings to walk across the side walk it becomes apparent " );
				outcomesTxt.append( " a mage has enchanted the sidewalk.  "  + dsp.getName() +  "  runs to escape the fire " );
				outcomesTxt.append(  dsp.getName() +  "  loses 25Hp. " );
				sub.setHp(25);
				break;
			case 3:
				if(dsp.getSpd() > 5)
				{
				outcomesTxt.append( "  "  + dsp.getName() +  "  proceeds to sprint across the side walk. " );
				outcomesTxt.append( " Its a good thing to because the sidwalk was enchanted with fire. " );
				outcomesTxt.append(  dsp.getName() +  "  gains 50Xp. " );
				add.setXp(50);
				}
				else
				{
					outcomesTxt.append( " The fire was enchanted with fire.  "  + dsp.getName() +  "  wasn't fast enough to completely avoid it. " );
					outcomesTxt.append(  dsp.getName() +  "  loses 25hp. " );
					sub.setHp(25);
				}
				break;
			}
		break;
		//event 13
		case 13:
			// dispalys event and options and may alter outcome based on stats
			ChoiceEventGui.eventLbl.setText(dsp.getName() +  "  comes across a descrated alter. " );
			
			ChoiceEventGui.choice1.setText( "  clean the alter. " );
			ChoiceEventGui.choice2.setText( "  desacrate the alter more " );
			ChoiceEventGui.choice3.setText( "  ignore the alter " );
			
			
			switch(playResp) {
			case 1:
				outcomesTxt.append( "  "  + dsp.getName() +  "  the gods think you're just being a suck up. " );
				outcomesTxt.append(  dsp.getName() +  "  loses 1 strenght. " );
				break;
			case 2:
				outcomesTxt.append( "  "  + dsp.getName() +  "  normally the gods would be angry... but not the god of destruction. " );
				outcomesTxt.append(  dsp.getName() +  "  gains 1 point for every stat. " );
				add.setStr(1);
				add.setLuc(1);
				add.setSpd(1);
				add.setSma(1);
				add.setDef(1);
				break;
			case 3:
				outcomesTxt.append( "  "  + dsp.getName() +  "  ignores the alter. The gods are displeased. But not to displeased. " );
				break;
			}
		break;
		//event 14
		case 14:
			// dispalys event and options and may alter outcome based on stats
			ChoiceEventGui.eventLbl.setText(dsp.getName() +  "  witnesses a woman villager being mugged. " );
			
			ChoiceEventGui.choice1.setText( "  help the villager " );
			ChoiceEventGui.choice2.setText( "  ignore the siutation " );
			ChoiceEventGui.choice3.setText( "  help the mugger " );
			
			
			switch(playResp) {
			case 1:
				if(dsp.getStr() > 5)
				{
					outcomesTxt.append( "  "  + dsp.getName() +  "  over powers the mugger. The villager thanks you for your help. " );
					outcomesTxt.append(  dsp.getName() +  "  gains 50Xp and an item. " );
					inv.addRandItem();
					add.setXp(50);
				}
				else
				{
					outcomesTxt.append( "  "  + dsp.getName() +  "  lacks the strength to help and the mugger overpowers  "  + dsp.getName());
					outcomesTxt.append(  dsp.getName() +  "  loses 40Hp. " );
					sub.setHp(40);
				}
				break;
			case 2:
				outcomesTxt.append( "  "  + dsp.getName() +  "  ignores the mugging because  "  + dsp.getName() +  "  is a terrible person. " );
				break;
			case 3:
				outcomesTxt.append( "  "  + dsp.getName() +  "  helps the mugger because  "  + dsp.getName() +  "  is a terrible person. " );
				inv.addRandItem();
				break;
			}
		break;
		//event 15
		case 15:
			// dispalys event and options and may alter outcome based on stats
			ChoiceEventGui.eventLbl.setText(dsp.getName() +  "  sees a black cat. " );
			
			ChoiceEventGui.choice1.setText( "  Let it cross your path. " );
			ChoiceEventGui.choice2.setText( "  Avoid it " );
			ChoiceEventGui.choice3.setText( "  Cross it's path. " );
			
			
			switch(playResp) {
			case 1:
				outcomesTxt.append( " Really?  "  + dsp.getName() +  "  loses 1 luck. " );
				sub.setLuc(1);
				break;
			case 2:
				outcomesTxt.append( "  "  + dsp.getName() +  "  avoids the black cat. " );
				break;
			case 3:
				outcomesTxt.append( " I mean I guess it can work in reverse.  "  + dsp.getName() +  "  gains 1 luck. " );
				add.setLuc(1);
				break;
			}
		break;
		//event 16
		case 16:
			// dispalys event and options and may alter outcome based on stats
			ChoiceEventGui.eventLbl.setText(dsp.getName()  +  "  is witness to a theif stealing candy from a young child. " );
			
			ChoiceEventGui.choice1.setText( "  Chase The Theif " );
			ChoiceEventGui.choice2.setText( "  Ignore The Situation " );
			ChoiceEventGui.choice3.setText( "  Laugh At The Child " );
			
			
			switch(playResp) {
			case 1:
				if (dsp.getSpd() > 5)
				{
				outcomesTxt.append( "  "  + dsp.getName() +  "  is quick enough to catch the theif and return the candy to the child. " );
				outcomesTxt.append( " The child thanks  "  + dsp.getName() +  "  by giving  "  + dsp.getName() +  "  a random item. " );
				inv.addRandItem();
				}
				else
				{
					outcomesTxt.append( "  "  + dsp.getName() +  "  tried to give chase but tripped and fell on his face. " );
					outcomesTxt.append(  dsp.getName() +  "  lost 10 Hp " );
					sub.setHp(10);
				}
				break;
			case 2:
				outcomesTxt.append( "  "  + dsp.getName() +  "  hates children and doesn't help. " );
				break;
			case 3:
				outcomesTxt.append( " The child annoyed by  "  + dsp.getName() +  " s laughter responds by kicking  "  + dsp.getName());
				outcomesTxt.append(  dsp.getName() +  "  loses 10HP. " );
				sub.setHp(10);
				break;
			}
		break;
		//event 17
		case 17:
			// dispalys event and options and may alter outcome based on stats
			ChoiceEventGui.eventLbl.setText( " You see a house on fire in town and hear screaming from inside. " );
			ChoiceEventGui.choice1.setText( "  Run Into The Burning House! " );
			ChoiceEventGui.choice2.setText( "  Watch The World Go Up In Flames  " );
			ChoiceEventGui.choice3.setText( "  Attempt To Put The House Fire Out With A Glass Of Water " );
			
			switch(playResp) {
			case 1:
				if (dsp.getStr() > 7)
					outcomesTxt.append( "  "  + dsp.getName() +  "  with his immense strength helps the person inside out. " );
					outcomesTxt.append(  dsp.getName() +  "  is rewarded with 50XP and given a random item. " );
					add.setXp(50);
					inv.addRandItem();
				break;
			case 2:
				outcomesTxt.append( " GOOD JOB! " );
				outcomesTxt.append( " THE WORLD WENT UP IN FLAMES AND NOW THERES NO WORLD FOR YOU TO PLAY IN " );
				System.exit(0);
				break;
			case 3:
				outcomesTxt.append( " Obviously this attempt fails and  "  + dsp.getName() +  "  gets severely burned and loses 50HP. " );
				sub.setHp(50);
				break;
			}
		break;
		//event 18
		case 18:
			// dispalys event and options and may alter outcome based on stats
			ChoiceEventGui.eventLbl.setText( " A guard in town mistakes  "  + dsp.getName() +  "  for someone whos comitted haneaous crimes against the kingdom. " );
			ChoiceEventGui.choice1.setText( "  Explain Why The Guard Is Wrong " );
			ChoiceEventGui.choice2.setText( "  Act Like You Didn't Hear the Guard " );
			ChoiceEventGui.choice3.setText( "  Run From The Guard " );
			
			switch(playResp) {
			case 1:
					if (dsp.getSma() > 5)
					{
						outcomesTxt.append( "  "  + dsp.getName() +  "  manages to convince the guard he's not the criminal the guard is looking for. " );
						outcomesTxt.append(  dsp.getName() +  "  gains 50XP. " );
						add.setXp(50);
					}
					else
					{
						outcomesTxt.append( "  "  + dsp.getName() +  "  fails to convince the guard. The guard attacks  "  + dsp.getName());
						outcomesTxt.append(  dsp.getName() +  "  loses 25HP. " );
						sub.setHp(50);
					}
				break;
			case 2:
				outcomesTxt.append( " The guard now feels awkward about the situation and decides to leave  "  + dsp.getName() +  " alone. " );
				break;
			case 3:
				if (dsp.getSpd() > 5)
				{
				outcomesTxt.append( "  "  + dsp.getName() +  "  manages to escape and gains 25Xp. " );
				add.setXp(25);
				}
				else
				{
					outcomesTxt.append( "  "  + dsp.getName() +  "  is not quick enough and the guard gives  "  + dsp.getName() +  "  gives him a pumelling. " );
					outcomesTxt.append(  dsp.getName() +  "  loses 25HP. " );
					sub.setHp(25);
				}
				break;
			}
		break;
		//event 19
		case 19:
			// dispalys event and options and may alter outcome based on stats
			ChoiceEventGui.eventLbl.setText( " As you're walking along the street you see a pub. " );
			ChoiceEventGui.choice1.setText( "  Enter The Pub " );
			ChoiceEventGui.choice2.setText( "  Walk Past The Pub " );
			ChoiceEventGui.choice3.setText( "  Enter The Pub And Get Lit " );
			
			switch(playResp) {
			case 1:
				outcomesTxt.append( "  "  + dsp.getName() +  "  enters the pub and has a casual drink. " );
				outcomesTxt.append(  dsp.getName() +  "  gains 10XP. " );
				add.setXp(10);
				break;
			case 2:
				outcomesTxt.append( "  "  + dsp.getName() +  "  decides to not go for a drink today. " );
				break;
			case 3:
				outcomesTxt.append( "  "  + dsp.getName() +  "  gets lit and loses 1 Intelligence. " );
				sub.setSma(1);
				break;
			}
		break;
		//event 20
		case 20:
			// dispalys event and options and may alter outcome based on stats
			ChoiceEventGui.eventLbl.setText(dsp.getName() +  "  gets into town and realize that the town is currently infested with rats. " );
			ChoiceEventGui.choice1.setText( "  Rid The Town Of Rats " );
			ChoiceEventGui.choice2.setText( "  Leave Town " );
			ChoiceEventGui.choice3.setText( "  Attempt To Befriend The Rats " );
			
			switch(playResp) {
			case 1:
				if (dsp.getStr() > 6)
				{
					outcomesTxt.append( "  "  + dsp.getName() +  "  successfully kills all the rats in town. And gains 25XP. " );
					outcomesTxt.append( " The towns people also give "  + dsp.getName() +  "  a reward. " );
					add.setXp(25);
					inv.addRandItem();
				}
				else
				{
					outcomesTxt.append( "  "  + dsp.getName() +  "  is swarmed by rats and takes 25 damage. " );
					sub.setHp(25);
				}
				break;
			case 2:
				outcomesTxt.append( "  "  + dsp.getName() +  "  leaves the towns people to deal with it on their own. " );
				break;
			case 3:
				outcomesTxt.append( "  "  + dsp.getName() +  "  tries to befriend the rats. The rats aren't looking for new friends. " );
				outcomesTxt.append(  dsp.getName() +  "  feels hurt and lonely and loses 25Hp. " );
				sub.setHp(50);
				break;
			}
		break;
		//event 21
		case 21:
			// dispalys event and options and may alter outcome based on stats
			ChoiceEventGui.eventLbl.setText( " A town guard is having a bad day and decides to pick a fight with you. " );
			ChoiceEventGui.choice1.setText( "  Help The Guard Understand His Feelings " );
			ChoiceEventGui.choice2.setText( "  Walk Away " );
			ChoiceEventGui.choice3.setText( "  Fight The Guard " );
			
			switch(playResp) {
			case 1:
				if (dsp.getSma() > 5)
				{
					outcomesTxt.append( "  "  + dsp.getName() +  "  helps the guard understand his feelings. " );
					outcomesTxt.append(  dsp.getName() +  "  gains 50XP. " );
					add.setXp(50);
				}
				else
				{
					outcomesTxt.append( "  "  + dsp.getName() +  "  fails to help the guard and the guard becomes enraged. " );
					outcomesTxt.append( " The guard knocks  "  + dsp.getName() +  "  over the head.  "  + dsp.getName() +  "  loses 25Hp. " );
					sub.setHp(25);
				}
				break;
			case 2:
				outcomesTxt.append( "  "  + dsp.getName() +  "  walks away from the situation. " );
				break;
			case 3:
				if (dsp.getStr() > 5)
				{
					outcomesTxt.append( "  "  + dsp.getName() +  "  gets in a fight with the guard and wins. " );
					outcomesTxt.append(  dsp.getName() +  "  gains 50Xp. " );
					add.setXp(50);
				}
				else
				{
					outcomesTxt.append( "  "  + dsp.getName() +  "  gets his clock cleaned by the guard and loses 25Hp. " );
					sub.setHp(25);
				}
				break;
			}
		break;
		//event 22
		case 22:
			// dispalys event and options and may alter outcome based on stats
			ChoiceEventGui.eventLbl.setText( " You see a female and male dwarf fighting in the middle of the street. " );
			ChoiceEventGui.choice1.setText( "  Attempt To Stop The Fight " );
			ChoiceEventGui.choice2.setText( "  Walk Away " );
			ChoiceEventGui.choice3.setText( "  Watch The Fight " );
			
			switch(playResp) {
			case 1:
				if (dsp.getStr() > 5)
				{
					outcomesTxt.append( "  "  + dsp.getName() +  "  breaks the fight up and gains 50Xp " );
					add.setXp(50);
				}
				else
				{
					outcomesTxt.append( "  "  + dsp.getName() +  "  fails to break up the fight and takes a beating in the process. " );
					outcomesTxt.append(  dsp.getName() +  "  loses 25Hp. " );
					sub.setHp(25);
				}
				break;
			case 2:
				outcomesTxt.append( "  "  + dsp.getName() +  "  decides to not get involved. " );
				break;
			case 3:
				outcomesTxt.append( "  "  + dsp.getName() +  "  learns some new fight moves from watching the fight and gains 1 strength. " );
				outcomesTxt.append(  dsp.getName() +  "  also feels slightly dumber after watching the fight and loses 1 intelligence. " );
				add.setStr(1);
				sub.setSma(1);
				break;
			}
		break;
		//event 23
		case 23:
			// dispalys event and options and may alter outcome based on stats
			ChoiceEventGui.eventLbl.setText(dsp.getName() +  "  hears noises coming from a cellar entrance near you? " );
			ChoiceEventGui.choice1.setText( "  Inspect The Noises " );
			ChoiceEventGui.choice2.setText( "  Don't Inspect The Noises " );
			ChoiceEventGui.choice3.setText( "  Cry Because Your A Wimp " );
			
			switch(playResp) {
			case 1:
				outcomesTxt.append( "  "  + dsp.getName() +  "  inspects the noises and discovers a monster. " );
				battle.monsterFight(1, true);
				break;
			case 2:
				outcomesTxt.append( "  "  + dsp.getName() +  "  decides to not inspect the noises. " );
				break;
			case 3:
				outcomesTxt.append( "  "  + dsp.getName() +  "  realizes he's a wimp and crys... he also loses 1 strength. " );
				sub.setStr(1);
				break;
			}
		break;
		//event 24
		case 24:
			// dispalys event and options and may alter outcome based on stats
			ChoiceEventGui.eventLbl.setText( " Dreder Dene, a male halfling merchant. He is selling strange potions and alchemical items. " );
			ChoiceEventGui.choice1.setText( "  Attempt To Steal From The Merchant " );
			ChoiceEventGui.choice2.setText( "  Beg For Items " );
			ChoiceEventGui.choice3.setText( "  My Mom Said I'm Not Allowed To Talk To Strangers " );
			
			switch(playResp) {
			case 1:
				if(dsp.getLuc() > 5)
				{
					outcomesTxt.append( "  "  + dsp.getName() +  "  succesfully steals an item from the merchant. " );
					inv.addRandItem();
				}
				else
				{
					outcomesTxt.append( "  "  + dsp.getName() +  "  gets caught and the merchant knocks  "  + dsp.getName() +  "  over the head. " );
					outcomesTxt.append(  dsp.getName() +  "  loses 25Hp. " );
					sub.setHp(25);
				}
				break;
			case 2:
				if (dsp.getStr() < 5)
				{
				outcomesTxt.append( " The merchant takes pitty on  "  + dsp.getName() +  " s weak soul and gives him an item. "  );
				inv.addRandItem();
				}
				else
				{
					outcomesTxt.append( " The merchant chases  "  + dsp.getName() +  "  away. " );
					outcomesTxt.append(  dsp.getName() +  "  feels weak and loses 1 strength. " );
					sub.setStr(1);
				}
				break;
			case 3:
				outcomesTxt.append( " I mean okay then... " );
				break;
			}
		break;
		//event 25
		case 25:
			// dispalys event and random outcome and may alter outcome based on stats
			ChoiceEventGui.eventLbl.setText( " Stones from the street begin gathering themselves into a pile. " );
			chancePer = chance.getChance300(dsp.getLuc());
			if (chancePer >= 0 && chancePer <= 100) 
			{
				outcomesTxt.append( " The stones become a mosnter and attack  "  + dsp.getName() +  " . " );
				outcomesTxt.append(  dsp.getName() +  "  loses 25Hp. " );
				sub.setHp(25);
			}
			if (chancePer >= 101 && chancePer <= 200) 
			{
				outcomesTxt.append( " Dude it's just a pile of stones calm down. " );
			}
			if (chancePer >= 201) 
			{
				outcomesTxt.append( " The Stones become a sophisticated statue and  "  + dsp.getName() +  "  gains 1 intelligence " );
				outcomesTxt.append( " from simply looking at the statue. " );
				add.setSma(1);
			}
				break;
				//event 26
		case 26:
			// dispalys event and random outcome and may alter outcome based on stats
			ChoiceEventGui.eventLbl.setText( " A gang of thugs led by the cunning rogue Heore. They have just killed someone and appear to be casting a ritual upon the corpse. " );
			chancePer = chance.getChance300(dsp.getLuc());
			if (chancePer >= 0 && chancePer <= 100) 
			{
				outcomesTxt.append( " The thugs fail the ritual causes an explosion and damaging  "  + dsp.getName() +  "  in the process. " );
				outcomesTxt.append(  dsp.getName() +  "  loses 50Hp. " );
				sub.setHp(50);
			}
			if (chancePer >= 101 && chancePer <= 200) 
			{
				outcomesTxt.append( " The ritual does nothing because magic isn't real! " );
			}
			if (chancePer >= 201) 
			{
				outcomesTxt.append( "  "  + dsp.getName() +  "  gains 1 point in luck and speed by being in the vacinity of the ritual. " );
				add.setSpd(1);
				add.setLuc(1);
			}
				break;
				//event 27
		case 27:
			// dispalys event and random outcome and may alter outcome based on stats
			ChoiceEventGui.eventLbl.setText( " A male human named Balde. He is quarreling with his son over a broken goblet. " );
			chancePer = chance.getChance300(dsp.getLuc());
			if (chancePer >= 0 && chancePer <= 100) 
			{
				outcomesTxt.append( " Balde throws the goblet at his son but misses and hits  "  + dsp.getName() +  " . " );
				outcomesTxt.append(  dsp.getName() +  "  loses 25Hp. " );
				sub.setHp(25);
			}
			if (chancePer >= 101 && chancePer <= 200) 
			{
				outcomesTxt.append( " The fight ends with father and son hugging. " );
			}
			if (chancePer >= 201) 
			{
				outcomesTxt.append( " Balde throws the goblet but misses his son almost hitting  "  + dsp.getName() +  " . " );
				outcomesTxt.append(  dsp.getName() +  "  thankfully manages to dodge and gains 1 luck and 1 speed. " );
				add.setSpd(1);
				add.setLuc(1);
			}
				break;
				//event 28
		case 28:
			// dispalys event and random outcome and may alter outcome based on stats
			ChoiceEventGui.eventLbl.setText( " Here, a male human moneylender. He is quarreling with a rat catcher who wants to search his shop. " );
			chancePer = chance.getChance300(dsp.getLuc());
			if (chancePer >= 0 && chancePer <= 100) 
			{
				outcomesTxt.append( " The rats sense the ratcatcher and run from the shop biting  "  + dsp.getName() +  "  in the process. " );
				outcomesTxt.append(  dsp.getName() +  " 25Hp. " );
				sub.setHp(25);
			}
			if (chancePer >= 101 && chancePer <= 200) 
			{
				outcomesTxt.append( " The ratcatcher walks away angered but nothing important happens. " );
			}
			if (chancePer >= 201) 
			{
				outcomesTxt.append( " The rats sense the ratcatcher and run from the shop and  "  + dsp.getName());
				outcomesTxt.append( " gets to play the game dodge the rats.  "  + dsp.getName() +  "  gains 1 speed and luck. " );
				add.setLuc(1);
				add.setSpd(1);
			}
				break;
				//event 29
		case 29:
			// dispalys event and random outcome and may alter outcome based on stats
			ChoiceEventGui.eventLbl.setText( " A black cat with bat-like wings perches atop a balcony, watching the street. " );
			chancePer = chance.getChance300(dsp.getLuc());
			if (chancePer >= 0 && chancePer <= 100) 
			{
				outcomesTxt.append( " The black cat doesn't take a liking to  "  + dsp.getName() +  "  and does a scratch and dash. " );
				outcomesTxt.append(  dsp.getName() +  "  loses 25Hp. " );
				sub.setHp(25);
			}
			if (chancePer >= 101 && chancePer <= 200) 
			{
				outcomesTxt.append( " Sounds cool right.. but nothing cool happens. " );
			}
			if (chancePer >= 201) 
			{
				outcomesTxt.append( " The cat is actually a god... huh turns out the egyptians is right. " );
				outcomesTxt.append( " The cat blesses  "  + dsp.getName() +  "  gaining him 1 stat point in every stat. " );
				add.setStr(1);
				add.setSpd(1);
				add.setDef(1);
				add.setLuc(1);
				add.setSma(1);
			}
				break;
				//event 30
		case 30:
			// dispalys event and random outcome and may alter outcome based on stats
			ChoiceEventGui.eventLbl.setText( " A male dwarf mercer named Gini. He seems to be under the delusion that his shop is on fire.  " );
			chancePer = chance.getChance300(dsp.getLuc());
			if (chancePer >= 0 && chancePer <= 100) 
			{
				outcomesTxt.append( " Gini blames  "  + dsp.getName() +  "  for the non existent house fire and proceeds to  " );
				outcomesTxt.append( " whale on  "  + dsp.getName() +  " .  "  + dsp.getName() +  "  loses 25Hp. " );
				sub.setHp(25);
			}
			if (chancePer >= 101 && chancePer <= 200) 
			{
				outcomesTxt.append( " Gini just keeps tweaking out on the poisonous mushrooms he obviously ate.  " );
				outcomesTxt.append( " He doesn't even notice  "  + dsp.getName() +  " . " );
			}
			if (chancePer >= 201) 
			{
				outcomesTxt.append( "  "  + dsp.getName() +  "  manages to convince Gini there isn't a fire.  " );
				outcomesTxt.append( " Gini rewards  "  + dsp.getName() +  "  with an item. " );
				inv.addRandItem();
			}			
		break;
		}
		ChoiceEventGui.outLbl.setText("<html><center>" + outcomesTxt.toString() + "</center></html>");
		outcomesTxt = new StringBuffer( "  " );
		if (cha >= 25 && cha <= 30)
		{
			ChoiceEventGui.choice1.doClick();
		}
	}

}
