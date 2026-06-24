package entities;

import java.util.concurrent.atomic.AtomicInteger;

public abstract class User {
    //Para gerar os ID unicos optei pelo AtomicInteger por ser um exemplo, 
    // mas entendo que em produção existem formas mais seguras de estar gerando o id
    private static final AtomicInteger counterId = new AtomicInteger(1);
    private final Integer id;
    private String nome;

    public User(String nome) {
        this.id = counterId.getAndIncrement();
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Integer getId() {
        return id;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        User other = (User) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }

}
