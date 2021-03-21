package mx.com.service.unitary.streams

import mx.com.iterate.services.StreamIterateServiceImpl
import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class StreamIterateServiceSpec extends Specification {

  @Shared
    service = new StreamIterateServiceImpl()

  def "testing the method stream_0_9 with #_limit"() {
    given:
    Integer limit = _limit
    expect:
    service.stream_0_9(limit)
    where:
    _limit << [0, 1, 9, 1000]
  }

}
