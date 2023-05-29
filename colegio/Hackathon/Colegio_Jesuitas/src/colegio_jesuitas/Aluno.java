
package colegio_jesuitas;


public class Aluno {
    
    private String idAluno;
    private String nome;
    
    public Aluno(){
        
    }

    public Aluno(String idAluno, String nome) {
        this.idAluno = idAluno;
        this.nome = nome;
    }

    public String getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(String idAluno) {
        this.idAluno = idAluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
}
