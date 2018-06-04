package bangun2D3D;

public class Segitiga {
	double sisi1, sisi2, sisi3, luasSegitiga, kelilingSegitiga;
	
	public Segitiga(double s1, double s2, double s3) {
		sisi1=s1;
		sisi2=s2;
		sisi3=s3;
	}
	
	void segi3() {
		kelilingSegitiga=sisi1+sisi2+sisi3;
		double s=0.5*(sisi1+sisi2+sisi3);
		luasSegitiga=Math.sqrt(s*(s-sisi1)*(s-sisi2)*(s-sisi3));
	}
}
