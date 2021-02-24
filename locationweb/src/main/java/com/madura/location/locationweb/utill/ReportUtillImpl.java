package com.madura.location.locationweb.utill;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class ReportUtillImpl implements ReportUtill {

    @Override
    public void GeneratePieChart(String path, List<Object[]> data) {

        DefaultPieDataset dataSet = new DefaultPieDataset();
        for (Object[] objects : data) {
            dataSet.setValue(objects[0].toString(), Double.parseDouble(objects[1].toString()));
        }
        JFreeChart chart = ChartFactory.createPieChart("Location Type Report", dataSet);
        try {
            ChartUtilities.saveChartAsJPEG(new File(path),chart,300,300);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
