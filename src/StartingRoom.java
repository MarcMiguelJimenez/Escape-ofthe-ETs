public class StartingRoom extends MapTile {

    public StartingRoom(int x, int y) {

        super(x,y);
    }

    public String intro_text(){
        return "\n You were working in a Hershey factory and were just about to go home.When you started walking towards your card, you were abducted by Aliens and taken into their ship.\n When you wake up, you can see four paths.";
    }

    public void modify_player(Player player){

    }

}
