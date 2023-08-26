import pkgAlumnos.Alumno;
import pkgAlumnos.Curso;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class Main {
    public static void main(String[] args) {
      Alumno alumno1 = new Alumno ( "001" ,"Juan perez ",  "4444", "5 calle 8-14" );
      Curso cur = new Curso( "curso", "Programacion", 500  );
      alumno1.agregarCurso(cur);
      alumno1.agregarCurso(new Curso("12" , "Derecho", 1));

      System.out.println("nombre del alumno:" + alumno1.getNombre());
      System.out.println("carnet"+alumno1.getCarnet());

        //iteracion

        for(Curso curso: alumno1.getCursos()) {
            System.out.println("Curso:"   + curso.getNombre() +   " Valor:" + curso.getCosto());
        }


      Alumno alumno2 = new Alumno ( "002" ,"Brandon Florian ",  "2222", "6 calle 8-11" );
      Curso curso2 = new Curso( "curso", "Matematica", 200  );
      alumno2.agregarCurso(cur);
      alumno2.agregarCurso(new Curso("10" , " Derecho", 1));

        System.out.println("\nnombre del alumno:" + alumno2.getNombre());
        System.out.println("carnet"+alumno2.getCarnet());

      //iteracion
             double to = 0;
            for(Curso curso_2: alumno2.getCursos()) {
                to = to + curso2.getCosto();
                System.out.println("Curso:" + curso2.getNombre() +   " Valor:"   + curso2.getCosto());
            }


                Alumno alumno3 = new Alumno ( "003" ,"Daniel lopez ",  "3333", "7 calle 7-12" );
                Curso curso3 = new Curso( "curso", "Fisica", 300  );
                alumno3.agregarCurso(cur);
                alumno3.agregarCurso(new Curso("14" , "Derecho", 1));

                System.out.println("\nnombre del alumno:" + alumno3.getNombre());
                System.out.println("carnet"+alumno3.getCarnet());

                //iteracion

                for(Curso curso_3: alumno3.getCursos()){
                    System.out.println("Curso:" +curso3.getNombre() +" Valor:" +curso3.getCosto()) ;
        }
    }
}