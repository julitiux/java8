package mx.com.service.unitary.streams

import mx.com.streams.services.FileServiceImpl
import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class FileServiceSpec extends Specification {

  @Shared
    service = new FileServiceImpl();

  def "making unit test with Stream where filename #_filename"() {
    given:
    String filename = _filename
    expect:
    service.readFileLineByLine(filename)
    where:
    _filename << ["src/main/resources/Files/lines.txt"]
  }

}
