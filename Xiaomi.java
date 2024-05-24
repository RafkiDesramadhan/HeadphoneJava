import interfaces.Phone;

public class Xiaomi implements Phone{
    private int volume;
    private boolean isPowerOn;

    public Xiaomi(){
        // set volume awal
        this.volume = 50;
    }

    public void powerOn(){
        isPowerOn = true;
        System.out.println("Handphone menyala...");
        System.out.println("Selamat datang di Xiaomi");
        System.out.println("Android Version 10");
    }

    public void powerOff(){
        isPowerOn = false;
        System.out.println("Mematikan Handphone");
    }

    public void volumeUp(){
        if(isPowerOn){
            if(this.volume == MAX_VOLUME){
                System.out.println("Volume Sudah Maximal!!!");
                System.out.println("Volume = "+this.volume+"%");
            } else {
                this.volume += 10;
                System.out.println("Volume Sekarang "+this.volume+"%");
            }
        } else {
            System.out.println("Handphone mati, silahkan nyalakan dulu!!!");
        }
    }

    public void volumeDown(){
        if(isPowerOn){
            if(this.volume == MIN_VOLUME){
                System.out.println("Volume = "+this.volume+"%");
            } else {
                this.volume -= 10;
                System.out.println("Volume sekarang "+this.volume+"%");
            }
        } else {
            System.out.println("Handphone mati, silahkan nyalakan dulu!!!");
        }
    }

    // getter setter
    public int getVolume(){
        return volume;
    }

    public void setVolume(int volume){
        this.volume = volume;
    }

    public boolean isPowerOn(){
        return this.isPowerOn;
    }

    public void setPowerOn(boolean isPowerOn){
        this.isPowerOn = isPowerOn;
    }
}
