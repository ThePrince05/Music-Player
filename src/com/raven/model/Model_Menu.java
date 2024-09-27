package com.raven.model;

import javax.swing.Icon;
import javax.swing.ImageIcon;



public class Model_Menu {
    
    private String menuName;
    private String icon;

    public Model_Menu(String menuName, String icon) {
        this.menuName = menuName;
        this.icon = icon;
    }

    public Model_Menu() {
    }
    
    public Icon toIcon(){
        return new ImageIcon(getClass().getResource("/com/raven/icon/" + icon + ".png"));
    }
    
    public Icon toIconSelected(){
        return new ImageIcon(getClass().getResource("/com/raven/icon/" + icon + "_selected.png"));
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }
      
    public String getMenuName() {
        return menuName;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
    
}
