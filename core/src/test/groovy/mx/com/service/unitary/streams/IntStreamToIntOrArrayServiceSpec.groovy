package mx.com.service.unitary.streams

import mx.com.streams.services.IntStreamToIntOrArrayServiceImpl
import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class IntStreamToIntOrArrayServiceSpec extends Specification {

  @Shared
    service = new IntStreamToIntOrArrayServiceImpl()

  def "making unit test of the method getFirstElementOfArray and using elements like Arrays.stream and findFirst with #_ints"() {
    given:
    int[] ints = _ints
    int response
    when:
    response = service.getFirstElementOfArray(ints)
    then:
    response == _response
    where:
    _ints                                       | _response
    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0) | 1
    Arrays.asList(0)                            | 0
    Arrays.asList(10000)                        | 10000

  }

  def "making unit test of the method getAnyElementOfArray and using elements like Arrays.stream and findAny with #_ints"() {
    given:
    int[] ints = _ints
    int response
    when:
    response = service.getAnyElementOfArray(ints)
    then:
    response >= _response
    where:
    _ints                                       | _response
    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0) | 2
    Arrays.asList(0)                            | 0
    Arrays.asList(10000)                        | 5000

  }

  def "making unit test using just Arrays.stream with values like #_integers"() {
    given:
    Integer[] integers = _integers
    Integer[] response
    when:
    response = service.convertArrayIntToArrayInteger integers
    then:
    response == _response
    where:
    _integers                                | _response
    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9) | Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9)
  }

}
