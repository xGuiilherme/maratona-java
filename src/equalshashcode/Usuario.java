package equalshashcode;

public class Usuario {

    String nome;
    String email;

    public boolean equals(Object objeto) {

        Usuario outro = (Usuario) objeto;
        return super.equals(email);
    }
}


