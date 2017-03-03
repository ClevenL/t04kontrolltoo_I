public class ul2{
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

	public static void main(String[] args){

		int[] eapd = {1,2,3,4,5,6};
		int[] hinded = {1,2,3,4,5,5};
		
		System.out.println("kahe aine kaalutud keskmine hinne oleks "+kaalutud_keskmine(eapd,hinded));
	}
}