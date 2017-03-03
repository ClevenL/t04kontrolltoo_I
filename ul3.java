import java.io.*;

public class ul3{
	
	public static double kaalutud_keskmine(int[] eapd, int[] hinded){
		
		int eap_hinne=0;
		int eap=0;
		
		for (int i=0; i<(eapd.length); i++ ) {
			eap_hinne=eap_hinne+eapd[i]*hinded[i];
			eap=eap+eapd[i];
		}
		
		double keskmine=(1.0*eap_hinne)/(1.0*eap);
		
		return keskmine;
	}
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader failist=new BufferedReader(new FileReader("andmed.txt"));
		
		String rida1=failist.readLine();
		String[] nimed=rida1.split(",");

		String rida2=failist.readLine();
		String[] hinded_taht=rida2.split(",");

		String rida3=failist.readLine();
		String[] eapdstr=rida3.split(",");
		
		int[] eapd = new int[eapdstr.length];
		int[] hinded = new int[hinded_taht.length];
		
		for (int i=0; i<(eapdstr.length); i++ ) {
			int numbriks = Integer.parseInt(eapdstr[i]);
			eapd[i]=numbriks;
		}
		
		for (int i=0; i<(hinded_taht.length); i++ ) {
			if (hinded_taht[i].equals("A")){hinded[i]=5;}
			else if (hinded_taht[i].equals("B")){hinded[i]=4;}
			else if (hinded_taht[i].equals("C")){hinded[i]=3;}
			else if (hinded_taht[i].equals("D")){hinded[i]=2;}
			else if (hinded_taht[i].equals("E")){hinded[i]=1;}
			else if (hinded_taht[i].equals("F")){hinded[i]=0;}
			else{
				System.out.println("Vale hinde sisend!");
			}
		}
		
		System.out.println("kaalutud keskmine hinne on edukalt lisatud faili keskmine.txt");
		
		PrintWriter faili1=new PrintWriter(new FileWriter("keskmine.txt"));
		
		double keskmine=kaalutud_keskmine(eapd,hinded);
		
		faili1.println(keskmine);
		
		faili1.close();
	}
}