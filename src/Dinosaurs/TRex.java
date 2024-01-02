package Dinosaurs;

// Conceito de Herança: TRex é uma classe Filha de Dino 
public class TRex extends Dino {

    public TRex() {
        super.type = "T-rex";
        super.name = "jow";
        super.color = "Red";
        super.height = 12.0; //metros
        super.weight = 8.0; //toneladas
    }
    /**
     * @param name :: Novo nome do dinossauro instanciado
     * Agora a classe TRex Herda todos os objetos e funcoes de sua classe Pai
     * Dessa forma, para acessarmos um objeto da classe Pai (name) temos que indicar
     */
    public void setNewName(String name) {
        super.name = name;
    }

    /**
     * Utilizamos a notação  @Override para sobrescrever funções que foram inicialmente 
     * criadas na classe pai (no caso, a função roar é uma função de Dino)
     * Assim, como o dino é um T-Rex, achei interessante representar o rugido 
     * forte dele :) 
     */
    @Override
    public void roar() {
        System.out.println("RAAAAWR | -2 Energy Point");
        this.energy -= 2;
    }

    public void setEatingType() {
        super.setEatingType(true);
    }
}
