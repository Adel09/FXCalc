package com.crumlabs.fxcalculator;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Label resultLabel;

    String fnumString = "";
    int fnum, snum, result;
    String operator;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    public void zero(){ fnumString += "0"; resultLabel.setText(fnumString);}

    @FXML
    public void one(){ fnumString += "1"; resultLabel.setText(fnumString);}

    @FXML
    public void two(){ fnumString += "2"; resultLabel.setText(fnumString);}

    @FXML
    public void three(){ fnumString += "3"; resultLabel.setText(fnumString);}
    @FXML
    public void four(){ fnumString += "4"; resultLabel.setText(fnumString);}
    @FXML
    public void five(){ fnumString += "5"; resultLabel.setText(fnumString);}
    @FXML
    public void six(){ fnumString += "6"; resultLabel.setText(fnumString);}
    @FXML
    public void seven(){ fnumString += "7"; resultLabel.setText(fnumString);}
    @FXML
    public void eight(){ fnumString += "8"; resultLabel.setText(fnumString);}
    @FXML
    public void nine(){ fnumString += "9"; resultLabel.setText(fnumString);}


    @FXML
    public void add(){
        resultLabel.setText("");
        fnum = Integer.parseInt(fnumString);
        fnumString = "";
        operator = "+";
    }

    @FXML
    public void minus(){
        resultLabel.setText("");
        fnum = Integer.parseInt(fnumString);
        fnumString = "";
        operator = "-";
    }

    @FXML
    public void multiply(){
        resultLabel.setText("");
        fnum = Integer.parseInt(fnumString);
        fnumString = "";
        operator = "*";
    }

    @FXML
    public void divide(){
        resultLabel.setText("");
        fnum = Integer.parseInt(fnumString);
        fnumString = "";
        operator = "/";
    }

    @FXML
    public void equals(){

        switch (operator){
            case "+":
                snum = Integer.parseInt(fnumString);
                result = fnum + snum;
                resultLabel.setText(result + "");
                break;
            case "-":
                snum = Integer.parseInt(fnumString);
                result = fnum - snum;
                resultLabel.setText(result + "");
                break;
            case "*":
                snum = Integer.parseInt(fnumString);
                result = fnum * snum;
                resultLabel.setText(result + "");
                break;
            case "/":
                snum = Integer.parseInt(fnumString);
                result = fnum / snum;
                resultLabel.setText(result + "");
                break;
        }


    }


    @FXML
    public void clear(){
        fnumString = "";
        resultLabel.setText("");
    }

    @FXML
    public void about(){
//Creating a dialog
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setTitle("Developer");

        a.setContentText("This project was built by Adel Nehikhare using JavaFX" +
                "\n This is a calculator app" +
                "\n Find out more about Adel at -> https://adel.com.ng");
        a.show();

    }



    @FXML
    public void exit(){ System.exit(0);}
}