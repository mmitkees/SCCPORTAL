package scc.portal.view.backing;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;
import javax.faces.application.Application;
import javax.faces.context.FacesContext;
import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.data.RichTree;
import oracle.adf.view.rich.component.rich.output.RichOutputText;
import oracle.jbo.Row;
import oracle.jbo.uicli.binding.JUCtrlHierBinding;
import oracle.jbo.uicli.binding.JUCtrlHierNodeBinding;
import org.apache.myfaces.trinidad.component.UIXGroup;
import org.apache.myfaces.trinidad.event.SelectionEvent;
import org.apache.myfaces.trinidad.model.CollectionModel;
import org.apache.myfaces.trinidad.model.RowKeySet;
import org.apache.myfaces.trinidad.model.TreeModel;  
import javax.el.ELContext;
import javax.el.ExpressionFactory;
import javax.el.MethodExpression;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.output.RichMessages;
import oracle.jbo.Key;
import oracle.jbo.RowSetIterator;

public class Test_table_bind {
    private RichForm f1;
    private RichDocument d1;
    private UIXGroup g1;
    private RichTree t1;
    private RichOutputText ot1;
    private RichMessages m1;
    private RichTable t2;
    private RichTable t3;

    public Test_table_bind (){
            
            
            
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

   

    public void setG1(UIXGroup g1) {
        this.g1 = g1;
    }

    public UIXGroup getG1() {
        return g1;
    }


    public void setT1(RichTree t1) {
        this.t1 = t1;
    }

    public RichTree getT1() {
        return t1;
    }

    public void setOt1(RichOutputText ot1) {
        this.ot1 = ot1;
    }

    public RichOutputText getOt1() {
        return ot1;
    }

    public void select_tree_node(SelectionEvent selectionEvent) {
                   
             //original selection listener set by ADF
             //#{bindings.allDepartments.treeModel.makeCurrent}
             String adfSelectionListener = "#{bindings.CasesRules_Cases_IT_HS1.treeModel.makeCurrent}";
             //make sure the default selection listener functionality is 
             //preserved. you don't need to do this for multi select trees 
             //as the ADF binding only supports single current row selection             
             /* START PRESERVER DEFAULT ADF SELECT BEHAVIOR */
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
               if(rowType.equalsIgnoreCase("CasesVO_HS")){
                   
                   System.out.println("Case_id= " + (Arrays.asList(attribs).contains("CaseId")?rw.getAttribute("CaseId").toString():"none"));
                   System.out.println("rule_id= " +(Arrays.asList(attribs).contains("Id")?rw.getAttribute("Id").toString():"none"));
                   System.out.println("****************************************");
               }
                 else if(rowType.equalsIgnoreCase("Rules_InsertVO_HS")) {
                   System.out.println("Case_id= " + (Arrays.asList(attribs).contains("CaseId")?rw.getAttribute("CaseId").toString():"none"));
                   System.out.println("rule_id= " +(Arrays.asList(attribs).contains("Id")?rw.getAttribute("Id").toString():"none"));
                   System.out.println("****************************************");
               }             
             }         
        }
    public void select_table_node(SelectionEvent selectionEvent) {
            RowKeySet selectedEmps = getT2().getSelectedRowKeys();    
            Iterator selectedEmpIter = selectedEmps.iterator();
            DCBindingContainer bindings =(DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
            DCIteratorBinding empIter = bindings.findIteratorBinding("CasesRules_Cases_IT_HSIterator");
            RowSetIterator empRSIter = empIter.getRowSetIterator();
             while(selectedEmpIter.hasNext()){
               Key key = (Key)((List)selectedEmpIter.next()).get(0);
               Row currentRow = empRSIter.getRow(key);
               System.out.println(currentRow.getAttribute("CaseId"));
             }        
        }


    public void setM1(RichMessages m1) {
        this.m1 = m1;
    }

    public RichMessages getM1() {
        return m1;
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

}
