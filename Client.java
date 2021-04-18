public class Client extends Person{
    Account account;
    /*
    this for show data of client
     */
    public Client(int id, String first_name, String second_Name, String last_Name, int age, String email, String gender, int telephone_Number, double balance, double balance_Saudi, double balance_Dolar, String username, int password) {
        super(first_name, second_Name, last_Name, age, email, gender, telephone_Number, id);
        account=new Account(balance,balance_Saudi,balance_Dolar,username,password);
    }
    public Client(String first_name, String second_Name, String last_Name, int age, String email, String gender, int telephone_Number, double balance, double balance_Saudi, double balance_Dolar, String username, int password) {
        super(first_name, second_Name, last_Name, age, email, gender, telephone_Number);
        account=new Account(balance,balance_Saudi,balance_Dolar,username,password);
    }
    public void addClient(int id,String first_name, String second_Name, String last_Name, int age, String email, String gender, int telephone_Number, double balance, double balance_Saudi, double balance_Dolar, String username, int password){
        Client client=new Client(id,first_name,second_Name,last_Name,age,email,gender,telephone_Number,balance,balance_Saudi,balance_Dolar,username,password);
    }

    @Override
    public String toString() {
        return super.toString()+"Client{" +
                "account=" + account +
                '}';
    }
}
