package mx.com.streams.services;

import mx.com.streams.domain.Travel;
import mx.com.streams.domain.User;
import mx.com.streams.services.FlatMapService;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapServiceImpl implements FlatMapService {

  @Override
  public List<String> convertListStringStringToListString(List<List<String>> stringListList) {
    return stringListList.stream().flatMap(Collection::stream).collect(Collectors.toList());
  }

  @Override
  public List<Travel> getTravelListByUserList(List<User> userList) {
    return userList.stream().map(user -> user.getTravelList()).flatMap(travel -> travel.stream()).collect(Collectors.toList());
  }

}
