/**
 * @author Brandon Smith
 * @Version 1.0
 * @Date 3.30.2019
 * 
 * File gets events randomly if random event is actived and player is in a town local.
 */
package getEvent;

import java.awt.event.ActionListener;

import algorithms.Chance;
import battleMode.MonsterBattle;
import battleMode.MonsterBattle.endMoveMonBat;
import console.PlayerEntry;
import gameMethods.MainGame;
import getsetStats.StatAdd;
import getsetStats.StatSub;
import inventory.InventoryMethod;
import ui.StatDisplay;

public class ShadowPassEvents {
	
	protected static MonsterBattle battle = new MonsterBattle();
	private static ChoiceEventGui eventWind = new ChoiceEventGui();
	
	private static Chance chance = new Chance();
	private static StatAdd add = new StatAdd();
	private static StatSub sub = new StatSub();
	private static StatDisplay dsp = new StatDisplay();
	private static InventoryMethod inv = new InventoryMethod();
	private static int chancePer;
	

	
	private static StringBuffer outcomesTxt = new StringBuffer( "  " );
	
	public static void getEvent(int cha, int playResp, boolean newEvent)
	{	
		
		if(newEvent)
		{
		eventWind.eventChoiceWindow(cha, "Shadow");
		}

		switch (cha) 
		{
		case 1:
			ChoiceEventGui.eventLbl.setText(dsp.getName() +  "  finds a shrine dedicated to the god of death. " );
			ChoiceEventGui.choice1.setText( " Die!! (literally) " );
			ChoiceEventGui.choice2.setText( " Sacrafice Goat " );
			ChoiceEventGui.choice3.setText( " Die!! (but only on the inside) " );
			switch(playResp) {
			case 1:
				sub.setHp(99999999);
				break;
			case 2:
				outcomesTxt.append( " Death God: Dude?!?!? Whats wrong with you??? " );
				break;
			case 3:
				outcomesTxt.append( " HA! Jokes on you. You've been dead on the inside for years and just not realized it. " );
				break;
			}
		break;
		case 2:
			ChoiceEventGui.eventLbl.setText( " A lake of oily water lies ahead. " );
			ChoiceEventGui.choice1.setText( "  Take a dip. " );
			ChoiceEventGui.choice2.setText( "  Avoid the lake. " );
			ChoiceEventGui.choice3.setText( "  Take a sip. " );
			switch(playResp) {
			case 1:
				outcomesTxt.append( "  "  + dsp.getName() +  "  finds treasure at the bottom of the lake. " );
				inv.addRandItem();
				break;
			case 2:
				outcomesTxt.append( "  "  + dsp.getName() +  "  avoids the lake. " );
				break;
			case 3:
				outcomesTxt.append( " Really?  "  + dsp.getName() +  "  loses 50Hp because the lake is oily... come on man whats wrong with you? " );
				sub.setHp(50);
				break;
			}
		break;
		case 3:
			ChoiceEventGui.eventLbl.setText(dsp.getName() +  "  finds an abandoned cottage haunted by a ghost of a betrayed maiden. " );
			ChoiceEventGui.choice1.setText( "  Laugh at the ghost. " );
			ChoiceEventGui.choice2.setText( "  Who ya gonna call? " );
			ChoiceEventGui.choice3.setText( "  Comfort the ghost " );
			switch(playResp) {
			case 1:
				outcomesTxt.append( "  "  + dsp.getName() +  "  is possessed by the ghost who proceeds to use  "  + dsp.getName() +  " s body to "  + 
			 "  run head fisrt into a tree.  "  + dsp.getName() +  "  loses 50Hp. " );
				sub.setHp(50);
				break;
			case 2:
				outcomesTxt.append( "  "  + dsp.getName() +  "  CALLS THE GHOST BUSTERS!! DON'T WORRY THEY GOT THIS! " );
				break;
			case 3:
				outcomesTxt.append( " The ghost appreciates the councelling session provided by  "  + dsp.getName() +  "  and rewards  "  + 
			dsp.getName() +  "  with 100 gold pieces as payment. " );
				add.setGold(100);
				break;
			}
		break;
		case 4:
			ChoiceEventGui.eventLbl.setText(dsp.getName() +  "  runs into a company of dwarven warriors led by a female dwarf paladin  " 
					+  " \n  " 
					+  " named Borgga Arvardotr. Each of them is wearing dragonscale plate armor and a horned helm. " );
			ChoiceEventGui.choice1.setText( " Why is this so long???? " );
			ChoiceEventGui.choice2.setText( " I don't even understand what's going on here??? " );
			ChoiceEventGui.choice3.setText( " call developer a NERD!!!!  " );
			
			switch(playResp) {
			case 1:
				outcomesTxt.append( " Honestly I don't know... " );
				break;
			case 2:
				outcomesTxt.append( " Don't worry neither do I... " );
				break;
			case 3:
				outcomesTxt.append( " You're gonna regret that... " );
				sub.setStr(1);sub.setStr(1);sub.setStr(1);sub.setStr(1);sub.setStr(1);sub.setStr(1);sub.setStr(1);sub.setStr(1);sub.setStr(1);sub.setStr(1);
				sub.setDef(1);sub.setDef(1);sub.setDef(1);sub.setDef(1);sub.setDef(1);sub.setDef(1);sub.setDef(1);sub.setDef(1);sub.setDef(1);sub.setDef(1);
				sub.setSpd(1);sub.setSpd(1);sub.setSpd(1);sub.setSpd(1);sub.setSpd(1);sub.setSpd(1);sub.setSpd(1);sub.setSpd(1);sub.setSpd(1);sub.setSpd(1);
				sub.setSma(1);sub.setSma(1);sub.setSma(1);sub.setSma(1);sub.setSma(1);sub.setSma(1);sub.setSma(1);sub.setSma(1);sub.setSma(1);sub.setSma(1);
				sub.setLuc(1);sub.setLuc(1);sub.setLuc(1);sub.setLuc(1);sub.setLuc(1);sub.setLuc(1);sub.setLuc(1);sub.setLuc(1);sub.setLuc(1);sub.setLuc(1);
				break;
			}
		break;
		case 5:
			ChoiceEventGui.eventLbl.setText(dsp.getName() +  "  sees a gang of cruel orc warriors. They have made a spiked pit trap and are lurking nearby.  " );
			ChoiceEventGui.choice1.setText( "  walk dirrectly in to the trap " );
			ChoiceEventGui.choice2.setText( "  walk around the trap " );
			ChoiceEventGui.choice3.setText( "  jump into the trap like an OG " );
			
			switch(playResp) {
			case 1:
				outcomesTxt.append( "  Really??? It's a trap!!! Did you expect this to go well... YOU'RE A MASOCHIST. " );
				outcomesTxt.append( "  LOSE 1 STRENGTH " );
				outcomesTxt.append( "  LOSE 1 SPPED " );
				outcomesTxt.append( "  LOSE 100 HP!!! BECAUSE YOU LANDED ON SPIKES!!! " );
				outcomesTxt.append( "  LOSE 1 INTELLIGENCE... BECAUSE YOU'RE STUPID!!!  " );
				outcomesTxt.append(  dsp.getName() +  "  SCREAMS BECAUSE HE LANDED ON SPIKES AND ATTRACTS A MONSTER!!! " );
				outcomesTxt.append(  dsp.getName() +  "  also hates (insert your name here) because... you know what you did! " );
				battle.monsterFight(3, true);
				break;
			case 2:
				outcomesTxt.append( " Thank god you didn't pick option 1 or 3. " );
				break;
			case 3:
				outcomesTxt.append( " Really??? It's a trap!!! Did you expect this to go well... YOU'RE A MASOCHIST. " );
				outcomesTxt.append( " LOSE 1 STRENGTH... like an OG " );
				outcomesTxt.append( " LOSE 1 SPPED... like an OG " );
				outcomesTxt.append( " LOSE 100 HP!!! BECAUSE YOU LANDED ON SPIKES!!! Like an OG. " );
				outcomesTxt.append( " LOSE 1 INTELLIGENCE... BECAUSE YOU'RE STUPID!!! Like an OG. " );
				outcomesTxt.append( dsp.getName() +  "  SCREAMS BECAUSE HE LANDED ON SPIKES AND ATTRACTS A MONSTER!!! Like an OG. " );
				outcomesTxt.append(  dsp.getName() +  "  also hates (insert your name here) because... you know what you did... like an OG. " );
				
				battle.monsterFight(3, true);
				break;
			}
		break;
		case 6:
			ChoiceEventGui.eventLbl.setText(dsp.getName() +  "  sees a strange rock in the distantce.  " );
			ChoiceEventGui.choice1.setText( "  inspect the rock  " );
			ChoiceEventGui.choice2.setText( "  don't inspect the rock  " );
			ChoiceEventGui.choice3.setText( "  inspect the rock from a distance " );
			
			switch(playResp) {
			case 1:
				outcomesTxt.append( " The rock is magical and hits  "  + dsp.getName() +  "  in the head. " );
				outcomesTxt.append( dsp.getName() +  "  loses 50Hp. " );
				sub.setHp(50);
				break;
			case 2:
				outcomesTxt.append( " Yeah something seemed funny about that rock. " );
				break;
			case 3:
				outcomesTxt.append( " The rock is magical and tries to hit  "  + dsp.getName() +  "  in the head but " );
				outcomesTxt.append(  dsp.getName() +  "  managed to dodge it because they had time to react. " );
				outcomesTxt.append(  dsp.getName() +  "  gained 50Xp " );
				add.setXp(50);
				break;
			}
		break;
		case 7:
			ChoiceEventGui.eventLbl.setText(dsp.getName() +  "  sees a goblin trying to sacrafice a goat. " );
			ChoiceEventGui.choice1.setText( "  SAVE THE GOAT! " );
			ChoiceEventGui.choice2.setText( "  HELP THE GOBLING! (WHATS WRONG WITH YOU????) " );
			ChoiceEventGui.choice3.setText( "  walk away. " );
			
			switch(playResp) {
			case 1:
					outcomesTxt.append( "  "  + dsp.getName() +  "  is agaisnt animal violence and stops the gobling. " );
					outcomesTxt.append(  dsp.getName() +  "  gains a heart and 100 hit points. " );
					add.setHp(100);
				break;
			case 2:
					outcomesTxt.append( " Yeah not gonna happen.  "  + dsp.getName() +  "  tries to help the goblin. " );
					outcomesTxt.append( " The goblin doesn't like getting help and decides to kick  "  + dsp.getName() +  "  in the shins. " );
					outcomesTxt.append( " Also the goat escapes... and  "  + dsp.getName() +  "  loses 150hp because that hurt. " );
					sub.setHp(150);
				break;
			case 3:
					outcomesTxt.append( " The goat escaped on it's own no thanks to  "  + dsp.getName() +  "  ... jerk. " );
				break;
			}
		break;
		case 8:
			ChoiceEventGui.eventLbl.setText(dsp.getName() +  "  hears the unearthly howl of a monstrous beast that echoes through the air. " );
			ChoiceEventGui.choice1.setText( "  Find The Monster " );
			ChoiceEventGui.choice2.setText( "  Pee Your Self " );
			ChoiceEventGui.choice3.setText( "  Run From The Mosnter " );
			
			switch(playResp) {
			case 1:
				outcomesTxt.append( "  "  + dsp.getName() +  "  hunts down the monster. " );
				battle.monsterFight(3, true);
				break;
			case 2:
				outcomesTxt.append( "  "  + dsp.getName() +  "  loses 1 self respect and 1 strength for being a wimp. " );
				sub.setStr(1);
				break;
			case 3:
				if (dsp.getSp() > 7)
				{
					outcomesTxt.append( "  "  + dsp.getName() +  "  manages to escape with his dignity intact " );
				}
				else
				{
					outcomesTxt.append( "  "  + dsp.getName() +  "  tries to escape but the mosnter catches up. " );
					battle.monsterFight(3, true);
				}
				break;
			}
		break;
		case 9:
			ChoiceEventGui.eventLbl.setText(dsp.getName() +  "  sees a chicken in the distance. " );
			ChoiceEventGui.choice1.setText( "  pet the chicken " );
			ChoiceEventGui.choice2.setText( "  ignore the chicken " );
			ChoiceEventGui.choice3.setText( "  kick the chicken " );
			
			switch(playResp) {
			case 1:
					outcomesTxt.append( "  "  + dsp.getName() +  "  pets the chicken.. the chicken is a mosnter in disguise. " );
					battle.monsterFight(3, true);
				break;
			case 2:
					outcomesTxt.append( "  "  + dsp.getName() +  "  ignores the chicken. " );
				break;
			case 3:
					outcomesTxt.append( "  "  + dsp.getName() +  "  kicks the chicken and the chicken runs away. " );
					outcomesTxt.append( " The chicken was actually a mosnter in disguise but whos the real monster? " );
					outcomesTxt.append( " I mean seriously who kicks a chicken... oh well +25Xp. " );
					add.setXp(25);
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
				outcomesTxt.append( "  "  + dsp.getName() +  "  jumps off a cliff. Looks like Shadows Pass claims another adventurer. " );
				sub.setHp(10000);
				break;
			case 2:
				outcomesTxt.append( "  "  + dsp.getName() +  "  thinks Shadows Pass isn't good for the mind. " );
				break;
			case 3:
				outcomesTxt.append( "  "  + dsp.getName() +  "  gains 1 Strength. " );
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
				outcomesTxt.append(  dsp.getName() +  "  gains 1 defense " );
				add.setDef(1);
				break;
			case 2:
				outcomesTxt.append( "  "  + dsp.getName() +  "  leaves the mushroom alone never knowing what secrets its holds " );
				break;
			case 3:
				outcomesTxt.append( " The mushroom bounces off the head of a nearby monster, good luck " );
				battle.monsterFight(2, true);
				break;
			}
		break;
		case 12:
			ChoiceEventGui.eventLbl.setText( " you come across a small spring in a clearing " );
			ChoiceEventGui.choice1.setText( "  relax near the spring for a bit " );
			ChoiceEventGui.choice2.setText( "  cannon ball into the spring " );
			ChoiceEventGui.choice3.setText( "  throw something into the spring " );
			
			switch(playResp) {
			case 1:
				outcomesTxt.append( "  "  + dsp.getName() +  "  relaxes near the spring and feels refreshed  " );
				outcomesTxt.append( dsp.getName() +  "  has recovered 50hp " );
				add.setHp(50);
				break;
			case 2:
				outcomesTxt.append( " you make a decent splash, but no-one is around to see it " );
				break;
			case 3:
				outcomesTxt.append( " you throw a large stick into the pond and walk away. " );
				outcomesTxt.append(  dsp.getName() +  " has been cursed by the spring " );
				sub.setHp(50);
				
				break;
			}
		break;
		case 13:
			ChoiceEventGui.eventLbl.setText( " while walking thru shadows pass "  + dsp.getName() +  " sees a large beast approaching you " );
			ChoiceEventGui.choice1.setText( "  quietly sneak away " );
			ChoiceEventGui.choice2.setText( "  run yelling and screaming " );
			ChoiceEventGui.choice3.setText( "  take the beast head on " );
			
			switch(playResp) {
			case 1:
				if(dsp.getLuc() > 7)
				{
				outcomesTxt.append(dsp.getName() +   "  was able to quiety sneak past " );
				}
				else
				{
					outcomesTxt.append( "  "  + dsp.getName() +  "  was not sneaky enough. " );
				}
				break;
			case 2:
				outcomesTxt.append( "  "  + dsp.getName() +  "  got away from the first beast but thier screaming has attracted another " );
				battle.monsterFight(3, true);
				break;
			case 3:
				outcomesTxt.append( "  "  + dsp.getName() +  " chooses to fight the monster " );
				battle.monsterFight(2, true);
				break;
			}
		break;
		case 14:
			ChoiceEventGui.eventLbl.setText( " as  "  + dsp.getName() +  "  is walking  "  + dsp.getName() +  "  hears a large tree trying to talk to them " );
			ChoiceEventGui.choice1.setText( "  listen to the tree " );
			ChoiceEventGui.choice2.setText( "  Make small talk with the tree " );
			ChoiceEventGui.choice3.setText( "  ignore the tree " );
			
			switch(playResp) {
			case 1:
				outcomesTxt.append( "  "  + dsp.getName() +  " listens to the tree for awhile and becomes bored " );
				outcomesTxt.append(  dsp.getName() +  "  loses 25sp " );
				sub.setSp(25);
				break;
			case 2:
				outcomesTxt.append( "  "  + dsp.getName() +  "  talks to the tree about that fantasy football game " );
				break;
			case 3:
				outcomesTxt.append( "  "  + dsp.getName() +  " belives he is going crazy and avoids the magic talking tree " );
				break;
			}
		break;
		case 15:
			ChoiceEventGui.eventLbl.setText(dsp.getName() +  "  comes across a chest with an old map inside " );
			ChoiceEventGui.choice1.setText( "  look at the map " );
			ChoiceEventGui.choice2.setText( "  ignore the map " );
			ChoiceEventGui.choice3.setText( "  yeet the map " );
			
			switch(playResp) {
			case 1:
				outcomesTxt.append( " the map bursts into the flames the second  "  + dsp.getName() +  "  picks it up " );
				outcomesTxt.append(  dsp.getName() +  "  learns nothing from the map and takes 50 damge. " );
				sub.setHp(50);
				break;
			case 2:
				outcomesTxt.append( "  "  + dsp.getName() +  "  ignores the map and continues on thier journey " );
				break;
			case 3:
				outcomesTxt.append( "  "  + dsp.getName() +  "  throws the map as far as they can, it bursts into flames in the sky creating a nice show " );
				break;
			}
		break;
		case 16:
			ChoiceEventGui.eventLbl.setText( " A swarm of insects darkens the sky overhead. " );
			ChoiceEventGui.choice1.setText( "  Hide " );
			ChoiceEventGui.choice2.setText( "  Run " );
			ChoiceEventGui.choice3.setText( "  Scream At The Bugs " );
			
			switch(playResp) {
			case 1:
				if (dsp.getLuc() > 5)
				{
				outcomesTxt.append( dsp.getName() +  "  succesfully hides from the bugs + 50XP. " );
				add.setXp(50);
				}
				else
				{
					outcomesTxt.append( "  "  + dsp.getName() +  "  fails to hide and the bugs swarm  "  + dsp.getName() +  " . " );
					outcomesTxt.append(  dsp.getName() +  "  loses 50Hp because bugs are gross. " );
					sub.setHp(50);
				}
				break;
			case 2:
				if (dsp.getSpd() > 8)
				{
					outcomesTxt.append( "  "  + dsp.getName() +  "  manages to outrun the bugs +50XP " );
					add.setXp(50);
				}
				else
				{
					outcomesTxt.append( "  "  + dsp.getName() +  "  is not fast enough and the bugs swarm and sting  "  + dsp.getName());
					outcomesTxt.append( " like a voodoo doll.  "  + dsp.getName() +  "  loses 100Hp. " );
					sub.setHp(100);
				}
				break;
			case 3:
				outcomesTxt.append( "  "  + dsp.getName() +  "  is a fool and the bugs swarm and sting  "  + dsp.getName());
				outcomesTxt.append( " like a voodoo doll.  "  + dsp.getName() +  "  loses 100Hp... idiot... " );
				sub.setHp(100);
				break;
			}
		break;
		case 17:
			ChoiceEventGui.eventLbl.setText(dsp.getName() +  "  runs across an injured traveler. " );
			ChoiceEventGui.choice1.setText( "  Help the traveler " );
			ChoiceEventGui.choice2.setText( "  Ignore the traveler " );
			ChoiceEventGui.choice3.setText( "  Rob the traveler " );
			
			switch(playResp) {
			case 1:
				outcomesTxt.append( "  "  + dsp.getName() +  "  helps the travler... turns out the traveler was thier and steals gold from  "  + dsp.getName());
				sub.setGold(300);
				break;
			case 2:
				outcomesTxt.append( "  "  + dsp.getName() +  "  ignores the injured traveler... becuase  "  + dsp.getName() +  "  is a jerk. " );
				break;
			case 3:
				outcomesTxt.append( "  "  + dsp.getName() +  "  robs the traveler... turns out the traveler was theif and had 500 Gold. " );
				add.setGold(500);
				break;
			}
		break;
		case 18:
			ChoiceEventGui.eventLbl.setText(dsp.getName() +  "  finds an injured cat. " );
			ChoiceEventGui.choice1.setText( "  help the cat " );
			ChoiceEventGui.choice2.setText( "  ignore the cat " );
			ChoiceEventGui.choice3.setText( "  dogs are better " );
			
			switch(playResp) {
			case 1:
				outcomesTxt.append( "  "  + dsp.getName() +  "  helps the cat but get scratched in the process... ouch lose 50Hp "   +  " This is why dogs are better. " );
				sub.setHp(50);
				break;
			case 2:
				outcomesTxt.append( "  "  + dsp.getName() +  "  ignores the cat. " );
				break;
			case 3:
				outcomesTxt.append( " Yup. Gain 1 intelligence. " );
				add.setSma(1);
				break;
			}
		break;
		case 19:
			ChoiceEventGui.eventLbl.setText( " Runs into a dangerous monster. " );
			ChoiceEventGui.choice1.setText( "  RUN!!! " );
			ChoiceEventGui.choice2.setText( "  FIGHT!! " );
			ChoiceEventGui.choice3.setText( "  Help the mosnters understand their feelings. " );
			
			switch(playResp) {
			case 1:
				if (dsp.getSpd() > 5)
				{
					outcomesTxt.append( "  "  + dsp.getName() +  "  manages to escape and gains 150XP " );
					add.setXp(150);
				}
				else
				{
					outcomesTxt.append( "  "  + dsp.getName() +  "  fails to escape.. get ready for a fight. " );
					battle.monsterFight(3, true);
				}
				break;
			case 2:
				outcomesTxt.append( " Try not to die! " );
				battle.monsterFight(3, true);
				break;
			case 3:
				outcomesTxt.append( "  "  + dsp.getName() +  "  manages to make the mosnters see the errors of their way. + 10XP " );
				add.setXp(10);
				break;
			}
		break;
		case 20:
			ChoiceEventGui.eventLbl.setText(dsp.getName() +  "  runs into a tree. " );
			ChoiceEventGui.choice1.setText( "  Punch The Tree " );
			ChoiceEventGui.choice2.setText( "  Walk Away " );
			ChoiceEventGui.choice3.setText( "  Apologize To The Tree " );
			
			switch(playResp) {
			case 1:
				if (dsp.getStr() > 7)
				{
					outcomesTxt.append( "  "  + dsp.getName() +  "  makes the tree cry. "  + dsp.getName() +  "  gains 50XP " );
					add.setXp(50);
				}
				else
				{
					outcomesTxt.append( "  "  + dsp.getName() +  "  punches the tree... the tree is magical and punches back. "  + dsp.getName() +  "  loses 50Hp. " );
					sub.setHp(50);
				}
				break;
				
			case 2:
				outcomesTxt.append( "  "  + dsp.getName() +  "  walks away. " );
				break;
			case 3:
				outcomesTxt.append( " The tree responds by apolgizing to. "  + dsp.getName() +  "  gains 25XP " );
				add.setXp(25);
				break;
			}
		break;
		case 21:
			ChoiceEventGui.eventLbl.setText(dsp.getName() +  "  sees an elf performing a satanic ritual. " );
			ChoiceEventGui.choice1.setText( "  Stop The Elf " );
			ChoiceEventGui.choice2.setText( "  Nope " );
			ChoiceEventGui.choice3.setText( "  Help The Elf " );
			
			switch(playResp) {
			case 1:
				outcomesTxt.append( "  "  + dsp.getName() +  "  attempts to stop the elf but is stopped by an electric forcefield. " );
				outcomesTxt.append(  dsp.getName() +  "  gets shcoked and loses 50Hp. " );
				sub.setHp(50);
				break;
			case 2:
				outcomesTxt.append( "  "  + dsp.getName() +  "  nopes out of there. " );
				break;
			case 3:
				outcomesTxt.append( "  "  + dsp.getName() +  "  helps the elf complete the ritual. " );
				outcomesTxt.append(  dsp.getName() +  "  is rewarded with an item. " );
				inv.addRandItem();
				break;
			}
		break;
		case 22:
			ChoiceEventGui.eventLbl.setText(dsp.getName() +  "  meets a talking squirrel. " );
			ChoiceEventGui.choice1.setText( "  Talk About The Weather " );
			ChoiceEventGui.choice2.setText( "  SQUIRRELS DON'T TALK!!! " );
			ChoiceEventGui.choice3.setText( "  Have A Political Debate " );
			
			switch(playResp) {
			case 1:
				outcomesTxt.append( "  "  + dsp.getName() +  "  bores the squirrel. The squirrel leaves. " );
				outcomesTxt.append(  dsp.getName() +  "  gains 50XP. " );
				add.setXp(50);
				break;
			case 2:
				outcomesTxt.append( " YES THEY DO! " );
				break;
			case 3:
				outcomesTxt.append( "  "  + dsp.getName() +  "  enrages the squirrel. The squirrel bites  "  + dsp.getName());
				outcomesTxt.append(  dsp.getName() +  "  loses 50HP. " );
				sub.setHp(50);
				break;
			}
		break;
		case 23:
			ChoiceEventGui.eventLbl.setText(dsp.getName() +  "  meets an enchanted rock. " );
			ChoiceEventGui.choice1.setText( "  Have A Polite Conversation " );
			ChoiceEventGui.choice2.setText( "  CAN YOU SMELL WHAT THE ROCK IS COOKING? " );
			ChoiceEventGui.choice3.setText( "  Ignore The Rock " );
			
			switch(playResp) {
			case 1:
				outcomesTxt.append( "  "  + dsp.getName() +  "  becomes extremely bored with the rock and loses 50HP. " );
				sub.setHp(50);
				break;
			case 2:
				outcomesTxt.append( "  "  + dsp.getName() +  "  can smell what the rock is cooking. +50XP " );
				add.setXp(50);
				break;
			case 3:
				outcomesTxt.append( "  "  + dsp.getName() +  "  ignores the rock. " );
				break;
			}
		break;
		case 24:
			ChoiceEventGui.eventLbl.setText( " A cloud of blood-sucking flies darkens the sky overhead. " );
			ChoiceEventGui.choice1.setText( "  Shoo The Flies Away " );
			ChoiceEventGui.choice2.setText( "  Ignore The Flies " );
			ChoiceEventGui.choice3.setText( "  Pray To The Gods " );
			
			switch(playResp) {
			case 1:
					outcomesTxt.append( " Yeah that doesn't work well.  "  + dsp.getName() +  "  just annoy the flies and they attack. "  + 
			dsp.getName() +  "  loses 50Hp. " );
					sub.setHp(50);
				break;

			case 2:
				outcomesTxt.append( "  "  + dsp.getName() +  "  might ignore the flies but the flies don't ignore  "  + dsp.getName() + dsp.getName() +  "  loses 25Hp. " );
				sub.setHp(25);
				break;
			case 3:
				outcomesTxt.append( "  "  + dsp.getName() +  "  prays for help from the gods. The gods respond by making it rain frogs. "  +  " The frogs eat the flies and  "  + dsp.getName() +  "  gains 50XP. " );
				add.setXp(50);
				break;
			}
		break;
		case 25:
			ChoiceEventGui.eventLbl.setText( " A ghostly warrior stands guard beside a broken tomb. She is bound to this place until iron is made flesh. " );
			ChoiceEventGui.choice1.setText( "  What Does That Even Mean? " );
			ChoiceEventGui.choice2.setText( "  Attack The Warrior " );
			ChoiceEventGui.choice3.setText( "  Turn Iron Into Flesh " );
			
			switch(playResp) {
			case 1:
				outcomesTxt.append( " ... all I know is I need sleep");
				break;
			case 2:
				outcomesTxt.append( " The ghostly warrior summons a monster.");
				battle.monsterFight(3, true);
				break;
			case 3:
				outcomesTxt.append( "  "  + dsp.getName() +  "  frees the ghostly warrior. " );
				break;
			}
		break;
		case 26:
			ChoiceEventGui.eventLbl.setText( " A large rock suddenly falls from a cliff and heads right for you " );
			chancePer = chance.getChance300(dsp.getLuc());
			if (chancePer >= 0 && chancePer <= 100) 
			{
				outcomesTxt.append( " you arent able to get out of the way in time "  + dsp.getName() +  "  loses 50hp " );
				sub.setHp(50);
			}
			if (chancePer >= 101 && chancePer <= 200) 
			{
				outcomesTxt.append( " you barely dodge but scrape your knee doing so "  + dsp.getName() +  "  loses 20hp " );
				sub.setHp(20);
			}
			if (chancePer >= 201) 
			{
				outcomesTxt.append( " you dodge the rock perfectly " );
			}
				break;
		case 27:
			ChoiceEventGui.eventLbl.setText( " your allergies start acting up and you begin sneezing uncontrolably " );
			chancePer = chance.getChance300(dsp.getLuc());
			if (chancePer >= 0 && chancePer <= 100) 
			{
				outcomesTxt.append( " the noise has attracted a monster " );
				battle.monsterFight(3, true);
			}
			if (chancePer >= 101 && chancePer <= 200) 
			{
				outcomesTxt.append( " you sit there and sneexe for awhile, allergy season sucks " );
			}
			if (chancePer >= 201) 
			{
				outcomesTxt.append( " your sneezing attracts an old wizard, he cures your allergies using a new spell " );
			}
				break;
		case 28:
			ChoiceEventGui.eventLbl.setText( " you begin to hear strange voices in your head " );
			chancePer = chance.getChance300(dsp.getLuc());
			if (chancePer >= 0 && chancePer <= 100) 
			{
				outcomesTxt.append( " you believe you are going crazy and worry about it all day "  + dsp.getName() +  "  loses 25hp and 25sp " );
				sub.setHp(25);
				sub.setSp(25);
			}
			if (chancePer >= 101 && chancePer <= 200) 
			{
				outcomesTxt.append( " you welcome the new friendly voice in your head and continue on " );
			}
			if (chancePer >= 201) 
			{
				outcomesTxt.append( " you sit a meditate on the voice for awhile and you learn the secrets of true power "  + dsp.getName() +  "  gains 1 stregnth " );
				add.setStr(1);
			}
				break;
		case 29:
			ChoiceEventGui.eventLbl.setText( " you come across a small stream and decide to take a drink " );
			chancePer = chance.getChance300(dsp.getLuc());
			if (chancePer >= 0 && chancePer <= 100) 
			{
				outcomesTxt.append( " the water is tainted "  + dsp.getName() +  "  loses 50hp " );
				sub.setHp(25);
			}
			if (chancePer >= 101 && chancePer <= 200) 
			{
				outcomesTxt.append( " you drink the water and it quenches your thirst " );
			}
			if (chancePer >= 201) 
			{
				outcomesTxt.append( " this is the best water you've ever had "  + dsp.getName() +  "  recovers 25sp " );
				add.setSp(25);
			}
				break;
		case 30:
			ChoiceEventGui.eventLbl.setText( " an elf appears before you " );
			chancePer = chance.getChance300(dsp.getLuc());
			if (chancePer >= 0 && chancePer <= 100) 
			{
				outcomesTxt.append( " He's heard of you and innt a fan, he summons a monster to fight you " );
				battle.monsterFight(3, true);
			}
			if (chancePer >= 101 && chancePer <= 200) 
			{
				outcomesTxt.append( " the elf offers fake directions to the next area " );
			}
			if (chancePer >= 201) 
			{
				outcomesTxt.append( " the elf offers you an item to help on your adventure " );
				inv.addRandItem();
			}
			
		break;
		}

		ChoiceEventGui.outLbl.setText("<html><center>" + outcomesTxt.toString()+ "</center></html>");
		outcomesTxt = new StringBuffer( "  " );
		if (cha >= 25 && cha <= 30)
		{
			ChoiceEventGui.choice1.doClick();
		}
		
		
	}
	
	

}