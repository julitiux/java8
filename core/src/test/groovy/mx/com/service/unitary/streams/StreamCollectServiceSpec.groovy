package mx.com.service.unitary.streams

import mx.com.streamCollect.services.StreamCollectServiceImpl
import mx.com.streams.domain.Item
import spock.lang.Shared
import spock.lang.Specification

class StreamCollectServiceSpec extends Specification {

  @Shared
    service = new StreamCollectServiceImpl()

  def ""() {
    given:
    List<Item> itemList = [
      new Item("apple", 10, new BigDecimal("9.99")),
      new Item("banana", 20, new BigDecimal("19.99")),
      new Item("orang", 10, new BigDecimal("29.99")),
      new Item("watermelon", 10, new BigDecimal("29.99")),
      new Item("papaya", 20, new BigDecimal("9.99")),
      new Item("apple", 10, new BigDecimal("9.99")),
      new Item("banana", 10, new BigDecimal("19.99")),
      new Item("apple", 20, new BigDecimal("9.99"))
    ]
    Map response = [:]
    when:
    response = service.countTheKeyByRepeatInList(itemList)
    then:
    response == itemList.groupBy { it.name }.collectEntries {
      k, v ->
        [(k): v*.qty.sum()]
    }
  }

}
