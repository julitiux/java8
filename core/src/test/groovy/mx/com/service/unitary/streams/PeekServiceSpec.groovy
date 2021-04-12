package mx.com.service.unitary.streams


import mx.com.streams.services.PeekServiceImpl
import spock.lang.Shared
import spock.lang.Specification

class PeekServiceSpec extends Specification {

  @Shared
    service = new PeekServiceImpl()

  def "making unit test using peek. Peek dont work with count. This test should be show a count of elements of an array"() {
    given:
    List<String> stringList = ['one', 'two', 'three', 'four', 'five']
    expect:
    service.testPeekFirst(stringList)

  }

}
