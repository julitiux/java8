package mx.com.streams.services;

import mx.com.streams.domain.Travel;
import mx.com.streams.domain.User;

import java.util.List;

public interface FlatMapService {
  public List<String> convertListStringStringToListString(List<List<String>> stringListList);
  public List<Travel> getTravelListByUserList(List<User> userList);
}
