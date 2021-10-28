package week4;

public class WalletTester2 {
    public static void main(String[] args) {

        CallingCard calling = new CallingCard("Michael", "02020203", "0987");
        Card expiredDrivers = new Card("Steve");


        Wallet newWallet3 = new Wallet();

        newWallet3.addCard(calling);
        //System.out.println(newWallet3.getExpiredCardCount());
        System.out.println(calling);

        newWallet3.addCard(expiredDrivers);
        //System.out.println(newWallet3.getExpiredCardCount());
        System.out.println(expiredDrivers);


    }





}
