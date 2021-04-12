package mx.com.service.unitary.streams


import mx.com.streams.services.StreamToArrayServiceImpl
import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class StreamToArrayServiceSpec extends Specification {

  @Shared
    service = new StreamToArrayServiceImpl()

  def ""() {
    given:
    String string = "this is a important test"
    String[] response
    when:
    response = service.convertStringToArray(string)
    then:
    response.each {println it}
  }

}
