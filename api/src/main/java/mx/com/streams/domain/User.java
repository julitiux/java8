package mx.com.streams.domain;

import java.util.List;

public class User {

  String username;
  List<Travel> travelList;

  public User(String username, List<Travel> travelList) {
    this.username = username;
    this.travelList = travelList;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public List<Travel> getTravelList() {
    return travelList;
  }

  public void setTravelList(List<Travel> travelList) {
    this.travelList = travelList;
  }
}
