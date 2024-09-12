
public class Principal {

	public static void main(String[] args) {

		long startTime = System.nanoTime();
		int n=100000;
		int[] numeros = new int[n];
		for(int num=2, pos=0;num<=n;num++,pos++) {
			numeros[pos]=num;
		}
		
		for(int i=0;i<numeros.length;i++) {
			if(numeros[i]>0) {
				for(int j=i+1;j<numeros.length;j++) {
					if(numeros[j]%numeros[i]==0&& numeros[j]>0) {
						numeros[j]*=-1;
					}
				}
			}
		}
		
		for(int posi=0;posi<n;posi++) {
			if(numeros[posi]>0)
				System.out.print(" "+numeros[posi]+" ");
		}
		long endTime = System.nanoTime();
		System.out.print("Tiempo Tomado: "+(endTime-startTime)+" nanosegundos");
		

	}
}
