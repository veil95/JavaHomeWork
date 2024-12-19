package prac13.num6;

import java.io.*;
import java.util.*;

public class WordChain {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите имя файла: ");
            String fileName = scanner.nextLine();
            List<String> words = readWordsFromFile(fileName);
            String result = getLine(words);
            System.out.println("Результат:");
            System.out.println(result);
        } catch (IOException e) {
            System.err.println("Ошибка чтения файла: " + e.getMessage());
        }
    }

    private static List<String> readWordsFromFile(String fileName) throws IOException {
        List<String> words = new ArrayList<>();
        File file = new File(fileName);
        try (Scanner sc = new Scanner(file)) {
            String line;
            while (sc.hasNextLine()) {
                line = sc.nextLine();
                words.addAll(Arrays.asList(line.split("\\s+")));
            }
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден: " + fileName);
        }
        return words;
    }

    public static String getLine(List<String> words) {
        if (words == null || words.isEmpty()) {
            return "";
        }

        List<String> usedWords = new ArrayList<>();
        StringBuilder result = new StringBuilder();
        String currentWord = words.get(0);
        usedWords.add(currentWord);
        result.append(currentWord).append(" ");
        words.remove(0);

        while (!words.isEmpty()) {
            boolean found = false;

            for (int i = 0; i < words.size(); i++) {
                String word = words.get(i);
                if (currentWord.toLowerCase().charAt(currentWord.length() - 1) == word.toLowerCase().charAt(0)) {
                    result.append(word).append(" ");
                    usedWords.add(word);
                    words.remove(i);
                    currentWord = word;
                    found = true;
                    break;
                }
            }

            if (!found) {
                break;
            }
        }

        return result.toString().trim();
    }
}