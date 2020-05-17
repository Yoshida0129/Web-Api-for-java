package Interfaces.UseCases;

import Entities.User;

public interface IUserRepository {
  public static void saveUser(User user){};
  public static void removeUser(User user){};
  public static User find(String name){return new User(getMaxId(), name);};
  public static int getMaxId(){return 1;};
}
