package week4;

public class WalletTester {

    public static void main(String[] args) {

        DriverLicence dl = new DriverLicence("Marc Wheeler", "31101986", 1986);
        IDCard id = new IDCard("Georgie Hewitson", "25021993");


        Wallet marcCard = new Wallet();

        marcCard.addCard(dl);
        //System.out.println(marcCard.formatCards());
        System.out.println(dl);

        marcCard.addCard(id);
        //System.out.println(marcCard.formatCards());
        System.out.println(id);


    }
}
