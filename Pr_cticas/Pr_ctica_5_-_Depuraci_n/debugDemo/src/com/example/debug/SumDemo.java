package com.example.debug;

public class SumDemo {
	static int[] nums = {1, 2, 3, 4, 5};
    static int sum = 0;
    private static int variable;
    public static void sumar(int valor) {
    	sum += valor;
    	
    }
    public static void main(String[] args) {    
        // ERROR intencional
        for (int i = 0; i < nums.length; i++) {
        	System.out.println("Paso "+i);
            sumar(nums[i]);
        }
        System.out.println("Suma = " + sum);
        variable=1;
        System.out.println("Variable =" + variable);
        metodo();
    }
    private static void metodo() {
    	System.out.println("linea del método");
    	System.out.println("linea del método");
    	System.out.println("linea del método");
    	System.out.println("linea del método");
    	System.out.println("linea del método");
    	System.out.println("linea del método");
    	System.out.println("linea del método");
    	System.out.println("linea del método");
    	System.out.println("linea del método");
    	System.out.println("linea del método");
    }
}

