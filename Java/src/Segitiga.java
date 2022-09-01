public class Segitiga {
    
    int alas = 3;
    int tinggi = 4;
    int sisiMiring = 5;

    public double hitungLuas(){
        
        Double luas = 0.5 * this.alas * this.tinggi;
        return luas;
    }

    public double hitungKeliling(){

        double keliling = this.alas + this.tinggi + this.sisiMiring;
        return keliling;
    }

    public static void main(String[] args) {
        
        Segitiga segitiga = new Segitiga();

        System.out.println("alas : "+segitiga.alas);
        System.out.println("tinggi : "+segitiga.tinggi);
        System.out.println("sisi miring : "+segitiga.sisiMiring);
        System.out.println("Luas segitiga : "+segitiga.hitungLuas());
        System.out.println("Keliling Segitiga : "+segitiga.hitungKeliling());
    }
}
