/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo1;

/**
 *
 * @author lenovo
 */
class User {
    private int ticket_id,passenger_id,mobile_number;
    private String book_date,ticket_description,passenger_name,email_id,flight_name;
    public User(int ticket_id,int passenger_id,String book_date,String ticket_description)
    {
        this.ticket_id=ticket_id;
        this.passenger_id=passenger_id;
        this.book_date=book_date;
        this.ticket_description=ticket_description;

    }
    public int getticket_id(){
        return ticket_id;
    }
    public int getpassenger_id(){
        return passenger_id;
    }
    public String getbook_date()
    {
        return book_date;
    }
    public String getticket_description()
    {
        return ticket_description;
    }
        
    
}
