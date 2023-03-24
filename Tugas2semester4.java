

package com.mycompany.tugas2semester4;
import java.util.LinkedList;
import java.util.Arrays;
public class Tugas2semester4 {
//Penggunaan Add pada Linked List
       public static void main(String[] args) {
        LinkedList<String> Hewan = new LinkedList<>(Arrays.asList("Sapi","Kelinci","Kambing","Unta","Domba"));
        System.out.print("Hewan : "+Hewan);
//Penggunaan Delete pada Linked List 
        LinkedList<String> deleteHewan = new LinkedList<>();
        deleteHewan.add("Kelinci");
        deleteHewan.add("Kambing");
        deleteHewan.add("Unta");
//Penggunaan variable warna untuk pengganti variable deleteHewan 
        LinkedList<String> hapusData = new LinkedList<>();
        for (String warna : deleteHewan){
          Hewan.removeIf(h -> h.equals(warna));
          hapusData.add(warna);
        }
        System.out.println("\nHewan yang dihapus : "+hapusData);
        System.out.println("Output Hewan yang telah dihapus : "+Hewan);
        
        
        
    }
    
}




