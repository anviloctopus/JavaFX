package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;


public class Controller implements Initializable {
    ObservableList<Contact> contacts = FXCollections.observableArrayList();

    @FXML
    ListView contactsList;

    @FXML
    TextField name;

    @FXML
    TextField phone;

    @FXML
    TextField email;


    public void addContact(){
        if(name.getText().equals("") || phone.getText().equals("") || email.getText().equals("")){

        } else {
            Contact contact = new Contact(name.getText(), phone.getText(), email.getText());
            contacts.add(contact);
            name.setText("");
            phone.setText("");
            email.setText("");
        }

    }
    public void removeContact(){
        Contact contact = (Contact) contactsList.getSelectionModel().getSelectedItem();
        contacts.remove(contact);
    }

    @Override
    public void initialize(URL url, ResourceBundle resources){
        contactsList.setItems(contacts);
    }
}
