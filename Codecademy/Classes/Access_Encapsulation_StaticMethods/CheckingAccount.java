package Classes.Access_Encapsulation_StaticMethods;

public class CheckingAccount{
    private String name;
    private int balance;

    public CheckingAccount(String inputName, int inputBalance){
        name = inputName;
        balance = inputBalance;
    }

    private void addFunds(int fundsToAdd){
        balance += fundsToAdd;
    }

    private void getInfo(){
        System.out.println("This checking account belongs to " + name +". It has " + balance + " dollars in it.");
    }

    public static void main(String[] args){
        CheckingAccount myAccount = new CheckingAccount("Marc", 1000);
        System.out.println(myAccount.balance);
        myAccount.addFunds(5);
        System.out.println(myAccount.balance);
    }

}
