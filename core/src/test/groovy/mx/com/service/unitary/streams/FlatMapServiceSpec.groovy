package mx.com.service.unitary.streams

import mx.com.flatMap.services.FlatMapServiceImpl
import spock.lang.Shared
import spock.lang.Specification

class FlatMapServiceSpec extends Specification {

  @Shared
    service = new FlatMapServiceImpl()

  def ""() {
    given:
    List stringListList = [[1], [2, 3, 4], [5, 6, 7], [8, 9]]
    List response = []
    when:
    response = service.convertListStringStringToListString(stringListList)
    then:
    println response

  }

}
