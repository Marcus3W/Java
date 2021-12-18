package Classes.Access_Encapsulation_StaticMethods;

public class CheckingAccountAccessors {

    private String name;
    private int balance;
    private String id;

    public CheckingAccountAccessors(String inputName, int inputBalance, String inputId){
        name = inputName;
        balance = inputBalance;
        id = inputId;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}

