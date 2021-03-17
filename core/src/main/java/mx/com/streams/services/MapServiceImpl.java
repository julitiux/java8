package mx.com.streams.services;

import mx.com.streams.domain.Staff;

import java.util.List;
import java.util.stream.Collectors;

public class MapServiceImpl implements MapService {

  @Override
  public List<String> stringToUpperCase(List<String> list) {
    return list.stream().map(it -> it.toUpperCase()).collect(Collectors.toList());
  }

  @Override
  public List<String> objectToString(List<Staff> staffList) {
    return staffList.stream().map(it -> it.getName()).collect(Collectors.toList());
  }

}
