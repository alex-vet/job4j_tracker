package ru.job4j.collection.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Упражнения
 * 1.3.2. Коллекция Set, HashSet
 * 6. Изограмма
 * Изограмма - это слово, которое не содержит повторяющихся букв,
 * т.е. все буквы в таком слове уникальные.
 * Метод принимает на входе строку, которая является словом, все буквы написаны в нижнем регистре.
 * Входная строка - не фраза, а одно слово, поэтому ее не нужно делить на слова.
 * Метод должен вернуть булево значение - если слово является изограммой - то метод
 * вернет true, иначе - false.
 */
public class Isogram {
    public static boolean checkString(String s) {
        Set<String> word = new HashSet<>(Arrays.asList(s.split("")));
        return s.length() == word.size();
    }
}
