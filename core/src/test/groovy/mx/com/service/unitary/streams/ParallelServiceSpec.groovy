package mx.com.service.unitary.streams

import mx.com.parallel.services.ParallelServiceImpl
import spock.lang.Shared
import spock.lang.Specification

import java.util.stream.IntStream

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

}
