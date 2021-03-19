package mx.com.service.unitary.streams

import mx.com.parallel.services.ParallelServiceImpl
import spock.lang.Shared
import spock.lang.Specification

import java.util.stream.IntStream

class ParallelServiceSpec extends Specification {

  @Shared
    service = new ParallelServiceImpl()

  def ""() {
    given:
    IntStream intStream = IntStream.rangeClosed(1, 10);
    when:
    service.justPrintARangeNumberParallelOrNot(intStream)
    then:
    true
  }
}
