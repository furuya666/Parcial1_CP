package calculadorainfpospre;
import java.util.*;
public class operaciones {
    private double sacaTope, sacaSig,resultado;
    private ArrayList<String> operadores;
    private Pila pila;
    public operaciones(String expresion[]) {
        pila = new Pila(expresion.length);
    }
    public double Postfija(String[] expresion) {
        operadores = new ArrayList<>();
        operadores.add("+");
        operadores.add("-");
        operadores.add("*");
        operadores.add("/");
        operadores.add("^");
        for (String car : expresion) {
            if (operadores.contains(car)) {
                sacaTope = pila.quitar();         
                sacaSig = pila.quitar();
       
                operacionPre(sacaSig, sacaTope, car);
            } else {
                pila.poner(Integer.parseInt(car));
                
            }
        }
        
        return resultado;
    }
   

    public double Prefija(String[] expresion) {
        String car;
        operadores = new ArrayList<>();
        operadores.add("+");
        operadores.add("-");
        operadores.add("*");
        operadores.add("/");
        operadores.add("^");

        for (int i = (expresion.length - 1); i >= 0; i--) { 
            car = expresion[i];
            if (operadores.contains(car)) {
                sacaTope = pila.quitar();
               System.out.println("sacaTope: " + sacaTope);
                sacaSig = pila.quitar();
                System.out.println("sacaSig: " + sacaSig);
                System.out.println("car: " + car);
                operacionPre(sacaTope, sacaSig, car);
            } else {
                pila.poner(Integer.parseInt(car));
                System.out.println("entra: " + car);
            }
        }
        
        return resultado;
    }

    public double Infija(String[] expresion) {

        String o;
        int c=expresion.length-2;
        for (int i=1; i<=5; i++)
        {
            for (int j=0;j<=c;j++)
            {
                o=expresion[j];
                switch (i)
                {
                    case 1: 
                         if("^".equals(o))
                        {
                            c=c-2;
                            sacaTope=Double.parseDouble(expresion[j-1]);
                            sacaSig=Double.parseDouble(expresion[j+1]);
                            resultado=(double) Math.pow(sacaTope, sacaSig);
                            int n=c+1;
                            expresion[j-1]=String.valueOf(resultado);
                            System.out.println(resultado);
                            for(int h=j;h<=n;h++)
                            {
                                expresion[h]=expresion[h+2];
                            }
                            j=0;
                        }
                        break;
                    case 2:
                        if("*".equals(o))
                        {
                            c=c-2;
                            sacaTope=Double.parseDouble(expresion[j-1]);
                            sacaSig=Double.parseDouble(expresion[j+1]);
                            resultado=(double) sacaTope * sacaSig;
                            int n=c+1;
                            expresion[j-1]=String.valueOf(resultado);
                            for(int h=j;h<=n;h++)
                            {
                                expresion[h]=expresion[h+2];
                            }
                            j=0;
                        }
                        break;
                    case 3: 
                         if("/".equals(o))
                        {
                            c=c-2;
                            sacaTope=Double.parseDouble(expresion[j-1]);
                            sacaSig=Double.parseDouble(expresion[j+1]);
                            resultado=sacaTope/sacaSig;
                            int n=c+1;
                            expresion[j-1]=String.valueOf(resultado);
                            System.out.println(resultado);
                            for(int h=j;h<=n;h++)
                            {
                                expresion[h]=expresion[h+2];
                            }
                            j=0;
                        }
                        break;
                    case 4:
                        if("+".equals(o))
                        {
                            c=c-2;
                            sacaTope=Double.parseDouble(expresion[j-1]);
                            sacaSig=Double.parseDouble(expresion[j+1]);
                            resultado=sacaTope+sacaSig;
                            int n=c+1;
                            expresion[j-1]=String.valueOf(resultado);
                            System.out.println(resultado);
                            for(int h=j;h<=n;h++)
                            {
                                expresion[h]=expresion[h+2];
                            }
                            j=0;
                        }
                        break;
                    case 5:
                         if("-".equals(o))
                        {
                            c=c-2;
                            sacaTope=Double.parseDouble(expresion[j-1]);
                            sacaSig=Double.parseDouble(expresion[j+1]);
                            resultado=sacaTope-sacaSig;
                            int n=c+1;
                            expresion[j-1]=String.valueOf(resultado);
                            System.out.println(resultado);
                            for(int h=j;h<=n;h++)
                            {
                                expresion[h]=expresion[h+2];
                            }
                            j=0;
                        }
                        break;
                    default:
                        break;
                }
            }
        }
        return resultado;
    }

    

    public double operacionPre(double sacaTope, double sacaSig, String operador) {
        if (operador.equals("^")) {
            resultado = (double) Math.pow(sacaTope, sacaSig);
            pila.poner(resultado);
        } else if (operador.equals("/")) {
            resultado = sacaTope / sacaSig;
            pila.poner(resultado);
        } else if (operador.equals("+")) {
            resultado = (sacaTope + sacaSig);
            pila.poner(resultado);
        } else if (operador.equals("-")) {
            resultado = sacaTope - sacaSig;
            pila.poner(resultado);
        } else if (operador.equals("*")) {
            resultado = sacaTope * sacaSig;
            pila.poner(resultado);
        }
        return resultado;
    }
}
