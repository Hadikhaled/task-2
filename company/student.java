/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package company;

/**
 *
 * @author Hadi khaled
 */
class student extends person{
  public  final String freshman , sophomore , junior , senior;

   

    public student(String freshman, String sophomore, String junior, String senior, String name, String adress, int phone, String email) {
        super(name, adress, phone, email);
        this.freshman = freshman;
        this.sophomore = sophomore;
        this.junior = junior;
        this.senior = senior;
    }
    
 @Override
    public String toString() {
        return super.name; //To change body of generated methods, choose Tools | Templates.
    }
    
   
    
}
