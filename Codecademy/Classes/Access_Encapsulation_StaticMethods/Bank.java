package Classes.Access_Encapsulation_StaticMethods;

public class Bank{
    private CheckingAccount accountOne;
    private CheckingAccount accountTwo;

    public Bank(){
        this.accountOne = new CheckingAccount("Zeus", 100, "1");
        this.accountTwo = new CheckingAccount("Hades", 200, "2");
    }

    public static void main(String[] args){
        Bank bankOfGods = new Bank();
        bankOfGods.accountOne.getAccountInformation();



    }

}