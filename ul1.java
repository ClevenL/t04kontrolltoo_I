public class ul1{
	public static double kaalutud_keskmine(int eap1, int h1, int eap2, int h2){
		int aine1=eap1*h1;
		int aine2=eap2*h2;
		int ained=aine1+aine2;
		int eapd=eap1+eap2;
		double keskmine=(1.0*ained)/(1.0*eapd);
		
		return keskmine;
	}

	public static void main(String[] a){
		
		int eap1=Integer.parseInt(a[0]);
		int h1=Integer.parseInt(a[1]);
		int eap2=Integer.parseInt(a[2]);
		int h2=Integer.parseInt(a[3]);
		
		System.out.println("kahe aine kaalutud keskmine hinne oleks "+kaalutud_keskmine(eap1,h1,eap2,h2));
	}
}