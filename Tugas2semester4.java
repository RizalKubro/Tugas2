

package com.mycompany.tugas2semester4;
import java.util.ArrayList;
import java.util.Arrays;
public class Tugas2semester4 {
//Penggunaan Add pada Linked List di ArrayList
       public static void main(String[] args) {
        ArrayList<String> Hewan = new ArrayList<>(Arrays.asList("Sapi","Kelinci","Kambing","Unta","Domba"));
        System.out.print("Hewan : "+Hewan);
//Penggunaan Delete pada Linked List di ArrayList
        ArrayList<String> deleteHewan = new ArrayList<>();
        deleteHewan.add("Kelinci");
        deleteHewan.add("Kambing");
        deleteHewan.add("Unta");
//Penggunaan variable warna untuk pengganti variable deleteHewan 
        ArrayList<String> hapusData = new ArrayList<>();
        for (String warna : deleteHewan){
          Hewan.removeIf(h -> h.equals(warna));
          hapusData.add(warna);
        }
        System.out.println("\nHewan yang dihapus : "+hapusData);
        System.out.println("Output Hewan yang telah dihapus : "+Hewan);
        
        
        
    }
    
}




