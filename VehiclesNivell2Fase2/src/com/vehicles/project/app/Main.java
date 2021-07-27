package com.vehicles.project.app;

import java.util.*;
import java.util.Scanner;

import com.vehicles.project.exceptions.InvalidWheelDiameterException;
import com.vehicles.project.vehicles.Bike;
import com.vehicles.project.vehicles.Car;
import com.vehicles.project.vehicles.Truck;
import com.vehicles.project.vehicles.Wheel;

public class Main {

	static Scanner lector = new Scanner(System.in);
	
	public static void main(String[] args) throws Exception{
            
                System.out.println("¿Quin tipus de vehicle vols? \n1. Un cotxe\n2. Una moto\n3. Un camió");
		int eleccio = lector.nextInt();
		lector.nextLine();
		
		if(eleccio == 1) {
			
			System.out.println("Excriu la matrícula del cotxe: ");
			String matriculaCotxe = lector.nextLine();
			
			System.out.println("Escriu la marca del cotxe: ");
			String marcaCotxe = lector.nextLine();
			
			System.out.println("Específica el color del cotxe: ");
			String colorCotxe = lector.nextLine();
			
			Car car = new Car(matriculaCotxe, marcaCotxe, colorCotxe);
			
			System.out.println("Possar les rodes del davant!");
			Wheel rodaDavant = demanarRoda();
			
			System.out.println("Possar les rodes del darrere!");
			Wheel rodaDarrere = demanarRoda();
			
			List<Wheel> rodesDavant = new ArrayList<>();
			rodesDavant.add(rodaDavant);
			rodesDavant.add(rodaDavant);
			
			List<Wheel> rodesDarrere = new ArrayList<>();
			rodesDarrere.add(rodaDarrere);
			rodesDarrere.add(rodaDarrere);
			
			car.addWheels(rodesDavant, rodesDarrere);
			
			System.out.println(car.toString());
			
		}else if(eleccio == 2) {
			
			System.out.println("Escriu la matrícula de la moto: ");
			String matriculaMoto = lector.nextLine();
			
			System.out.println("Escriu la marca: ");
			String marcaMoto = lector.nextLine();
			
			System.out.println("Específica el color: ");
			String colorMoto = lector.nextLine();
			
			Bike bike = new Bike(matriculaMoto, marcaMoto, colorMoto);
			
			System.out.println("Possar la roda del davant!");
			Wheel rodaDavant = demanarRoda();
			
			System.out.println("Possar la roda del darrere");
			Wheel rodaDarrere = demanarRoda();
			
			bike.addWheels(rodaDavant, rodaDarrere);
			
			System.out.println(bike.toString());
			
		}else if(eleccio == 3){
			
			System.out.println("Escriu la matrícula del camió: ");
			String matriculaCamio = lector.nextLine();
			
			System.out.println("Escriu la marca: ");
			String marcaCamio = lector.nextLine();
			
			System.out.println("Especifica el color: ");
			String colorCamio = lector.nextLine();
			
			Truck truck = new Truck(matriculaCamio, marcaCamio, colorCamio);
			
			System.out.println("Quantes rodes té el camió: 4, 6, 8, 10 ó 12 ?");
			
			int rodesTotalsCamio = lector.nextInt();
			lector.nextLine();
			
			List<Wheel> rodesCamio = new ArrayList<>();
			
			System.out.println("Marca i diàmetre rodes del camió: ");
			
			for(int i=0;i<rodesTotalsCamio/2;i++) {
				
				System.out.println("Escriu un parell de rodes nº " + (i+1));
				Wheel roda = demanarRoda();
				rodesCamio.add(roda);
				rodesCamio.add(roda);
			}
			
			truck.addWheels(rodesCamio);
			
			System.out.println("Nombre correcte de rodes: " + truck.suitableNumberOfWheels());
			
		}else {
			System.err.println("Nomès hi ha tres opcions: [1 -> Coche | 2 -> Moto | 3 -> Camion]");
		}
		
		lector.close();
	}
	
	public static Wheel demanarRoda() throws InvalidWheelDiameterException {
		
		Wheel roda;
		
		System.out.println("Escriu la marca de la roda: ");
		String marcaRoda = lector.nextLine();
		
		System.out.println("Escriu el diàmetre de la roda: ");
		double diametreRoda = lector.nextDouble();
		lector.nextLine();
		
		roda = new Wheel(marcaRoda, diametreRoda);
		
		return roda;
	}

}

   