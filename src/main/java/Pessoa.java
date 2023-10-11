
import java.sql.Connection;
import java.sql.PreparedStatement;

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
    
    public boolean cadastrar() {
        //primeiro: definir o comando sql / a string
        String sql = "INSERT INTO TB_PESSOA (NOME, FONE, EMAIL) VALUES (?, ?, ?)";
        
        //segundo: abrir conexão (como recurso do try)
        try (Connection c = ConnectionFactory.obtemConexao()) {
            //pré compilar o comando sql
            PreparedStatement ps =  c.prepareStatement(sql);
            
            //terceiro: preencher com valores o statement sql
            ps.setString(1,nome);
            ps.setString(2,fone);
            ps.setString(3, email);
            
            //quarto: executa o comando
            ps.execute();
            
            //se tudo der certo 
            return true;
        }
        catch (Exception erro){
            erro.printStackTrace();
            
            //se der errado
            return false;
        }
        
    }
}
