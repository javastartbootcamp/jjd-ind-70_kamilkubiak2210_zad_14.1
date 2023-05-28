import java.io.IOException;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        String fileName = "src/main/resources/liczby.txt";
        try {
            NumberReader numberReader = new NumberReader();
            TreeMap<Integer, Integer> integerMap = numberReader.mapOfNumbers(fileName);
            if (!integerMap.isEmpty()) {
                numberReader.printListOfNumbers(integerMap);
            } else {
                System.err.println("Lista jest pusta");
            }
        } catch (IOException e) {
            System.err.println("Nie można znaleźć pliku " + fileName);
        }

    }

}
