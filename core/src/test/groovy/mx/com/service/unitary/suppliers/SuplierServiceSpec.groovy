package mx.com.service.unitary.suppliers

import mx.com.suppliers.services.SuplierServiceImpl
import spock.lang.Shared
import spock.lang.Specification

class SuplierServiceSpec extends Specification {

  @Shared
    service = new SuplierServiceImpl()

  def "Implement a unit test using a Supplier. the Supplier dont sent data and just give something"() {
    expect:
    service.nowDateFormat()
  }

}
