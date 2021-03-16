package mx.com.service.unitary.streams


import mx.com.streams.services.MapServiceImpl
import spock.lang.Shared
import spock.lang.Specification

class MapServiceSpec extends Specification {

  @Shared
    service = new MapServiceImpl()

  def ""() {
    given:
    List<String> stringList = ['uno', 'dos', 'tres', 'cuatro', 'cinco']
    List<String> response = []
    when:
    response = service.stringToUpperCase(stringList)
    then:
    response == stringList.collect { it.toUpperCase() }
  }

}
