import javax.swing.JOptionPane;

public class TesteAtribuicao{
   public static void main (String ... args){
      
      String nome = JOptionPane.showInputDialog("Nome do professor: ");
      int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade do professor: "));
      String d = JOptionPane.showInputDialog("Disciplina: ");
      String sPratica = JOptionPane.showInputDialog("Aula prática? (Sim ou não)");
      boolean pratica = sPratica.equals("sim") ? true : false;
      
      Professor professor = new Professor (nome, idade);
      
      Disciplina disciplina = new Disciplina (d, pratica);
      
      Atribuicao atribuicao = new Atribuicao (professor, disciplina);
      
      JOptionPane.showMessageDialog(null, atribuicao.getDados());
      
   }
}