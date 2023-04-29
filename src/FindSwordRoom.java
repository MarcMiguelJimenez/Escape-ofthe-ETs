public class FindSwordRoom extends LootRoom {
    public FindSwordRoom(int x, int y, Sword sword) {
        super(x,y, sword);

    }
    public String intro_text(){
        if(pickedItem == false)
            return String.format("You find a Sword on the floor in the room.");
        else
            return "";
    }
}
