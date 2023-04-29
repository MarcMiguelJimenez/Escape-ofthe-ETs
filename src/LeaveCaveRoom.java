import java.util.ArrayList;
public class LeaveCaveRoom extends MapTile {
    public LeaveCaveRoom(int x, int y) {
        super(x, y);
    }


    public String intro_text() {
        return "You have found the portal to leave!";

    }

    public void modify_player(Player player) {
        player.victory = true;
    }
}

