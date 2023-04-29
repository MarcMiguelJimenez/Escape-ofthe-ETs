public class Main {
    public static void main(String[] args) {
        Bar hershbar = new Bar(10);
        Weapon weapon1 = new Weapon("Super weapon", "Super 2 weapon", 10, 50);
        Sword magicSword = new Sword();
        Laser lasergun = new Laser();
        Grenade grenade =new Grenade();


        // Enemies
        Robot robot = new Robot();
        Alien alien = new Alien();
        World world = new World();
        world.load_tiles();
    }

}
