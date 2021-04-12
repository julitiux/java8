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

  def "making unit test using Arrays.stream, map, boxed and toArray with the array #_integers"() {
    given:
    int[] integers = _integers
    Integer[] response
    when:
    response = service.convertArrayIntToArrayInteger(integers)
    then:
    response.equals _response
    where:
    _integers          | _response
    [1, 2, 3, 4, 5, 6] | [2, 4, 6, 8, 10, 12]
  }

  def "making unit test of the method convertStreamToArrayInt using IntStream.rangeClosed with #_startRange #_endRange"() {
    given:
    Integer startRange = _startRange
    Integer endRange = _endRange
    Integer[] response
    when:
    response = service.convertStreamToArrayInt(startRange, endRange)
    then:
    response.equals _response
    where:
    _startRange | _endRange | _response
    0           | 10        | [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

  }

}
