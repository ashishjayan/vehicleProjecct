package classes;

public class Car extends Vehicle {

public Car(String name, int HP, int num)
{
    super.setHP(HP);
    super.setVehicle(name);
    super.setWheels(num);
}
    @Override
    public void addMods(int power) {
        if(super.getHP()<1000)
        {
            super.setHP(super.getHP()+50);
        }
        else
            System.out.println("The Vehicle already has more than 1000 horsepower." +
                    "We dont add any more HP due to state laws. Go add a flame sticker it adds 5HP");
    }

    @Override
    public void removeMods(int power) {
        if(super.getHP()>150){
            super.setHP(super.getHP()-50);
        }
        else
            System.out.println("The lowest HP is 100 per state laws. We cant reduce anymore HP");
    }

}
