package mx.com.streams.domain;

import java.math.BigDecimal;

public class Staff {
  String name;
  Integer age;
  BigDecimal salary;

  public Staff(String name, Integer age, BigDecimal salary) {
    this.name = name;
    this.age = age;
    this.salary = salary;
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

  public BigDecimal getSalary() {
    return salary;
  }

  public void setSalary(BigDecimal salary) {
    this.salary = salary;
  }
}
