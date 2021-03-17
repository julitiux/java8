package mx.com.service.unitary.streams

import mx.com.streams.services.MapServiceImpl
import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class MapServiceSpec extends Specification {

  @Shared
    service = new MapServiceImpl()

  def "UNIT TEST OF METHOD STRINGTOUPPERCASE #_stringList"() {
    given:
    List<String> stringList = _stringList
    List<String> response = []
    when:
    response = service.stringToUpperCase(stringList)
    then:
    response == _response
    where:
    _stringList                               | _response
    []                                        | []
    ['uno', 'dos', 'tres', 'cuatro', 'cinco'] | ['UNO', 'DOS', 'TRES', 'CUATRO', 'CINCO']
    ['UPPERCASE']                             | ['UPPERCASE']
  }

}
