/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaplon;


public class Student {
    int id;
    String fullname, gender, email, phone;
    int course;
    
    public Student() {
    }

    public Student(int id, String fullname, String gender, String email, String phone, int course) {
        this.id = id;
        this.fullname = fullname;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
        this.course = course;
    }

    public Student(String fullname, String gender, String email, String phone, int course) {
        this.fullname = fullname;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
        this.course = course;
    }

    

    Student(String fullname, String gender, int course, String email, String phone) {
        this.fullname = fullname;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
        this.course = course;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getCourse() {
        return course;
    }
    public void setCourse(int course){
        this.course = course;
    }
}