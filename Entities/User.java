package Entities;

public class User {
  private final int id;
  private final String name;

  public User(int id, String name){
    this.id = id;
    this.name = name;
  }

  public int getUserId(){
    return this.id;
  }

  public String getUserName(){
    return this.name;
  }
}