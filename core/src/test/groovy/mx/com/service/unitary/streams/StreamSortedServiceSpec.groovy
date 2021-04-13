package mx.com.service.unitary.streams

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

  def""(){
    given:
    List<String> stringList = ['one', 'two', 'three', 'four', 'five', 'six', 'seven']
    List<String> response
    when:
    response = service.sortedWithReverseOrder stringList
    then:
    println response
  }

}
