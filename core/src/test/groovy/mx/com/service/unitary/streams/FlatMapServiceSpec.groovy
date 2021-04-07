package mx.com.service.unitary.streams

import mx.com.streams.services.FlatMapServiceImpl
import mx.com.streams.domain.Travel
import mx.com.streams.domain.User
import spock.lang.Shared
import spock.lang.Specification

class FlatMapServiceSpec extends Specification {

  @Shared
    service = new FlatMapServiceImpl()

  def "testing flatMap in java 8"() {
    given:
    List stringListList = [[1], [2, 3, 4], [5, 6, 7], [8, 9]]
    List response = []
    when:
    response = service.convertListStringStringToListString(stringListList)
    then:
    response == stringListList.flatten()
  }


  def ""() {
    given:
    List<Travel> firstTravelList = [new Travel("Mexico"),
                                    new Travel("USA"),
                                    new Travel("Francia"),
                                    new Travel("Japon")]
    List<Travel> secodTravelList = [new Travel("Londes"),
                                    new Travel("Buenos Aires"),
                                    new Travel("Mexico")]
    List<User> userList = [new User("j.ramirez", firstTravelList),
                           new User("g.reyes", secodTravelList)]
    List<Travel> response = []
    when:
    response = service.getTravelListByUserList(userList)
    then:
    response == userList*.travelList.flatten()
  }


}
