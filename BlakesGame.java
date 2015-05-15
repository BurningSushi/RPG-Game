import java.awt.event.*; 
import java.applet.*;
import java.awt.*;
import java.awt.Color;
import java.util.Random;

public class BlakesGame extends Applet implements MouseListener, KeyListener
{
	private Graphics backg;
	private Image backbuffer;
	private boolean mouseDown;
	private int ballX;
	private int Screen = 0;
	private int ballY;
	private int Food1X;
	private int Food1Y;
	private boolean Right;
	private boolean Left;
	private boolean Up;
	private boolean Down;
	private boolean level1= false;
	private boolean level2 = false;
	private boolean level3 = false;
	private boolean level4 = false;
	private boolean level5 = false;
	private boolean level6 = false;
	private boolean level7 = false;
	private boolean level8 = false;
	private boolean level9 = false;
	private boolean level10 = false;
	private boolean level11 = false;
	private boolean level12 = false;
	private boolean level13 = false;
	private boolean level14 = false;
	private boolean level15 = false;
	private boolean level16 = false;
	private boolean level17 = false;
	private boolean level18 = false;
	private boolean level19 = false;
	private boolean level20 = false;
	private int moves = 0;
	private boolean moving = false;
	private int attack = 0;
	private int health = 30;
	private int maxHealth = 30;
	private int exp = 0;
	private int needExp = 20;
	private int level = 1;
	private int damage = 500;
	private double added = 0;
	private double numOfAttacks = 0;
	private double sumOfAttacks = 0;
	private int offset=5;
	private int potions = 20;
	private int gold = 1000;
	private int goldDrop = 8;
	private int char2attack = 4;
	private int charattack = 5;
	private int BadGuyattack = 10;
	private int BadGuyHealth = 100;
	private int char2Health = 10;
	private int char3Health = 10;
	private int char4Health = 10;
	private int char5Health = 10;
	private int cowHealth = 50;
	private boolean char2Alive = true;
	private boolean char3Alive = true;
	private boolean char4Alive = true;
	private boolean char5Alive = true;
	private boolean cowAlive = true;
	private boolean BadGuyAlive = true;
	private boolean trade = false;
	private boolean buy = false;
	private boolean dead = false;
	private boolean far2 = false;
	private boolean far3 = false;
	private boolean far4 = false;
	private boolean far5 = false;
	private boolean far6 = false;
	private boolean far7 = false;
	private boolean far8 = false;
	private boolean sword = false;
	private boolean sheild = false;
	private boolean attackChar2 = false;
	private boolean attackChar3 = false;
	private boolean attackChar4 = false;
	private boolean attackChar5 = false;
	private boolean attackBadGuy = false;
	private boolean attackcow = false;
	AudioClip LightWorld;
	AudioClip SwordSound;
	AudioClip dieing;
	AudioClip linkDieing;
	AudioClip cowDieing;
	AudioClip levelUp;
	AudioClip buyPotion;
	AudioClip drinking;

public void init()
{ 

	LightWorld = getAudioClip (getCodeBase() , "LightWorld.au");
	LightWorld.play();
	SwordSound = getAudioClip (getCodeBase() , "SwordSound.au");
	dieing = getAudioClip (getCodeBase() , "dieing.au");
	linkDieing = getAudioClip (getCodeBase() , "linkDieing.au");
	cowDieing = getAudioClip (getCodeBase() , "cowDieing.au");
	levelUp = getAudioClip (getCodeBase() , "levelUp.au");
	buyPotion= getAudioClip (getCodeBase() , "buyPotion.au");
	drinking= getAudioClip (getCodeBase() , "drinking.au");
	setFocusable(true);
	requestFocus();
	ballX = 120;
	ballY = 150;
	Food1X = 90;
	Food1Y = 120;
	Right = false;
	Left = false;
	Up = false;
	Down = true;
	mouseDown = false;

	// we need to add this MouseListener to the Applet
//	addMouseListener(this);

	addKeyListener(this);
	addMouseListener(this);
	// create the backbuffer image that will later be swapped to the screen
	backbuffer = createImage(getSize().width, getSize().height);

	// get the backbuffer's graphics (canvas) so that we can draw on it.
	backg = backbuffer.getGraphics();
	
}
// because we are implementing an interface, we must include these:
public void mouseClicked(MouseEvent e)
{
	//attack char2
	//60, 200
	if(e.getX() > 60 && e.getX() < 75 && e.getY() > 200 && e.getY() < 220 && char2Health > 0)
	{
		far2 = true;
		if(e.getX() > 60 && e.getX() < 75 && e.getY() > 200 && e.getY() < 220 && ballX > 20 && ballX < 135 && ballY > 160 && ballY < 240 && char2Health > 0 && char2Alive == true)
		{
			SwordSound.play();
			far2 = false;
			attackChar2 = true;
			Random randGen = new Random();
      		attack = randGen.nextInt(char2attack);
      		damage = randGen.nextInt(charattack);
     	 	health -= attack;
      		char2Health -= damage;
      		added += damage;
      		numOfAttacks ++;
		}
	}
	//attack char3
	//180,310
	if(e.getX() > 180 && e.getX() < 195 && e.getY() > 310 && e.getY() < 330 && char3Health > 0)
	{
		far3 = true;
		if(e.getX() > 180 && e.getX() < 195 && e.getY() > 310 && e.getY() < 330 && ballX > 140 && ballX < 215 && ballY > 270 && ballY < 350 && char3Health > 0  && char3Alive == true)
		{
			SwordSound.play();
			far3 = false;
			attackChar3 = true;
			Random randGen = new Random();
      		attack = randGen.nextInt(char2attack);
      		damage = randGen.nextInt(charattack);
     	 	health -= attack;
      		char3Health -= damage;
      		added += damage;
      		numOfAttacks ++;
		}
	}
	//attack char4
	//220,120
	if(e.getX() > 220 && e.getX() < 235 && e.getY() > 120 && e.getY() < 140 && char4Health > 0)
	{
		far4 = true;
		if(e.getX() > 220 && e.getX() < 235 && e.getY() > 120 && e.getY() < 140 && ballX > 180 && ballX < 255 && ballY > 80 && ballY < 160 && char4Health > 0 && char4Alive == true)
		{
			SwordSound.play();
			far4 = false;
			attackChar4 = true;
			Random randGen = new Random();
      		attack = randGen.nextInt(char2attack);
      		damage = randGen.nextInt(charattack);
     	 	health -= attack;
      		char4Health -= damage;
      		added += damage;
      		numOfAttacks ++;
		}
	}
	//attack char5
	//40,290
	if(e.getX() > 40 && e.getX() < 55 && e.getY() > 290 && e.getY() < 310 && char5Health > 0)
	{
		far5 = true;
		if(e.getX() > 40 && e.getX() < 55 && e.getY() > 290 && e.getY() < 310 && ballX > 0 && ballX < 75 && ballY > 250 && ballY < 330 && char5Health > 0 && char5Alive == true)
		{
			SwordSound.play();
			far5 = false;
			attackChar5 = true;
			Random randGen = new Random();
      		attack = randGen.nextInt(char2attack);
      		damage = randGen.nextInt(charattack);
     	 	health -= attack;
      		char5Health -= damage;
      		added += damage;
      		numOfAttacks ++;
		}
	}
	//shop
		if(e.getX() > 30 && e.getX() < 45 && e.getY() > 110 && e.getY() < 130)
	{
		far6 = true;
		if(e.getX() > 30 && e.getX() < 45 && e.getY() > 110 && e.getY() < 130 && ballX > -10 && ballX < 65 && ballY > 70 && ballY < 150)
		{
			trade = true;
			far6 = false;
		}
	}
	//cow
	//120,120
		if(e.getX() > 120 && e.getX() < 137 && e.getY() > 120 && e.getY() < 140 && cowHealth > 0)
	{
		far7 = true;
		if(e.getX() > 120 && e.getX() < 137 && e.getY() > 120 && e.getY() < 140 && ballX > 70 && ballX < 155 && ballY > 30 && ballY < 210 && cowHealth > 0 && cowAlive == true)
		{
			SwordSound.play();
			far7 = false;
			attackcow = true;
			Random randGen = new Random();
      		attack = randGen.nextInt(10);
      		damage = randGen.nextInt(charattack);
     	 	health -= attack;
      		cowHealth -= damage;
      		added += damage;
      		numOfAttacks ++;
		}
	}
	//BadGuy
		if(e.getX() > 120 && e.getX() < 137 && e.getY() > 120 && e.getY() < 140 && BadGuyHealth > 0)
	{
		far8 = true;
		if(e.getX() > 120 && e.getX() < 137 && e.getY() > 120 && e.getY() < 140 && ballX > 70 && ballX < 155 && ballY > 30 && ballY < 210 && BadGuyHealth > 0 && BadGuyAlive == true)
		{
			SwordSound.play();
			far8 = false;
			attackBadGuy = true;
			Random randGen = new Random();
      		attack = randGen.nextInt(15);
      		damage = randGen.nextInt(charattack);
     	 	health -= attack;
      		BadGuyHealth -= damage;
      		added += damage;
      		numOfAttacks ++;
		}
	}
	e.consume();
}
public void mouseEntered(MouseEvent e)
{}
public void mouseExited(MouseEvent e)
{}
public void mousePressed(MouseEvent e)
{
		mouseDown = true;
		repaint();
		e.consume();
}
public void mouseReleased(MouseEvent e)
{
        mouseDown = false;
        repaint();
        e.consume();
}

public void update(Graphics g)
{   
		//Room1
		Image Wood = getImage(getCodeBase(),"Wood.gif");
		Image ship = getImage(getCodeBase(),"ship.gif");
		Image Char1 = getImage(getCodeBase(),"Char1.gif");
		Image Char1Left = getImage(getCodeBase(),"Char1Left.gif");
		Image Char1Right = getImage(getCodeBase(),"Char1Right.gif");
		Image Char1Up = getImage(getCodeBase(),"Char1Up.gif");
		Image Char2 = getImage(getCodeBase(),"Char2.gif");
		Image PlainGrass = getImage(getCodeBase(),"PlainGrass.gif");
		Image floor = getImage(getCodeBase(),"floor.gif");
		Image door = getImage(getCodeBase(),"door.gif");
		Image wall = getImage(getCodeBase(),"wall.gif");
		Image shop = getImage(getCodeBase(),"shop.gif");
		Image cow1 = getImage(getCodeBase(),"cow1.gif");
		Image BadGuy = getImage(getCodeBase(),"BadGuy.gif");
		if(exp < 20)
		{
			level = 1;
			needExp = 20;
		}
		if(exp >= 20 && level2 == false )
		{
			levelUp.play();
			charattack = 6;
			level2 = true;
			level = 2;
			maxHealth = 35;
			health = 35;
			needExp = 50;
			added = 0;
      		numOfAttacks = 0;
		}
		if(exp >= 50 && level3 == false)
		{
			levelUp.play();
			charattack = 7;
			level3= true;
			maxHealth = 40;
			health = 40;
			level = 3;
			needExp = 80;
			added = 0;
      		numOfAttacks = 0;
		}
		if(exp >= 80 && level4 == false)
		{
			levelUp.play();
			charattack = 8;
			level4= true;
			maxHealth = 50;
			health = 50;
			level = 4;
			needExp = 140;
			added = 0;
      		numOfAttacks = 0;
		}
		if(exp >= 140 && level5 == false)
		{
			levelUp.play();
			charattack = 9;
			level5= true;
			maxHealth = 55;
			health = 55;
			level = 5;
			needExp = 200;
			added = 0;
      		numOfAttacks = 0;
		}
		if(exp >= 200 && level6 == false)
		{
			levelUp.play();
			charattack = 10;
			level6= true;
			maxHealth = 60;
			health = 60;
			level = 6;
			needExp = 280;
			added = 0;
      		numOfAttacks = 0;
		}
		if(exp >= 280 && level7 == false)
		{
			levelUp.play();
			charattack = 11;
			level7= true;
			maxHealth = 65;
			health = 65;
			level = 7;
			needExp = 380;
			added = 0;
      		numOfAttacks = 0;
		}
		if(exp >= 380 && level8 == false)
		{
			levelUp.play();
			charattack = 12;
			level8= true;
			maxHealth = 70;
			health = 70;
			level = 8;
			needExp = 500;
			added = 0;
      		numOfAttacks = 0;
		}
		if(exp >= 500 && level9 == false)
		{
			levelUp.play();
			charattack = 13;
			level9= true;
			maxHealth = 75;
			health = 75;
			level = 9;
			needExp = 650;
			added = 0;
      		numOfAttacks = 0;
		}
		if(exp >= 650 && level10 == false)
		{
			levelUp.play();
			charattack = 14;
			level10= true;
			maxHealth = 80;
			health = 80;
			level = 10;
			needExp = 900;
			added = 0;
      		numOfAttacks = 0;
		}
		if(exp >= 900 && level11 == false)
		{
			levelUp.play();
			charattack = 16;
			level11= true;
			maxHealth = 85;
			health = 85;
			level = 11;
			needExp = 1400;
			added = 0;
      		numOfAttacks = 0;
		}
		if(exp >= 1400 && level12 == false)
		{
			levelUp.play();
			charattack = 18;
			level12= true;
			maxHealth = 90;
			health = 90;
			level = 12;
			needExp = 1900;
			added = 0;
      		numOfAttacks = 0;
		}
		if(exp >= 1900 && level13 == false)
		{
			levelUp.play();
			charattack = 20;
			level13= true;
			maxHealth = 100;
			health = 100;
			level = 13;
			needExp = 2600;
			added = 0;
      		numOfAttacks = 0;
		}
		if(exp >= 2600 && level14 == false)
		{
			levelUp.play();
			charattack = 22;
			level14= true;
			maxHealth = 110;
			health = 110;
			level = 14;
			needExp = 3900;
			added = 0;
      		numOfAttacks = 0;
		}
		if(exp >= 3900 && level15 == false)
		{
			levelUp.play();
			charattack = 24;
			level15= true;
			maxHealth = 120;
			health = 120;
			level = 15;
			needExp = 5000;
			added = 0;
      		numOfAttacks = 0;
		}
		if(exp >= 5000 && level16 == false)
		{
			levelUp.play();
			charattack = 28;
			level16= true;
			maxHealth = 130;
			health = 130;
			level = 16;
			needExp = 7500;
			added = 0;
      		numOfAttacks = 0;
		}
		if(exp >= 7500 && level17 == false)
		{
			levelUp.play();
			charattack = 32;
			level17= true;
			maxHealth = 140;
			health = 140;
			level = 17;
			needExp = 9200;
			added = 0;
      		numOfAttacks = 0;
		}
		if(exp >= 9200 && level18 == false)
		{
			levelUp.play();
			charattack = 36;
			level18= true;
			maxHealth = 150;
			health = 150;
			level = 18;
			needExp = 15000;
			added = 0;
      		numOfAttacks = 0;
		}
		if(exp >= 15000 && level19 == false)
		{
			levelUp.play();
			charattack = 40;
			level19= true;
			maxHealth = 160;
			health = 160;
			level = 19;
			needExp = 25000;
			added = 0;
      		numOfAttacks = 0;
		}
		if(exp >= 25000 && level20 == false)
		{
			levelUp.play();
			charattack = 50;
			level20= true;
			maxHealth = 200;
			health = 200;
			level = 20;
			needExp = 40000;
			added = 0;
      		numOfAttacks = 0;
		}
		sumOfAttacks = added / numOfAttacks;
		backg.setColor(Color.white);
		backg.fillRect(0,0,250,100);
		backg.setColor(Color.blue);
		backg.fillRect(75,0,100,63);
		backg.setColor(Color.white);
		backg.drawString("Health = " + health + "/" + maxHealth ,75, 10);
		backg.drawString("Level = " + level , 75, 20);
		backg.drawString("Exp = " + exp + "/" + needExp , 75, 30);
		backg.drawString("# of Potions = " + potions,75, 40);
		backg.drawString("Gold = " + gold,75, 50);
		backg.drawString("Avg Attack = " + sumOfAttacks ,75, 60);
		backg.setColor(Color.black);
		backg.drawString("Move Up = w",90, 380);
		backg.drawString("Move Down = s" ,90,390);
		backg.drawString("Move Right = d",90, 400);
		backg.drawString("Move Left = a",90, 410);
		backg.drawString("Action = Click",90, 430);
		backg.drawString("Drink potion = p",90, 420);
		
		if(Screen == 0)
		{
			char2Alive = true;
			char3Alive = true;
			char4Alive = true;
			char5Alive = true;
 			cowAlive = true;
 			BadGuyAlive = true;
			char2Health = 10;
			char3Health = 10;
			char4Health = 10;
			char5Health = 10;
			cowHealth = 50;
			BadGuyHealth = 100;
			backg.drawImage(floor, 0,100,this);
			backg.drawImage(wall, 0,100,this);
			backg.drawImage(door,120,100,this);
			backg.drawImage(shop,30,110,this);
			//room exit
			if(ballX >= 120 && ballX <= 130 && ballY < 110)
			{
				Screen += 1;
				ballY = 330;
			}
			if(ballY <= 110)
			{
				ballY = 110;
			}
			if(ballX <= 0)
			{
				ballX = 0;
			}
			if(ballX >= 230)
			{
				ballX = 230;
			}
			if(ballX >= 0 && ballX <= 250 && ballY >= 320)
			{
				ballY = 320;
			}
			dead = false;
			if(trade == true && gold >= 30 )
			{
				moving = true;
				backg.setColor(Color.black);
				if(moves <= 10)
				{
					backg.drawString("buy a potion for 30 gold? press 1" , 20,70);
					backg.drawString("buy a sword for 30 gold? press 2" , 20,80);
					backg.drawString("buy a sheild for 30 gold? press 3" , 20,90);
					backg.drawString("Want to not buy anything? press n" , 20,100);
					buy = true;
				}
				if(moves >= 10)
				{
					trade = false;
					moving = false;
				}
				backg.setColor(Color.black);
			}
			if(trade == true && gold < 30)
			{
				moving = true;
				backg.setColor(Color.black);
				if(moves <= 10)
				{
					backg.drawString("You dont have enough money" , 10,90);
					buy = false;
				}
				if(moves >= 10)
				{
					trade = false;
					moving = false;
				}
			}
		}
		if(Screen == 1)
		{
			BadGuyHealth = 100;
			backg.drawImage(PlainGrass, 0,100,this);
			backg.drawImage(wall, 0,340,this);
			backg.setColor(Color.black);
			backg.fillRect(120,340,20,10);
			if(ballX >= 110 && ballX <= 130 && ballY > 330)
			{
				Screen = 0;
				ballY = 120;
			}
			if(ballY <= 90)
			{
				ballY = 90;
			}
			if(ballX <= 0)
			{
				ballX = 0;
			}
			if(ballX >= 230)
			{
				ballX = 230;
			}
			if(ballX >= 0 && ballX <= 110 && ballY >= 320)
			{
				ballY = 320;
			}
			if(ballX >= 130 && ballX <= 250 && ballY >= 320)
			{
				ballY = 320;
			}
			//char2
			if(char2Health > 0)
			{
				backg.drawImage(Char2,60,200,this);
			}
			if(char3Health > 0)
			{
				backg.drawImage(Char2,180,310,this);
			}
			if(char4Health > 0)
			{
				backg.drawImage(Char2,220,120,this);
			}
			if(char5Health > 0)
			{
				backg.drawImage(Char2,40,290,this);
			}
			if(cowHealth > 0)
			{
				backg.drawImage(cow1,120,120,this);
			}
			if(attackChar2 == true && attackChar2 == true && dead == false)
			{
				backg.drawString("" + char2Health ,60, 195);
      			backg.drawString(""+ health  , ballX, ballY - 5);

      			if(char2Health <= 0)
      			{
      				Random randGen = new Random();
      				gold += randGen.nextInt(goldDrop);
      				attackChar2 = false;
      				far2 = false;
      				exp += 5;
      				dieing.play();
      				char2Alive = false;
      			}
      			if(health <= 0)
      			{
      				dead = true;
      				Screen = 0;
      				far2 = false;
      				linkDieing.play();
      			}
			}
			if(attackChar3 == true && attackChar3 == true && dead == false)
			{
				backg.drawString("" + char3Health ,180, 305);
      			backg.drawString(""+ health  , ballX, ballY - 5);

      			if(char3Health <= 0)
      			{
      				Random randGen = new Random();
      				gold += randGen.nextInt(goldDrop);
      				attackChar3 = false;
      				far3 = false;
      				exp += 5;
      				dieing.play();
      				char3Alive = false;
      			}
      			if(health <= 0)
      			{
      				dead = true;
      				far3 = false;
      				linkDieing.play();
      			}
			}
			if(attackChar4 == true && attackChar4 == true && dead == false)
			{
				backg.drawString("" + char4Health ,220,115);
      			backg.drawString(""+ health  , ballX, ballY - 5);

      			if(char4Health <= 0)
      			{
      				Random randGen = new Random();
      				gold += randGen.nextInt(goldDrop);
      				attackChar4 = false;
      				far4 = false;
      				exp += 5;
      				dieing.play();
      				char4Alive = false;
      			}
      			if(health <= 0)
      			{
      				dead = true;
      				Screen = 0;
      				far4 = false;
      				linkDieing.play();
      			}
			}
			if(attackChar5 == true && attackChar5 == true && dead == false)
			{
				backg.drawString("" + char5Health ,40, 285);
      			backg.drawString(""+ health  , ballX, ballY - 5);

      			if(char5Health <= 0)
      			{
      				Random randGen = new Random();
      				gold += randGen.nextInt(goldDrop);
      				attackChar5 = false;
      				far3 = false;
      				exp += 5;
      				dieing.play();
      				char5Alive = false;
      			}
      			if(health <= 0)
      			{
      				dead = true;
      				Screen = 0;
      				far5 = false;
      				linkDieing.play();
      			}
			}
			if(attackcow == true && dead == false)
			{
				backg.drawString("" + cowHealth ,120, 115);
      			backg.drawString(""+ health  , ballX, ballY - 5);

      			if(cowHealth <= 0)
      			{
      				Random randGen = new Random();
      				gold += randGen.nextInt(30);
      				attackcow = false;
      				far7 = false;
      				exp += 40;
      				cowDieing.play();
      				cowAlive = false;
      			}
      			if(health <= 0)
      			{
      				dead = true;
      				Screen = 0;
      				far7 = false;
      				linkDieing.play();
      			}
			}
			if(ballX >= 0 && ballX <= 250 && ballY < 110)
			{
				Screen += 1;
				ballY = 330;
			}
		}
		if(Screen == 2)
		{	
			char2Health = 10;
			char3Health = 10;
			char4Health = 10;
			char5Health = 10;
			cowHealth = 50;
			backg.drawImage(BadGuy, 0,100,this);
			backg.drawImage(PlainGrass, 0,100,this);
			backg.setColor(Color.black);
			if(ballY <= 90)
			{
				ballY = 90;
			}
			if(ballX <= 0)
			{
				ballX = 0;
			}
			if(ballX >= 230)
			{
				ballX = 230;
			}
			if(ballY >= 340)
			{
				ballY = 110;
				Screen -= 1;
				
			}
			if(BadGuyHealth > 0)
			{
				backg.drawImage(BadGuy,120,120,this);
			}
			if(attackBadGuy == true && dead == false)
			{
				backg.drawString("" + BadGuyHealth ,120, 115);
      			backg.drawString(""+ health  , ballX, ballY - 5);
      			
      			if(BadGuyHealth <= 0)
      			{
      				Random randGen = new Random();
      				gold += randGen.nextInt(60);
      				attackcow = false;
      				far8 = false;
      				exp += 80;
  					dieing.play();
  					BadGuyAlive = false;
      			}
      			if(health <= 0)
      			{
      				dead = true;
      				Screen = 0;
      				far8 = false;
      				linkDieing.play();
      			}
			}
		}
		if(far2 == true || far3 == true || far4 == true || far5 == true || far6 == true || far7 == true)
		{
			moving = true;
			backg.setColor(Color.black);
			if(moves <= 10)
			{
				backg.drawString("You are too far away!"  , 68, 90);
			}
			if(moves >= 10)
			{
				moving = false;
				far2 = false;
				far3 = false;
				far4 = false;
				far5 = false;
				far6 = false;
			}
		}
		if(dead == true)
		{
			health = 30;
			Screen = 0;
			char2Health = 10;
			char3Health = 10;
			char4Health = 10;
			char5Health = 10;
			cowHealth = 50;
			backg.drawString("You Died"  , 80, 220);
			if(gold >=30)
			{
				gold -= 30;
			}
			if(gold < 30)
			{
				gold =0;
			}
		}
		backg.setColor(Color.black);
		//Character
		if(Down == true)
		{
			backg.drawImage(Char1, ballX,ballY,this);
		}
		if(Left == true)
		{
			backg.drawImage(Char1Left, ballX,ballY,this);
		}
		if(Right == true)
		{
			backg.drawImage(Char1Right, ballX,ballY,this);
		}
		if(Up == true)
		{
			backg.drawImage(Char1Up, ballX,ballY,this);
		}
	if(mouseDown)
	{}
	else
	{}
 
	//drawImage draws the Backbuffer image to the screen at (0,0)
     g.drawImage(backbuffer, 0, 0, this);
     //if we want to continually update the canvas, we need to:
     repaint();
}
	public void paint(Graphics g)
	{
		update(g);
	}
	public void keyTyped(KeyEvent e )
	{
		requestFocus();
		char c = e.getKeyChar();
		showStatus("letter: " + c); 
      	
  		if(c=='a')
  		{
  			if(moving == true)
  			{
  				moves++;
  			}
  			if(moving == false)
  			{
  				moves = 0;
  			}
			ballX-=offset;
			Up = false;
			Right = false;
			Left = true;
			Down = false;
			far2 = false;
			far3 = false;	
			far4 = false;	
			far5 = false;
  		}
  		else if(c=='w')
  		{
  			if(moving == true)
  			{
  				moves++;
  			}
  			if(moving == false)
  			{
  				moves = 0;
  			}
			ballY-= offset;
			Up = true;
			Right = false;
			Left = false;
			Down = false;
			far2 = false;
			far3 = false;	
			far4 = false;	
			far5 = false;
  		}
  		else if(c=='d')
  		{
  			if(moving == true)
  			{
  				moves++;
  			}
  			if(moving == false)
  			{
  			moves = 0;
  			}
			ballX+=offset;
			Up = false;
			Right = true;
			Left = false;
			Down = false;
			far2 = false;
			far3 = false;
			far4 = false;
			far5 = false;
	  	}
	  	else if(c=='s')
	  	{
	  		if(moving == true)
  			{
  				moves++;
  			}
  			if(moving == false)
  			{
  				moves = 0;
  			}
			ballY+=offset;
			Up = false;
			Right = false;
			Left = false;
			Down = true;
			far2 = false;
			far3 = false;	
			far4 = false;	
			far5 = false;
		}
	  	else if(c=='p')
	  	{
  			if(potions >= 1 && health <= (maxHealth))
  			{
  				drinking.play();
  				health += 30;
  				potions --;
  				if(health >= maxHealth)
  				{
  					health = maxHealth;
  				}
  			}
  		}
  		else if(c=='1' && buy == true)
  		{
  			buyPotion.play();
  			potions++;
  			gold -= 30;
  			buy = false;
  			trade = false;
  		}
  		else if(c=='2' && buy == true && sword == false)
  		{
  			//sword
  			buyPotion.play();
  			charattack += 2;
  			gold -= 30;
  			buy = false;
  			trade = false;
  		}
  		else if(c=='3' && buy == true && sheild == false)
  		{
  			buyPotion.play();
  			health += 5;
  			gold -= 30;
  			buy = false;
  			trade = false;
  		}		
  			else if(c=='n'&& buy == true)
  		{
  			buy = false;
  			trade = false;
  		}
		e.consume();
  		repaint();
	}
    public void keyReleased( KeyEvent e )
    {	
   	}
    public void keyPressed( KeyEvent e )
    {
      	
    }
}
