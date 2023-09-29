
package javaproject;

import java.util.Date;

public class Course 
{
    private String crn;
    private String className;
    private String section;
    private Hour start;
    private Hour end;
    // Class days
    private boolean[] days;
    private Profesor profesor;
    
    public Course() {
        
    }

    public String getCrn() 
    {
        return crn;
    }

    public void setCrn(String crn) 
    {
        this.crn = crn;
    }

    public String getClassName() 
    {
        return className;
    }

    public void setClassName(String className) 
    {
        this.className = className;
    }

    public String getSection() 
    {
        return section;
    }

    public void setSection(String section) 
    {
        this.section = section;
    }

    public Hour getStart() 
    {
        return start;
    }

    public void setStart(Hour start) 
    {
        this.start = start;
    }

    public Hour getEnd() 
    {
        return end;
    }

    public void setEnd(Hour end) 
    {
        this.end = end;
    }

    public boolean[] getDays() 
    {
        return days;
    }

    public void setDays(boolean[] days)
    {
        this.days = days;
    }
            
    
}
