package mx.com.service.unitary.streams

import mx.com.parallel.services.ParallelServiceImpl
import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

import java.util.stream.IntStream
import java.util.stream.Stream

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

  def "unit testing using with parallel strean or not"() {
    given:
    Stream stream = _stream
    expect:
    service.usingParallelStrem(stream)
    where:
    _stream << [['1', '2', '3', '4', '5', '6', '7', '8', '9', '0'].stream(),
                ['1', '2', '3', '4', '5', '6', '7', '8', '9', '0'].parallelStream()]
  }


}
