package mx.com.service.unitary.streams

import mx.com.streams.services.IntStreamToIntOrArrayServiceImpl
import spock.lang.Shared
import spock.lang.Specification

class IntStreamToIntOrArrayServiceSpec extends Specification {

  @Shared
    service = new IntStreamToIntOrArrayServiceImpl()

  def ""() {
    given:
    int[] ints = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
    int response
    when:
    response = service.getFirstElementOfArray(ints)
    then:
    println response
  }

}
