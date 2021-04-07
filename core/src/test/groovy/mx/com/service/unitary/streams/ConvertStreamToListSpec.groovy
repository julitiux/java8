package mx.com.service.unitary.streams


import mx.com.streams.services.ConvertStreamToListImpl
import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

import java.util.stream.Stream

@Unroll
class ConvertStreamToListSpec extends Specification {

  @Shared
    service = new ConvertStreamToListImpl()

  def ""() {
    given:
    Stream<String> stream = _stream
    List<String> response = []
    when:
    response = service.convertStreamToList(stream)
    then:
    response.equals(_response)
    where:
    _stream                                        | _response
    Stream.of()                                    | []
    Stream.of(null)                                | [null]
    Stream.of("one", "two", "three", "four")       | ["one", "two", "three", "four"]
    Stream.of("one", "two", "three", "four", null) | ["one", "two", "three", "four", null]
  }

}
