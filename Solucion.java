public class Solucion {
	 public static void main(String[] args) {
	        int[] arreglo = {1,1,0,-1,-1 };
	        double num_pos=0;
	        double  ceros = 0;
	        double  num_neg = 0;
	        int x= 0;
			for (int i = 0; i < arreglo.length ; i++) {
				 x = arreglo[i];
	            if (x > 0) {
	                num_pos++;
	            } else if (x == 0) {
	                ceros++;
	            } else {
	                num_neg++;
	            }
	        }

			double result_pos = num_pos / (double) arreglo.length;
			double result_neg = num_neg / (double) arreglo.length;
			double result_ceros = ceros / (double) arreglo.length;
			
			System.out.println(String.format("%.6f ", result_pos));
	        System.out.println(String.format("%.6f", result_neg));
	        System.out.println(String.format("%.6f",result_ceros));
	    }

}
