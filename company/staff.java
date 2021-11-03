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
class staff extends employ{
   public  String title;

    public staff(String title, String office, int salary, mydata datahired, String name, String adress, int phone, String email) {
        super(office, salary, datahired, name, adress, phone, email);
        this.title = title;
    }
    @Override
    public String toString() {
        return super.name; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
