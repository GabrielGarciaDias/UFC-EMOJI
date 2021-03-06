package exercicioaula07;

public class Lutador {
    //atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;    
    private float peso;
    private String categoria;
    private int vitorias;        
    private int derrotas; 
    private int empates;
    
    public Lutador(String no,String na, int id,float al,
        float pe,int vi,int de,int em){
        this.nome=no;
        this.nacionalidade=na;
        this.idade=id;
        this.altura=al;
        this.setPeso(pe);
        this.vitorias=vi;
        this.derrotas=de;
        this.empates=em;
    }

    public void apresentar(){
        System.out.println("Nome:"+this.nome);
        System.out.println("Nacionalidade:"+this.nacionalidade);
        System.out.println("Idade:"+this.idade);
        System.out.println("Altura:"+this.altura);
        System.out.println("Peso:"+this.peso);
        System.out.println("Vitorias:"+this.vitorias);
        System.out.println("Derrotas:"+this.derrotas);
        System.out.println("Empates:"+this.empates);
    }
    
    public void status(){
        System.out.println(this.getNome() +" é um peso "+this.getCategoria());
        System.out.println("Ganhou "+this.getVitorias()+" Vezes");
        System.out.println("Perdeu "+this.getDerrotas()+" Vezes");
        System.out.println("Empatou "+this.getEmpates()+" Vezes");
    }
    
    public void ganharLuta(){
        this.setVitorias(getVitorias() +1 );
    }
    
    public void perderLuta(){
        this.setDerrotas(getDerrotas() +1);
    }
    
    public void empatarLuta(){
        this.setEmpates(getEmpates() +1);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.peso < 52.2){
            this.categoria = "Inválido";
        }else if(this.peso <=70.3){
            this.categoria = "Leve";
        }else if(this.peso <=89.3){
            this.categoria = "Médio";
        }else if(this.peso <=120.2){
            this.categoria = "Pesado";
        }else{
            this.categoria = "Inválido";
        }
    }
    
    
    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }    
}