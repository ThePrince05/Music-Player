
package com.raven.model;



public class Model_Music {
    
    private String name;
    private String time;
    private String no;
   
 
    public Model_Music() {
       
    }
    
     public Model_Music(String no, String name, String time) {
        this.no = no;
        this.name = name;
        this.time = time;
    }
     
    
    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
   
}
