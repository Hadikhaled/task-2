/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentinfo;


public class Studentinfo {


    public static void main(String[] args) {
        subject s = new subject("12", "math", "18");
        
       Adress ad = new Adress("abokorqas", "mini", "africa");
       students st = new students("hadi", 12345678, 3 , s, ad);
       
       st.printinfo();
    }
     
}
