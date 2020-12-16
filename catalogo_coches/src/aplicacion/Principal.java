
package aplicacion;

import dominio.*;

public class Main{
public static void main(String[] args){
Coche audi = new Coche("A3", "5467 KFK");
Coche citroen = new Coche("C3", "9843 JGK");
Catalogo catalogo = new Catalogo();
catalogo.annadirCoche(audi);
catalogo.annadirCoche(citroen);
System.out.println(catalogo);
}

}
