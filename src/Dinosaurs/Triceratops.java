package Dinosaurs;

public class Triceratops  extends Dino {

    public Triceratops() {
        super.type = "Triceratops";
        super.name = "triz";
        super.color = "Pink";
        super.height = 7.0; //metros
        super.weight = 6.0; //toneladas
    }
    public void setNewName(String name) {
        super.name = name;
    }
    public void setEatingType() {
        super.setEatingType(false);
       }
}
