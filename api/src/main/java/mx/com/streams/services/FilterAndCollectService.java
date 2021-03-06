package mx.com.streams.services;

import mx.com.streams.domain.Person;

import java.util.List;

public interface FilterAndCollectService {
  public List<String> filterStartWith(List<String> stringList, String filter);
  public List<Person> filterPersonByAge(List<Person> personList, Integer age);
  public Person filterPersonUsingAny(List<Person> personList, Integer age);
  public List<String> getListOfUsernamePerson(List<Person> personList);
}
