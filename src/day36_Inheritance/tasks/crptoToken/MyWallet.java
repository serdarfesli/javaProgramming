package day36_Inheritance.tasks.crptoToken;

public class MyWallet {
    public static void main(String[] args) {

        Bitcoin bitcoin1 = new Bitcoin();
        Ethereum ethereum1 = new Ethereum();
        Cardano cardano1 = new Cardano();
        XRP xrp1 = new XRP();
        Doge doge1 = new Doge();

        bitcoin1.setInfo(45,40,null,null,null,true);
        System.out.println(bitcoin1);
        System.out.println(bitcoin1.totalPrice());
        ethereum1.setInfo(200,100,null,null,null,false);
        cardano1.setInfo(50,46,null,null,null,true);
        xrp1.setInfo(10,10,null,null,null,false);
        doge1.setInfo(5,55,null,null,null,false);

        System.out.println(bitcoin1.totalPrice() + ethereum1.totalPrice()+ cardano1.totalPrice() + xrp1.totalPrice()+ doge1.totalPrice());
    }
}