package mx.com.service.unitary.streams

import mx.com.iterate.services.StreamIterateServiceImpl
import spock.lang.Shared
import spock.lang.Specification

class StreamIterateServiceSpec extends Specification {

  @Shared
    service = new StreamIterateServiceImpl()

  def ""() {
    given:
    Integer limit = 9
    expect:
    service.stream_0_9(limit)
  }

}
