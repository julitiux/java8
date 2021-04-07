package mx.com.service.unitary.streams


import mx.com.streams.services.FilterAValueNullServiceImpl
import spock.lang.Shared
import spock.lang.Specification

class FilterAValueNullServiceSpec extends Specification {

  @Shared
    service = new FilterAValueNullServiceImpl()

  def ""() {
    given:
    List<String> stringList = _stringList
    List<String> response = []
    when:
    response = service.filterValueNullInAList(stringList)
    then:
    response == _response
    where:
    _stringList                                               | _response
    ['one', 'two', 'three', 'four', 'five']                   | ['one', 'two', 'three', 'four', 'five']
    [null, 'one', 'two', null, 'three', 'four', 'five', null] | ['one', 'two', 'three', 'four', 'five']

  }

}
