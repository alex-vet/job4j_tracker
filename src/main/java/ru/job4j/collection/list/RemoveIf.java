package ru.job4j.collection.list;

import java.util.List;
import java.util.function.Predicate;

/**
 * Упражнения
 * 1.3.1. Коллекция List, ArrayList
 * 10. Удаление элементов по условию
 * Может возникнуть ситуация, когда нам надо удалить элементы, которые удовлетворяют
 * какому-то условию. Чтобы не писать цикл, в котором будет проверяться условие,
 * в интерфейсе Collection(наследником которого является интерфейс List) определен метод removeIf():
 * default boolean removeIf​(Predicate<? super E> filter) - метод удаляет все элементы из коллекции,
 * которые удовлетворяют условию определенному в предикате filter
 * (передается в виде лямбда выражения). Если в результате работы метода список
 * изменился - метод возвращает true.
 * <p>
 * Задание: необходимо реализовать метод, который вернет список строк, которые
 * состоят из 5 и более символов.
 */
public class RemoveIf {
    public static List<String> sortList(List<String> list) {
        list.removeIf(i -> i.length() < 5);
        return list;
    }

}
