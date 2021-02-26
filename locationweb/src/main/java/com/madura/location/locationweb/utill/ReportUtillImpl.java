package com.madura.location.locationweb.utill;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.util.List;

@Component
public class ReportUtillImpl implements ReportUtill {

    @Override
    public void generatePieChart(String path, List<Object[]> data) {
        Double value;
        String key;
        DefaultPieDataset dataSet = new DefaultPieDataset();
        for (Object[] objects : data) {
            value = Double.valueOf(objects[1].toString());
            key = (String) objects[0];
            try {
                if (!key.equals(null) && !value.equals(null))
                    dataSet.setValue(key, value);

            } catch (NullPointerException e) {
                e.printStackTrace();
            }


        }
        JFreeChart chart = ChartFactory.createPieChart("Location Type Report", dataSet);
        try {
            ChartUtilities.saveChartAsJPEG(new File(path + "/pieChart.jpeg"), chart, 300, 300);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
