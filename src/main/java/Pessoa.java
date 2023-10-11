public class Pessoa {
    private int codigo;
    private String nome;
    private String fone;
    private String email;

    public Pessoa(String nome, String email, String fone) {
        this.nome = nome;
        this.fone = fone;
        this.email = email;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "codigo=" + codigo + ", nome=" + nome + ", fone=" + fone + ", email=" + email + '}';
    }
    
    
}
