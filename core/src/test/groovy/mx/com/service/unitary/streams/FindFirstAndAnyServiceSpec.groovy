package mx.com.service.unitary.streams

import mx.com.streams.services.FindFirstAndAnyServiceImpl
import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class FindFirstAndAnyServiceSpec extends Specification {

  @Shared
    service = new FindFirstAndAnyServiceImpl()

  def "making unit test of find any using #_stringList"() {
    given:
    List<String> stringList = _stringList
    String response
    when:
    response = service.findAny(stringList)
    then:
    response == _response
    where:
    _stringList                             | _response
    []                                      | 'No Value'
    ['just one value']                      | 'just one value'
    ['one', 'two', 'three', 'four', 'five'] | 'one'
    //The last one it could be no true
  }

  def "making unit test of find first using #_stringList"() {
    given:
    List<String> stringList = _stringList
    String response
    when:
    response = service.findFirst(stringList)
    then:
    response.equals(_response)
    where:
    _stringList                             | _response
    []                                      | 'No Value'
    ['first value']                         | 'first value'
    ['one', 'two', 'three', 'four', 'five'] | 'one'
  }


}
