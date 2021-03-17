package mx.com.streams.services;

import mx.com.streams.domain.Staff;
import mx.com.streams.domain.StaffPublic;

import java.util.List;

public interface MapService {
  public List<String> stringToUpperCase(List<String> list);
  public List<String> objectToString(List<Staff> staffList);
  public List<StaffPublic> staffListToStaffPublicList(List<Staff> staffList);
}
