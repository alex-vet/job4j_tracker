package ru.job4j.collection.set;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Упражнения
 * 1.3.2. Коллекция Set, HashSet
 * 3. Панграмма
 * Панграмма - короткий текст, который использует все буквы алфавита, по возможности не повторяя их.
 * Метод принимает строку(на английском языке). Необходимо реализовать его так, чтобы метод
 * определил является ли входящая строка панграммой. Строчные и прописные буквы являются
 * одинаковыми символами, пробелы необходимо игнорировать.
 * Напомню, что в английском алфавите 26 букв.
 */
public class Pangram {
    public static boolean checkString(String s) {
        boolean rsl = false;
        String str = s.toLowerCase().replaceAll("\\s+", "");
        HashSet<String> chars = new HashSet<>(Arrays.asList(str.split("")));
        if (chars.size() == 26) {
            rsl = true;
        }
        return rsl;
    }
}
