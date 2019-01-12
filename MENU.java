package com.pivot.json;

import java.util.List;

public class MENU{
    public static class Menuitem{
        private String onclick;
        public String getOnclick(){
            return this.onclick;
        }
        public void SetOnclick(String onclick){
            this.onclick=onclick;
        }
        private String value;
        public String getValue(){
            return this.value;
        }
        public void SetValue(String value){
            this.value=value;
        }
    }
    public static class Popup{
        private List<Menuitem> menuitem;
        public List<Menuitem> getMenuitem(){
            return this.menuitem;
        }
        public void SetMenuitem(List<Menuitem> menuitem){
            this.menuitem=menuitem;
        }
    }
    public static class Menu{
        private Popup popup;
        public Popup getPopup(){
            return this.popup;
        }
        public void SetPopup(Popup popup){
            this.popup=popup;
        }
        private String id;
        public String getId(){
            return this.id;
        }
        public void SetId(String id){
            this.id=id;
        }
        private String value;
        public String getValue(){
            return this.value;
        }
        public void SetValue(String value){
            this.value=value;
        }
    }
    private Menu menu;
    public Menu getMenu(){
        return this.menu;
    }
    public void SetMenu(Menu menu){
        this.menu=menu;
    }
}