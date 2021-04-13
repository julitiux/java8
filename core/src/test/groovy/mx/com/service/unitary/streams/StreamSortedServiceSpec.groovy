package mx.com.service.unitary.streams

import mx.com.streams.services.StreamSortedServiceImpl
import spock.lang.Shared
import spock.lang.Specification

class StreamSortedServiceSpec extends Specification {

  @Shared
    service = new StreamSortedServiceImpl()

  def ""() {
    given:
    List<String> stringList = ['one', 'two', 'three', 'four', 'five', 'six', 'seven']
    List<String> response
    when:
    response = service.sortedNatural stringList
    then:
    println response

  }

}
