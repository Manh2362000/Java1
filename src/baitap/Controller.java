package baitap;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.Observable;
import java.util.ResourceBundle;


public class Controller implements Initializable {
    public TextField Name;
    public TextField Phone;
    public TextField Sreach;
    public TableView <Contact> tbview;
    public TableColumn <Contact,String> tbName;
    public TableColumn <Contact,String> tbPhone;
    ObservableList<Contact> ds= FXCollections.observableArrayList();
    ObservableList<Contact> dsTim=FXCollections.observableArrayList();
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        tbName.setCellValueFactory(new PropertyValueFactory<Contact,String>("name"));
        tbPhone.setCellValueFactory(new PropertyValueFactory<Contact,String>("phone"));
    }
    public void them(){
        String n=Name.getText();
        String p=Phone.getText();
        if (!n.isEmpty()&&!p.isEmpty()){
            Contact aB=new Contact(n,p);
            ds.add(aB);
            tbview.setItems(ds);
        }
        Name.setText("");
        Phone.setText("");
    }
    public void ok(){
        String n=Sreach.getText();
        dsTim.remove(0,dsTim.size());
        for (Contact ab:
                ds) {
            if (ab.getName().equals(n)){
                dsTim.add(ab);
            }
        }
        tbview.setItems(dsTim);
    }
    public void back(){
        Platform.exit();
    }

}
