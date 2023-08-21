package Logico;
import java.util.Scanner;

import Interface.IGenerateNumber;

import java.util.Random;
	
	public class GenerateNumber implements IGenerateNumber {
		public static Random random = new Random();
	    private int fact1;
	    private int fact2;
	    
	    public GenerateNumber() {
	    	
	    }
	    
		public GenerateNumber(int fact1, int fact2) {
			super();
			this.fact1 = fact1;
			this.fact2 = fact2;
		}


		public double getFact1() {
			return fact1;
		}


		public void setFact1(int fact1) {
			this.fact1 = fact1;
		}


		public int getFact2() {
			return fact2;
		}


		public void setFact2(int fact2) {
			this.fact2 = fact2;
		}



		
		public int randonNumber(int fact1, int fact2) {
		    int randomNumber = random.nextInt((fact2 - fact1) + 1) + fact1;
		    return randomNumber;
		}

	}
