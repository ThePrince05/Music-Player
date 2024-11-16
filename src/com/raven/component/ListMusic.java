package com.raven.component;


import com.raven.model.Model_Music;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;


public class ListMusic<E extends Object> extends JList<E>{
    
    private final DefaultListModel model;
    private int playIndex =- 1;
    
    
    public ListMusic(){
        model = new DefaultListModel();
        setModel(model);
        setOpaque(false);
       
    }
    
    @Override
    public ListCellRenderer getCellRenderer(){
        return new DefaultListCellRenderer(){
            
            @Override
            public Component getListCellRendererComponent(JList<?> jList, Object o, int index, boolean selected, boolean focus){
                
                Model_Music data;
                
                if(o instanceof Model_Music){
                   data = (Model_Music) o; 
                }
                else{
                  data = new Model_Music("1","No Music", "00:00");  
                }
                ItemMusic item = new ItemMusic(data);
                item.setPlay(index == playIndex);
                
                return item;
            }
        }; 
    }
    
   public void addItem(Model_Music data){
       model.addElement(data); 
   }
}
