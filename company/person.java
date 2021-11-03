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
class person {
    public  String name ;
    public String adress;
    public int phone;
    public String email;

    public person(String name, String adress, int phone, String email) {
        this.name = name;
        this.adress = adress;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return name  ;
    }
    
    
    
    
}
