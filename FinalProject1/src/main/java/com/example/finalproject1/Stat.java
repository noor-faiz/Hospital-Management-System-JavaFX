package com.example.finalproject1;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;

import java.net.URL;
import java.util.ResourceBundle;

public class Stat implements Initializable {

    @FXML
    private BarChart<?, ?> barchart;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        XYChart.Series series1 = new XYChart.Series();
        series1.setName("Doctor Vs. No. of Patients Treated (Avg. a day)");
        series1.getData().add(new XYChart.Data<>("Dr. Muzahid", 40));
        series1.getData().add(new XYChart.Data<>("Dr. Shahiduzzaman", 25));
        series1.getData().add(new XYChart.Data<>("Dr. Humayra", 34));

        XYChart.Series series2 = new XYChart.Series();
        series2.setName("Patient Age vs Recovery Time (in days)");
        series2.getData().add(new XYChart.Data<>("10", 3));
        series2.getData().add(new XYChart.Data<>("40", 7));
        series2.getData().add(new XYChart.Data<>("60", 15));
        barchart.getData().addAll(series1, series2);
    }
}

