public class TreasureRoom extends LootRoom {
    public TreasureRoom(int x, int y, Bar geld) {
        super(x,y, geld);

    }
    public String intro_text(){
        if(pickedItem == false)
            return String.format("You find Hershey Bars all over the floor.");
        else
            return "";
    }
}
