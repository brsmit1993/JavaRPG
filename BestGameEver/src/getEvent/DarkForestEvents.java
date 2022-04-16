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
import getsetStats.StatAdd;
import getsetStats.StatSub;
import inventory.InventoryMethod;
import ui.StatDisplay;

public class DarkForestEvents{
	
	private static ChoiceEventGui eventWind = new ChoiceEventGui();
	protected static  MonsterBattle battle = new MonsterBattle();
	private static  PlayerEntry enter = new PlayerEntry();
	private static  Chance chance = new Chance();
	private static  StatAdd add = new StatAdd();
	private static  StatSub sub = new StatSub();
	private static  StatDisplay dsp = new StatDisplay();
	private static  InventoryMethod inv = new InventoryMethod();
	
	private static StringBuffer outcomesTxt = new StringBuffer( "  " );

	public static void getEvent(int cha, int playResp, boolean newEvent)
	{
		
		int chancePer;
		
		if(newEvent)
		{
		eventWind.eventChoiceWindow(cha,  "Forrest" );
		}
		
		switch (cha) 
		{
		case 1:
			ChoiceEventGui.eventLbl.setText(dsp.getName() +  "  finds a strength talisman. " );
			ChoiceEventGui.choice1.setText( "  rub it " );
			ChoiceEventGui.choice2.setText( "  avoid it " );
			ChoiceEventGui.choice3.setText( "  toss it like a frisbee " );
			
			switch(playResp) {
			case 1:
				outcomesTxt.append( " "  + dsp.getName() +  "  gains 1 strength. "  + "");
				add.setStr(1);
				break;
			case 2:
				outcomesTxt.append( " "  + dsp.getName() +  "  avoids it. "  + "");
				break;
			case 3:
				outcomesTxt.append( "Really?  "  + dsp.getName() +  "  loses 1 strength. "  + "");
				sub.setStr(1);
				break;
			}
		break;
		case 2:
			ChoiceEventGui.eventLbl.setText(dsp.getName() +  "  finds a intelligence talisman. " );
			ChoiceEventGui.choice1.setText( "  rub it " );
			ChoiceEventGui.choice2.setText( "  avoid it " );
			ChoiceEventGui.choice3.setText( "  toss it like a frisbee " );
			
			switch(playResp) {
			case 1:
				outcomesTxt.append( ""  + dsp.getName() +  "  gains 1 intelligence. " );
				add.setSma(1);
				break;
			case 2:
				outcomesTxt.append( ""  + dsp.getName() +  "  avoids it. " );
				break;
			case 3:
				outcomesTxt.append( " Really?  "  + dsp.getName() +  "  loses 1 intelligence. " );
				sub.setSma(1);
				break;
			}
		break;
		case 3:
			ChoiceEventGui.eventLbl.setText(dsp.getName() +  "  finds a speed talisman. " );
			ChoiceEventGui.choice1.setText( "  rub it " );
			ChoiceEventGui.choice2.setText( "  avoid it " );
			ChoiceEventGui.choice3.setText( "  toss it like a frisbee " );
			
			switch(playResp) {
			case 1:
				outcomesTxt.append( "  "  + dsp.getName() +  "  gains 1 speed. "  + "");
				add.setSpd(1);
				break;
			case 2:
				outcomesTxt.append( "  "  + dsp.getName() +  "  avoids it. "  + "");
				break;
			case 3:
				outcomesTxt.append( " Really?  "  + dsp.getName() +  "  loses 1 speed. "  + "");
				sub.setSpd(1);
				break;
			}
		break;
		case 4:
			ChoiceEventGui.eventLbl.setText(dsp.getName() +  "  finds a luck talisman. " );
			ChoiceEventGui.choice1.setText( "  rub it " );
			ChoiceEventGui.choice2.setText( "  avoid it " );
			ChoiceEventGui.choice3.setText( "  toss it like a frisbee " );
			
			switch(playResp) {
			case 1:
				outcomesTxt.append( "  "  + dsp.getName() +  "  gains 1 luck. "  + "");
				add.setLuc(1);
				break;
			case 2:
				outcomesTxt.append( "  "  + dsp.getName() +  "  avoids it. "  + "");
				break;
			case 3:
				outcomesTxt.append( " Really?  "  + dsp.getName() +  "  loses 1 luck. " + "" );
				sub.setLuc(1);
				break;
			}
		break;
		case 5:
			ChoiceEventGui.eventLbl.setText(dsp.getName() +  "  finds a defense talisman. " );
			ChoiceEventGui.choice1.setText( "  rub it " );
			ChoiceEventGui.choice2.setText( "  avoid it " );
			ChoiceEventGui.choice3.setText( "  toss it like a frisbee " );
			
			switch(playResp) {
			case 1:
				outcomesTxt.append( "  "  + dsp.getName() +  "  gains 1 defense. "  + "");
				add.setDef(1);
				break;
			case 2:
				outcomesTxt.append( "  "  + dsp.getName() +  "  avoids it. "  + "");
				break;
			case 3:
				outcomesTxt.append( " Really?  "  + dsp.getName() +  "  loses 1 defense. "  + "");
				sub.setDef(1);
				break;
			}
		break;
		case 6:
			ChoiceEventGui.eventLbl.setText(dsp.getName() +  "  comes across a ritual circle. " );
			ChoiceEventGui.choice1.setText( "  Attempt to perform a ritual " );
			ChoiceEventGui.choice2.setText( "  Nope out of their. " );
			ChoiceEventGui.choice3.setText( "  Destroy the ritual circle. " );
			
			switch(playResp) {
			case 1:
				outcomesTxt.append( " Although the attempt was pathetic the gods take pity. " );
				outcomesTxt.append( dsp.getName() +  "  gets a participation trophy. "  + "" );
				inv.addRandItem();
				break;
			case 2:
				outcomesTxt.append( "  "  + dsp.getName() +  "  aint about that life. "  + "" );
				break;
			case 3:
				outcomesTxt.append( "  "  + dsp.getName() +  "  messed up bad this time. "  + "");
				battle.monsterFight(3, true);
				break;
			}
		break;
		case 7:
			ChoiceEventGui.eventLbl.setText(dsp.getName() +  "  has a midlife crisis. " );
			ChoiceEventGui.choice1.setText( "  Cry " );
			ChoiceEventGui.choice2.setText( "  Get Over It " );
			ChoiceEventGui.choice3.setText( "  Call Your Accountant " );
			
			switch(playResp) {
			case 1:
				outcomesTxt.append( "  "  + dsp.getName() +  "  the noise of crying attracts a monster. " );
				battle.monsterFight(3, true);
				break;
			case 2:
				outcomesTxt.append( "  "  + dsp.getName() +  "  gets over it and gains 25XP. "  + "");
				add.setXp(25);
				break;
			case 3:
				outcomesTxt.append( "  "  + dsp.getName() +  " 's accountant tells  "  + dsp.getName() +  " ,  "  + dsp.getName() +  "  can afford that ferrari. " );
				outcomesTxt.append(dsp.getName() +  "  gains 25MaxHp from feeling young again. "  + "");
				add.setMaxHp(25);
				break;
			}
		break;
		case 8:
			ChoiceEventGui.eventLbl.setText(dsp.getName() +  "  hears an odd noise coming from the forest. " );
			ChoiceEventGui.choice1.setText( "  inspect the noise " );
			ChoiceEventGui.choice2.setText( "  run from the noise " );
			ChoiceEventGui.choice3.setText( "  curl up in a ball " );
			
			switch(playResp) {
			case 1:
				outcomesTxt.append( "  "  + dsp.getName() +  "  discovers where the noise is coming from. "  + "");
				battle.monsterFight(3, true);
				break;
			case 2:
				if (dsp.getSpd() > 8) {
				outcomesTxt.append( "  "  + dsp.getName() +  "  got away from the noise. "  + "");
				}
				else
				{
					outcomesTxt.append( "  "  + dsp.getName() +  "  can't escape fate. "  + "");
					battle.monsterFight(3, true);
				}
				break;
			case 3:
				outcomesTxt.append( " Really?  "  + dsp.getName() +  "  loses 1 strength from being so pathetic. "  + "");
				sub.setStr(1);
				break;
			}
		break;
		case 9:
			ChoiceEventGui.eventLbl.setText(dsp.getName() +  "  questions his life decisions. " );
			ChoiceEventGui.choice1.setText( "  Change Your Life For The Better " );
			ChoiceEventGui.choice2.setText( "  Do Nothing " );
			ChoiceEventGui.choice3.setText( "  Spiral Into Chaos " );
			
			switch(playResp) {
			case 1:
				outcomesTxt.append( "  "  + dsp.getName() +  "  changes his life for the better. " );
				outcomesTxt.append( dsp.getName() +  "  gains 25 Max Sp "  + "");
				add.setMaxSp(25);
				break;
			case 2:
				outcomesTxt.append( "  "  + dsp.getName() +  "  does nothing... like always. " );
				break;
			case 3:
				outcomesTxt.append( "  "  + dsp.getName() +  "  runs into a tree at full force. " );
				outcomesTxt.append( dsp.getName() +  "  loses 75Hp "  + "" );
				sub.setHp(75);
				break;
			}
		break;
		case 10:
			ChoiceEventGui.eventLbl.setText(dsp.getName() +  "  hears voices. " );
			ChoiceEventGui.choice1.setText( "  Listen To The Voices " );
			ChoiceEventGui.choice2.setText( "  Acknowledge Your Crazy " );
			ChoiceEventGui.choice3.setText( "  Don't Listen To The Voices " );
			
			switch(playResp) {
			case 1:
				outcomesTxt.append( "  "  + dsp.getName() +  "  bangs his head against a tree. " );
				outcomesTxt.append( dsp.getName() +  "  loses 25Hp. "  + "");
				sub.setHp(25);
				break;
			case 2:
				outcomesTxt.append( "  "  + dsp.getName() +  "  thinks Shadows Pass isn't good for the mind. " + "" );
				break;
			case 3:
				outcomesTxt.append( "  "  + dsp.getName() +  "  gains 1 Strength. " + "" );
				add.setStr(1);
				break;
			}
		break;
		case 11:
			ChoiceEventGui.eventLbl.setText( " You come across a strange glowing mushroom " );
			ChoiceEventGui.choice1.setText( "  Eat the mushroom " );
			ChoiceEventGui.choice2.setText( "  Ignore the mushroom " );
			ChoiceEventGui.choice3.setText( "  Yeet the mushroom " );
			
			switch(playResp) {
			case 1:
				outcomesTxt.append( " The mushroom makes you feel somehwat more durable " );
				outcomesTxt.append( dsp.getName() +  "  gains 1 defense "  + "");
				add.setDef(1);
				break;
			case 2:
				outcomesTxt.append( "  "  + dsp.getName() +  "  leaves the mushroom alone never knowing what secrets its holds " + "" );
				break;
			case 3:
				outcomesTxt.append( " The mushroom bounces off the head of a nearby monster, good luck " + "" );
				battle.monsterFight(2, true);
				break;
			}
		break;
		case 12:
			ChoiceEventGui.eventLbl.setText( " You see a shadow in the distance " );
			ChoiceEventGui.choice1.setText( "  Investigate the shadow " );
			ChoiceEventGui.choice2.setText( "  Call out to the shadow " );
			ChoiceEventGui.choice3.setText( "  Turn the other way " );
			
			switch(playResp) {
			case 1:
				outcomesTxt.append( " You've found BigFoot and the locals praise you as a celebrity " );
				outcomesTxt.append(dsp.getName() +  "  Gained 100xp "  + "");
				add.setXp(100);
				break;
			case 2:
				outcomesTxt.append( " the shadow is spooked and runs back into the forest "  + "");
				break;
			case 3:
				outcomesTxt.append( " You hit your head in a panic while trying to get away from the shadow " );
				outcomesTxt.append( dsp.getName() +  " loses 25hp "  + "");
				sub.setHp(25);
				break;
			}
		break;
		case 13:
			ChoiceEventGui.eventLbl.setText( " You come across a strange rickety bridge " );
			ChoiceEventGui.choice1.setText( "  carefully walk across the bridge " );
			ChoiceEventGui.choice2.setText( "  run across the bridge as fast as you can " );
			ChoiceEventGui.choice3.setText( "  yeet yourself into the water below " );
			
			switch(playResp) {
			case 1:
				outcomesTxt.append( "  "  + dsp.getName() +  "  makes it across the bridge safetly "  + "");
				break;
			case 2:
				if (dsp.getSpd() > 7) {
					outcomesTxt.append( "  "  + dsp.getName() +  "  made it across the bridge as it crumbles behind them "  + "");
				}
				else {
					outcomesTxt.append( "  "  + dsp.getName() +  "  falls into the river as the bridge collapses under them " );
					outcomesTxt.append(dsp.getName() +  "  max hp has fallen by 25 "  + "");
					sub.setHp(25);
					sub.setMaxHp(25);
				}
				break;
			case 3:
				outcomesTxt.append( "  "  + dsp.getName() +  "  gets washed away to a fairy's spring " );
				outcomesTxt.append( dsp.getName() +  "  max hp has been increased by 25 "  + "");
				add.setMaxHp(25);
				add.setHp(25);
				break;
			}
		break;
		case 14:
			ChoiceEventGui.eventLbl.setText( " you've run into an elf who wants to teach you calculus " );
			ChoiceEventGui.choice1.setText( "  sit down a try your best " );
			ChoiceEventGui.choice2.setText( "  run and scream from the scary math " );
			ChoiceEventGui.choice3.setText( "  attempt to pass the test " );
			
			switch(playResp) {
			case 1:
				outcomesTxt.append( "  "  + dsp.getName() +  " did thier best and learned from the lesson " );
				outcomesTxt.append( dsp.getName() +  " inteligence has increased by 1 "  + "");
				add.setSma(1);
				break;
			case 2:
				outcomesTxt.append( "  "  + dsp.getName() +  " can never escape higher education " );
				outcomesTxt.append( dsp.getName() +  " has lost 25 special points "  + "");
				sub.setSp(25);
				sub.setMaxSp(25);
				break;
			case 3:
				if(dsp.getSma() > 8) {
					outcomesTxt.append( "  "  + dsp.getName() +  " Has passed and receives 100 xp "  + "");
					add.setXp(100);
				}
				else {
					outcomesTxt.append( "  "  + dsp.getName() +  " has failed and goes home in tears " + "" );
				}
				break;
			}
		break;
		case 15:
			ChoiceEventGui.eventLbl.setText( " You come across a chest sitting in a small clearing " );
			ChoiceEventGui.choice1.setText( "  Open the chest " );
			ChoiceEventGui.choice2.setText( "  its a trap, leave the chest alone " );
			ChoiceEventGui.choice3.setText( "  attack it " );
			
			switch(playResp) {
			case 1:
				outcomesTxt.append( "  "  + dsp.getName() +  " opens the chest and finds a item "  + "");
				inv.addRandItem();
				break;
			case 2:
				outcomesTxt.append( "  "  + dsp.getName() +  " Leaves the chest alone fearing its trap " + "" );
				break;
			case 3:
				outcomesTxt.append( "  "  + dsp.getName() +  " punches the chest and hurts thier hand "  + "");
				sub.setHp(5);
				break;
			}
		break;
		case 16:
			ChoiceEventGui.eventLbl.setText( " you run into an old wizard among the trees " );
			ChoiceEventGui.choice1.setText( "  make small talk " );
			ChoiceEventGui.choice2.setText( "  ask the wizard the meaning of life " );
			ChoiceEventGui.choice3.setText( "  ask the wizard for a helpful item for your journey " );
			
			switch(playResp) {
			case 1:
				outcomesTxt.append( "  "  + dsp.getName() +  "  and the wizard talk about the weather for awhile " + "" );
				add.setXp(25);
				break;
			case 2:
				outcomesTxt.append( "  "  + dsp.getName() +  "  receives no meaningful response "  + "");
				break;
			case 3:
				outcomesTxt.append( " the wizard just gave out his last potion and you receive nothing "  + "");
				break;
			}
		break;
		case 17:
			ChoiceEventGui.eventLbl.setText( " you walk thru the forest and nothing happens " );
			ChoiceEventGui.choice1.setText( "  Do nothing " );
			ChoiceEventGui.choice2.setText( "  Do nothing " );
			ChoiceEventGui.choice3.setText( "  Do nothing " );
			
			switch(playResp) {
			case 1:
				outcomesTxt.append( " nothing happens " + "" );
				break;
			case 2:
				outcomesTxt.append( " nothing happens "  + "");
				break;
			case 3:
				outcomesTxt.append( " a small leaf floats by your face " + "" );
				break;
			}
		break;
		case 18:
			ChoiceEventGui.eventLbl.setText( " A strange cat is sitting infront of you " );
			ChoiceEventGui.choice1.setText( "  Pet the cat " );
			ChoiceEventGui.choice2.setText( "  Ask the cat for wares " );
			ChoiceEventGui.choice3.setText( "  ignore the cat " );
			
			switch(playResp) {
			case 1:
				outcomesTxt.append( "  "  + dsp.getName() +  "  pets the cat and feels warm and fuzzy inside " + "" );
				break;
			case 2:
				outcomesTxt.append( " the cat pulls an item out of a bag attached to his collar " + "" );
				inv.addRandItem();
				break;
			case 3:
				outcomesTxt.append( " heartless, but understandable "  + "");
				break;
			}
		break;
		case 19:
			ChoiceEventGui.eventLbl.setText( " You find a large tree that looks climbable " );
			ChoiceEventGui.choice1.setText( "  Climb the tree " );
			ChoiceEventGui.choice2.setText( "  chop down the tree " );
			ChoiceEventGui.choice3.setText( "  leave the tree alone " );
			
			switch(playResp) {
			case 1:
				outcomesTxt.append( "  "  + dsp.getName() +  " climbs the tree and find an item at the top "  + "");
				inv.addRandItem();
				break;
			case 2:
				outcomesTxt.append( "  "  + dsp.getName() +  " attempts to chop down the tree "  + "" );
				outcomesTxt.append("climate change stat +1 " );
				break;
			case 3:
				outcomesTxt.append( "  "  + dsp.getName() +  "  leaves the tree alone "  + "" );
				break;
			}
		break;
		case 20:
			ChoiceEventGui.eventLbl.setText( " you find a small villages of gnomes " );
			ChoiceEventGui.choice1.setText( "  Ask the gnomes for advice " );
			ChoiceEventGui.choice2.setText( "  ask the gnomes for an item " );
			ChoiceEventGui.choice3.setText( "  fight the gnomes " );
			
			switch(playResp) {
			case 1:
				outcomesTxt.append( " the gnomes tell you that breathing is important "  + "");
				break;
			case 2:
				outcomesTxt.append( " the gnomes give you a small trinket to help you on your travels "  + "");
				inv.addRandItem();
				break;
			case 3:
				outcomesTxt.append( "  "  + dsp.getName() +  "  attempts to attack the gnomes, they release thier monter to fight you "  + "");
				battle.monsterFight(2, true);
				break;
			}
		break;
		case 21:
			ChoiceEventGui.eventLbl.setText( " You see a dark shadowy figure on the ground near you " );
			ChoiceEventGui.choice1.setText( "  Investigate " );
			ChoiceEventGui.choice2.setText( "  Run " );
			ChoiceEventGui.choice3.setText( "  punch it " );
			
			switch(playResp) {
			case 1:
				outcomesTxt.append( " You realize its your own shadow "  + "");
				break;
			case 2:
				outcomesTxt.append( " you run as fast as you can but the shaddow continues to follow you "  + "");
				break;
			case 3:
				outcomesTxt.append( " you punch the ground, it was your own shadow "  + "");
				break;
			}
		break;
		case 22:
			ChoiceEventGui.eventLbl.setText( " you find a small bag of rations in the forest " );
			ChoiceEventGui.choice1.setText( "  Eat the rations " );
			ChoiceEventGui.choice2.setText( "  ignore the rations " );
			ChoiceEventGui.choice3.setText( "  Save the rations for later  " );
			
			switch(playResp) {
			case 1:
				outcomesTxt.append( " the rations had gone bad while sitting in the forest "  + "");
				outcomesTxt.append(dsp.getName() +  " loses 15hp " );
				sub.setHp(15);
				break;
			case 2:
				outcomesTxt.append( " the rations are left in the forest "  + "");
				break;
			case 3:
				outcomesTxt.append( "  "  + dsp.getName() +  " adds the rations to his inventory  "  + "");
				inv.addRandItem();
				break;
			}
		break;
		case 23:
			ChoiceEventGui.eventLbl.setText( " You hear what sounds like a voice on the wind " );
			ChoiceEventGui.choice1.setText( "  listen closer " );
			ChoiceEventGui.choice2.setText( "  ignore the voice " );
			ChoiceEventGui.choice3.setText( "  try to yell back " );
			
			switch(playResp) {
			case 1:
				outcomesTxt.append( " it sounds like wind "  + "");
				break;
			case 2:
				outcomesTxt.append( " you ignore the voice and continue on your adventure "  + "" );
				break;
			case 3:
				outcomesTxt.append( " you know sound like a crazy person that yells at the wind "  + "");
				break;
			}
		break;
		case 24:
			ChoiceEventGui.eventLbl.setText( " you find a lever attached to a tree " );
			ChoiceEventGui.choice1.setText( "  ignore the level " );
			ChoiceEventGui.choice2.setText( "  pull the lever " );
			ChoiceEventGui.choice3.setText( "  investigat the lever first " );
			
			switch(playResp) {
			case 1:
				outcomesTxt.append( " you leave the lever alone and nothing happens "  + "" );
				break;
			case 2:
				outcomesTxt.append( " you pull the lever and feel new strenght " );
				outcomesTxt.append( dsp.getName() +  "  gains 1 strength "  + "");
				add.setStr(1);
				break;
			case 3:
				outcomesTxt.append( " you see the lever isnt attached to anything and leave it alone "  + "");
				break;
			}
		break;
		case 25:
			ChoiceEventGui.eventLbl.setText( " you come across a small spring in a clearing " );
			ChoiceEventGui.choice1.setText( "  relax near the spring for a bit " );
			ChoiceEventGui.choice2.setText( "  cannon ball into the spring " );
			ChoiceEventGui.choice3.setText( "  throw something into the spring " );
			
			switch(playResp) {
			case 1:
				outcomesTxt.append( "  "  + dsp.getName() +  "  relaxes near the spring and feels refreshed  "  + "" );
				outcomesTxt.append(dsp.getName() +  "  has recovered 50hp " );
				add.setHp(50);
				break;
			case 2:
				outcomesTxt.append( " you make a decent splash, but no-one is around to see it "  + "");
				break;
			case 3:
				outcomesTxt.append( " you throw a large stick into the pond and walk away. "  + "");
				break;
			}
		break;
		case 26:
			ChoiceEventGui.eventLbl.setText( " you trip over a small hole and try to catch yourself " );
			chancePer = chance.getChance300(dsp.getLuc());
			if (chancePer >= 0 && chancePer <= 100) 
			{
				outcomesTxt.append( " you fall and hit your head, " );
				outcomesTxt.append( dsp.getName() +  "  loses 25hp "  + "");
				sub.setHp(25);
			}
			if (chancePer >= 101 && chancePer <= 200) 
			{
				outcomesTxt.append( " you catch yourself before falling " + "" );
			}
			if (chancePer >= 201) 
			{
				outcomesTxt.append( " you retain your balance and keep going like nothing happened " );
				outcomesTxt.append( dsp.getName() +  "  gains 1 speed "  + "");
				add.setSpd(1);
			}
				break;
		case 27:
			ChoiceEventGui.eventLbl.setText( " theres a strange portal in the forest " );
			chancePer = chance.getChance300(dsp.getLuc());
			if (chancePer >= 0 && chancePer <= 100) 
			{
				outcomesTxt.append( " a monster has appeared from the portal and attacked you  " + "" );
				battle.monsterFight(2, true);
			}
			if (chancePer >= 101 && chancePer <= 200) 
			{
				outcomesTxt.append( " the portal closes before you can get a closer look "  + "");
			}
			if (chancePer >= 201) 
			{
				outcomesTxt.append( " as you aproach the portal an item pops out "  + "");
				inv.addRandItem();
			}
				break;
		case 28:
			ChoiceEventGui.eventLbl.setText( " you come across a small camp " );
			chancePer = chance.getChance300(dsp.getLuc());
			if (chancePer >= 0 && chancePer <= 100) 
			{
				outcomesTxt.append( " you investigate and realize its an enemy camp " + "" );
				battle.monsterFight(3, true);
			}
			if (chancePer >= 101 && chancePer <= 200) 
			{
				outcomesTxt.append( " the camp seems abandoned and you continue on your way " + "" );
			}
			if (chancePer >= 201) 
			{
				outcomesTxt.append( " you find an item sitting in the camp and take it while no one is looking "  + "");
				inv.addRandItem();
			}
				break;
		case 29:
			ChoiceEventGui.eventLbl.setText( " it seems like nothing is happneing " );
			chancePer = chance.getChance300(dsp.getLuc());
			if (chancePer >= 0 && chancePer <= 100) 
			{
				outcomesTxt.append( " nothing happens....but badly "  + "");
			}
			if (chancePer >= 101 && chancePer <= 200) 
			{
				outcomesTxt.append( " nothing happens but its sorta neutral "  + "");
			}
			if (chancePer >= 201) 
			{
				outcomesTxt.append( " nothing happens " );
				outcomesTxt.append( dsp.getName() +  "  gains 50Xp for thier patience "  + "");
				add.setXp(50);
			}
				break;
		case 30:
			ChoiceEventGui.eventLbl.setText( " you suddenly fall feel tired and fall asleep on the trail "  + "");
			chancePer = chance.getChance300(dsp.getLuc());
			if (chancePer >= 0 && chancePer <= 100) 
			{
				outcomesTxt.append( " you seem to have hit your head on the way down "  + "");
				outcomesTxt.append( dsp.getName() +  "  lost 20hp " );
				sub.setHp(20);
			}
			if (chancePer >= 101 && chancePer <= 200) 
			{
				outcomesTxt.append( " you wake up feeling slighlty more rested than before "  + "" );
			}
			if (chancePer >= 201) 
			{
				outcomesTxt.append( " you wake up feeling completley refreshed " );
				outcomesTxt.append(  dsp.getName() +  "  recovers 50hp " + "");
				add.setHp(50);
			}			
		break;
		}
		ChoiceEventGui.outLbl.setText("<html><center>" + outcomesTxt.toString() + "</center></html>");
		outcomesTxt = new StringBuffer("");
		if (cha >= 25 && cha <= 30)
		{
			ChoiceEventGui.choice1.doClick();
		}
	}

}
