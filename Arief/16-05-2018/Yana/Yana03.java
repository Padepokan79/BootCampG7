/*
Date Created	: 16 May 2016
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;

public class Yana03 {
	public static void main(String[] args) {
		Scanner inputKey = new Scanner(System.in);

		int poin, maxPoin, poinPermen, poinCiki, poinSisri, poinSoyjoy, poinMilo, poinTukar, nol,
		a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y;

		poinPermen = 1;
		poinCiki = 3;
		poinSisri = 5;
		poinSoyjoy = 6;
		poinMilo = 10;
		nol = 0;

		a = 1;
		b = 2;
		c = 3;
		d = 4;
		e = 5;
		f = 6;
		g = 7;
		h = 8;
		i = 9;
		j = 10;
		k = 11;
		l = 12;
		m = 13;
		n = 14;
		o = 15;
		p = 16;
		q = 17;
		r = 18;
		s = 19;
		t = 20;
		u = 21;
		v = 22;
		w = 23;
		x = 24;
		y = 25;

		maxPoin = 25;

		System.out.print("Masukan poin Budi: ");
		poin = inputKey.nextInt();

		System.out.println("Daftar yang dapat ditukar");
		if (poin >= nol) {
			System.out.println("Anda tidak punya poin");
		}
		if (poin >= poinPermen) {
			System.out.println("Permen poin : 1");
		}
		if (poin >= poinCiki) {
			System.out.println("Ciki poin : 3");
		}
		if (poin >= poinSisri) {
			System.out.println("Es Kepal Sisri poin : 5");
		}
		if (poin >= poinSoyjoy) {
			System.out.println("Soyjoy poin : 6");
		}
		if (poin >= poinMilo) {
			System.out.println("Es Kepal Milo poin : 10");
		}
		if (poin > maxPoin) {
			System.out.println("Nilai melebihi batas maksimal. Anda curang!!");
		}

		if (poin == nol) {
			// nothin happen
			System.out.println("Cek nol");
		}else {
			if (poin <= maxPoin) {
				System.out.println("Tukar Poin");
				poinTukar = inputKey.next();
				if (poinTukar <= poin) {
					System.out.println("Permen poin : 1");

					if (poin <= maxPoin) {
						System.out.println("Tukar Poin");
						poinTukar = inputKey.next();
						if (poinTukar <= poin) {
								System.out.println("Permen poin : 1");

							if (poin <= maxPoin) {
								System.out.println("Tukar Poin");
								poinTukar = inputKey.next();
								if (poinTukar <= poin) {
									System.out.println("Permen poin : 1");

									if (poin <= maxPoin) {
										System.out.println("Tukar Poin");
										poinTukar = inputKey.next();
										if (poinTukar <= poin) {
											System.out.println("Permen poin : 1");

											if (poin <= maxPoin) {
												System.out.println("Tukar Poin");
												poinTukar = inputKey.next();
												if (poinTukar <= poin) {
													System.out.println("Permen poin : 1");

													if (poin <= maxPoin) {
														System.out.println("Tukar Poin");
														poinTukar = inputKey.next();
														if (poinTukar <= poin) {
															System.out.println("Permen poin : 1");

															if (poin <= maxPoin) {
																System.out.println("Tukar Poin");
																poinTukar = inputKey.next();
																if (poinTukar <= poin) {
																	System.out.println("Permen poin : 1");

																	if (poin <= maxPoin) {
																		System.out.println("Tukar Poin");
																		poinTukar = inputKey.next();
																		if (poinTukar <= poin) {
																			System.out.println("Permen poin : 1");

																			if (poin <= maxPoin) {
																				System.out.println("Tukar Poin");
																				poinTukar = inputKey.next();
																				if (poinTukar <= poin) {
																					System.out.println("Permen poin : 1");
																				}
																			}else {
																				System.out.println("Point Habis");
																			}
																		}else {
																			System.out.println("Point Habis");
																		}
																	}else {
																		System.out.println("Point Habis");
																	}
																}else {
																	System.out.println("Point Habis");
																}
															}else {
																System.out.println("Point Habis");
															}
														}else {
															System.out.println("Point Habis");
														}
													}else {
														System.out.println("Point Habis");
													}
												}else {
													System.out.println("Point Habis");
												}
											}else {
												System.out.println("Point Habis");
											}
										}else {
											System.out.println("Point Habis");
										}
									}else {
										System.out.println("Point Habis");
									}
								}else {
									System.out.println("Point Habis");
								}
							}else {
								System.out.println("Point Habis");
							}
						}else {
							System.out.println("Point Habis");
						}
					}else {
						System.out.println("Point Habis");
					}
				}else{
					System.out.println("Point Habis");
				}
			}else {
				System.out.println("Point Habis");
			}
		}

	}
}