public class AlienRoom extends EnemyRoom{
    Alien enemy;
    public AlienRoom(int x, int y, Alien enemy){
        super(x,y, enemy);
        this.enemy=enemy;

    }
    public String intro_text() {
        if (enemy.is_alive()) {
            return "An Alien is in the room, its eyes turn red and comes towards you. ";
        }else{
            return "The pieces of a Robot are on the floor.";
        }

    }


}
