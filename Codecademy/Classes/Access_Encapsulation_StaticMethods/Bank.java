package Classes.Access_Encapsulation_StaticMethods;

public class Bank{
    private CheckingAccountAccessors accountOne;
    private CheckingAccountAccessors accountTwo;

    public Bank(){
        accountOne = new CheckingAccountAccessors("Zeus", 100, "1");
        accountTwo = new CheckingAccountAccessors("Hades", 200, "2");
    }

    public static void main(String[] args){
        Bank bankOfGods = new Bank();
        System.out.println(bankOfGods.accountOne.getBalance());
        bankOfGods.accountOne.setBalance(5000);
        System.out.println(bankOfGods.accountOne.getBalance());
    }

}