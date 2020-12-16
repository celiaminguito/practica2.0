package dominio;

/**
* Esta clase es responsable de mantener los datos e información sobre los coches del catalogo. Cada coche tiene como información la marca como por ejemplo, "Audi" y la matricula, por ejemplo, "1234 BCD".
*/

public class Coche{
    private String marca;
    private String matricula;
/**
*Crea un coche a partir de una marca y una matricula.
*@param marca marca del coche.
*@param matricula matricula del coche.
*/
    public Coche(String marca, String matricula) {
        this.marca = marca;
        this.matricula = matricula;
    }

    public Coche() {
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

/**
*Devuelve la marca del coche.
*
*@return marca del coche.
*/

    public String getMarca() {
        return marca;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return getMarca() + ": "+ getMatricula();
    }

}
