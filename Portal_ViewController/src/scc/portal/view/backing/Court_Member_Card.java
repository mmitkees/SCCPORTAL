package scc.portal.view.backing;

import java.util.Date;

public class Court_Member_Card {
    String member_name;
    String member_Date;
    String member_image;
    String member_cv_link;
    
    public Court_Member_Card(String member_name,
                             String member_Date,
                             String member_image,
                             String member_cv_link) {
        this.member_name=member_name;
        this.member_Date=member_Date;
        this.member_image=member_image;
        this.member_cv_link=member_cv_link;
        
    }
    public void  setmember_name(String member_name) {
        this.member_name=member_name;
    }
    public String  getmember_name() {
        return this.member_name;
    }
    public void  setmember_Date(String member_Date) {
        this.member_Date=member_Date;
    }
    public String  getmember_Date() {
        return this.member_Date;
    }
    public void  setmember_image(String member_image) {
        this.member_image=member_image;
    }
    public String  getmember_image() {
        return this.member_image;
    }
    public void  setmember_cv_link(String member_cv_link) {
        this.member_cv_link=member_cv_link;
    }
    public String  getmember_cv_link() {
        return this.member_cv_link;
    }
    

}
