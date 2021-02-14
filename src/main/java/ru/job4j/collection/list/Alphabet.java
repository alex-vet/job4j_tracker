package ru.job4j.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Упражнения
 * 1.3.1. Коллекция List, ArrayList
 * 16. Буквы в алфавитном порядке.
 * Вам необходимо реализовать метод, который принимает строку, которое является одним словом,
 * без знаков препинания цифр и пробелов. Метод должен вернуть новую строку, в которой все
 * символы исходной строки будут расставлены в алфавитном порядке.
 * Для разделения строки на подстроки используйте метод split(), добавьте все элементы
 * в коллекцию List<String>, отсортируйте в порядке возрастания - используйте метод sort,
 * в который передадите компаратор. Новую строку сформируйте с помощью StringBuilder.
 */
public class Alphabet {
    public static String reformat(String s) {
        List<String> list = new ArrayList<>(Arrays.asList(s.split("")));
        list.sort(Comparator.naturalOrder());
        StringBuilder sb = new StringBuilder();
        for (String str : list) {
            sb.append(str);
        }
        return sb.toString();
    }
}
