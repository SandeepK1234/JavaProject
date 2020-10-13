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
class Pass {
    private int ticket_id,passenger_id,mobile_number;
    private String passenger_name,email_id,flight_name;
    public Pass(int passenger_id,String passenger_name,String email_id,int mobile_number,String flight_name,int ticket_id)
    {
        this.passenger_id=passenger_id;
        this.passenger_name=passenger_name;
        this.email_id=email_id;
        this.mobile_number=mobile_number;
        this.flight_name=flight_name;
        this.ticket_id=ticket_id;
        
        
        
    }
    public int getpassenger_id() {
        return passenger_id;
    
    }
    public String getpassenger_name(){
        return passenger_name;
    }
    public String getemail_id(){
        return email_id;
    }
    public int getmobile_number(){
        return mobile_number;
    }
    
    public String getflight_name(){
        return flight_name;
    }
    public int getticket_id(){
        return ticket_id;
    }
    
    
    
}
