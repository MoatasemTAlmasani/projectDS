/**
 * Created by Afif on 04/12/20.
 */
public  class Person {
    private String first_name;
    private String second_Name;
    private String last_Name;
    private int age;
    private String email;
    private String gender;
    private int telephone_Number;
    private int id;





     /*
     *
     *
     * @param init this for persona details
     *
     */
    public Person(String first_name, String second_Name, String last_Name, int age, String email, String gender, int telephone_Number, int id) {
        this.first_name = first_name;
        this.second_Name = second_Name;
        this.last_Name = last_Name;
        this.age = age;
        this.email = email;
        this.gender = gender;
        this.telephone_Number = telephone_Number;
        this.id = id;
    }

    public Person(String first_name, String second_Name, String last_Name, int age, String email, String gender, int telephone_Number) {
        this.first_name = first_name;
        this.second_Name = second_Name;
        this.last_Name = last_Name;
        this.age = age;
        this.email = email;
        this.gender = gender;
        this.telephone_Number = telephone_Number;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getSecond_Name() {
        return second_Name;
    }

    public void setSecond_Name(String second_Name) {
        this.second_Name = second_Name;
    }

    public String getLast_Name() {
        return last_Name;
    }

    public void setLast_Name(String last_Name) {
        this.last_Name = last_Name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getTelephone_Number() {
        return telephone_Number;
    }

    public void setTelephone_Number(int telephone_Number) {
        this.telephone_Number = telephone_Number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName(){
       return first_name+" "+second_Name+" "+last_Name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "first_name='" + first_name + '\'' +
                ", second_Name='" + second_Name + '\'' +
                ", last_Name='" + last_Name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", telephone_Number=" + telephone_Number +
                ", id=" + id +
                '}';
    }
}

