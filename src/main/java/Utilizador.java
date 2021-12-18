public class Utilizador{
    String id;
    String nome;
    String morada;

    String username;
    String Password;

    public Utilizador(String id, String nome, String morada, String username, String password) {
        this.id = id;
        this.nome = nome;
        this.morada = morada;
        this.username = username;
        Password = password;
    }


    // TESte
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}

