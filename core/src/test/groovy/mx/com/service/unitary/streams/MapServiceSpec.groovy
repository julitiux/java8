package mx.com.service.unitary.streams

import mx.com.streams.domain.Staff
import mx.com.streams.domain.StaffPublic
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


  def "Implement a convert in a map with Function java"() {
    given:
    List<Staff> staffList = _staffList
    List<StaffPublic> response = []
    when:
    response = service.staffListToStaffPublicList(staffList)
    then:
    response*.name == _response*.name
    where:
    _staffList                       | _response
    [new Staff('Julio', 36, 10000.0),
     new Staff('Gils', 36, 11000.0),
     new Staff('Gaio', 32, 12000.0)] | [new StaffPublic('Julio', 36, '10000'),
                                        new StaffPublic('Gils', 36, '11000'),
                                        new StaffPublic('Gaio', 32, '12000')]
  }

}
