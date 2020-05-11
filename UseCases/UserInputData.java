package UseCases;

public class UserInputData {
  private final String userName;

  public UserInputData(String name) {
    this.userName = name;
  }

  public String getUserName(){
    return this.userName;
  }
}