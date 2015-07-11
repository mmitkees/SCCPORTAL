package scc.portal.view.backing;

import java.awt.event.ActionEvent;

import java.io.IOException;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.el.ELContext;
import javax.el.ExpressionFactory;
import javax.el.MethodExpression;
import javax.faces.application.Application;
import javax.faces.context.FacesContext;
import javax.faces.event.MethodExpressionActionListener;
import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.data.RichTree;
import oracle.adf.view.rich.component.rich.fragment.RichRegion;
import oracle.adf.view.rich.component.rich.layout.RichPanelAccordion;
import oracle.adf.view.rich.component.rich.layout.RichPanelSplitter;
import oracle.adf.view.rich.component.rich.layout.RichShowDetailItem;
import oracle.adf.view.rich.component.rich.output.RichInlineFrame;
import oracle.adf.view.rich.component.rich.output.RichMessages;

import oracle.adf.view.rich.component.rich.output.RichOutputText;

import oracle.jbo.Row;
import oracle.jbo.uicli.binding.JUCtrlHierBinding;
import oracle.jbo.uicli.binding.JUCtrlHierNodeBinding;

import org.apache.myfaces.trinidad.event.SelectionEvent;
import org.apache.myfaces.trinidad.model.CollectionModel;
import org.apache.myfaces.trinidad.model.RowKeySet;
import org.apache.myfaces.trinidad.model.TreeModel;

public class MakalatBBV2 {
    private RichInlineFrame iframe_static_container_makalat;
    private RichOutputText ot1;
    private RichTree t1;
    private RichShowDetailItem sdi1;
    private RichPanelAccordion pa1;
    private RichPanelSplitter ps2;

    public MakalatBBV2() {
    }
    String path = "/Static_Content/ElMagala/HTML";
    RichOutputText des;
    public void select_tree_node(SelectionEvent selectionEvent) {
                   
             //original selection listener set by ADF     //#{bindings.allDepartments.treeModel.makeCurrent}
             String adfSelectionListener = "#{bindings.Magala2.treeModel.makeCurrent}";
             //make sure the default selection listener functionality is  //preserved. you don't need to do this for multi select trees            //as the ADF binding only supports single current row selection /* START PRESERVER DEFAULT ADF SELECT BEHAVIOR */
             FacesContext fctx = FacesContext.getCurrentInstance();
             Application application = fctx.getApplication();
             ELContext elCtx = fctx.getELContext();
             ExpressionFactory exprFactory = application.getExpressionFactory();
             
             MethodExpression me = null;
             me = exprFactory.createMethodExpression(elCtx, adfSelectionListener, 
                                                     Object.class, new Class[]{SelectionEvent.class}); 
             me.invoke(elCtx, new Object[] { selectionEvent });  

             /* END PRESERVER DEFAULT ADF SELECT BEHAVIOR */
             RichTree tree = (RichTree)selectionEvent.getSource();
             TreeModel model = (TreeModel)tree.getValue();   
            
             //get selected nodes
             RowKeySet rowKeySet = selectionEvent.getAddedSet(); 
             Iterator rksIterator = rowKeySet.iterator(); 
             //for single select configurations,this only is called once 
             while (rksIterator.hasNext()) {
               List key = (List)rksIterator.next();
               JUCtrlHierBinding treeBinding = null;
               CollectionModel collectionModel = (CollectionModel)tree.getValue();
               treeBinding = (JUCtrlHierBinding)collectionModel.getWrappedData(); 
               JUCtrlHierNodeBinding nodeBinding = null;
               nodeBinding = treeBinding.findNodeByKeyPath(key);
               Row rw = nodeBinding.getRow();
               String [] attribs=rw.getAttributeNames();
               //print first row attribute. Note that in a tree you have to 
               //determine the node type if you want to select node attributes 
               //by name and not index 
               String rowType = rw.getStructureDef().getDefName();
               if(rowType.equalsIgnoreCase("MagalaVO_SD")){
                   
                   path= "/Static_Content/ElMagala/HTML"+ (Arrays.asList(attribs).contains("Fileurl")?rw.getAttribute("Fileurl").toString():"none");
                   System.out.println("****************************************");
               }
                 else if(rowType.equalsIgnoreCase("MakalVO_SD")) {
                    path= "/Static_Content/ElMagala/HTML"+  (Arrays.asList(attribs).contains("Makalurl")?rw.getAttribute("Makalurl").toString():"none");
                   
                    }
                 iframe_static_container_makalat.setSource(path);
                 
             
             } 
        
        }
        public void link_Click_action_listener(javax.faces.event.ActionEvent actionEvent) {
        // Add event code here...
        des = (RichOutputText)actionEvent.getSource();
        path ="/Static_Content/ElMagala/HTML"+ des.getShortDesc();
    }

    public String Link_click_action() {
        iframe_static_container_makalat.setSource(path);
       return null;
    }


    public void setiframe_static_container_makalat(RichInlineFrame iframe_static_container_makalat) {
        this.iframe_static_container_makalat = iframe_static_container_makalat;
    }

    public RichInlineFrame getiframe_static_container_makalat() {
        return iframe_static_container_makalat;
    }

    public void setOt1(RichOutputText ot1) {
        this.ot1 = ot1;
    }

    public RichOutputText getOt1() {
        return ot1;
    }

    public void setT1(RichTree t1) {
        this.t1 = t1;
    }

    public RichTree getT1() {
        return t1;
    }

    public void setSdi1(RichShowDetailItem sdi1) {
        this.sdi1 = sdi1;
    }

    public RichShowDetailItem getSdi1() {
        return sdi1;
    }

    public void setPa1(RichPanelAccordion pa1) {
        this.pa1 = pa1;
    }

    public RichPanelAccordion getPa1() {
        return pa1;
    }

    public void setPs2(RichPanelSplitter ps2) {
        this.ps2 = ps2;
    }

    public RichPanelSplitter getPs2() {
        return ps2;
    }
}
