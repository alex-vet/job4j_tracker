package ru.job4j.collection.map;

import java.util.*;

/**
 * Упражнения
 * 1.3.3. Map. HashMap. LinkedHashMap
 * 13. Данные об осадках
 * Метод принимает список объектов Info. При этом эти объекты содержат два поля:
 * 1. city - название города, где производились наблюдения;
 * 2. rainfall - количество осадков которые выпали в этом городе за период наблюдения.
 * Необходимо реализовать метод так, чтобы в результате вернулся список объектов Info в котором
 * будет указано имя города наблюдения и общее количество осадков за период наблюдения.
 */
public class Weather {
    public static List<Info> editData(List<Info> list) {
        int rainfall = 0;
        HashMap<String, Integer> map = new HashMap<>();
        for (Info info : list) {
            if (map.containsKey(info.getCity())) {
                rainfall = map.get(info.getCity());
            }
            map.put(info.getCity(), info.getRainfall() + rainfall);
            rainfall = 0;
        }
        List<Info> rsl = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            Info info = new Info(entry.getKey(), entry.getValue());
            rsl.add(info);
        }
        return rsl;
    }

    public static class Info {
        private String city;

        private int rainfall;

        public Info(String city, int rainfall) {
            this.city = city;
            this.rainfall = rainfall;
        }

        public String getCity() {
            return city;
        }

        public int getRainfall() {
            return rainfall;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Info info = (Info) o;
            return rainfall == info.rainfall
                    && Objects.equals(city, info.city);
        }

        @Override
        public int hashCode() {
            return Objects.hash(city, rainfall);
        }
    }
}