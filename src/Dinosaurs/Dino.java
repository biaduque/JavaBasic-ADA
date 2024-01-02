package Dinosaurs;

public class Dino {
    
    // Definidas como publicas (public) para poderem ser alteradas na main
    // Atributos
    public String type; 
    public String name;
    public String color; 
    public double height; 
    public double weight;
    public boolean isCarnivore;

    Integer health = 0;
    Integer energy = 10;
    String humor;

    // Metodos 
    // sao as acoes que contemplam nosso objeto

    /**
     * Ação de comer
     * Acrescenta + 1 ponto de saúde (health)
     */
    public void eat() {
        health += 1;
        System.out.println("Hummmmm | +1 Health Point");
    }

    /**
     * Rugido do seu dino :)
     * Acrescenta -1 ponto de energia (energy)
     */
    public void roar() {
        energy -=1;
        System.out.println("Raaaawr | -1 Energy Point");
    }

    //
    /**
     *  Metodos que retornam sao utilizados para acessar
     *  valores de dentro do objeto
     * @return :: retorna o humor do dinossauro de acordo com 
     * o valor de sua fome (hungry) e sua energia (energy)
     */
    public String getHumor() {
        if (health + energy >= 10) {
            humor = "Happy";
        }
        else {
            humor = "Angry";
        }
        return humor;
    }

    public void setEatingType(Boolean isCarnivore) {
        this.isCarnivore = isCarnivore ;
    }
}
