package scc.portal.view.backing;

import java.util.Iterator;
import java.util.List;

import javax.el.ELContext;
import javax.el.ExpressionFactory;
import javax.el.MethodExpression;

import javax.faces.application.Application;
import javax.faces.context.FacesContext;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCDataControl;
import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.data.RichTree;
import oracle.adf.view.rich.component.rich.fragment.RichRegion;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelSplitter;
import oracle.adf.view.rich.component.rich.nav.RichCommandButton;
import oracle.adf.view.rich.component.rich.output.RichMessages;
import oracle.adf.view.rich.component.rich.output.RichOutputText;

import oracle.jbo.ApplicationModule;
import oracle.jbo.Row;
import oracle.jbo.ViewObject;
import oracle.jbo.uicli.binding.JUCtrlHierBinding;
import oracle.jbo.uicli.binding.JUCtrlHierNodeBinding;

import org.apache.myfaces.trinidad.event.SelectionEvent;
import org.apache.myfaces.trinidad.model.CollectionModel;
import org.apache.myfaces.trinidad.model.RowKeySet;
import org.apache.myfaces.trinidad.model.TreeModel;

public class GroupesSearchBacking {
    private RichPanelGroupLayout pgl2;
   // private RichCommandButton cb2;
   // private RichInputText it1;
    private RichOutputText ot16;
    private RichTree t2;
    private RichPanelGroupLayout pgl1;
    private RichPanelSplitter ps1;
    private RichForm f1;
    private RichMessages m1;
    private RichDocument d1;
    private RichTable t1;
    private RichRegion r1;


    public GroupesSearchBacking() {
    }


    public void setPgl2(RichPanelGroupLayout pgl2) {
        this.pgl2 = pgl2;
    }

    public RichPanelGroupLayout getPgl2() {
        return pgl2;
    }

/*    public void setCb2(RichCommandButton cb2) {
        this.cb2 = cb2;
    }

    public RichCommandButton getCb2() {
        return cb2;
    }

    public void setIt1(RichInputText it1) {
        this.it1 = it1;
    }

    public RichInputText getIt1() {
        return it1;
    } */

    public void setOt16(RichOutputText ot16) {
        this.ot16 = ot16;
    }

    public RichOutputText getOt16() {
        return ot16;
    }

    public void setT2(RichTree t2) {
        this.t2 = t2;
    }

    public RichTree getT2() {
        return t2;
    }

    public void setPgl1(RichPanelGroupLayout pgl1) {
        this.pgl1 = pgl1;
    }

    public RichPanelGroupLayout getPgl1() {
        return pgl1;
    }

    public void setPs1(RichPanelSplitter ps1) {
        this.ps1 = ps1;
    }

    public RichPanelSplitter getPs1() {
        return ps1;
    }

    public void setF1(RichForm f1) {
        this.f1 = f1;
    }

    public RichForm getF1() {
        return f1;
    }

    public void setM1(RichMessages m1) {
        this.m1 = m1;
    }

    public RichMessages getM1() {
        return m1;
    }
    ViewObject vo;
    public void setD1(RichDocument d1) {
        this.d1 = d1;
    }

    public RichDocument getD1() {
        return d1;
    }
    oracle.jbo.domain.Number num;
    public void NodeSeletionListener(SelectionEvent selectionEvent) {
        //original selection listener set by ADF     //#{bindings.allDepartments.treeModel.makeCurrent}
        String adfSelectionListener = "#{bindings.CourtTypes2.treeModel.makeCurrent}";
        //make sure the default selection listener functionality is  //preserved. you don't need to do this for multi select trees            //as the ADF binding only supports single current row selection /* START PRESERVER DEFAULT ADF SELECT BEHAVIOR */
        FacesContext fctx = FacesContext.getCurrentInstance();
        Application application = fctx.getApplication();
        ELContext elCtx = fctx.getELContext();
        ExpressionFactory exprFactory = application.getExpressionFactory();
        MethodExpression me = null;
        me = exprFactory.createMethodExpression(elCtx, adfSelectionListener, Object.class,
                                    new Class[] { SelectionEvent.class });
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
            String[] attribs =
                rw.getAttributeNames(); //print first row attribute. Note that in a tree you have to  //determine the node type if you want to select node attributes
            //by name and not index
            String rowType = rw.getStructureDef().getDefName();
            if (rowType.equalsIgnoreCase("CourtTypesVO_SD")) {
                break;
            } else if (rowType.equalsIgnoreCase("PartsLKPVO_SD")) { //  (Arrays.asList(attribs).contains("Makalurl")?rw.getAttribute("Makalurl").toString():"none");
                System.out.println(rw.getAttribute("PartId").toString());
                FacesContext context = FacesContext.getCurrentInstance();
                BindingContext bindingContext = BindingContext.getCurrent();
                DCDataControl dc = bindingContext.findDataControl("AppModuleAM_SDDataControl");
                // Name of application module in datacontrolBinding.cpx
                ApplicationModule am = (ApplicationModule)dc.getDataProvider();
                //ApplicationModule am = (ApplicationModule)resolvElDC(AppModuleAM_SD);                //  ApplicationModule am = new App AppModuleAM_SD();
                num = (oracle.jbo.domain.Number)rw.getAttribute("PartId");
                vo = am.findViewObject("GroupesSearch1");
                vo.setNamedWhereClauseParam("PartNumber", num);
                vo.executeQuery();            
                }

        }
    }
    String selectedNode;
    public String setselectedNodeValue() {
        //selectedNode= vo.getNamedWhereClauseParam("PartNumber").toString();
         return num.toString();
    }
    public oracle.jbo.domain.Number getnum() {
        //selectedNode= vo.getNamedWhereClauseParam("PartNumber").toString();
         return num;
    }


    public void setT1(RichTable t1) {
        this.t1 = t1;
    }

    public RichTable getT1() {
        return t1;
    }

    public void setR1(RichRegion r1) {
        this.r1 = r1;
    }

    public RichRegion getR1() {
        return r1;
    }
}
