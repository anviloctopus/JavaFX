package sample;

/**
 * Created by ANVIL_OCTOPUS on 4/8/17.
 */
public class Contact {

    String name, phone, email;

    public Contact(String name, String phone, String email) {
        this.phone = phone;
        this.email = email;
        this.name = name;
    }

    @Override
    public String toString(){
        return name + ", " + phone + ", " + email;
    }
}
