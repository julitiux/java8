package mx.com.service.unitary.streams

import mx.com.streamCollect.services.StreamCollectServiceImpl
import mx.com.streams.domain.Item
import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class StreamCollectServiceSpec extends Specification {

  @Shared
    service = new StreamCollectServiceImpl()


  def "making groupBy test from java8 with a list #_stringList and #_response"() {
    given:
    List<String> stringList = _stringList
    Map response = [:]
    when:
    response = service.usingGroupBy(stringList)
    then:
    response.equals(_response)
    where:
    _stringList                                                                           | _response
    ['uno', 'dos', 'dos', 'tres', 'tres', 'tres', 'cuatro', 'cuatro', 'cuatro', 'cuatro'] | [uno: 1, dos: 2, tres: 3, cuatro: 4]
    ['uno', 'dos', 'tres', 'cuatro']                                                      | [uno: 1, dos: 1, tres: 1, cuatro: 1]
  }


  def ""() {
    given:
    List<String> stringList = ['uno', 'dos', 'dos', 'tres', 'tres', 'tres', 'cuatro', 'cuatro', 'cuatro', 'cuatro']
    Map responseSorted = [:]
    when:
    responseSorted = service.usingGroupByAndOrderByValue(stringList)
    then:
    responseSorted == responseSorted.sort { a, b -> a.value <=> b.value }
  }


  def "test a groupBy with Java8"() {
    given:
    List<Item> itemList = _itemList
    Map response = [:]
    when:
    response = service.countTheKeyByRepeatInList(itemList)
    then:
    response == _itemList.groupBy { it.name }.collectEntries {
      k, v ->
        [(k): v*.qty.sum()]
    }
    where:
    _itemList << [
      [
        new Item("apple", 10, new BigDecimal("9.99")),
        new Item("banana", 20, new BigDecimal("19.99")),
        new Item("orang", 10, new BigDecimal("29.99")),
        new Item("watermelon", 10, new BigDecimal("29.99")),
        new Item("papaya", 20, new BigDecimal("9.99")),
        new Item("apple", 10, new BigDecimal("9.99")),
        new Item("banana", 10, new BigDecimal("19.99")),
        new Item("apple", 20, new BigDecimal("9.99"))
      ]
    ]


  }

}
