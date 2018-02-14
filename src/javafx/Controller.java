package javafx;

import classes.Car;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

   // Bike bike= new Bike("",2,250);
    Car car=new Car("",350,4);

    public void initialize() throws Exception{
        updateFields();
    }

    private void updateFields() {
        vehicleName.setText(car.getVehicle());
        vehicleHP.setText(Integer.toString(car.getHP()));
    }

    @FXML
    private Label vehicleName;

    @FXML
    private Label vehicleHP;

    @FXML
    private TextField vehicleField;




    public void setCar(){
        car.setVehicle(vehicleField.getText());
        updateFields();
    }

    public void addHP(){
        car.addMods(Integer.parseInt(vehicleHP.getText()));
        updateFields();
    }
    public void reduceHP(){
        car.removeMods(Integer.parseInt(vehicleHP.getText()));
        updateFields();
    }


}
