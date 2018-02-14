package classes;

public abstract class Vehicle {

    private String vehicle;
    private int wheels;
    private int HP;

    public abstract void addMods(int power);
    public abstract void removeMods(int power);


  public String getVehicle(){
      return vehicle;
  }
  public int getWheels(){
      return  wheels;
  }
  public int getHP(){
      return HP;
  }
  public void setVehicle(String name)
  {
      vehicle=name;
  }
  public void setHP(int amount){
      HP=amount;
  }

    @Override
    public String toString() {
      return "The Vehicle is a"+this.vehicle +" and it has "+this.wheels+" wheels, This Vehicle has a measure Horsepower of "+this.HP+".";
    }


    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
}
