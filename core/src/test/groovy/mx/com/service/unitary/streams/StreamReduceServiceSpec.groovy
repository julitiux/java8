package mx.com.service.unitary.streams


import mx.com.streams.services.StreamReduceServiceImpl
import spock.lang.Shared
import spock.lang.Specification

class StreamReduceServiceSpec extends Specification {

  @Shared
    service = new StreamReduceServiceImpl()

  def ""() {
    given:
    List<Integer> integerList = [1, 2, 3, 4, 5, 6, 7, 8, 9, 0]
    Integer response
    when:
    response = service.reduceAListWithAdd integerList
    then:
    response
    println response
  }

}
