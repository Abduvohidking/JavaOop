public class Uchburchak {
    double katet1,katet2,gipotenuza;
    Uchburchak(){}
    Uchburchak(double katet1 , double katet2){
        this.katet1 = katet1;
        this.katet2 = katet2;
        this.gipotenuza = Math.pow(katet1,2)+ Math.pow(katet2,2);
    }

    void  yuzi(){
        double s = (katet1*katet2)/2;
        System.out.println("Uchburchak yuzi:"+s);
    }
    void perimetr(){
        double p = katet1+katet2+gipotenuza;
        System.out.println("Perimetr:"+p);
    }
}
