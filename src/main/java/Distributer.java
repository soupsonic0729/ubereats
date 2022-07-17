import java.util.ArrayList;

public class Distributer {
    String name;
    int num;

    ArrayList<Order> dislist = new ArrayList<>();

    public Distributer(String name, int num) {
        this.name = name;
        this.num = num;

    }


    public ArrayList<Order> getDislist() {

        return this.dislist;
    }
}
