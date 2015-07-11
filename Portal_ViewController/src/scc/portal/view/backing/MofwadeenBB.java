package scc.portal.view.backing;

import java.util.ArrayList;

import java.util.List;

import javax.el.ELContext;
import javax.el.ExpressionFactory;

import javax.faces.context.FacesContext;

import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.output.RichMessages;
import oracle.adf.view.rich.component.rich.output.RichOutputText;

import org.apache.myfaces.trinidad.component.UIXGroup;

public class MofwadeenBB {
    private RichOutputText ot1;
    private UIXGroup g1;
    private RichForm f1;
    private RichDocument d1;
    public Court_Member_Card card;
    public List<Court_Member_Card> jobList;
    private RichMessages m1;
    private RichTable t1;

    public MofwadeenBB() {
    }

    public void setOt1(RichOutputText ot1) {
        this.ot1 = ot1;
    }

    public RichOutputText getOt1() {
        return ot1;
    }

    public void setG1(UIXGroup g1) {
        this.g1 = g1;
    }

    public UIXGroup getG1() {
        return g1;
    }

    public void setF1(RichForm f1) {
        this.f1 = f1;
    }

    public RichForm getF1() {
        return f1;
    }

    public void setD1(RichDocument d1) {
        this.d1 = d1;
    }

    public RichDocument getD1() {
        return d1;
    }
    public String getSomeHtml(){
        
           jobList = new  ArrayList<Court_Member_Card>();
            FacesContext context =  FacesContext.getCurrentInstance();
            ELContext elContext = context.getELContext();
            ExpressionFactory ef = context.getApplication().getExpressionFactory();
            DCBindingContainer bc =(DCBindingContainer)ef.createValueExpression(context.getELContext(),"#{bindings}",DCBindingContainer.class).getValue(context.getELContext());
            DCIteratorBinding it=bc.findIteratorBinding("Mofwadeen1Iterator");
       
           String str= "<table WIDTH='90%' height='500px' cellspacing=5  align='CENTER' style='font-weight:bold;font-size:small;-webkit-border-radius: 15px;-moz-border-radius: 15px;overflow:hidden;border-radius: 20px;-pie-background: linear-gradient(#ece9d8, #E5ECD8); box-shadow: #666 0px 5px 10px;behavior: url(Include/PIE.htc);overflow: hidden;' >";
           for(int i=0;i<it.getViewObject().getEstimatedRowCount();)
           {
               str+="<tr>";
               for(int j=0;j<3&&i<it.getViewObject().getEstimatedRowCount();j++) 
               {
                    str+="<td height='100' width='100' align='center'  ><center>"+"<br/><img style='border-color:rgb(155,77,0); border-width:2px;border-style:solid; ' width='100' height='100' src='/SCC/Portal_Images/Members/"+
                    it.getRowAtRangeIndex(i).getAttribute("CourtMemberId")+"/"+it.getRowAtRangeIndex(i).getAttribute("SmallImage")+ "'" + " height=\"75\" width=\"50\">"+
                    "</br><a href='/SCC/Portal_Images/Members/"+
                    it.getRowAtRangeIndex(i).getAttribute("CourtMemberId")+"/"+it.getRowAtRangeIndex(i).getAttribute("CvHtml")+ "'  style='color:black'>"+
                    it.getRowAtRangeIndex(i).getAttribute("Name")+"</a><br>"+
                    (it.getRowAtRangeIndex(i).getAttribute("PrevPos")!=null?it.getRowAtRangeIndex(i).getAttribute("PrevPos")+"<br>":"")+
                    it.getRowAtRangeIndex(i).getAttribute("PeriodFrom")+"</center></td>";                    
                   i++;
                }
               str+="</tr>";               
           }
               str+="</table>";   
               return str;
    }


    public void setM1(RichMessages m1) {
        this.m1 = m1;
    }

    public RichMessages getM1() {
        return m1;
    }

    public void setT1(RichTable t1) {
        this.t1 = t1;
    }

    public RichTable getT1() {
        return t1;
    }

}
