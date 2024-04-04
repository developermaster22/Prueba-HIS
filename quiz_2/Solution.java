import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    // Mapa de mapeo de texto a números
    private static final Map<String, Integer> textToNumberMap = new HashMap<>();

    static {
        // Agregar mapeo de texto a números
        textToNumberMap.put("one", 1);
        textToNumberMap.put("two", 2);
        textToNumberMap.put("three", 3);
        textToNumberMap.put("four", 4);
        textToNumberMap.put("five", 5);
        textToNumberMap.put("six", 6);
        textToNumberMap.put("seven", 7);
        textToNumberMap.put("eight", 8);
        textToNumberMap.put("nine", 9);
    }

    public static void main(String[] args) {
        String fileName = "calibration_doc.txt";
        try {
            // Leer el archivo de calibración
            String[] calibrationData = readCalibrationFile(fileName);

            // Procesar la calibración y mostrar el resultado
            int result = processCalibration(calibrationData);
            System.out.println("La suma total de la calibración es: " + result);
        } catch (IOException e) {
            System.err.println("Error al leer el archivo de calibración: " + e.getMessage());
        }
    }

    public static int processCalibration(String[] table) {
        int totalSum = 0;
        for (int i = 0; i < table.length; i++) {
            String line = table[i];
            List<Integer> numbers = extractNumbers(line);
            System.out.print("Números extraídos de la línea " + (i + 1) + ": ");
            System.out.println(numbers);
            for (int number : numbers) {
                totalSum += number;
            }
        }
        return totalSum;
    }

    public static List<Integer> extractNumbers(String str) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String subStr = str.substring(i, j);
                if (textToNumberMap.containsKey(subStr.toLowerCase())) {
                    numbers.add(textToNumberMap.get(subStr.toLowerCase()));
                }
            }
        }
        return numbers;
    }

    public static String[] readCalibrationFile(String fileName) throws IOException {
        List<String> calibrationData = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                calibrationData.add(line);
            }
        }
        return calibrationData.toArray(new String[0]);
    }
}
