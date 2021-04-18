/**
 * Created by DELL on 12/12/20.
 */
public class Account {
    private double balance;
    private double balance_Saudi;
    private double balance_Dolar;
    private String username;
    private int password;


    public Account(double balance, double balance_Saudi, double balance_Dolar, String username, int password)
    {
        this.balance = balance;
        this.balance_Saudi = balance_Saudi;
        this.balance_Dolar = balance_Dolar;
        this.username = username;
        this.password = password;
    }

    public Account(double balance){this.balance=0.0;}

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance_Saudi() {
        return balance_Saudi;
    }

    public void setBalance_Saudi(double balance_Saudi) {
        this.balance_Saudi = balance_Saudi;
    }

    public double getBalance_Dolar() {
        return balance_Dolar;
    }

    public void setBalance_Dolar(double balance_Dolar) {
        this.balance_Dolar = balance_Dolar;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }


    public void withdraw(double draw){
        balance=balance-draw;
    }

    public void deposit(double draw){
        balance=balance+draw;
    }

    public void transform(double draw){
        balance=balance-draw;
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                ", balance_Saudi=" + balance_Saudi +
                ", balance_Dolar=" + balance_Dolar +
                ", username='" + username + '\'' +
                ", password=" + password +
                '}';
    }
}
