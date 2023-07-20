package ExamenU3;

class Password {

    private final String PASSWORD = "diazgonzalezyahiralberto";

    boolean Verificacion(String password) {
        boolean respuesta = (password.equals(this.PASSWORD));
        return respuesta;
    }
}
