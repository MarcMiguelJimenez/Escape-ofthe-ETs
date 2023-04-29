public class FindLaserRoom extends LootRoom {
    public FindLaserRoom(int x, int y, Laser laser) {
        super(x,y, laser);

    }
    public String intro_text(){
        if(pickedItem == false)
            return String.format("You find a Laser Gun in a room.");
        else
            return "";
    }
}
