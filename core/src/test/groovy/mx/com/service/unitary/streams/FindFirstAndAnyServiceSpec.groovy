package mx.com.service.unitary.streams

import mx.com.streams.services.FindFirstAndAnyService
import mx.com.streams.services.FindFirstAndAnyServiceImpl
import spock.lang.Shared
import spock.lang.Specification

class FindFirstAndAnyServiceSpec extends Specification{

  @Shared
  service = new FindFirstAndAnyServiceImpl()

  def""(){
    given:
    List<String> stringList = ['one', 'two', 'three', 'four', 'five']
    String response
    when:
    response = service.findAny(stringList)
    then:
    println response
  }

}
