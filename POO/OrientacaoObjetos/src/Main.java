public class Main {
    public static void main(String[] args) {
        Aluno[] alunos = new Aluno[10];
       for (int i = 0; i < alunos.length; i ++){
           alunos[i] = new Aluno();
       }
        alunos[0].nome = "Mônica";
        alunos[0].email = "monica@gmail.com";

        System.out.println(alunos[0].nome);
        System.out.println(alunos[0].email);
    }
}