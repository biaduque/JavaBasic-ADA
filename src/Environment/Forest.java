package Environment;

import Dinosaurs.Dino;
import Dinosaurs.TRex;
import Dinosaurs.Triceratops;

/*
 * Aqui temos uma classe Forest (Floresta) para representarmos o conceito 
 * de Polimorfismo 
 */
public class Forest {
    // A variavel estatica eh compartilhada entre todas as instancias da classe
    public static Integer numerOfDinosInWorld = 0; 
    Integer numberOfCarnivorous = 0; 
    Integer numberOfHerbivores = 0;


    /**
     * @param dino :: tipo de dinosasuro que sera adicionado 
     * O polimorfismo está presente em funcoes que possuem o mesmo nome,
     * mas que podem executar diferentes tipos de ações dependendo de sua 
     * construção
     */
    public void addDino(Dino dino) {
        if (dino.isCarnivore) {
            numberOfCarnivorous += 1;
        } else {
            numberOfHerbivores += 1;
        }
        numerOfDinosInWorld +=1 ;
    }

    public void addDino(TRex trexDino) {
        numberOfCarnivorous += 1;
        numerOfDinosInWorld +=1 ;
    }

    public void addDino(Triceratops trisDino) {
        numberOfHerbivores += 1; 
        numerOfDinosInWorld +=1 ;
    }

    public void printForestPopulation() {
        System.out.println("Number of carnivores: " + numberOfCarnivorous);
        System.out.println("Number of herbivores: " + numberOfHerbivores);

    }

    public Integer getNumberOfAllDinos() {
        return numerOfDinosInWorld;
    }
}
