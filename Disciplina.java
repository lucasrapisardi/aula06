public class Disciplina {
   //atributos
   private String nome;
   private boolean pratica;
   
   //metodo construtor
   public Disciplina (String d, boolean pratica){
      this.nome = d;
      this.pratica = true;
   }
   
   //metodo de acesso
   public String getNome(){
      return nome;
   }
   public boolean getPratica(){
      return pratica;
   }
   
   //metodos modificadores
   public void setNome(String d){
      this.nome = d;
   }
   public void setPratica(boolean pratica){
      this.pratica = pratica;
   }
   
   //metodo getDados
   public String getDados(){
      return "\nDisciplina: " + nome + "\nAula prática?: " + pratica;
   }
   
}