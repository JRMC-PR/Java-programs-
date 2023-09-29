/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

public class Student extends Person 
{
    private String id ;
    private Course course;
    private Course lab;

    public Student(String id, String name, String lastName, 
            Course course, Course lab) 
    {
        this.id = id ;
        this.firstName = name ;
        this.lastName = lastName ;
        this.course = course;
        this.lab = lab;
    }
    
    
    
}
