import java.util.ArrayList;
import java.util.Scanner;


public class Order {
    ArrayList<Goods> ordlist = new ArrayList<>();
    ArrayList<Cart> cartlist = new ArrayList<>();

    public Order() {
        Goods coffee = new Goods("コーヒー", 250);
        ordlist.add(coffee);

        Goods tea = new Goods("紅茶", 150);
        ordlist.add(tea);

        Goods morning = new Goods("モーニングセット", 750);
        ordlist.add(morning);

        Goods lunch = new Goods("ランチセット", 1000);
        ordlist.add(lunch);

        Goods cookie = new Goods("クッキー", 500);
        ordlist.add(cookie);
    }

    public ArrayList<Goods> getOrdlist() {
        return this.ordlist;
    }

    public void order() {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("注文商品を選択してください -> メニュー番号 or -1で終了");
            System.out.println("0:コーヒー 1:紅茶 2:モーニングセット 3:ランチセット 4:クッキー" );

            int selectnum = scanner.nextInt();

            if( (-1<=selectnum && selectnum <=5) != true) {
                System.out.println("正しい値を入力してください");
                continue;
            }
            if (selectnum == -1) {
                break;
            }

            System.out.println(ordlist.get(selectnum).getName() + "を何個注文しますか?");
            int num = scanner.nextInt();

            if(num<1) {
                System.out.println("1個以上頼んでください");
                continue;
            }

            Cart cart_add = new Cart(ordlist.get(selectnum).getName(), ordlist.get(selectnum).getCost(), num);
            cartlist.add(cart_add);
        }
    }

}

