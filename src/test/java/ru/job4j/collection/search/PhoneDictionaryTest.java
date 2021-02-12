package ru.job4j.collection.search;

import org.junit.Test;
import ru.job4j.collection.search.phonedictionary.Person;
import ru.job4j.collection.search.phonedictionary.PhoneDictionary;

import static org.hamcrest.Matchers.is;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        ArrayList<Person> persons = phones.find("Petr");
        assertThat(persons.get(0).getSurname(), is("Arsentev"));
    }
}