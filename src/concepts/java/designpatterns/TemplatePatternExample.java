package designpatterns;

/**
 * Template Pattern Example: Useful when defining a skeleton workflow with customizable steps (e.g., file processing, algorithm steps).
 */
abstract class DataProcessor {
    public void process() {
        readData();
        processData();
        saveData();
    }

    abstract void readData();
    abstract void processData();
    void saveData() {
        System.out.println("Data saved to database.");
    }
}

class CSVDataProcessor extends DataProcessor {
    void readData() { System.out.println("Reading CSV data"); }
    void processData() { System.out.println("Processing CSV data"); }
}

public class TemplatePatternExample {
    public static void main(String[] args) {
        DataProcessor processor = new CSVDataProcessor();
        processor.process();
    }
}
