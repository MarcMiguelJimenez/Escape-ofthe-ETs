public class RobotRoom extends EnemyRoom{
    Robot enemy;
    public RobotRoom(int x, int y, Robot enemy){
        super(x,y, enemy);
        this.enemy=enemy;

    }
    public String intro_text() {
        if (enemy.is_alive()) {
            return "A Giant Robot is in the room, its eyes turn red and comes towards you. ";
        }else{
            return "The pieces of a Robot are on the floor.";
        }

    }


}
