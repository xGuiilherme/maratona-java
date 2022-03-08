package desafio;

public class Usuario {

    String nome;
    String email;

    // "Object é a classe Mae,apartir dessa classe todos é depdendente dela. aqui fiz um Cash/Conversao p/ usuario
    public boolean equals(Object objeto) {

        Usuario outro = (Usuario) objeto;
        return super.equals(email);
    }
}


