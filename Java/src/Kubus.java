public class Kubus {

    int sisiKubus = 5;

    public Double hitungVolume() {

        Double volume = 0.0;
        
        double pangkat = Math.pow(this.sisiKubus, 3);
        volume =+ pangkat;

        return volume;
    }

    public int hitungLuasPermukaan() {
        
        int luasPermukaan = 0;

        int persegi = (int)Math.pow(this.sisiKubus, 2);
        luasPermukaan =+ persegi*6;

        return luasPermukaan;
    }

    public static void main(String[] args) {

        Kubus kubus = new Kubus();

        System.out.println("Volume Kubus            : "+kubus.hitungVolume());
        System.out.println("Luas Permukaan Kubus    : "+kubus.hitungLuasPermukaan());
    }
    
}
