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
class subject {
    public String subject_id , subject_name , subject_hour;

    public subject(String subject_id, String subject_name, String subject_hour) {
        this.subject_id = subject_id;
        this.subject_name = subject_name;
        this.subject_hour = subject_hour;
    }
    public void printsubject(){
        System.out.println("subject_id/ " + subject_id);
           System.out.println("subject_name/ "+subject_name);
              System.out.println("subject_hour/ "+subject_hour);
       
    }
    
}
