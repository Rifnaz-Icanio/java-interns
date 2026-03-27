import java.io.*;

public class FileAnalyzer{
    public static void main(String[] args) {
        File file = new File("numbers.txt");
        double sum = 0;
        int count = 0;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;

            while ((line = reader.readLine()) != null) {
                try {
                    double number = Double.parseDouble(line.trim());
                    sum += number;
                    count++;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid data skipped: " + line);
                }
            }

            reader.close();

            if (count > 0) {
                double average = sum / count;
                System.out.println("Sum of numbers: " + sum);
                System.out.println("Average: " + average);
            } else {
                System.out.println("No valid numbers found in the file.");
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found. Make sure 'numbers.txt' exists.");
        } catch (IOException e) {
            System.out.println("Error while reading the file.");
        }
    }
}
