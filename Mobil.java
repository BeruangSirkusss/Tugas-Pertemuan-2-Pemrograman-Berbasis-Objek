public class Mobil {
    String merk;
    String warna;
    int kecepatan;

    public void setDataMobil(String b,String warna, int k) {
        merk = b;
        kecepatan = k;
        this. warna = warna;

    }

    public String getMerk(){
        return merk;
    }

    public String getWarna(){
        return warna;

    }

    public int getKecepatan(){
        return kecepatan;
    }

    public void tambahKecepatan (int k){
        kecepatan += k;

    }

    public void NyalakanMobil(){
         
    }


    public void infoMobil(){
        System.out.println("Merk :" + getMerk());
        System.out.println("warna :" + getWarna());
        System.out.println("kecepatan :" + getKecepatan());
        System.out.println("==========");
    }

} 