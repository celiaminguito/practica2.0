package dominio;

public class Coche{
private String marca;
private String matricula;

public Coche(String marca, String matricula){
this.marca = marca;
this.matricula = matricula;

}

public Coche() {
}

public void setMarca(String marca) {
this.marca = marca;
}

public String getMarca() {
return marca;
}

public void setMatricula(String matricula) {
this.matricula  = matricula;
}

public String getmatricula() {
return matricula;
}

@Override 
public String toString() {
return getMarca() + ": " getMatricula();
}

}
