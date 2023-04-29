public class Bar extends Item{
    public int amt;

    public Bar(int amt){
        super("HersheyBar", String.format("%s hersey bar was found in your pocket.", String.valueOf(amt)),amt);
        this.amt = amt;
    }
}
