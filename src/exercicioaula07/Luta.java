package exercicioaula07;

import java.util.Random;

public class Luta {
    //atributos
    private Lutador desafiante;
    private Lutador desafiado;  
    private int rounds;
    private boolean aprovada;
    
    //metodos 
    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria())
            && l1!=l2){
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        }else{
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante= null;
        }
    }
    
    public void lutar (){
        if (this.aprovada){
            System.out.println("==========DESAFIADO==========");
            this.desafiado.apresentar();
            System.out.println("==========DESAFIANTE==========");
            this.desafiante.apresentar();
            //Gera um numero aleatorio para decidir o vencedor
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); // 0, 1, 2
            
            switch (vencedor){
                case 0 : //EMPATE
                    System.out.println("Empatou !!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                case 1 : // Desafiado Ganhou
                    System.out.println(this.desafiado.getNome()+" VENCEU !!");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                case 2 : // Desafiante Ganhou
                    System.out.println(this.desafiante.getNome()+" VENCEU!!");
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
            }
        }else{
            System.out.println("Luta não pode acontecer !");
        }
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador dd) {
        this.desafiado = dd;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}