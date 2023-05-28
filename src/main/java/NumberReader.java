import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class NumberReader {

    public TreeMap<Integer, Integer> mapOfNumbers(String fileName) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        String line;
        TreeMap<Integer, Integer> newList = new TreeMap<>(Integer::compareTo);
        while ((line = bufferedReader.readLine()) != null) {
            Integer number = Integer.valueOf(line);
            Integer value = newList.getOrDefault(number, 0);
            newList.put(number, value + 1);
        }
        return newList;
    }

    public void printListOfNumbers(TreeMap<Integer, Integer> integerMap) {
        for (HashMap.Entry<Integer, Integer> map : integerMap.entrySet()) {
            Integer key = map.getKey();
            int value = map.getValue();
            System.out.println(key + " - liczba wystąpień " + value);
        }
    }
}

