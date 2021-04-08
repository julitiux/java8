package mx.com.service.unitary.streams

import mx.com.streams.services.StreamReduceServiceImpl
import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class StreamReduceServiceSpec extends Specification {

  @Shared
    service = new StreamReduceServiceImpl()

  def "making a unit test of Stream.reduce with a reference method Integer::sum #_integerList"() {
    given:
    List<Integer> integerList = _integerList
    Integer response
    when:
    response = service.reduceAListWithAdd integerList
    then:
    response.equals(_response)
    where:
    _integerList                   | _response
    []                             | 0
    [1, 2, 3, 4, 5, 6, 7, 8, 9, 0] | 45
  }

  def "making a unit test of Stream.reduce with a lambda 0, (a, b) -> a * b #_integerList"() {
    given:
    List<Integer> integerList = _integerList
    Integer response
    when:
    //The function multiply dont work cos, the lambda start with 0
    response = service.reduceAListWithMultiply integerList
    then:
    response.equals(_response)
    where:
    _integerList                | _response
    []                          | 0
    [1, 2, 3, 4, 5, 6, 7, 8, 9] | 0
  }

  def "making a unit test of Stream.reduce with a lambda 0, (a, b) -> a / b #_integerList"() {
    given:
    List<Integer> integerList = [1, 2, 3, 4, 5, 6, 7, 8, 9]
    Integer response
    when:
    //The function multiply dont work cos, the lambda start with 0
    response = service.reduceAListWithDivide integerList
    then:
    response.equals(_response)
    where:
    _integerList                | _response
    []                          | 0
    [1, 2, 3, 4, 5, 6, 7, 8, 9] | 0
  }

}
