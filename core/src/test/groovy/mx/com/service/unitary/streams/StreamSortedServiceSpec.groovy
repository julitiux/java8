package mx.com.service.unitary.streams

import mx.com.streams.domain.Person
import mx.com.streams.services.StreamSortedServiceImpl
import spock.lang.Shared
import spock.lang.Specification

class StreamSortedServiceSpec extends Specification {

  @Shared
    service = new StreamSortedServiceImpl()

  def "making unit test of method sortedNatural, sending a List<String> and returning a ordered list with #_stringList"() {
    given:
    List<String> stringList = _stringList
    List<String> response
    when:
    response = service.sortedNatural stringList
    then:
    response == _response
    where:
    _stringList                                             | _response
    ['one', 'two', 'three', 'four', 'five', 'six', 'seven'] | ['five', 'four', 'one', 'seven', 'six', 'three', 'two']

  }

  def "making unit test using stream().sorted(Comparator.reverseOrder()) with #_stringList"() {
    given:
    List<String> stringList = _stringList
    List<String> response
    when:
    response = service.sortedWithReverseOrder stringList
    then:
    response == _response
    where:
    _stringList                                             | _response
    ['one', 'two', 'three', 'four', 'five', 'six', 'seven'] | ['two', 'three', 'six', 'seven', 'one', 'four', 'five']
  }

  def "making unit test sorted a list of Person with .sorted(Comparator.comparing(Person::getUsername)) with #_personList"() {
    given:
    List<Person> personList = [new Person('Julio', 'j.ramirez008', 36),
                               new Person('Gilberto', 'g.reyes008', 36),
                               new Person('Joel', 'jj.gonzalez', 32)]
    List<Person> response
    when:
    response = service.sortedPersonByUsername personList
    then:
    response == personList.sort { it.username }

  }

}
