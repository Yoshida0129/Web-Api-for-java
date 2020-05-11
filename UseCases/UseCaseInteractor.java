package UseCases;

import Interfaces.UseCases.InputBoundary;

public class UseCaseInteractor implements InputBoundary {

  public void handle(String userName){
    int id = new java.util.Random().nextInt(20);
    Entities.User user = new Entities.User(id, userName);
    System.out.println(user.getUserId());
    System.out.println(user.getUserName());
  };
}