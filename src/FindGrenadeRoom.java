public class FindGrenadeRoom extends LootRoom {
    public FindGrenadeRoom(int x, int y, Grenade grenade) {
        super(x,y, grenade);

    }
    public String intro_text(){
        if(pickedItem == false)
            return String.format("You find a small Grenade in a room.");
        else
            return "";
    }
}
