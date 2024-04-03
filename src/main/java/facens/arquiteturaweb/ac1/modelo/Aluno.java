package facens.arquiteturaweb.ac1.modelo;

public class Aluno {
    private Long id;
    private String nome;
    private String curso;
    private String ra;
    private String tipoensino;
    private String genero;

    public Aluno(Long id, String nome, String curso, String ra, String tipoensino, String genero) {
        this.id = id;
        this.nome = nome;
        this.curso = curso;
        this.ra = ra;
        this.tipoensino = tipoensino;
        this.genero = genero;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getTipoEnsino() {
        return tipoensino;
    }

    public void setTipoEnsino(String tipoensino) {
        this.tipoensino = tipoensino;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
