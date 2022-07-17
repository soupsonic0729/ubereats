import java.util.ArrayList;

public class Ubereats {
    ArrayList<Distributer> uberlist = new ArrayList<Distributer>();

    public Ubereats() {
        Distributer dis1 = new Distributer("鈴木", 723595);
        uberlist.add(dis1);

        Distributer dis2 = new Distributer("田中", 480347);
        uberlist.add(dis2);

        Distributer dis3 = new Distributer("佐藤", 140711);
        uberlist.add(dis3);
    }

    public ArrayList<Distributer> getUberlist() {

        return this.uberlist;
    }
}
