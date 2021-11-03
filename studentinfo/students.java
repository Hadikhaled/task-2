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
class students {
    public String student_name;
    private int student_id , student_GPA ;
    public subject sub ;
    public Adress adres;

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public int getStudent_GPA() {
        return student_GPA;
    }

    public void setStudent_GPA(int student_GPA) {
        this.student_GPA = student_GPA;
    }

    public students(String student_name, int student_id, int student_GPA, subject sub, Adress adres) {
        this.student_name = student_name;
        this.student_id = student_id;
        this.student_GPA = student_GPA;
        this.sub = sub;
        this.adres = adres;
    }
    
    public void  printinfo(){
        
        System.out.println("student_name/ " + student_name);
        System.out.println("student_id/ " + getStudent_id());
        System.out.println("Student_GPA/ " + getStudent_GPA());
        sub.printsubject();
        adres.printadress();
        
    }
    
}
