package guiComponents;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import console.GameStart;

public class Images {
	private static JLabel imgThief;
	private static JLabel imgMage;
	private static JLabel imgRanger;
	private static JLabel imgKnight;
	private static JLabel imgBadger;
	private static JLabel imgBat;
	private static JLabel imgBrownbear;
	private static JLabel imgBunny;
	private static JLabel imgChicken;
	private static JLabel imgCyclops;
	private static JLabel imgDrunkdwarf;
	private static JLabel imgFlyingsword;
	private static JLabel imgFrog;
	private static JLabel imgGhost;
	private static JLabel imgGiant;
	private static JLabel imgGiantscorpion;
	private static JLabel imgGiantspider;
	private static JLabel imgGiantwolfspider;
	private static JLabel imgGoblin;
	private static JLabel imgGoblinking;
	private static JLabel imgHawk;
	private static JLabel imgHoneybadger;
	private static JLabel imgLizard;
	private static JLabel imgOrc;
	private static JLabel imgOwl;
	private static JLabel imgShadowdemon;
	private static JLabel imgShrub;
	private static JLabel imgSkeletonwarrior;
	private static JLabel imgSpider;
	private static JLabel imgStonegiant;
	private static JLabel imgThug;
	private static JLabel imgTroll;
	private static JLabel imgVampire;
	private static JLabel imgVulture;
	private static JLabel imgWerewolf;
	private static JLabel imgWolf;
	private static JLabel imgDeath;
	private static JLabel shopKeep;
	private static JLabel imgWin;
// MAP COMPONENTS ******************************************************************************************************************************************
	public ImageIcon getImgAppIcon() {
		ImageIcon mapImgbad = new ImageIcon(GameStart.class.getResource(
                "/console/resources/appIcon.jpg"));
		Image image4 = mapImgbad.getImage(); // transform it 
		Image newimg4 = image4.getScaledInstance(100, 100,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		ImageIcon appImg = new ImageIcon(newimg4);  // transform it back
		return appImg;
	}
	public ImageIcon getImgMapTown() {
		ImageIcon mapImgbad = new ImageIcon(GameStart.class.getResource(
                "/inventory/resources/Town.jpg"));
		Image image4 = mapImgbad.getImage(); // transform it 
		Image newimg4 = image4.getScaledInstance(40, 40,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		ImageIcon mapImg = new ImageIcon(newimg4);  // transform it back
		return mapImg;
	}
	public ImageIcon getImgMapDarkforrest() {
		ImageIcon mapImgbad = new ImageIcon(GameStart.class.getResource(
                "/inventory/resources/Darkforrest.jpg"));
		Image image4 = mapImgbad.getImage(); // transform it 
		Image newimg4 = image4.getScaledInstance(40, 40,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		ImageIcon mapImg = new ImageIcon(newimg4);  // transform it back
		return mapImg;
	}
	public ImageIcon getImgMapShadowpass() {
		ImageIcon mapImgbad = new ImageIcon(GameStart.class.getResource(
                "/inventory/resources/Shadowpass.jpg"));
		Image image4 = mapImgbad.getImage(); // transform it 
		Image newimg4 = image4.getScaledInstance(40, 40,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		ImageIcon mapImg = new ImageIcon(newimg4);  // transform it back
		return mapImg;
	}
	public ImageIcon getImgMapGoblinkingdom() {
		ImageIcon mapImgbad = new ImageIcon(GameStart.class.getResource(
                "/inventory/resources/Goblinkingdom.jpg"));
		Image image4 = mapImgbad.getImage(); // transform it 
		Image newimg4 = image4.getScaledInstance(40, 40,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		ImageIcon mapImg = new ImageIcon(newimg4);  // transform it back
		return mapImg;
	}
	public ImageIcon getImgMapCoinshop() {
		ImageIcon mapImgbad = new ImageIcon(GameStart.class.getResource(
                "/inventory/resources/Coinshop.jpg"));
		Image image4 = mapImgbad.getImage(); // transform it 
		Image newimg4 = image4.getScaledInstance(40, 40,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		ImageIcon mapImg = new ImageIcon(newimg4);  // transform it back
		return mapImg;
	}
	public ImageIcon getImgKeyTown() {
		ImageIcon mapImgbad = new ImageIcon(GameStart.class.getResource(
                "/inventory/resources/townKey.jpg"));
		Image image4 = mapImgbad.getImage(); // transform it 
		Image newimg4 = image4.getScaledInstance(40, 40,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		ImageIcon mapImg = new ImageIcon(newimg4);  // transform it back
		return mapImg;
	}
	public ImageIcon getImgKeyDarkforrest() {
		ImageIcon mapImgbad = new ImageIcon(GameStart.class.getResource(
                "/inventory/resources/forrestkey.jpg"));
		Image image4 = mapImgbad.getImage(); // transform it 
		Image newimg4 = image4.getScaledInstance(40, 40,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		ImageIcon mapImg = new ImageIcon(newimg4);  // transform it back
		return mapImg;
	}
	public ImageIcon getImgKeyShadowpass() {
		ImageIcon mapImgbad = new ImageIcon(GameStart.class.getResource(
                "/inventory/resources/shadowpassKey.jpg"));
		Image image4 = mapImgbad.getImage(); // transform it 
		Image newimg4 = image4.getScaledInstance(40, 40,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		ImageIcon mapImg = new ImageIcon(newimg4);  // transform it back
		return mapImg;
	}
	public ImageIcon getImgKeyGoblinkingdom() {
		ImageIcon mapImgbad = new ImageIcon(GameStart.class.getResource(
                "/inventory/resources/goblinkingdomKey.jpg"));
		Image image4 = mapImgbad.getImage(); // transform it 
		Image newimg4 = image4.getScaledInstance(40, 40,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		ImageIcon mapImg = new ImageIcon(newimg4);  // transform it back
		return mapImg;
	}
	public ImageIcon getImgKeyCoinshop() {
		ImageIcon mapImgbad = new ImageIcon(GameStart.class.getResource(
                "/inventory/resources/coinshopKey.jpg"));
		Image image4 = mapImgbad.getImage(); // transform it 
		Image newimg4 = image4.getScaledInstance(40, 40,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		ImageIcon mapImg = new ImageIcon(newimg4);  // transform it back
		return mapImg;
	}
//GAME WIN DEATH AND SHOP IMAGE ICONS --------
public JLabel getImgWin() {
	ImageIcon deathImgbad = new ImageIcon(GameStart.class.getResource(
            "/console/resources/winner.jpg"));
	Image image4 = deathImgbad.getImage(); // transform it 
	Image newimg4 = image4.getScaledInstance(500, 500,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
	ImageIcon deathImg = new ImageIcon(newimg4);  // transform it back
	imgWin = new JLabel(deathImg);
	return imgWin;
}
	public JLabel getImgShop() {
		ImageIcon thiefImgbad = new ImageIcon(GameStart.class.getResource(
                "/console/resources/shop.jpg"));
		Image image4 = thiefImgbad.getImage(); // transform it 
		Image newimg4 = image4.getScaledInstance(200, 225,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		ImageIcon thiefImg = new ImageIcon(newimg4);  // transform it back
		shopKeep = new JLabel(thiefImg);
		return shopKeep;
	}
	public JLabel getImgDeath() {
		ImageIcon deathImgbad = new ImageIcon(GameStart.class.getResource(
                "/console/resources/deathimg.jpg"));
		Image image4 = deathImgbad.getImage(); // transform it 
		Image newimg4 = image4.getScaledInstance(500, 500,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		ImageIcon deathImg = new ImageIcon(newimg4);  // transform it back
		imgDeath = new JLabel(deathImg);
		return imgDeath;
	}
	public JLabel getImgLvl() {
		ImageIcon deathImgbad = new ImageIcon(GameStart.class.getResource(
                "/console/resources/lvlUp.jpg"));
		Image image4 = deathImgbad.getImage(); // transform it 
		Image newimg4 = image4.getScaledInstance(500, 500,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		ImageIcon deathImg = new ImageIcon(newimg4);  // transform it back
		imgDeath = new JLabel(deathImg);
		return imgDeath;
	}
	
	
	// player imglbls ---------------------------------------------------
	public JLabel getImgThief() {
		ImageIcon thiefImgbad = new ImageIcon(GameStart.class.getResource(
                "/console/resources/thief.jpg"));
		Image image4 = thiefImgbad.getImage(); // transform it 
		Image newimg4 = image4.getScaledInstance(200, 225,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		ImageIcon thiefImg = new ImageIcon(newimg4);  // transform it back
		imgThief = new JLabel(thiefImg);
		return imgThief;
	}
	public JLabel getImgMage() {
		ImageIcon mageImgbad = new ImageIcon(GameStart.class.getResource(
                "/console/resources/mage.png"));
		Image image2 = mageImgbad.getImage(); // transform it 
		Image newimg2 = image2.getScaledInstance(200, 225,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		ImageIcon mageImg = new ImageIcon(newimg2);  // transform it back
		this.imgMage = new JLabel(mageImg);
		return this.imgMage;
	}
	public JLabel getImgRanger() {
		ImageIcon rangerImgbad = new ImageIcon(GameStart.class.getResource(
                "/console/resources/ranger.jpg"));
		Image image3 = rangerImgbad.getImage(); // transform it 
		Image newimg3 = image3.getScaledInstance(200, 225,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		ImageIcon rangerImg = new ImageIcon(newimg3);  // transform it back
		this.imgRanger = new JLabel(rangerImg);
		return imgRanger;
	}
	public JLabel getImgKnight() {
		ImageIcon knightbad = new ImageIcon(GameStart.class.getResource(
                "/console/resources/knight.png"));
		Image image1 = knightbad.getImage(); // transform it 
		Image newimg1 = image1.getScaledInstance(200, 225,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		ImageIcon knightImg = new ImageIcon(newimg1);  // transform it back
		this.imgKnight = new JLabel(knightImg);
		return imgKnight;
	}
	// img icons =========================================
	public ImageIcon getImgIconThief() {
		ImageIcon thiefImgbad = new ImageIcon(GameStart.class.getResource(
                "/console/resources/thief.jpg"));
		Image image4 = thiefImgbad.getImage(); // transform it 
		Image newimg4 = image4.getScaledInstance(200, 225,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		ImageIcon thiefImg = new ImageIcon(newimg4);  // transform it back
		return thiefImg;
	}
	public ImageIcon getImgIconMage() {
		ImageIcon mageImgbad = new ImageIcon(GameStart.class.getResource(
                "/console/resources/mage.png"));
		Image image2 = mageImgbad.getImage(); // transform it 
		Image newimg2 = image2.getScaledInstance(200, 225,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		ImageIcon mageImg = new ImageIcon(newimg2);  // transform it back
		return mageImg;
	}
	public ImageIcon getImgIconRanger() {
		ImageIcon rangerImgbad = new ImageIcon(GameStart.class.getResource(
                "/console/resources/ranger.jpg"));
		Image image3 = rangerImgbad.getImage(); // transform it 
		Image newimg3 = image3.getScaledInstance(200, 225,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		ImageIcon rangerImg = new ImageIcon(newimg3);  // transform it back
		return rangerImg;
	}
	public ImageIcon getImgIconKnight() {
		ImageIcon knightbad = new ImageIcon(GameStart.class.getResource(
                "/console/resources/knight.png"));
		Image image1 = knightbad.getImage(); // transform it 
		Image newimg1 = image1.getScaledInstance(200, 225,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		ImageIcon knightImg = new ImageIcon(newimg1);  // transform it back
		return knightImg;
	}
	
	//monster imgs ----------------------------------------------------------------
	public JLabel getImgBadger() {
		ImageIcon BadgerImgbad = new ImageIcon(GameStart.class.getResource(
                "/monsters/resources/Badger.jpg"));
		Image image3 = BadgerImgbad.getImage(); // transform it 
		Image newimg3 = image3.getScaledInstance(200, 225,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		ImageIcon BadgerImg = new ImageIcon(newimg3);  // transform it back
		this.imgBadger = new JLabel(BadgerImg);
		return imgBadger;
	}
	public JLabel getImgBat() {
		ImageIcon BatImgbad = new ImageIcon(GameStart.class.getResource(
                "/monsters/resources/Bat.jpg"));
		Image image3 = BatImgbad.getImage(); // transform it 
		Image newimg3 = image3.getScaledInstance(200, 225,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		ImageIcon BatImg = new ImageIcon(newimg3);  // transform it back
		this.imgBat = new JLabel(BatImg);
		return imgBat;
	}
	public JLabel getImgBrownbear() {
		ImageIcon BrownbearImgbad = new ImageIcon(GameStart.class.getResource(
                "/monsters/resources/Brownbear.jpg"));
		Image image3 = BrownbearImgbad.getImage(); // transform it 
		Image newimg3 = image3.getScaledInstance(200, 225,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		ImageIcon BrownbearImg = new ImageIcon(newimg3);  // transform it back
		this.imgBrownbear = new JLabel(BrownbearImg);
		return imgBrownbear;
	}
	public JLabel getImgBunny() {
		ImageIcon BunnyImgbad = new ImageIcon(GameStart.class.getResource(
                "/monsters/resources/Bunny.jpg"));
		Image image3 = BunnyImgbad.getImage(); // transform it 
		Image newimg3 = image3.getScaledInstance(200, 225,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		ImageIcon BunnyImg = new ImageIcon(newimg3);  // transform it back
		this.imgBunny = new JLabel(BunnyImg);
		return imgBunny;
	}
	public JLabel getImgChicken() {
		ImageIcon ChickenImgbad = new ImageIcon(GameStart.class.getResource(
                "/monsters/resources/Chicken.jpg"));
		Image image3 = ChickenImgbad.getImage(); // transform it 
		Image newimg3 = image3.getScaledInstance(200, 225,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		ImageIcon ChickenImg = new ImageIcon(newimg3);  // transform it back
		this.imgChicken = new JLabel(ChickenImg);
		return imgChicken;
	}
	public JLabel getImgCyclops() {
		ImageIcon CyclopsImgbad = new ImageIcon(GameStart.class.getResource(
                "/monsters/resources/cyclops.jpg"));
		Image image3 = CyclopsImgbad.getImage(); // transform it 
		Image newimg3 = image3.getScaledInstance(200, 225,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		ImageIcon CyclopsImg = new ImageIcon(newimg3);  // transform it back
		this.imgCyclops = new JLabel(CyclopsImg);
		return imgCyclops;
	}
	public JLabel getImgDrunkdwarf() {
		ImageIcon DrunkdwarfImgbad = new ImageIcon(GameStart.class.getResource(
                "/monsters/resources/Drunkdwarf.jpg"));
		Image image3 = DrunkdwarfImgbad.getImage(); // transform it 
		Image newimg3 = image3.getScaledInstance(200, 225,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		ImageIcon DrunkdwarfImg = new ImageIcon(newimg3);  // transform it back
		this.imgDrunkdwarf = new JLabel(DrunkdwarfImg);
		return imgDrunkdwarf;
	}
	public JLabel getImgFlyingsword() {
		ImageIcon FlyingswordImgbad = new ImageIcon(GameStart.class.getResource(
                "/monsters/resources/Flyingsword.jpg"));
		Image image3 = FlyingswordImgbad.getImage(); // transform it 
		Image newimg3 = image3.getScaledInstance(200, 225,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		ImageIcon FlyingswordImg = new ImageIcon(newimg3);  // transform it back
		this.imgFlyingsword = new JLabel(FlyingswordImg);
		return imgFlyingsword;
	}
	public JLabel getImgFrog() {
		ImageIcon FrogImgbad = new ImageIcon(GameStart.class.getResource(
                "/monsters/resources/Frog.jpg"));
		Image image3 = FrogImgbad.getImage(); // transform it 
		Image newimg3 = image3.getScaledInstance(200, 225,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		ImageIcon FrogImg = new ImageIcon(newimg3);  // transform it back
		this.imgFrog = new JLabel(FrogImg);
		return imgFrog;
	}
	public JLabel getImgGhost() {
		ImageIcon GhostImgbad = new ImageIcon(GameStart.class.getResource(
                "/monsters/resources/Ghost.jpg"));
		Image image3 = GhostImgbad.getImage(); // transform it 
		Image newimg3 = image3.getScaledInstance(200, 225,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		ImageIcon GhostImg = new ImageIcon(newimg3);  // transform it back
		this.imgGhost = new JLabel(GhostImg);
		return imgGhost;
	}
	public JLabel getImgGiant() {
		ImageIcon GiantImgbad = new ImageIcon(GameStart.class.getResource(
                "/monsters/resources/Giant.jpg"));
		Image image3 = GiantImgbad.getImage(); // transform it 
		Image newimg3 = image3.getScaledInstance(200, 225,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		ImageIcon GiantImg = new ImageIcon(newimg3);  // transform it back
		this.imgGiant = new JLabel(GiantImg);
		return imgGiant;
	}
	public JLabel getImgGiantscorpion() {
		ImageIcon GiantscorpionImgbad = new ImageIcon(GameStart.class.getResource(
                "/monsters/resources/Giantscorpion.jpg"));
		Image image3 = GiantscorpionImgbad.getImage(); // transform it 
		Image newimg3 = image3.getScaledInstance(200, 225,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		ImageIcon GiantscorpionImg = new ImageIcon(newimg3);  // transform it back
		this.imgGiantscorpion = new JLabel(GiantscorpionImg);
		return imgGiantscorpion;
	}
	public JLabel getImgGiantspider() {
		ImageIcon GiantspiderImgbad = new ImageIcon(GameStart.class.getResource(
                "/monsters/resources/Giantspider.jpg"));
		Image image3 = GiantspiderImgbad.getImage(); // transform it 
		Image newimg3 = image3.getScaledInstance(200, 225,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		ImageIcon GiantspiderImg = new ImageIcon(newimg3);  // transform it back
		this.imgGiantspider = new JLabel(GiantspiderImg);
		return imgGiantspider;
	}
	public JLabel getImgGiantwolfspider() {
		ImageIcon GiantwolfspiderImgbad = new ImageIcon(GameStart.class.getResource(
                "/monsters/resources/Giantwolfspider.jpg"));
		Image image3 = GiantwolfspiderImgbad.getImage(); // transform it 
		Image newimg3 = image3.getScaledInstance(200, 225,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		ImageIcon GiantwolfspiderImg = new ImageIcon(newimg3);  // transform it back
		this.imgGiantwolfspider = new JLabel(GiantwolfspiderImg);
		return imgGiantwolfspider;
	}
	public JLabel getImgGoblin() {
		ImageIcon GoblinImgbad = new ImageIcon(GameStart.class.getResource(
                "/monsters/resources/Goblin.jpg"));
		Image image3 = GoblinImgbad.getImage(); // transform it 
		Image newimg3 = image3.getScaledInstance(200, 225,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		ImageIcon GoblinImg = new ImageIcon(newimg3);  // transform it back
		this.imgGoblin = new JLabel(GoblinImg);
		return imgGoblin;
	}
	public JLabel getImgGoblinking() {
		ImageIcon GoblinkingImgbad = new ImageIcon(GameStart.class.getResource(
                "/monsters/resources/Goblinking.jpg"));
		Image image3 = GoblinkingImgbad.getImage(); // transform it 
		Image newimg3 = image3.getScaledInstance(200, 225,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		ImageIcon GoblinkingImg = new ImageIcon(newimg3);  // transform it back
		this.imgGoblinking = new JLabel(GoblinkingImg);
		return imgGoblinking;
	}
	public JLabel getImgHawk() {
		ImageIcon HawkImgbad = new ImageIcon(GameStart.class.getResource(
                "/monsters/resources/Hawk.jpg"));
		Image image3 = HawkImgbad.getImage(); // transform it 
		Image newimg3 = image3.getScaledInstance(200, 225,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		ImageIcon HawkImg = new ImageIcon(newimg3);  // transform it back
		this.imgHawk = new JLabel(HawkImg);
		return imgHawk;
	}
	public JLabel getImgHoneybadger() {
		ImageIcon HoneybadgerImgbad = new ImageIcon(GameStart.class.getResource(
                "/monsters/resources/Honeybadger.png"));
		Image image3 = HoneybadgerImgbad.getImage(); // transform it 
		Image newimg3 = image3.getScaledInstance(200, 225,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		ImageIcon HoneybadgerImg = new ImageIcon(newimg3);  // transform it back
		this.imgHoneybadger = new JLabel(HoneybadgerImg);
		return imgHoneybadger;
	}
	public JLabel getImgLizard() {
		ImageIcon LizardImgbad = new ImageIcon(GameStart.class.getResource(
                "/monsters/resources/Lizard.png"));
		Image image3 = LizardImgbad.getImage(); // transform it 
		Image newimg3 = image3.getScaledInstance(200, 225,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		ImageIcon LizardImg = new ImageIcon(newimg3);  // transform it back
		this.imgLizard = new JLabel(LizardImg);
		return imgLizard;
	}
	public JLabel getImgOrc() {
		ImageIcon OrcImgbad = new ImageIcon(GameStart.class.getResource(
                "/monsters/resources/Orc.png"));
		Image image3 = OrcImgbad.getImage(); // transform it 
		Image newimg3 = image3.getScaledInstance(200, 225,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		ImageIcon OrcImg = new ImageIcon(newimg3);  // transform it back
		this.imgOrc = new JLabel(OrcImg);
		return imgOrc;
	}
	public JLabel getImgOwl() {
		ImageIcon OwlImgbad = new ImageIcon(GameStart.class.getResource(
                "/monsters/resources/Owl.jpg"));
		Image image3 = OwlImgbad.getImage(); // transform it 
		Image newimg3 = image3.getScaledInstance(200, 225,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		ImageIcon OwlImg = new ImageIcon(newimg3);  // transform it back
		this.imgOwl = new JLabel(OwlImg);
		return imgOwl;
	}
	public JLabel getImgShadowdemon() {
		ImageIcon ShadowdemonImgbad = new ImageIcon(GameStart.class.getResource(
                "/monsters/resources/Shadowdemon.jpg"));
		Image image3 = ShadowdemonImgbad.getImage(); // transform it 
		Image newimg3 = image3.getScaledInstance(200, 225,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		ImageIcon ShadowdemonImg = new ImageIcon(newimg3);  // transform it back
		this.imgShadowdemon = new JLabel(ShadowdemonImg);
		return imgShadowdemon;
	}
	public JLabel getImgShrub() {
		ImageIcon ShrubImgbad = new ImageIcon(GameStart.class.getResource(
                "/monsters/resources/Shrub.jpg"));
		Image image3 = ShrubImgbad.getImage(); // transform it 
		Image newimg3 = image3.getScaledInstance(200, 225,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		ImageIcon ShrubImg = new ImageIcon(newimg3);  // transform it back
		this.imgShrub = new JLabel(ShrubImg);
		return imgShrub;
	}
	public JLabel getImgSkeletonwarrior() {
		ImageIcon SkeletonwarriorImgbad = new ImageIcon(GameStart.class.getResource(
                "/monsters/resources/Skeletonwarrior.jpg"));
		Image image3 = SkeletonwarriorImgbad.getImage(); // transform it 
		Image newimg3 = image3.getScaledInstance(200, 225,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		ImageIcon SkeletonwarriorImg = new ImageIcon(newimg3);  // transform it back
		this.imgSkeletonwarrior = new JLabel(SkeletonwarriorImg);
		return imgSkeletonwarrior;
	}
	public JLabel getImgSpider() {
		ImageIcon SpiderImgbad = new ImageIcon(GameStart.class.getResource(
                "/monsters/resources/Spider.jpg"));
		Image image3 = SpiderImgbad.getImage(); // transform it 
		Image newimg3 = image3.getScaledInstance(200, 225,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		ImageIcon SpiderImg = new ImageIcon(newimg3);  // transform it back
		this.imgSpider = new JLabel(SpiderImg);
		return imgSpider;
	}
	public JLabel getImgStonegiant() {
		ImageIcon StonegiantImgbad = new ImageIcon(GameStart.class.getResource(
                "/monsters/resources/Stonegiant.jpg"));
		Image image3 = StonegiantImgbad.getImage(); // transform it 
		Image newimg3 = image3.getScaledInstance(200, 225,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		ImageIcon StonegiantImg = new ImageIcon(newimg3);  // transform it back
		this.imgStonegiant = new JLabel(StonegiantImg);
		return imgStonegiant;
	}
	public JLabel getImgThug() {
		ImageIcon ThugImgbad = new ImageIcon(GameStart.class.getResource(
                "/monsters/resources/Thug.jpg"));
		Image image3 = ThugImgbad.getImage(); // transform it 
		Image newimg3 = image3.getScaledInstance(200, 225,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		ImageIcon ThugImg = new ImageIcon(newimg3);  // transform it back
		this.imgThug = new JLabel(ThugImg);
		return imgThug;
	}
	public JLabel getImgTroll() {
		ImageIcon TrollImgbad = new ImageIcon(GameStart.class.getResource(
                "/monsters/resources/Troll.jpg"));
		Image image3 = TrollImgbad.getImage(); // transform it 
		Image newimg3 = image3.getScaledInstance(200, 225,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		ImageIcon TrollImg = new ImageIcon(newimg3);  // transform it back
		this.imgTroll = new JLabel(TrollImg);
		return imgTroll;
	}
	public JLabel getImgVampire() {
		ImageIcon VampireImgbad = new ImageIcon(GameStart.class.getResource(
                "/monsters/resources/Vampire.jpg"));
		Image image3 = VampireImgbad.getImage(); // transform it 
		Image newimg3 = image3.getScaledInstance(200, 225,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		ImageIcon VampireImg = new ImageIcon(newimg3);  // transform it back
		this.imgVampire = new JLabel(VampireImg);
		return imgVampire;
	}
	public JLabel getImgVulture() {
		ImageIcon VultureImgbad = new ImageIcon(GameStart.class.getResource(
                "/monsters/resources/Vulture.jpg"));
		Image image3 = VultureImgbad.getImage(); // transform it 
		Image newimg3 = image3.getScaledInstance(200, 225,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		ImageIcon VultureImg = new ImageIcon(newimg3);  // transform it back
		this.imgVulture = new JLabel(VultureImg);
		return imgVulture;
	}
	public JLabel getImgWerewolf() {
		ImageIcon WerewolfImgbad = new ImageIcon(GameStart.class.getResource(
                "/monsters/resources/Werewolf.png"));
		Image image3 = WerewolfImgbad.getImage(); // transform it 
		Image newimg3 = image3.getScaledInstance(200, 225,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		ImageIcon WerewolfImg = new ImageIcon(newimg3);  // transform it back
		this.imgWerewolf = new JLabel(WerewolfImg);
		return imgWerewolf;
	}
	public JLabel getImgWolf() {
		ImageIcon WolfImgbad = new ImageIcon(GameStart.class.getResource(
                "/monsters/resources/Wolf.jpg"));
		Image image3 = WolfImgbad.getImage(); // transform it 
		Image newimg3 = image3.getScaledInstance(200, 225,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		ImageIcon WolfImg = new ImageIcon(newimg3);  // transform it back
		this.imgWolf = new JLabel(WolfImg);
		return imgWolf;
	}	
}
