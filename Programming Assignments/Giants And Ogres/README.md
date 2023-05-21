# Giants and Ogres

In this assignment, we create two objects (giant and ogre) of the Monster class that attack each other, and battle to the death. This assignment consists of two parts:

Create the Monster class. (You have already done this in a lab.) The giant and ogre are objects with double floating point attributes strength and health, both of which should be private. The strength of a fighter represents the amount of damage it can do to another fighter, and its health determines whether it is alive or not (if a fighter is alive, its health is positive). The health of a giant is originally set at 100 and that of an ogre is set at 60, but these numbers decrease during the course of the battle. The strength of each fighter is fixed throughout the battle—the strength of a giant is 15 and that of an ogre is 25. Thus, an ogre is stronger than a giant, but a giant is healthier.

You need the following methods for a Monster class:
- A constructor which initializes its strength and health to 15 and 100, respectively.
- isAlive()- a boolean method that returns true if the Giant is alive (i. e. if health is positive), and false otherwise.
- attack() – a double method that returns the product of a random number between 0 and 1 that represents the intensity of the attack and multiplied it by a Monster object’s strength.
- takeDamage() takes a double value as a parameter and decreases the health of the Giant by that amount.
- getHealth() returns the current health of the Monster object. This method is necessary because the program requires you to display the health of each fighter during the battle, but that attribute should be declared private.

Write a program that pits a giant and an ogre against each other in a battle to the death. That is, create a giant and an ogre objects that attack each other simultaneously until one or both of them is killed.

### Sample Battles
Here is some possible output from the program.

    $ java Battle
    Health of Fighters
    Round Giant Ogre
    1 86.3451475355381 58.46344991010214
    2 85.96351502929825 50.784889947680924
    3 81.85707109727977 41.083745485306316
    4 79.14903065520559 38.45382911103047
    5 56.231409820553715 24.867334736541792
    6 46.16265720436502 10.500340610239004
    7 31.36012483005432 6.496696062852879
    8 29.757818249094743 -2.653509002092668
    The GIANT wins!

    $ java Battle
    Health of Fighters
    Round Giant Ogre
    1 76.92005886326228 59.23339572821756
    2 59.9776452847173 44.69645171220479
    3 39.135871340119365 31.533516281322555
    4 36.6534253952963 18.958035190665548
    5 25.425371466438556 15.216485311113706
    6 4.700139919912186 11.919460822944066
    7 -2.1129894663337705 4.410026049534214
    The OGRE wins!

    $ java Battle
    Health of Fighters
    Round Giant Ogre
    1 92.34556658417043 59.4900461644803
    2 90.01596872271888 46.050989777969136
    3 81.08249168642307 37.234618652327974
    4 68.36113225422372 32.21187328010476
    5 52.030682156761664 28.61480895251139
    6 37.3907003357842 20.156442112576197
    7 23.080341206692363 10.18733767665129
    8 -0.5947787645332738 -1.9928878233981706
    Both fighters are dead.

For this program you will need to create two files: one that contains the data, constructor, and methods for the Monster class, and one that manages the battle between the giant and ogre objects. When your program runs successfully, upload to Blackboard. For extra credit you may suggest up to two ways to improve the Giant and Ogres game and implement each. Extra credit depends on the creativity and complexity of the suggested features, as well as successful implementation.