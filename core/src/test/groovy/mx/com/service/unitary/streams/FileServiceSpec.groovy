package mx.com.service.unitary.streams

import mx.com.streams.services.FileServiceImpl
import spock.lang.Shared
import spock.lang.Specification

class FileServiceSpec extends Specification {

  @Shared
    service = new FileServiceImpl();

  def ""() {
    given:
    String filename = "src/main/resources/Files/lines.txt"
    expect:
    service.readFileLineByLine(filename)
  }

}
