package org.example.calculatorjavafx;

import javafx.beans.binding.NumberExpressionBase;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import com.fathzer.soft.javaluator.DoubleEvaluator;


public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    TextField resultBox;
    DoubleEvaluator evaluator;


    public HelloController() {
        resultString = "";
        evaluator = new DoubleEvaluator();
    }

    public String resultString;


    @FXML
    public void clearOnClick(MouseEvent event) {
        resultString = "";
        resultBox.setText(resultString);
    }

    @FXML
    public void changeSignOnClick(MouseEvent event) {
        resultString = "(-1)*(" + resultString + ")";
        resultString = String.valueOf(evaluator.evaluate(resultString));
        resultBox.setText(resultString);

    }

    @FXML
    public void sevenOnClick(MouseEvent event) {
        resultString += "7";
        resultString = String.valueOf(evaluator.evaluate(resultString));
        resultBox.setText(resultString);
    }

    @FXML
    public void eightOnClick(MouseEvent event) {
        resultString += "8";
        resultString = String.valueOf(evaluator.evaluate(resultString));
        resultBox.setText(resultString);
    }

    @FXML
    public void fourOnClick(MouseEvent event) {
        resultString += "4";
        resultString = String.valueOf(evaluator.evaluate(resultString));
        resultBox.setText(resultString);
    }

    @FXML
    public void zeroOnClick(MouseEvent event) {
        resultString += "0";
        resultString = String.valueOf(evaluator.evaluate(resultString));
        resultBox.setText(resultString);
    }

    @FXML
    public void oneOnClick(MouseEvent event) {
        resultString += "1";
        resultString = String.valueOf(evaluator.evaluate(resultString));
        resultBox.setText(resultString);
    }

    @FXML
    public void fiveOnClick(MouseEvent event) {
        resultString += "5";
        resultString = String.valueOf(evaluator.evaluate(resultString));
        resultBox.setText(resultString);
    }

    @FXML
    public void twoOnClick(MouseEvent event) {
        resultString += "2";
        resultString = String.valueOf(evaluator.evaluate(resultString));
        resultBox.setText(resultString);
    }

    @FXML
    public void percentOnClick(MouseEvent event) {
        resultString += "%";
        resultString = String.valueOf(evaluator.evaluate(resultString));
        resultBox.setText(resultString);
    }

    @FXML
    public void nineOnClick(MouseEvent event) {
        resultString += "nine";
        resultString = String.valueOf(evaluator.evaluate(resultString));
        resultBox.setText(resultString);
    }

    @FXML
    public void sixOnClick(MouseEvent event) {
        resultString += "6";
        resultString = String.valueOf(evaluator.evaluate(resultString));
        resultBox.setText(resultString);

    }

    @FXML
    public void threeOnClick(MouseEvent event) {
        resultString += "3";
        resultString = String.valueOf(evaluator.evaluate(resultString));
    }

    @FXML
    public void divisionOnClick(MouseEvent event) {
        resultString += "/";
        resultString = String.valueOf(evaluator.evaluate(resultString));
        resultBox.setText(resultString);
    }

    @FXML
    public void multiplyOnClick(MouseEvent event) {
        resultString += "*";
        resultString = String.valueOf(Integer.valueOf(resultString));
        resultBox.setText(resultString);
    }

    @FXML
    public void downSideOnClick(MouseEvent event) {
        resultString += "-";
        resultString = String.valueOf(Integer.valueOf(resultString));
        resultBox.setText(resultString);
    }

    @FXML
    public void plusOnClick(MouseEvent event) {
        resultString += "+";
        resultString = String.valueOf(Integer.valueOf(resultString));
        resultBox.setText(resultString);
    }

    @FXML
    public void commaOnClick(MouseEvent event) {
        resultString += ",";
        resultString = String.valueOf(Integer.valueOf(resultString));
        resultBox.setText(resultString);
    }

    @FXML
    public void equalSignOnClick(MouseEvent event) {
        resultString += "=";
        resultString = String.valueOf(Integer.valueOf(resultString));
        resultBox.setText(resultString);
    }


}