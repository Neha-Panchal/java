package Chart;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nehar
 */
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.util.Rotation;



public class Charts extends JFrame {

    private static final long serialVersionUID = 1L;
 
    HashMap<String, Integer>map;
    public Charts(String Title, String chartTitle, HashMap<String, Integer> temp) {
        super(Title);
        // This will create the dataset
        this.map=temp;
        PieDataset dataset = createDataset();
        // based on the dataset we create the chart
        JFreeChart chart = createChart(dataset, chartTitle);
        // we put the chart into a panel
        ChartPanel chartPanel = new ChartPanel(chart);
        // default size
        chartPanel.setPreferredSize(new java.awt.Dimension(1500, 1000));
        // add it to our application
        setContentPane(chartPanel);

    }

    /**
     * Creates a sample dataset
     */
    private  PieDataset createDataset() {
        int x=10;
        int y=30;
        int z=60;
        DefaultPieDataset analysis = new DefaultPieDataset();
        for (Map.Entry<String, Integer> entrySet : this.map.entrySet())
        {
            analysis.setValue(entrySet.getKey(), entrySet.getValue());
        }
//        analysis.setValue("NGO 1", x);
//        analysis.setValue("NGO 2", y);
//        analysis.setValue("NGO 3", z);
        return analysis;

    }

    /**
     * Creates a chart
     */
    private JFreeChart createChart(PieDataset dataset, String title) {

        JFreeChart chart = ChartFactory.createPieChart3D(
            title,                  // chart title
            dataset,                // data
            true,                   // include legend
            true,
            false
        );

        PiePlot3D display = (PiePlot3D) chart.getPlot();
        display.setStartAngle(290);
        display.setDirection(Rotation.CLOCKWISE);
        display.setForegroundAlpha(0.5f);
        return chart;

    }
}

