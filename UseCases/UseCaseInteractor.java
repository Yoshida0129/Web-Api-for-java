package UseCases;

import Interfaces.UseCases.IInputBoundary;
import Interfaces.UseCases.IUserRepository;
import Entities.User;

public class UseCaseInteractor implements IInputBoundary {

  public void handle(String userName){
    User user = new User(IUserRepository.getMaxId(), userName);

    IUserRepository.saveUser(user);

    UserOutputData outputData = new UserOutputData(user);
    outputData.handle();
  };
}