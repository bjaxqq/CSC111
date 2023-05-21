public class Battle {
    public static void main(String[] args) {
        Monster giant = new Monster(15, 100);
        Monster ogre = new Monster(25, 60);
        int round = 1;
        
        // Fight until one or both fighters are dead
        while (giant.isAlive() && ogre.isAlive()) {
            System.out.println("Round " + round);
            System.out.println("Giant: " + giant.getHealth());
            System.out.println("Ogre: " + ogre.getHealth());
            double giantAttack = giant.attack();
            double ogreAttack = ogre.attack();
            giant.takeDamage(ogreAttack);
            ogre.takeDamage(giantAttack);
            round++;
        }
        
        // Determine the winner
        if (!giant.isAlive() && !ogre.isAlive()) {
            System.out.println("Both fighters are dead.");
        } else if (!giant.isAlive()) {
            System.out.println("The OGRE wins!");
        } else {
            System.out.println("The GIANT wins!");
        }
    }
}