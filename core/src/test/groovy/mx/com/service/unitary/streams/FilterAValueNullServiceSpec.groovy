package mx.com.service.unitary.streams


import mx.com.streams.services.FilterAValueNullServiceImpl
import spock.lang.Shared
import spock.lang.Specification

class FilterAValueNullServiceSpec extends Specification {

  @Shared
    service = new FilterAValueNullServiceImpl()

  def ""() {
    given:
    List<String> stringList = ['one', 'two', 'three', 'four', 'five']
    List<String> response = []
    when:
    response = service.filterValueNullInAList(stringList)
    then:
    println response
  }

}
