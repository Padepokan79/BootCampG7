import java.util.Scanner;

public class YanaIF3 {
	public static void main (String [] args) {
	Scanner keyboard = new Scanner (System.in);

	int poin, sisaPoin, permen, ciki, soyjoy, esKepalSisri, esKepalMilo, tukar;

	System.out.println("============================");
	System.out.print("Masukkan poin Budi : ");
	poin = keyboard.nextInt ();

	//daftar poin 
	permen = 1;
	ciki = 3;
	esKepalSisri = 5;
	soyjoy = 6;
	esKepalMilo = 10;

	System.out.println ("Daftar yg dapat ditukar:");

	if (poin>= esKepalMilo) {
		System.out.println("- Es kepal Milo poin : 1O");
	}
	if (poin >= soyjoy) {
		System.out.println("- Soyjoy poin : 6");
	}
	if (poin >=esKepalSisri) {
		System.out.println("- Es kepal Sisri poin : 5");
	}
	if (poin >= ciki) {
		System.out.println("- Ciki poin : 3");
	}
	if (poin >= permen) {
		System.out.println("- Permen poin : 1");
	}
	System.out.println();
	System.out.print("Tukar poin : ");
	tukar = keyboard.nextInt ();

	if (tukar == esKepalMilo) {
		System.out.println("Menukar dengan Es kepal Milo poin 10");
	}
	else if (tukar == soyjoy) {
		System.out.println("Menukar dengan Soyjoy poin 6");
	}
	else if (tukar == esKepalSisri) {
		System.out.println("Menukar dengan Es kepal Sisri poin 5");
	}

	else if (tukar==ciki) {
		System.out.println("Menukar dengan Ciki poin 3");
	}
	else if (tukar==permen) {
		System.out.println("Menukar dengan Permen poin 1");
	}

	sisaPoin = poin - tukar;
	System.out.println("Sisa poin adalah " + sisaPoin + " poin");

	System.out.println("============================");
	
	if (sisaPoin > 0) {
		System.out.println("Daftar yg dapat ditukar:");

		if (sisaPoin>= esKepalMilo) {
			System.out.println("- Es kepal Milo poin : 10");
		}
		if (sisaPoin>= soyjoy) {
			System.out.println("- Soyjoy poin : 6");
		}
		if (sisaPoin >=esKepalSisri) {
			System.out.println("- Es kepal Sisri poin : 5");
		}
		if (sisaPoin>= ciki) {
			System.out.println("- Ciki poin : 3");
		}
		if (sisaPoin >= permen) {
			System.out.println("- Permen poin : 1");
		}
	}
	else if (sisaPoin == 0) {
		System.out.println("Maaf poin anda habis");
	}
	
	System.out.println();
	System.out.print ("Tukar poin : ");
	tukar = keyboard.nextInt ();

	if (sisaPoin > 0) {
		if (tukar == esKepalMilo) {
			System.out.println("Menukar dengan Es kepal Milo poin 10");
		}
		else if (tukar == soyjoy) {
			System.out.println("Menukar dengan Soyjoy poin 6");
		}
		else if (tukar == esKepalSisri) {
			System.out.println("Menukar dengan Es kepal Sisri poin 5");
		}
		else if (tukar==ciki) {
			System.out.println("Menukar dengan Ciki poin 3");
		}
		else if (tukar==permen) {
			System.out.println("Menukar dengan Permen poin 1");
		}
	}


	sisaPoin = sisaPoin - tukar;
	System.out.println("Sisa poin adalah " + sisaPoin + " poin");

	System.out.println("============================");

	if (sisaPoin > 0) {
		System.out.println("Daftar yg dapat ditukar:");

		if (sisaPoin>= esKepalMilo) {
			System.out.println("- Es kepal Milo poin : 10");
		}
		if (sisaPoin>= soyjoy) {
			System.out.println("- Soyjoy poin : 6");
		}
		if (sisaPoin >=esKepalSisri) {
			System.out.println("- Es kepal Sisri poin : 5");
		}
		if (sisaPoin>= ciki) {
			System.out.println("- Ciki poin : 3");
		}
		if (sisaPoin >= permen) {
			System.out.println("- Permen poin : 1");
		}
	}
	else if (sisaPoin == 0) {
		System.out.println("Maaf poin anda habis");
	}
	
	System.out.println();
	System.out.print ("Tukar poin : ");
	tukar = keyboard.nextInt ();

	if (sisaPoin > 0) {
		if (tukar == esKepalMilo) {
			System.out.println("Menukar dengan Es kepal Milo poin 10");
		}
		else if (tukar == soyjoy) {
			System.out.println("Menukar dengan Soyjoy poin 6");
		}
		else if (tukar == esKepalSisri) {
			System.out.println("Menukar dengan Es kepal Sisri poin 5");
		}
		else if (tukar==ciki) {
			System.out.println("Menukar dengan Ciki poin 3");
		}
		else if (tukar==permen) {
			System.out.println("Menukar dengan Permen poin 1");
		}
	}


	sisaPoin = sisaPoin - tukar;
	System.out.println("Sisa poin adalah " + sisaPoin + " poin");

	System.out.println("============================");

	if (sisaPoin > 0) {
		System.out.println("Daftar yg dapat ditukar:");

		if (sisaPoin>= esKepalMilo) {
			System.out.println("- Es kepal Milo poin : 10");
		}
		if (sisaPoin>= soyjoy) {
			System.out.println("- Soyjoy poin : 6");
		}
		if (sisaPoin >=esKepalSisri) {
			System.out.println("- Es kepal Sisri poin : 5");
		}
		if (sisaPoin>= ciki) {
			System.out.println("- Ciki poin : 3");
		}
		if (sisaPoin >= permen) {
			System.out.println("- Permen poin : 1");
		}
	}
	else if (sisaPoin == 0) {
		System.out.println("Maaf poin anda habis");
	}
	
	System.out.println();
	System.out.print ("Tukar poin : ");
	tukar = keyboard.nextInt ();

	if (sisaPoin > 0) {
		if (tukar == esKepalMilo) {
			System.out.println("Menukar dengan Es kepal Milo poin 10");
		}
		else if (tukar == soyjoy) {
			System.out.println("Menukar dengan Soyjoy poin 6");
		}
		else if (tukar == esKepalSisri) {
			System.out.println("Menukar dengan Es kepal Sisri poin 5");
		}
		else if (tukar==ciki) {
			System.out.println("Menukar dengan Ciki poin 3");
		}
		else if (tukar==permen) {
			System.out.println("Menukar dengan Permen poin 1");
		}
	}


	sisaPoin = sisaPoin - tukar;
	System.out.println("Sisa poin adalah " + sisaPoin + " poin");

	System.out.println("============================");

	if (sisaPoin > 0) {
		System.out.println("Daftar yg dapat ditukar:");

		if (sisaPoin>= esKepalMilo) {
			System.out.println("- Es kepal Milo poin : 10");
		}
		if (sisaPoin>= soyjoy) {
			System.out.println("- Soyjoy poin : 6");
		}
		if (sisaPoin >=esKepalSisri) {
			System.out.println("- Es kepal Sisri poin : 5");
		}
		if (sisaPoin>= ciki) {
			System.out.println("- Ciki poin : 3");
		}
		if (sisaPoin >= permen) {
			System.out.println("- Permen poin : 1");
		}
	}
	else if (sisaPoin == 0) {
		System.out.println("Maaf poin anda habis");
	}
	
	System.out.println();
	System.out.print ("Tukar poin : ");
	tukar = keyboard.nextInt ();

	if (sisaPoin > 0) {
		if (tukar == esKepalMilo) {
			System.out.println("Menukar dengan Es kepal Milo poin 10");
		}
		else if (tukar == soyjoy) {
			System.out.println("Menukar dengan Soyjoy poin 6");
		}
		else if (tukar == esKepalSisri) {
			System.out.println("Menukar dengan Es kepal Sisri poin 5");
		}
		else if (tukar==ciki) {
			System.out.println("Menukar dengan Ciki poin 3");
		}
		else if (tukar==permen) {
			System.out.println("Menukar dengan Permen poin 1");
		}
	}


	sisaPoin = sisaPoin - tukar;
	System.out.println("Sisa poin adalah " + sisaPoin + " poin");

	System.out.println("============================");

	if (sisaPoin > 0) {
		System.out.println("Daftar yg dapat ditukar:");

		if (sisaPoin>= esKepalMilo) {
			System.out.println("- Es kepal Milo poin : 10");
		}
		if (sisaPoin>= soyjoy) {
			System.out.println("- Soyjoy poin : 6");
		}
		if (sisaPoin >=esKepalSisri) {
			System.out.println("- Es kepal Sisri poin : 5");
		}
		if (sisaPoin>= ciki) {
			System.out.println("- Ciki poin : 3");
		}
		if (sisaPoin >= permen) {
			System.out.println("- Permen poin : 1");
		}
	}
	else if (sisaPoin == 0) {
		System.out.println("Maaf poin anda habis");
	}
	
	System.out.println();
	System.out.print ("Tukar poin : ");
	tukar = keyboard.nextInt ();

	if (sisaPoin > 0) {
		if (tukar == esKepalMilo) {
			System.out.println("Menukar dengan Es kepal Milo poin 10");
		}
		else if (tukar == soyjoy) {
			System.out.println("Menukar dengan Soyjoy poin 6");
		}
		else if (tukar == esKepalSisri) {
			System.out.println("Menukar dengan Es kepal Sisri poin 5");
		}
		else if (tukar==ciki) {
			System.out.println("Menukar dengan Ciki poin 3");
		}
		else if (tukar==permen) {
			System.out.println("Menukar dengan Permen poin 1");
		}
	}


	sisaPoin = sisaPoin - tukar;
	System.out.println("Sisa poin adalah " + sisaPoin + " poin");

	System.out.println("============================");

	if (sisaPoin > 0) {
		System.out.println("Daftar yg dapat ditukar:");

		if (sisaPoin>= esKepalMilo) {
			System.out.println("- Es kepal Milo poin : 10");
		}
		if (sisaPoin>= soyjoy) {
			System.out.println("- Soyjoy poin : 6");
		}
		if (sisaPoin >=esKepalSisri) {
			System.out.println("- Es kepal Sisri poin : 5");
		}
		if (sisaPoin>= ciki) {
			System.out.println("- Ciki poin : 3");
		}
		if (sisaPoin >= permen) {
			System.out.println("- Permen poin : 1");
		}
	}
	else if (sisaPoin == 0) {
		System.out.println("Maaf poin anda habis");
	}
	
	System.out.println();
	System.out.print ("Tukar poin : ");
	tukar = keyboard.nextInt ();

	if (sisaPoin > 0) {
		if (tukar == esKepalMilo) {
			System.out.println("Menukar dengan Es kepal Milo poin 10");
		}
		else if (tukar == soyjoy) {
			System.out.println("Menukar dengan Soyjoy poin 6");
		}
		else if (tukar == esKepalSisri) {
			System.out.println("Menukar dengan Es kepal Sisri poin 5");
		}
		else if (tukar==ciki) {
			System.out.println("Menukar dengan Ciki poin 3");
		}
		else if (tukar==permen) {
			System.out.println("Menukar dengan Permen poin 1");
		}
	}


	sisaPoin = sisaPoin - tukar;
	System.out.println("Sisa poin adalah " + sisaPoin + " poin");

	System.out.println("============================");

	if (sisaPoin > 0) {
		System.out.println("Daftar yg dapat ditukar:");

		if (sisaPoin>= esKepalMilo) {
			System.out.println("- Es kepal Milo poin : 10");
		}
		if (sisaPoin>= soyjoy) {
			System.out.println("- Soyjoy poin : 6");
		}
		if (sisaPoin >=esKepalSisri) {
			System.out.println("- Es kepal Sisri poin : 5");
		}
		if (sisaPoin>= ciki) {
			System.out.println("- Ciki poin : 3");
		}
		if (sisaPoin >= permen) {
			System.out.println("- Permen poin : 1");
		}
	}
	else if (sisaPoin == 0) {
		System.out.println("Maaf poin anda habis");
	}
	
	System.out.println();
	System.out.print ("Tukar poin : ");
	tukar = keyboard.nextInt ();

	if (sisaPoin > 0) {
		if (tukar == esKepalMilo) {
			System.out.println("Menukar dengan Es kepal Milo poin 10");
		}
		else if (tukar == soyjoy) {
			System.out.println("Menukar dengan Soyjoy poin 6");
		}
		else if (tukar == esKepalSisri) {
			System.out.println("Menukar dengan Es kepal Sisri poin 5");
		}
		else if (tukar==ciki) {
			System.out.println("Menukar dengan Ciki poin 3");
		}
		else if (tukar==permen) {
			System.out.println("Menukar dengan Permen poin 1");
		}
	}


	sisaPoin = sisaPoin - tukar;
	System.out.println("Sisa poin adalah " + sisaPoin + " poin");

	System.out.println("============================");

	if (sisaPoin > 0) {
		System.out.println("Daftar yg dapat ditukar:");

		if (sisaPoin>= esKepalMilo) {
			System.out.println("- Es kepal Milo poin : 10");
		}
		if (sisaPoin>= soyjoy) {
			System.out.println("- Soyjoy poin : 6");
		}
		if (sisaPoin >=esKepalSisri) {
			System.out.println("- Es kepal Sisri poin : 5");
		}
		if (sisaPoin>= ciki) {
			System.out.println("- Ciki poin : 3");
		}
		if (sisaPoin >= permen) {
			System.out.println("- Permen poin : 1");
		}
	}
	else if (sisaPoin == 0) {
		System.out.println("Maaf poin anda habis");
	}
	
	System.out.println();
	System.out.print ("Tukar poin : ");
	tukar = keyboard.nextInt ();

	if (sisaPoin > 0) {
		if (tukar == esKepalMilo) {
			System.out.println("Menukar dengan Es kepal Milo poin 10");
		}
		else if (tukar == soyjoy) {
			System.out.println("Menukar dengan Soyjoy poin 6");
		}
		else if (tukar == esKepalSisri) {
			System.out.println("Menukar dengan Es kepal Sisri poin 5");
		}
		else if (tukar==ciki) {
			System.out.println("Menukar dengan Ciki poin 3");
		}
		else if (tukar==permen) {
			System.out.println("Menukar dengan Permen poin 1");
		}
	}


	sisaPoin = sisaPoin - tukar;
	System.out.println("Sisa poin adalah " + sisaPoin + " poin");

	System.out.println("============================");

	if (sisaPoin > 0) {
		System.out.println("Daftar yg dapat ditukar:");

		if (sisaPoin>= esKepalMilo) {
			System.out.println("- Es kepal Milo poin : 10");
		}
		if (sisaPoin>= soyjoy) {
			System.out.println("- Soyjoy poin : 6");
		}
		if (sisaPoin >=esKepalSisri) {
			System.out.println("- Es kepal Sisri poin : 5");
		}
		if (sisaPoin>= ciki) {
			System.out.println("- Ciki poin : 3");
		}
		if (sisaPoin >= permen) {
			System.out.println("- Permen poin : 1");
		}
	}
	else if (sisaPoin == 0) {
		System.out.println("Maaf poin anda habis");
	}
	
	System.out.println();
	System.out.print ("Tukar poin : ");
	tukar = keyboard.nextInt ();

	if (sisaPoin > 0) {
		if (tukar == esKepalMilo) {
			System.out.println("Menukar dengan Es kepal Milo poin 10");
		}
		else if (tukar == soyjoy) {
			System.out.println("Menukar dengan Soyjoy poin 6");
		}
		else if (tukar == esKepalSisri) {
			System.out.println("Menukar dengan Es kepal Sisri poin 5");
		}
		else if (tukar==ciki) {
			System.out.println("Menukar dengan Ciki poin 3");
		}
		else if (tukar==permen) {
			System.out.println("Menukar dengan Permen poin 1");
		}
	}


	sisaPoin = sisaPoin - tukar;
	System.out.println("Sisa poin adalah " + sisaPoin + " poin");

	System.out.println("============================");

	if (sisaPoin > 0) {
		System.out.println("Daftar yg dapat ditukar:");

		if (sisaPoin>= esKepalMilo) {
			System.out.println("- Es kepal Milo poin : 10");
		}
		if (sisaPoin>= soyjoy) {
			System.out.println("- Soyjoy poin : 6");
		}
		if (sisaPoin >=esKepalSisri) {
			System.out.println("- Es kepal Sisri poin : 5");
		}
		if (sisaPoin>= ciki) {
			System.out.println("- Ciki poin : 3");
		}
		if (sisaPoin >= permen) {
			System.out.println("- Permen poin : 1");
		}
	}
	else if (sisaPoin == 0) {
		System.out.println("Maaf poin anda habis");
	}
	
	System.out.println();
	System.out.print ("Tukar poin : ");
	tukar = keyboard.nextInt ();

	if (sisaPoin > 0) {
		if (tukar == esKepalMilo) {
			System.out.println("Menukar dengan Es kepal Milo poin 10");
		}
		else if (tukar == soyjoy) {
			System.out.println("Menukar dengan Soyjoy poin 6");
		}
		else if (tukar == esKepalSisri) {
			System.out.println("Menukar dengan Es kepal Sisri poin 5");
		}
		else if (tukar==ciki) {
			System.out.println("Menukar dengan Ciki poin 3");
		}
		else if (tukar==permen) {
			System.out.println("Menukar dengan Permen poin 1");
		}
	}


	sisaPoin = sisaPoin - tukar;
	System.out.println("Sisa poin adalah " + sisaPoin + " poin");

	System.out.println("============================");

	if (sisaPoin > 0) {
		System.out.println("Daftar yg dapat ditukar:");

		if (sisaPoin>= esKepalMilo) {
			System.out.println("- Es kepal Milo poin : 10");
		}
		if (sisaPoin>= soyjoy) {
			System.out.println("- Soyjoy poin : 6");
		}
		if (sisaPoin >=esKepalSisri) {
			System.out.println("- Es kepal Sisri poin : 5");
		}
		if (sisaPoin>= ciki) {
			System.out.println("- Ciki poin : 3");
		}
		if (sisaPoin >= permen) {
			System.out.println("- Permen poin : 1");
		}
	}
	else if (sisaPoin == 0) {
		System.out.println("Maaf poin anda habis");
	}
	
	System.out.println();
	System.out.print ("Tukar poin : ");
	tukar = keyboard.nextInt ();

	if (sisaPoin > 0) {
		if (tukar == esKepalMilo) {
			System.out.println("Menukar dengan Es kepal Milo poin 10");
		}
		else if (tukar == soyjoy) {
			System.out.println("Menukar dengan Soyjoy poin 6");
		}
		else if (tukar == esKepalSisri) {
			System.out.println("Menukar dengan Es kepal Sisri poin 5");
		}
		else if (tukar==ciki) {
			System.out.println("Menukar dengan Ciki poin 3");
		}
		else if (tukar==permen) {
			System.out.println("Menukar dengan Permen poin 1");
		}
	}


	sisaPoin = sisaPoin - tukar;
	System.out.println("Sisa poin adalah " + sisaPoin + " poin");

	System.out.println("============================");

	if (sisaPoin > 0) {
		System.out.println("Daftar yg dapat ditukar:");

		if (sisaPoin>= esKepalMilo) {
			System.out.println("- Es kepal Milo poin : 10");
		}
		if (sisaPoin>= soyjoy) {
			System.out.println("- Soyjoy poin : 6");
		}
		if (sisaPoin >=esKepalSisri) {
			System.out.println("- Es kepal Sisri poin : 5");
		}
		if (sisaPoin>= ciki) {
			System.out.println("- Ciki poin : 3");
		}
		if (sisaPoin >= permen) {
			System.out.println("- Permen poin : 1");
		}
	}
	else if (sisaPoin == 0) {
		System.out.println("Maaf poin anda habis");
	}
	
	System.out.println();
	System.out.print ("Tukar poin : ");
	tukar = keyboard.nextInt ();

	if (sisaPoin > 0) {
		if (tukar == esKepalMilo) {
			System.out.println("Menukar dengan Es kepal Milo poin 10");
		}
		else if (tukar == soyjoy) {
			System.out.println("Menukar dengan Soyjoy poin 6");
		}
		else if (tukar == esKepalSisri) {
			System.out.println("Menukar dengan Es kepal Sisri poin 5");
		}
		else if (tukar==ciki) {
			System.out.println("Menukar dengan Ciki poin 3");
		}
		else if (tukar==permen) {
			System.out.println("Menukar dengan Permen poin 1");
		}
	}


	sisaPoin = sisaPoin - tukar;
	System.out.println("Sisa poin adalah " + sisaPoin + " poin");

	System.out.println("============================");

	if (sisaPoin > 0) {
		System.out.println("Daftar yg dapat ditukar:");

		if (sisaPoin>= esKepalMilo) {
			System.out.println("- Es kepal Milo poin : 10");
		}
		if (sisaPoin>= soyjoy) {
			System.out.println("- Soyjoy poin : 6");
		}
		if (sisaPoin >=esKepalSisri) {
			System.out.println("- Es kepal Sisri poin : 5");
		}
		if (sisaPoin>= ciki) {
			System.out.println("- Ciki poin : 3");
		}
		if (sisaPoin >= permen) {
			System.out.println("- Permen poin : 1");
		}
	}
	else if (sisaPoin == 0) {
		System.out.println("Maaf poin anda habis");
	}
	
	System.out.println();
	System.out.print ("Tukar poin : ");
	tukar = keyboard.nextInt ();

	if (sisaPoin > 0) {
		if (tukar == esKepalMilo) {
			System.out.println("Menukar dengan Es kepal Milo poin 10");
		}
		else if (tukar == soyjoy) {
			System.out.println("Menukar dengan Soyjoy poin 6");
		}
		else if (tukar == esKepalSisri) {
			System.out.println("Menukar dengan Es kepal Sisri poin 5");
		}
		else if (tukar==ciki) {
			System.out.println("Menukar dengan Ciki poin 3");
		}
		else if (tukar==permen) {
			System.out.println("Menukar dengan Permen poin 1");
		}
	}


	sisaPoin = sisaPoin - tukar;
	System.out.println("Sisa poin adalah " + sisaPoin + " poin");

	System.out.println("============================");

	if (sisaPoin > 0) {
		System.out.println("Daftar yg dapat ditukar:");

		if (sisaPoin>= esKepalMilo) {
			System.out.println("- Es kepal Milo poin : 10");
		}
		if (sisaPoin>= soyjoy) {
			System.out.println("- Soyjoy poin : 6");
		}
		if (sisaPoin >=esKepalSisri) {
			System.out.println("- Es kepal Sisri poin : 5");
		}
		if (sisaPoin>= ciki) {
			System.out.println("- Ciki poin : 3");
		}
		if (sisaPoin >= permen) {
			System.out.println("- Permen poin : 1");
		}
	}
	else if (sisaPoin == 0) {
		System.out.println("Maaf poin anda habis");
	}
	
	System.out.println();
	System.out.print ("Tukar poin : ");
	tukar = keyboard.nextInt ();

	if (sisaPoin > 0) {
		if (tukar == esKepalMilo) {
			System.out.println("Menukar dengan Es kepal Milo poin 10");
		}
		else if (tukar == soyjoy) {
			System.out.println("Menukar dengan Soyjoy poin 6");
		}
		else if (tukar == esKepalSisri) {
			System.out.println("Menukar dengan Es kepal Sisri poin 5");
		}
		else if (tukar==ciki) {
			System.out.println("Menukar dengan Ciki poin 3");
		}
		else if (tukar==permen) {
			System.out.println("Menukar dengan Permen poin 1");
		}
	}


	sisaPoin = sisaPoin - tukar;
	System.out.println("Sisa poin adalah " + sisaPoin + " poin");

	System.out.println("============================");

	if (sisaPoin > 0) {
		System.out.println("Daftar yg dapat ditukar:");

		if (sisaPoin>= esKepalMilo) {
			System.out.println("- Es kepal Milo poin : 10");
		}
		if (sisaPoin>= soyjoy) {
			System.out.println("- Soyjoy poin : 6");
		}
		if (sisaPoin >=esKepalSisri) {
			System.out.println("- Es kepal Sisri poin : 5");
		}
		if (sisaPoin>= ciki) {
			System.out.println("- Ciki poin : 3");
		}
		if (sisaPoin >= permen) {
			System.out.println("- Permen poin : 1");
		}
	}
	else if (sisaPoin == 0) {
		System.out.println("Maaf poin anda habis");
	}
	
	System.out.println();
	System.out.print ("Tukar poin : ");
	tukar = keyboard.nextInt ();

	if (sisaPoin > 0) {
		if (tukar == esKepalMilo) {
			System.out.println("Menukar dengan Es kepal Milo poin 10");
		}
		else if (tukar == soyjoy) {
			System.out.println("Menukar dengan Soyjoy poin 6");
		}
		else if (tukar == esKepalSisri) {
			System.out.println("Menukar dengan Es kepal Sisri poin 5");
		}
		else if (tukar==ciki) {
			System.out.println("Menukar dengan Ciki poin 3");
		}
		else if (tukar==permen) {
			System.out.println("Menukar dengan Permen poin 1");
		}
	}


	sisaPoin = sisaPoin - tukar;
	System.out.println("Sisa poin adalah " + sisaPoin + " poin");

	System.out.println("============================");

	if (sisaPoin > 0) {
		System.out.println("Daftar yg dapat ditukar:");

		if (sisaPoin>= esKepalMilo) {
			System.out.println("- Es kepal Milo poin : 10");
		}
		if (sisaPoin>= soyjoy) {
			System.out.println("- Soyjoy poin : 6");
		}
		if (sisaPoin >=esKepalSisri) {
			System.out.println("- Es kepal Sisri poin : 5");
		}
		if (sisaPoin>= ciki) {
			System.out.println("- Ciki poin : 3");
		}
		if (sisaPoin >= permen) {
			System.out.println("- Permen poin : 1");
		}
	}
	else if (sisaPoin == 0) {
		System.out.println("Maaf poin anda habis");
	}
	
	System.out.println();
	System.out.print ("Tukar poin : ");
	tukar = keyboard.nextInt ();

	if (sisaPoin > 0) {
		if (tukar == esKepalMilo) {
			System.out.println("Menukar dengan Es kepal Milo poin 10");
		}
		else if (tukar == soyjoy) {
			System.out.println("Menukar dengan Soyjoy poin 6");
		}
		else if (tukar == esKepalSisri) {
			System.out.println("Menukar dengan Es kepal Sisri poin 5");
		}
		else if (tukar==ciki) {
			System.out.println("Menukar dengan Ciki poin 3");
		}
		else if (tukar==permen) {
			System.out.println("Menukar dengan Permen poin 1");
		}
	}


	sisaPoin = sisaPoin - tukar;
	System.out.println("Sisa poin adalah " + sisaPoin + " poin");

	System.out.println("============================");

	if (sisaPoin > 0) {
		System.out.println("Daftar yg dapat ditukar:");

		if (sisaPoin>= esKepalMilo) {
			System.out.println("- Es kepal Milo poin : 10");
		}
		if (sisaPoin>= soyjoy) {
			System.out.println("- Soyjoy poin : 6");
		}
		if (sisaPoin >=esKepalSisri) {
			System.out.println("- Es kepal Sisri poin : 5");
		}
		if (sisaPoin>= ciki) {
			System.out.println("- Ciki poin : 3");
		}
		if (sisaPoin >= permen) {
			System.out.println("- Permen poin : 1");
		}
	}
	else if (sisaPoin == 0) {
		System.out.println("Maaf poin anda habis");
	}
	
	System.out.println();
	System.out.print ("Tukar poin : ");
	tukar = keyboard.nextInt ();

	if (sisaPoin > 0) {
		if (tukar == esKepalMilo) {
			System.out.println("Menukar dengan Es kepal Milo poin 10");
		}
		else if (tukar == soyjoy) {
			System.out.println("Menukar dengan Soyjoy poin 6");
		}
		else if (tukar == esKepalSisri) {
			System.out.println("Menukar dengan Es kepal Sisri poin 5");
		}
		else if (tukar==ciki) {
			System.out.println("Menukar dengan Ciki poin 3");
		}
		else if (tukar==permen) {
			System.out.println("Menukar dengan Permen poin 1");
		}
	}


	sisaPoin = sisaPoin - tukar;
	System.out.println("Sisa poin adalah " + sisaPoin + " poin");

	System.out.println("============================");

	if (sisaPoin > 0) {
		System.out.println("Daftar yg dapat ditukar:");

		if (sisaPoin>= esKepalMilo) {
			System.out.println("- Es kepal Milo poin : 10");
		}
		if (sisaPoin>= soyjoy) {
			System.out.println("- Soyjoy poin : 6");
		}
		if (sisaPoin >=esKepalSisri) {
			System.out.println("- Es kepal Sisri poin : 5");
		}
		if (sisaPoin>= ciki) {
			System.out.println("- Ciki poin : 3");
		}
		if (sisaPoin >= permen) {
			System.out.println("- Permen poin : 1");
		}
	}
	else if (sisaPoin == 0) {
		System.out.println("Maaf poin anda habis");
	}
	
	System.out.println();
	System.out.print ("Tukar poin : ");
	tukar = keyboard.nextInt ();

	if (sisaPoin > 0) {
		if (tukar == esKepalMilo) {
			System.out.println("Menukar dengan Es kepal Milo poin 10");
		}
		else if (tukar == soyjoy) {
			System.out.println("Menukar dengan Soyjoy poin 6");
		}
		else if (tukar == esKepalSisri) {
			System.out.println("Menukar dengan Es kepal Sisri poin 5");
		}
		else if (tukar==ciki) {
			System.out.println("Menukar dengan Ciki poin 3");
		}
		else if (tukar==permen) {
			System.out.println("Menukar dengan Permen poin 1");
		}
	}


	sisaPoin = sisaPoin - tukar;
	System.out.println("Sisa poin adalah " + sisaPoin + " poin");

	System.out.println("============================");

	if (sisaPoin > 0) {
		System.out.println("Daftar yg dapat ditukar:");

		if (sisaPoin>= esKepalMilo) {
			System.out.println("- Es kepal Milo poin : 10");
		}
		if (sisaPoin>= soyjoy) {
			System.out.println("- Soyjoy poin : 6");
		}
		if (sisaPoin >=esKepalSisri) {
			System.out.println("- Es kepal Sisri poin : 5");
		}
		if (sisaPoin>= ciki) {
			System.out.println("- Ciki poin : 3");
		}
		if (sisaPoin >= permen) {
			System.out.println("- Permen poin : 1");
		}
	}
	else if (sisaPoin == 0) {
		System.out.println("Maaf poin anda habis");
	}
	
	System.out.println();
	System.out.print ("Tukar poin : ");
	tukar = keyboard.nextInt ();

	if (sisaPoin > 0) {
		if (tukar == esKepalMilo) {
			System.out.println("Menukar dengan Es kepal Milo poin 10");
		}
		else if (tukar == soyjoy) {
			System.out.println("Menukar dengan Soyjoy poin 6");
		}
		else if (tukar == esKepalSisri) {
			System.out.println("Menukar dengan Es kepal Sisri poin 5");
		}
		else if (tukar==ciki) {
			System.out.println("Menukar dengan Ciki poin 3");
		}
		else if (tukar==permen) {
			System.out.println("Menukar dengan Permen poin 1");
		}
	}


	sisaPoin = sisaPoin - tukar;
	System.out.println("Sisa poin adalah " + sisaPoin + " poin");

	System.out.println("============================");

	if (sisaPoin > 0) {
		System.out.println("Daftar yg dapat ditukar:");

		if (sisaPoin>= esKepalMilo) {
			System.out.println("- Es kepal Milo poin : 10");
		}
		if (sisaPoin>= soyjoy) {
			System.out.println("- Soyjoy poin : 6");
		}
		if (sisaPoin >=esKepalSisri) {
			System.out.println("- Es kepal Sisri poin : 5");
		}
		if (sisaPoin>= ciki) {
			System.out.println("- Ciki poin : 3");
		}
		if (sisaPoin >= permen) {
			System.out.println("- Permen poin : 1");
		}
	}
	else if (sisaPoin == 0) {
		System.out.println("Maaf poin anda habis");
	}
	
	System.out.println();
	System.out.print ("Tukar poin : ");
	tukar = keyboard.nextInt ();

	if (sisaPoin > 0) {
		if (tukar == esKepalMilo) {
			System.out.println("Menukar dengan Es kepal Milo poin 10");
		}
		else if (tukar == soyjoy) {
			System.out.println("Menukar dengan Soyjoy poin 6");
		}
		else if (tukar == esKepalSisri) {
			System.out.println("Menukar dengan Es kepal Sisri poin 5");
		}
		else if (tukar==ciki) {
			System.out.println("Menukar dengan Ciki poin 3");
		}
		else if (tukar==permen) {
			System.out.println("Menukar dengan Permen poin 1");
		}
	}


	sisaPoin = sisaPoin - tukar;
	System.out.println("Sisa poin adalah " + sisaPoin + " poin");

	System.out.println("============================");

	if (sisaPoin > 0) {
		System.out.println("Daftar yg dapat ditukar:");

		if (sisaPoin>= esKepalMilo) {
			System.out.println("- Es kepal Milo poin : 10");
		}
		if (sisaPoin>= soyjoy) {
			System.out.println("- Soyjoy poin : 6");
		}
		if (sisaPoin >=esKepalSisri) {
			System.out.println("- Es kepal Sisri poin : 5");
		}
		if (sisaPoin>= ciki) {
			System.out.println("- Ciki poin : 3");
		}
		if (sisaPoin >= permen) {
			System.out.println("- Permen poin : 1");
		}
	}
	else if (sisaPoin == 0) {
		System.out.println("Maaf poin anda habis");
	}
	
	System.out.println();
	System.out.print ("Tukar poin : ");
	tukar = keyboard.nextInt ();

	if (sisaPoin > 0) {
		if (tukar == esKepalMilo) {
			System.out.println("Menukar dengan Es kepal Milo poin 10");
		}
		else if (tukar == soyjoy) {
			System.out.println("Menukar dengan Soyjoy poin 6");
		}
		else if (tukar == esKepalSisri) {
			System.out.println("Menukar dengan Es kepal Sisri poin 5");
		}
		else if (tukar==ciki) {
			System.out.println("Menukar dengan Ciki poin 3");
		}
		else if (tukar==permen) {
			System.out.println("Menukar dengan Permen poin 1");
		}
	}


	sisaPoin = sisaPoin - tukar;
	System.out.println("Sisa poin adalah " + sisaPoin + " poin");

	System.out.println("============================");

	if (sisaPoin > 0) {
		System.out.println("Daftar yg dapat ditukar:");

		if (sisaPoin>= esKepalMilo) {
			System.out.println("- Es kepal Milo poin : 10");
		}
		if (sisaPoin>= soyjoy) {
			System.out.println("- Soyjoy poin : 6");
		}
		if (sisaPoin >=esKepalSisri) {
			System.out.println("- Es kepal Sisri poin : 5");
		}
		if (sisaPoin>= ciki) {
			System.out.println("- Ciki poin : 3");
		}
		if (sisaPoin >= permen) {
			System.out.println("- Permen poin : 1");
		}
	}
	else if (sisaPoin == 0) {
		System.out.println("Maaf poin anda habis");
	}
	
	System.out.println();
	System.out.print ("Tukar poin : ");
	tukar = keyboard.nextInt ();

	if (sisaPoin > 0) {
		if (tukar == esKepalMilo) {
			System.out.println("Menukar dengan Es kepal Milo poin 10");
		}
		else if (tukar == soyjoy) {
			System.out.println("Menukar dengan Soyjoy poin 6");
		}
		else if (tukar == esKepalSisri) {
			System.out.println("Menukar dengan Es kepal Sisri poin 5");
		}
		else if (tukar==ciki) {
			System.out.println("Menukar dengan Ciki poin 3");
		}
		else if (tukar==permen) {
			System.out.println("Menukar dengan Permen poin 1");
		}
	}


	sisaPoin = sisaPoin - tukar;
	System.out.println("Sisa poin adalah " + sisaPoin + " poin");

	System.out.println("============================");

	if (sisaPoin > 0) {
		System.out.println("Daftar yg dapat ditukar:");

		if (sisaPoin>= esKepalMilo) {
			System.out.println("- Es kepal Milo poin : 10");
		}
		if (sisaPoin>= soyjoy) {
			System.out.println("- Soyjoy poin : 6");
		}
		if (sisaPoin >=esKepalSisri) {
			System.out.println("- Es kepal Sisri poin : 5");
		}
		if (sisaPoin>= ciki) {
			System.out.println("- Ciki poin : 3");
		}
		if (sisaPoin >= permen) {
			System.out.println("- Permen poin : 1");
		}
	}
	else if (sisaPoin == 0) {
		System.out.println("Maaf poin anda habis");
	}
	
	System.out.println();
	System.out.print ("Tukar poin : ");
	tukar = keyboard.nextInt ();

	if (sisaPoin > 0) {
		if (tukar == esKepalMilo) {
			System.out.println("Menukar dengan Es kepal Milo poin 10");
		}
		else if (tukar == soyjoy) {
			System.out.println("Menukar dengan Soyjoy poin 6");
		}
		else if (tukar == esKepalSisri) {
			System.out.println("Menukar dengan Es kepal Sisri poin 5");
		}
		else if (tukar==ciki) {
			System.out.println("Menukar dengan Ciki poin 3");
		}
		else if (tukar==permen) {
			System.out.println("Menukar dengan Permen poin 1");
		}
	}


	sisaPoin = sisaPoin - tukar;
	System.out.println("Sisa poin adalah " + sisaPoin + " poin");

	System.out.println("============================");

	if (sisaPoin > 0) {
		System.out.println("Daftar yg dapat ditukar:");

		if (sisaPoin>= esKepalMilo) {
			System.out.println("- Es kepal Milo poin : 10");
		}
		if (sisaPoin>= soyjoy) {
			System.out.println("- Soyjoy poin : 6");
		}
		if (sisaPoin >=esKepalSisri) {
			System.out.println("- Es kepal Sisri poin : 5");
		}
		if (sisaPoin>= ciki) {
			System.out.println("- Ciki poin : 3");
		}
		if (sisaPoin >= permen) {
			System.out.println("- Permen poin : 1");
		}
	}
	else if (sisaPoin == 0) {
		System.out.println("Maaf poin anda habis");
	}
	
	System.out.println();
	System.out.print ("Tukar poin : ");
	tukar = keyboard.nextInt ();

	if (sisaPoin > 0) {
		if (tukar == esKepalMilo) {
			System.out.println("Menukar dengan Es kepal Milo poin 10");
		}
		else if (tukar == soyjoy) {
			System.out.println("Menukar dengan Soyjoy poin 6");
		}
		else if (tukar == esKepalSisri) {
			System.out.println("Menukar dengan Es kepal Sisri poin 5");
		}
		else if (tukar==ciki) {
			System.out.println("Menukar dengan Ciki poin 3");
		}
		else if (tukar==permen) {
			System.out.println("Menukar dengan Permen poin 1");
		}
	}


	sisaPoin = sisaPoin - tukar;
	System.out.println("Sisa poin adalah " + sisaPoin + " poin");

	System.out.println("============================");

	

}
}


/*
3. Budi mengikuti lomba 17an dan berkesempatan mendapatkan banyak hadiah jika mendapatkan banyak poin dengan jumlah poin adalah max. 25 poin/orang.
Berikut adalah daftar hadiah beserta poinnya.
Permen poin : 1
Ciki poin : 3
Es kepal Sisri poin : 5
Soyjoy poin : 6
Es kepal Milo poin : 10

Tampilkan daftar hadiah yang dapat ditukar oleh Budi dengan poinnya.
Serta tampilkan sisa poin Budi.
Jika tidak tidak memiliki poin maka tidak bisa menukar poin.

Contoh output:

============================
(Input) Masukkan poin Budi : 5

Daftar yg dapat ditukar:
- Es kepal Sisri poin : 5
- Ciki poin : 3
- Permen poin : 1

(Input) Tukar poin : 3

Menukar dengan Ciki poin 3
Sisa poin adalah 2 poin

=============================

Daftar yang dapat ditukar:
- Permen poin: 1

(Input) Tukar poin : 1

Menukar dengan Permen poin 1
Sisa poin adalah 1 poin

=============================

Daftar yang dapat ditukar:
- Permen poin: 1

(Input) Tukar poin : 1

Menukar dengan Permen poin 1
Sisa poin adalah 0 poin

============================= */