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
class employ extends person{
    
     public String office ;
   public  int salary;
   public  mydata datahired;

    public employ(String office, int salary, mydata datahired, String name, String adress, int phone, String email) {
        super(name, adress, phone, email);
        this.office = office;
        this.salary = salary;
        this.datahired = datahired;
    }

    @Override
    public String toString() {
        return super.name; //To change body of generated methods, choose Tools | Templates.
    }
    
   
    
}
