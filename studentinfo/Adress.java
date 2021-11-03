/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentinfo;

/**
 *
 * @author Hadi khaled
 */
class Adress {
    public String street , city  ,country ;

    public Adress(String street, String city, String country) {
        this.street = street;
        this.city = city;
        this.country = country;
    }
    
    public void printadress(){
        System.out.println("street/ " + street);
           System.out.println("city/ "+city);
              System.out.println("country/ "+country);
       
    }
}
