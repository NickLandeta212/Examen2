package ec.edu.evaluacion;

import java.util.ArrayList;
import java.util.List;

public class GestionEstudiantes {
    private ArrayList<Estudiante> estudiantes;

    public GestionEstudiantes() {
        estudiantes=new ArrayList<>();
        precargarEstudiantes();

    }

    private void precargarEstudiantes() {
        estudiantes.add(new Estudiante(101, "Ana Torres", "Software", 8.5));
        estudiantes.add(new Estudiante(102, "Juan Pérez", "TI", 7.2));
        estudiantes.add(new Estudiante(103, "Carla López", "Computación", 9.1));
        estudiantes.add(new Estudiante(104, "Luis Mena", "Software", 6.8));
        estudiantes.add(new Estudiante(105, "María Ruiz", "TI", 8.9));
    }

    public boolean agregarEstudiante(Estudiante estudiante) {
        for (Estudiante e : estudiantes){
            if (e.getCodigo()== estudiante.getCodigo()){
                return false;
            }
        }
        estudiantes.add(estudiante);
        return true;
    }

    public Estudiante buscarPorCodigoSecuencial(int codigo) {
        


    }

    public Estudiante buscarPorNombreSecuencial(String nombre) {
        for (Estudiante e: estudiantes){
            if (e.getNombre().equalsIgnoreCase(nombre)){
                return e;
            }
        }
        return null;

    }

    public Estudiante buscarPorCodigoBinario(int codigo) {
        ordenarPorCodigoAscendente();
        int inicio = 0;
        int fin = estudiantes.size() -1;



    }

    public ArrayList<Estudiante> ordenarPorPromedioDescendente() {
        for (Estudiante e : estudiantes){
            for (int i=0; i <estudiantes.size()-1; i++){
                for (int j=0; j< estudiantes.size() -1 -i;j++){
                    if (estudiantes.get(j).getPromedio()< estudiantes.get(j+1).getPromedio()){
                        Estudiante aux = estudiantes.get(j);
                        estudiantes.set(j,estudiantes.get(j+1));
                        estudiantes.set(j+1, aux);
                    }
                }
            }
        }

        return estudiantes;

    }

    public ArrayList<Estudiante> ordenarPorCodigoAscendente() {

    }

    public int contarRecursivo(int indice) {

    }

    public double sumaPromediosRecursiva(int indice) {

    }

    public double promedioGeneralRecursivo() {

    }

    public double mayorPromedioRecursivo(int indice) {

    }


}
