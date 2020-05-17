package UseCases;

import Entities.User;

public class UserOutputData {
  private final User user;

  public UserOutputData(User user){
    this.user = user;
  }

  public void handle(){
    System.out.println(this.user.getUserId());
    System.out.println(this.user.getUserName());
  }
}