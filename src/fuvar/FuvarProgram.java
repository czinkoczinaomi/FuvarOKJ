/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuvar;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nami
 */
public class FuvarProgram {

    public static void main(String[] args) throws IOException {
       List<String> sorok=Files.readAllLines(Paths.get("fuvar.csv"));
       ArrayList<Fuvar> fuvarok=new ArrayList<>();
       
        for (int i = 1; i < sorok.size(); i++) {
            fuvarok.add(new Fuvar(sorok.get(i)));
        }
        //3. feladat
        int fuvarokSzama=fuvarok.size();
         System.out.print("3. feladat: ");
        System.out.println("fuvarok száma: "+ fuvarokSzama);
        
        int osszFuvar=0;
        double viteldij=0;
        for (int i = 0; i < fuvarokSzama; i++) {
            if (fuvarok.get(i).getTaxi_id()==6185) {
                viteldij+=fuvarok.get(i).getViteldij()*fuvarok.get(i).getIdotartam();
                osszFuvar++;
            }
            
        }
        System.out.print("4. feladat: ");
        System.out.println(osszFuvar+" fuvar alatt: "+viteldij);
        
        
    }
    
}
