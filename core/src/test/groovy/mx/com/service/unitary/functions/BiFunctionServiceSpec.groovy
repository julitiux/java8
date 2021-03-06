package mx.com.service.unitary.functions

import mx.com.functions.domain.Gps
import mx.com.functions.services.BiFunctionServiceImpl
import spock.lang.Shared
import spock.lang.Specification

class BiFunctionServiceSpec extends Specification {

  @Shared
    service = new BiFunctionServiceImpl()

  def "Add with a BiFunction"() {
    given:
    Integer firstNumber = _firstNumber
    Integer secondNumber = _secondNumber
    Integer response
    when:
    response = service.add(firstNumber, secondNumber)
    then:
    response == _response
    where:
    _firstNumber | _secondNumber | _response
    1            | 2             | 3
    1000         | 500           | 1500
  }

  def "Pow with a BiFunction"() {
    given:
    Integer firstNumber = _firstNumber
    Integer secondNumber = _secondNumber
    Double response
    when:
    response = service.pow(firstNumber, secondNumber)
    then:
    response == _response
    where:
    _firstNumber | _secondNumber | _response
    1            | 2             | 1
    1000         | 5             | 1.0E15
    1000         | 50            | 1.0E150
  }

  def "sum a pair number and convert a list of one number"() {
    given:
    Integer firstNumber = _firstNumber
    Integer secondNumber = _secondNumber
    List<String> response = []
    when:
    response = service.addNumbersAndTurnAList(firstNumber, secondNumber)
    then:
    response == _response
    where:
    _firstNumber | _secondNumber | _response
    1            | 2             | ['3']
    1000         | 5             | ['1005']
    1000         | 50            | ['1050']
  }

  def "Pow and then turn to String  usgin a BiFunction with a Function"() {
    given:
    Integer firstNumber = _firstNumber
    Integer secondNumber = _secondNumber
    String response
    when:
    response = service.powAndTurnString(firstNumber, secondNumber)
    then:
    response == _response
    where:
    _firstNumber | _secondNumber | _response
    1            | 2             | '1.0'
    1000         | 5             | '1.0E15'
    1000         | 50            | '1.0E150'
  }


  def "pow To String usgin a BiFunction with a Function like parameters"() {
    given:
    Integer firstNumber = _firstNumber
    Integer secondNumber = _secondNumber
    String response
    when:
    response = service.powToString(firstNumber, secondNumber)
    then:
    response == _response
    where:
    _firstNumber | _secondNumber | _response
    1            | 2             | '1.0'
    1000         | 5             | '1.0E15'
    1000         | 50            | '1.0E150'
  }


  def "Generate a new Gps with BiFunction"() {
    given:
    String firstString = _firstString
    String secondString = _secondString
    def response
    when:
    response = service.newGps(firstString, secondString)
    then:
    response instanceof Gps
    where:
    _firstString | _secondString
    "40.741895"  | "-73.989308"
    "40.741895"  | "-73.989308"

  }


}
