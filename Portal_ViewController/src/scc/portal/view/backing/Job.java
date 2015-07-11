package scc.portal.view.backing;

public class Job {
    public Job( Court_Member_Card Court_Member_Card1,Court_Member_Card Court_Member_Card2,Court_Member_Card Court_Member_Card3) {
        this.Court_Member_Card1=Court_Member_Card1;
        this.Court_Member_Card2=Court_Member_Card2;
        this.Court_Member_Card3=Court_Member_Card3;
    }
    private Court_Member_Card Court_Member_Card1;
    private Court_Member_Card Court_Member_Card2;
    private Court_Member_Card Court_Member_Card3;
    
    public void  setCourt_Member_Card1(Court_Member_Card Court_Member_Card1) {
        this.Court_Member_Card1=Court_Member_Card1;
        }   
    public void  setCourt_Member_Card2(Court_Member_Card Court_Member_Card2) {
        this.Court_Member_Card2=Court_Member_Card2;
        }  
    public void  setCourt_Member_Card3(Court_Member_Card Court_Member_Card3) {
        this.Court_Member_Card3=Court_Member_Card3;
        }  
    public Court_Member_Card  getCourt_Member_Card3(Court_Member_Card Court_Member_Card3) {
        return this.Court_Member_Card3;
        }  
    public Court_Member_Card  getCourt_Member_Card2(Court_Member_Card Court_Member_Card2) {
        return this.Court_Member_Card2;
        }  
    public Court_Member_Card  getCourt_Member_Card1(Court_Member_Card Court_Member_Card1) {
        return this.Court_Member_Card1;
        }  
    
}
