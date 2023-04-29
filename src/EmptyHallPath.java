import java.util.ArrayList;

public class EmptyHallPath extends MapTile {
    public EmptyHallPath(int x, int y) {
        super(x, y);
    }


    public String intro_text() {
        return "You are standing in an empty hall way.";
    }


    public void modify_player(Player player) {

    }


    public ArrayList<Action> available_actions() {
        ArrayList<Action> moves = new ArrayList<>();
        moves.addAll(super.available_actions());
        return moves;
    }

}




