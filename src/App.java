import java.util.Scanner;

import Dinosaurs.Dino;
import Dinosaurs.TRex;
import Dinosaurs.Triceratops;
import Environment.Forest;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Dino!");

        // Criando os dinossauros 
        TRex dinossaur = new TRex(); 
        Triceratops dinoTriz = new Triceratops();

        Dino dinos[] = {dinossaur, dinoTriz}; 

        // Testando o acesso a variavel name do objeto dinossauro
        print("Set a new name for your dino: ");
        Scanner inputUser = new Scanner(System.in);
        String newName = inputUser.nextLine();
        dinossaur.setNewName(newName);

        for (int i = 0 ; i < dinos.length ; i++) {

            // Testando ações do dinossauro criado
            print("\nDino Actions!");
            dinos[i].eat();
            dinos[i].roar();

            // infos do T-rex
            print("\nDino infos:");
            printDinoInfos(dinos[i]);
            print("\nYour dino humor is: " + dinos[i].getHumor());

        }
      
        // Criando a floresta e populando 
        Forest forest = new Forest(); 
        forest.addDino(dinossaur); // tipo TRex
        forest.addDino(dinoTriz); // Tipo Trisceratops

        print("Your forest population is:");
        forest.printForestPopulation();

        print("Number of dinos in World" + Integer.toString(forest.getNumberOfAllDinos()));
    }

    public static void printDinoInfos(Dino dinosaur) {
        print("Name: " + dinosaur.name);
        print("Color: " + dinosaur.color);
        print("Height: " + Double.toString(dinosaur.height) + " meters");
        print("Weight: " + Double.toString(dinosaur.weight) + " tonnes");
    }

    public static void print(String info) {
        System.out.println(info);
    }
}
