package mx.com.service.unitary.streams

import mx.com.parallel.services.ParallelServiceImpl
import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

import java.util.stream.IntStream

@Unroll
class ParallelServiceSpec extends Specification {

  @Shared
    service = new ParallelServiceImpl()

  def "Print a range of integer sequencial"() {
    given:
    IntStream intStream = IntStream.rangeClosed(1, 10);
    expect:
    service.justPrintARangeNumberParallelOrNot(intStream)
  }

  def "Print a range of integer parallel"() {
    given:
    IntStream intStream = IntStream.rangeClosed(1, 10);
    expect:
    service.justPrintARangeNumberParallelOrNot(intStream.parallel())
  }

  def "unit test that return if using parallel or not #_intStream"() {
    given:
    IntStream intStream = _intStream
    Boolean response
    when:
    response = service.isParallelRunning(intStream)
    then:
    response == _response
    where:
    _intStream                              | _response
    IntStream.rangeClosed(1, 10)            | false
    IntStream.rangeClosed(1, 10).parallel() | true
  }


}
