package calculadorainfpospre;
public class Pila {
    private double pila[];
    private double dato;
    private int tope = -1;
    private int max = 0;
    private boolean res;
    
    Pila(int max) {
        this.max = max;
        pila = new double[max];
        dato = 0;
    }

    public void borrarpila() {
        tope = -1;
    }

    public boolean Pila_llena() {
        if (tope == (max - 1)) {
            res = true;
        } else {
            res = false;
        }

        return res;
    }

    public boolean Pila_vacia() {
        if (tope == -1) {
            res = true;
        } else {
            res = false;
        }

        return res;
    }

    public boolean poner(double dato) {
        if (Pila_llena()) {
            System.err.print("Pila llena");
        } else {
            tope++;
            pila[tope] = dato;
            res = true;
        }
        return res;
    }

    public double quitar() {
        if (Pila_vacia()) {
            System.err.print(" Pila vacia");
        } else {
            dato = pila[tope];
            tope--;
        }
        return dato;
    }

    public void mostrar() {
        for (int i = tope; i >= 0; i--) {
            System.out.println(pila[i]);
        }
    }

    public String copiarPila(Object[] pila) {
        Object[] copy = new Object[pila.length];
        String muestra = "";
        System.arraycopy(pila, 0, copy, 0, pila.length);
        for (int i = 0; i < copy.length; i++) {
            muestra += copy[i] + " ";
        }
        return muestra;
    }
}
