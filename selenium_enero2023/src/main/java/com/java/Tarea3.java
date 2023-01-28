package com.java;

// Tarea 3. Terminar el ejercicio de las fotomultas agregando Zona escolar.

public class Tarea3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int velocidadActualcoche = 71; //Km*h
		int velocidadLimite = 70; //km*h
		
		boolean carretera = false;
		boolean zonaEscolar = true;
		
		if(carretera==true) {
			velocidadLimite = 100;
			
			if(velocidadActualcoche>velocidadLimite) {
				// Block code
				System.out.println("Carretera - Multa");
			}else {
				System.out.println("Carretera - Eres un buen conductor");
			}
			
		} else if(zonaEscolar = true) {
			velocidadLimite = 20;
			
			if(velocidadActualcoche>velocidadLimite) {
				// Block code
				System.out.println("Zona escolar - Multa");
			}else {
				System.out.println("Zona escolar - Eres un buen conductor");
			}
		} else if(velocidadActualcoche>velocidadLimite) {
			// Block code
			System.out.println("Calle - Multa");
		} else {
			System.out.println("Calle - Eres un buen conductor");
		}

	}

}
