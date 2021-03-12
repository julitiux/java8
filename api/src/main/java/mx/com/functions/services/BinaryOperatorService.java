package mx.com.functions.services;

import mx.com.functions.domain.Developer;

import java.util.List;

public interface BinaryOperatorService {
  public Integer addTwoNumbers(Integer firstNumber, Integer secondNumber);
  public Developer findMaxSalary(List<Developer> list);
}
