package mx.com.service.unitary.streams

import mx.com.streams.services.ConvertStreamToList
import mx.com.streams.services.ConvertStreamToListImpl
import spock.lang.Shared
import spock.lang.Specification

import java.util.stream.Stream

class ConvertStreamToListSpec extends Specification{

  @Shared
  service = new ConvertStreamToListImpl()


  def""(){
    given:
    Stream<String> stream = Stream.of("one", "two", "three", "four")
    List<String> response = []
    when:
    response = service.convertStreamToList(stream)
    then:
    println response
  }

}
