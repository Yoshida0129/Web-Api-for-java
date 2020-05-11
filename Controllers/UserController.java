package Controllers;

import UseCases.UserInputData;
import UseCases.UseCaseInteractor;

public class UserController {
  private UseCaseInteractor usecase = new UseCaseInteractor();

  public void createUser(String name){
    UserInputData inputData = new UserInputData(name);
    this.usecase.handle(inputData.getUserName());
  }
}