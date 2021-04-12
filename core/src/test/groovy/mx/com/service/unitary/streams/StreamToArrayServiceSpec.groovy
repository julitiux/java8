package mx.com.service.unitary.streams


import mx.com.streams.services.StreamToArrayServiceImpl
import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class StreamToArrayServiceSpec extends Specification {

  @Shared
    service = new StreamToArrayServiceImpl()

  def "making a unit test using Arrray.Stream(string.split('\\\\s+')), just for transform a String to Array"() {
    given:
    String string = _string
    String[] response
    when:
    response = service.convertStringToArray(string)
    then:
    response.equals _response
    where:
    _string                    | _response
    "this is a important test" | Arrays.asList("this", "is", "a", "important", "test")
    "null"                     | Arrays.asList("null")
//    ""                         | [] THIS ELEMENT GET ANOTHER TYPE OF ELEMENT NULL
  }

  def ""() {
    given:
    int[] integers = [1, 2, 3, 4, 5, 6]
    Integer[] response
    when:
    response = service.convertArrayIntToArrayInteger(integers)
    then:
    println response

  }

}
