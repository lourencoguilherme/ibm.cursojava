package aula01.pokemon;

public class Pokemon implements ContratoPokemon {

    private String nome;
    private Integer nivel;

    public Pokemon() {
    }

    public Pokemon(String nome, Integer nivel) {
        this.nome = nome;
        this.nivel = nivel;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }


    @Override
    public void quemEEssoPokemon() {
        System.out.println("Seu pokemon é o " + this.nome + " nível: " + this.nivel);
    }

    @Override
    public void evoluiPokemon(String nome) {
        this.nome = nome;
        this.nivel = nivel+1;
    }
}
