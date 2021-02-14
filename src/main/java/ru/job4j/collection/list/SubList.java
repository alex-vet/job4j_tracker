package ru.job4j.collection.list;

import java.util.ArrayList;
import java.util.List;

/**
 * Упражнения
 * 1.3.1. Коллекция List, ArrayList
 * 9. Получить часть списка с определенными индексами
 * Может возникнуть ситуация, когда у нас есть список и нам нужно получить его часть,
 * которая находится между двумя интересующими нас индексами. Что же делать в данной
 * ситуации? Не отчаиваться, не усложнять, а просто применить метод subList():
 * List<E> subList(int fromIndex, int toIndex) - метод возвращает список, который содержит
 * все элементы исходного списка начиная с индекса fromIndex(включительно) и до
 * toIndex(значение исключается). При этом, если выполняется условие
 * fromIndex == toIndex,- метод вернет пустой список.
 * <p>
 * Задание: метод принимает два параметра - список и элемент, который предполагается, что содержится
 * в этом списке. Необходимо реализовать метод, чтобы он возвращал результаты следующим образом:
 * 1. Элемента нет в списке - возвращает пустой список.
 * 2. Элемент в списке встречается 1 раз - возвращает пустой список.
 * 3. Элемент встречается более одного - возвращается список, начиная с первого вхождения элемента
 * и заканчивая предшествующим последнему вхождению элемента в исходной коллекции.
 */
public class SubList {
    public static List<String> getElementsBetweenIndexes(List<String> list, String el) {
        List<String> rsl = new ArrayList<>();
        int firstEl = list.indexOf(el);
        int secondEl = list.lastIndexOf(el);
        if (firstEl != -1 && secondEl != -1 && firstEl != secondEl) {
            rsl = list.subList(firstEl, secondEl);
        }
        return rsl;
    }
}
