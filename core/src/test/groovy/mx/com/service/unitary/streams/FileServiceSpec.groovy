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

  def "making unit test using Stream and send a filter startWith with the file #_filename"() {
    given:
    String filename = _filename
    String startWith = 'lin'
    expect:
    service.readFileLineByLineFilterLines(filename, startWith)
    where:
    _filename << ["src/main/resources/Files/lines.txt"]
  }

  def "making unit test for readBufferedReaderAndScanner method, this method use the Buffered And Scanner and print the line with the file #_filename"() {
    given:
    String filename = _filename
    expect:
    service.readBufferedReaderAndScanner(filename)
    where:
    _filename << ["src/main/resources/Files/lines.txt"]
  }

  def "making unit test using just Scanner and the name of file #_filename"() {
    given:
    String filename = _filename
    expect:
    service.readScanner(filename)
    where:
    _filename << ["src/main/resources/Files/lines.txt"]

  }

}
