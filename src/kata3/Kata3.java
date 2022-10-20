
package kata3;


public class Kata3 {


    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram();
        
        histogram.increment("Ulpgc.es");
        histogram.increment("Ulpgc.es");
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("outlook.com");
        histogram.increment("gmail.com");
        histogram.increment("Ulpgc.es");
        histogram.increment("outlook.com");
        histogram.increment("Ulpgc.es");
        histogram.increment("Ulpgc.es");
       
        
        
        
        
        HistogramDisplay histogramDisplay = new HistogramDisplay(histogram, "HISTOGRAM DISPLAY...");
        histogramDisplay.execute();
        
    }
    
}
