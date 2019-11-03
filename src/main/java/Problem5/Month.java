/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem5;

/**
 *
 * @author vueld
 */
public class Month
{
    private int monthNumber;
    private String monthName;
    
    public Month(int monthNumber)
    {
        this.monthNumber = monthNumber;
        if(monthNumber < 1 || monthNumber > 12)
        {
            this.monthNumber = 1;
        }
    }
    
    public Month(String monthName)
    {
        this.monthName = monthName;
        
        switch (monthName)
        {
            case "January":
                monthNumber = 1;
                break;
            case "February":
                monthNumber = 2;
                break;
            case "March":
                monthNumber = 3;
                break;
            case "April":
                monthNumber = 4;
                break;
            case "May":
                monthNumber = 5;
                break;
            case "June":
                monthNumber = 6;
                break;
            case "July":
                monthNumber = 7;
                break;
            case "August":
                monthNumber = 8;
                break;
            case "September":
                monthNumber = 9;
                break;
            case "October":
                monthNumber = 10;
                break;
            case "November":
                monthNumber = 11;
                break;
            case "December":
                monthNumber = 12;
                break;
            default:
                break;
        }
    }

    public int getMonthNumber()
    {
        return monthNumber;
    }
    
    public String getMonthName()
    {
        return monthName;
    }

    public void setMonthNumber(int monthNumber)
    {
        this.monthNumber = monthNumber;
        if(monthNumber < 1 || monthNumber > 12)
        {
            this.monthNumber = 1;
        }
    }

    @Override
    public String toString()
    {
        return monthName;
    }
    
    public boolean equals(Month month1)
    {
        if(this.monthName == month1.toString())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean greaterThan(Month month1)
    {
        if(this.monthNumber > month1.getMonthNumber())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean lessThan(Month month1)
    {
        if(this.monthNumber < month1.getMonthNumber())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
