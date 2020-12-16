package dominio;

import java.util.ArrayList;

public class Catalogo{
private ArrayList<Coche> coleccionCoches = new ArrayList<>();

public void annadirCoche(Coche coche){
coleccionCoches.add(coche);

}

@Override
public String toString(){
StringBuilder sb = new StringBuilder();
for(Coche coche : coleccionCoches) sb.append(coche + "/n");
return sb.toString();
}

}
