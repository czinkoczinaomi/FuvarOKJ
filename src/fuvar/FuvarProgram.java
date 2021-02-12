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
       
        for (int i = 0; i < sorok.size(); i++) {
            fuvarok.add(new Fuvar(sorok.get(i)));
        }
    }
    
}
