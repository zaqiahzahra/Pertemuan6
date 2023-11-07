package Pertemuan6;
public class MainUser {
public static void main(String[] args) {
    User user = new User();
    
    user.SetUsername("zakia");
    user.SetPassword("halo");
    
    System.out.println("Username : " + user.GetUsername("zakia") );
    System.out.println("Pasword : " + user.GetPassword("halo"));
        
        
    }
    
}
