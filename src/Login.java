
import java.util.Scanner;


public class Login {
    public boolean login(Hesap hesap){
            
            Scanner sca = new Scanner(System.in);
            String kullaniadi;
            String parola;
            
            System.out.println("Kullanıcı ad : ");
            kullaniadi=sca.nextLine();
            System.out.println("Parola : ");
            parola=sca.nextLine();
            
            if (hesap.getKullanici_adi().equals(kullaniadi) && hesap.getParola().equals(parola)) {
                return  true;
            }
            else{
                return  false;
            }
    }
}
