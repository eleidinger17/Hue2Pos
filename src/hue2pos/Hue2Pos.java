/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hue2pos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eleidinger17
 */
public class Hue2Pos {

    
    public static void main(String[] args) {
      List<String> list = new ArrayList<String>();
        HalloJavamitForEach obj = new HalloJavamitForEach(list);
        list.forEach((String s) -> System.out.println(s));
      
    }
    
}
