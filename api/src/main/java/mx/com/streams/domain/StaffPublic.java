package mx.com.streams.domain;

public class StaffPublic {
  String name;
  Integer age;
  String extra;

  public StaffPublic(String name, Integer age, String extra) {
    this.name = name;
    this.age = age;
    this.extra = extra;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public String getExtra() {
    return extra;
  }

  public void setExtra(String extra) {
    this.extra = extra;
  }
}
