package mx.com.service.unitary.streams

import mx.com.streams.domain.Invoice
import mx.com.streams.services.StreamReduceServiceImpl
import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class StreamReduceServiceSpec extends Specification {

  @Shared
    service = new StreamReduceServiceImpl()

  def "making a unit test of Stream.reduce with a reference method Integer::sum #_integerList"() {
    given:
    List<Integer> integerList = _integerList
    Integer response
    when:
    response = service.reduceAListWithAdd integerList
    then:
    response.equals(_response)
    where:
    _integerList                   | _response
    []                             | 0
    [1, 2, 3, 4, 5, 6, 7, 8, 9, 0] | 45
  }

  def "making a unit test of Stream.reduce with a lambda 0, (a, b) -> a * b #_integerList"() {
    given:
    List<Integer> integerList = _integerList
    Integer response
    when:
    //The function multiply dont work cos, the lambda start with 0
    response = service.reduceAListWithMultiply integerList
    then:
    response.equals(_response)
    where:
    _integerList                | _response
    []                          | 0
    [1, 2, 3, 4, 5, 6, 7, 8, 9] | 0
  }

  def "making a unit test of Stream.reduce with a lambda 0, (a, b) -> a / b #_integerList"() {
    given:
    List<Integer> integerList = [1, 2, 3, 4, 5, 6, 7, 8, 9]
    Integer response
    when:
    //The function multiply dont work cos, the lambda start with 0
    response = service.reduceAListWithDivide integerList
    then:
    response.equals(_response)
    where:
    _integerList                | _response
    []                          | 0
    [1, 2, 3, 4, 5, 6, 7, 8, 9] | 0
  }

  def "making a unit test of Stream.reduce with a lambda 0, (a, b) -> a - b #_integerList"() {
    given:
    List<Integer> integerList = _integerList
    Integer response
    when:
    response = service.reduceAListWithRest integerList
    then:
    response == _response
    where:
    _integerList                | _response
    []                          | 0
    [1, 2, 3, 4, 5, 6, 7, 8, 9] | -45
  }

  def "making a unit test of Stream.reduce with method reference 0, Integer::max #_integerList"() {
    given:
    List<Integer> integerList = _integerList
    Integer response
    when:
    response = service.reduceAListWithMax integerList
    then:
    response == _response
    where:
    _integerList                | _response
    []                          | 0
    [1, 2, 3, 4, 5, 6, 7, 8, 9] | 9
  }

  def "making a unit test of Stream.reduce with method reference 0, Integer::min #_integerList"() {
    given:
    List<Integer> integerList = _integerList
    Integer response
    when:
    response = service.reduceAListWithMin integerList
    then:
    response == _response
    where:
    _integerList                   | _response
    []                             | 0
    [1, 2, 3, 4, 5, 6, 7, 8, 9, 0] | 0
  }

  def "making a unit test of Stream.reduce with almbda \"\", (a, b) -> a + \"|\" + b #_integerList"() {
    given:
    List<String> stringList = _stringList
    String response
    when:
    response = service.joinStringWithAPipe stringList
    then:
    println response
    response == _response
    where:
    _stringList                                             | _response
    []                                                      | ""
    ['one', 'two', 'three', 'four', 'five', 'six', 'seven'] | "|one|two|three|four|five|six|seven"
  }

  def "making a unit test of Stream.reduce with other almbda #_integerList"() {
    given:
    List<String> stringList = _stringList
    String response
    when:
    response = service.joinStringWithAPipeStartingWithoutPipe stringList
    then:
    response == _response
    where:
    _stringList                                             | _response
    []                                                      | ""
    ['one', 'two', 'three', 'four', 'five', 'six', 'seven'] | "one|two|three|four|five|six|seven"
  }

  def "making a unit test of Stream.reduce with reference method String::join #_integerList"() {
    given:
    List<String> stringList = ['one', 'two', 'three', 'four', 'five', 'six', 'seven']
    def response
    when:
    response = service.joinStringWithAPipeOtherOption stringList
    then:
    response
    //This is not the response that I want, response like a Stream
  }

  def "making unit test of Stream.reduce wit method map using #_invoiceList "() {
    given:
    List<Invoice> invoiceList = _invoiceList
    def response
    when:
    response = service.sumAllQuantityInvoices invoiceList
    then:
    response.equals(_respone)
    where:
    _invoiceList | _respone
    [
      new Invoice('INV-001', 100.00, 100.00),
      new Invoice('INV-002', 300.00, 300.00),
      new Invoice('INV-002', 400.00, 400.00)
    ]            | 800.00
  }

}
