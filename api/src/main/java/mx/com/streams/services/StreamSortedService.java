package mx.com.streams.services;

import mx.com.streams.domain.Person;

import java.util.List;

public interface StreamSortedService {
  List<String> sortedNatural(List<String> stringList);
  List<String> sortedWithReverseOrder(List<String> stringList);
  List<Person> sortedPersonByUsername(List<Person> personList);
}
