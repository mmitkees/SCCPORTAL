package scc.portal.view.backing;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.el.ELContext;
import javax.el.ExpressionFactory;

import javax.faces.context.FacesContext;

import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.fragment.RichRegion;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelTabbed;
import oracle.adf.view.rich.component.rich.layout.RichShowDetailItem;
import oracle.adf.view.rich.component.rich.output.RichMessages;

import oracle.adf.view.rich.component.rich.output.RichOutputText;

import org.apache.myfaces.trinidad.component.UIXGroup;
import org.apache.myfaces.trinidad.render.ExtendedRenderKitService;
import org.apache.myfaces.trinidad.util.Service;

public class WelcomeBack {
    private String HtmlString = "" ;
    private List<String> Court = new ArrayList <String>();
    private List<String> HighCourt= new ArrayList<String>();
    String Next_Nav,taskFlowId;
    String path="";
    private RichTable t2;
    private RichTable t3;
    private RichTable t1;
    private UIXGroup g1;
    private RichShowDetailItem sdi1;
    private RichPanelTabbed pt2;
    private RichOutputText ot8;
    private RichPanelGroupLayout pgl1;

    public WelcomeBack() {        
                 /* FacesContext context = FacesContext.getCurrentInstance();
               if(context.getExternalContext().getRequestServletPath().equals("/Portal_Pages/Welcome.jspx" )){
                  ExpressionFactory ef = context.getApplication().getExpressionFactory();
                  DCBindingContainer bc =(DCBindingContainer)ef.createValueExpression(context.getELContext(),"#{bindings}",DCBindingContainer.class).getValue(context.getELContext());
                  DCIteratorBinding it=bc.findIteratorBinding("RulesChart1Iterator");
                  for(int i=0;i<it.getViewObject().getEstimatedRowCount();i++)
                  {                    
                        Court.add(it.getRowAtRangeIndex(i).getAttribute("HighCourt").toString()); 
                       
                        HighCourt.add(it.getRowAtRangeIndex(i).getAttribute("HighDestoriaCourt").toString());                           
                  }
                 
                          ExtendedRenderKitService erks = Service.getRenderKitService(context, ExtendedRenderKitService.class);
                          erks.addScript(context, "   $(function () {\n" + 
                          "         $('#container').highcharts({\n" + 
                          "              chart :  {type : 'area'},\n" + 
                          "              title :  {text : ' '},\n" + 
                          "              subtitle :  {text : ' '},\n" + 
                          "              xAxis :  {allowDecimals : false, labels :  {\n" + 
                          "                        formatter : function () {\n" + 
                          "                        return this.value; // clean, unformatted number for year\n" + 
                          "                                              }\n" + 
                          "                                 }\n" + 
                          "                        },\n" + 
                          "              yAxis :  {\n" + 
                          "                  title :  {\n" + 
                          "                      text : ' '\n" + 
                          "                  },\n" + 
                          "                  labels :  {\n" + 
                          "                      formatter : function () {\n" + 
                          "                          /*return this.value / 1000 + 'k';\n" + 
                          "                          return this.value;\n" + 
                          "                      }\n" + 
                          "                  }\n" + 
                          "              },\n" + 
                          "              tooltip :  {\n" + 
                          "                  pointFormat : '{point.y:,.0f} {series.name} صدرت في {point.x}'\n" + 
                          "              },\n" + 
                          "              plotOptions :  {\n" + 
                          "                  area :  {\n" + 
                          "                      pointStart : 1970, marker :  {\n" + 
                          "                          enabled : false, symbol : 'circle', radius : 2, states :  {\n" + 
                          "                              hover :  {\n" + 
                          "                                  enabled : true\n" + 
                          "                              }\n" + 
                          "                          }\n" + 
                          "                      }\n" + 
                          "                  }\n" + 
                          "              },\n" + 
                          "              \n" + 
                          "              series : [\n" + 
                          "              {\n" + 
                          "                  name : 'أحكام المحكمة الدستورية العليا',\n" + 
                          "                  data : " +
                                                  HighCourt+ 
                          "              },\n" + 
                          "              {\n" + 
                          "                  name : 'أحكام المحكمة العليا',\n" + 
                          "                  data : " +
                                                 Court + 
                          "              }]\n" + 
                          "          });\n" + 
                          "      });     \n");                        

              }*/
    }
    
    public String getHtmlString(){
//        FacesContext context =  FacesContext.getCurrentInstance();
//        ELContext elContext = context.getELContext();
//        ExpressionFactory ef = context.getApplication().getExpressionFactory();
//        DCBindingContainer bc =(DCBindingContainer)ef.createValueExpression(context.getELContext(),"#{bindings}",DCBindingContainer.class).getValue(context.getELContext());
//        DCIteratorBinding it=bc.findIteratorBinding("CourtNews1Iterator"); 
//        for(int i=0;i<it.getViewObject().getEstimatedRowCount();i++)
//        {
//         HtmlString += "<article>\n" + 
//        "      <div>  <img src=" +
//        "\".." +
//        it.getRowAtRangeIndex(i).getAttribute("LargeImage") +
//            "\"></img>\n" + 
//        "      </div>\n" + 
//        "      <h4>\n" + it.getRowAtRangeIndex(i).getAttribute("NewHeadline") + 
//        "      <br/></h4>\n" + 
//        it.getRowAtRangeIndex(i).getAttribute("NewBrief") + 
//        "      <h1 align=\"left\"><br/>" + 
//        "       <a href=\"#\" class=\"btn brown\">المزيد من التفاصيل</a></h1>" + 
//        "      </article>";
//        }
//            return HtmlString;
        return "";
    }


    public void setT2(RichTable t2) {
        this.t2 = t2;
    }

    public RichTable getT2() {
        return t2;
    }

    public void setT3(RichTable t3) {
        this.t3 = t3;
    }

    public RichTable getT3() {
        return t3;
    }

    public void setT1(RichTable t1) {
        this.t1 = t1;
    }

    public RichTable getT1() {
        return t1;
    }

    public void setG1(UIXGroup g1) {
        this.g1 = g1;
    }

    public UIXGroup getG1() {
        return g1;
    }

    public void setSdi1(RichShowDetailItem sdi1) {
        this.sdi1 = sdi1;
    }

    public RichShowDetailItem getSdi1() {
        return sdi1;
    }

    public void setPt2(RichPanelTabbed pt2) {
        this.pt2 = pt2;
    }

    public RichPanelTabbed getPt2() {
        return pt2;
    }

    public void setOt8(RichOutputText ot8) {
        this.ot8 = ot8;
    }

    public RichOutputText getOt8() {
        return ot8;
    }

    public void setPgl1(RichPanelGroupLayout pgl1) {
        this.pgl1 = pgl1;
    }

    public RichPanelGroupLayout getPgl1() {
        return pgl1;
    }
}
