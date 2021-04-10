package mx.com.service.unitary.streams

import mx.com.streams.services.FileServiceImpl
import spock.lang.Shared
import spock.lang.Specification

class FileServiceSpec extends Specification {

  @Shared
  service = new FileServiceImpl();

  def ""() {
    expect:
    service.readFileLineByLine()
  }

}
