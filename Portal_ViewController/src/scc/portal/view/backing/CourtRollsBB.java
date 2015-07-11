package scc.portal.view.backing;

import javax.el.ELContext;
import javax.el.ExpressionFactory;
import javax.el.ValueExpression;

import javax.faces.component.UISelectItems;

import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.input.RichInputDate;
import oracle.adf.view.rich.component.rich.input.RichSelectOneChoice;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelSplitter;
import oracle.adf.view.rich.component.rich.nav.RichCommandButton;
import oracle.adf.view.rich.component.rich.output.RichMessages;

import oracle.binding.BindingContainer;

import oracle.jbo.ViewObject;

public class CourtRollsBB {
    private RichInputDate id1;
    private RichInputDate id2;
    private RichTable t1;
    private RichPanelGroupLayout pgl2;
    private RichCommandButton cb1;
    private UISelectItems si4;
    private RichSelectOneChoice soc4;
    private UISelectItems si3;
    private RichSelectOneChoice soc3;
    private UISelectItems si2;
    private RichSelectOneChoice soc2;
    private UISelectItems si1;
    private RichSelectOneChoice soc1;
    private RichPanelGroupLayout pgl1;
    private RichPanelSplitter ps1;
    private RichForm f1;
    private RichMessages m1;
    private RichDocument d1;

    public CourtRollsBB() {
    }

    public void setId1(RichInputDate id1) {
        this.id1 = id1;
    }

    public RichInputDate getId1() {
        return id1;
    }

    public void setId2(RichInputDate id2) {
        this.id2 = id2;
    }

    public RichInputDate getId2() {
        return id2;
    }

    public void setT1(RichTable t1) {
        this.t1 = t1;
    }

    public RichTable getT1() {
        return t1;
    }

    public void setPgl2(RichPanelGroupLayout pgl2) {
        this.pgl2 = pgl2;
    }

    public RichPanelGroupLayout getPgl2() {
        return pgl2;
    }

    public void setCb1(RichCommandButton cb1) {
        this.cb1 = cb1;
    }

    public RichCommandButton getCb1() {
        return cb1;
    }

    public void setSi4(UISelectItems si4) {
        this.si4 = si4;
    }

    public UISelectItems getSi4() {
        return si4;
    }

    public void setSoc4(RichSelectOneChoice soc4) {
        this.soc4 = soc4;
    }

    public RichSelectOneChoice getSoc4() {
        return soc4;
    }

    public void setSi3(UISelectItems si3) {
        this.si3 = si3;
    }

    public UISelectItems getSi3() {
        return si3;
    }

    public void setSoc3(RichSelectOneChoice soc3) {
        this.soc3 = soc3;
    }

    public RichSelectOneChoice getSoc3() {
        return soc3;
    }

    public void setSi2(UISelectItems si2) {
        this.si2 = si2;
    }

    public UISelectItems getSi2() {
        return si2;
    }

    public void setSoc2(RichSelectOneChoice soc2) {
        this.soc2 = soc2;
    }

    public RichSelectOneChoice getSoc2() {
        return soc2;
    }

    public void setSi1(UISelectItems si1) {
        this.si1 = si1;
    }

    public UISelectItems getSi1() {
        return si1;
    }

    public void setSoc1(RichSelectOneChoice soc1) {
        this.soc1 = soc1;
    }

    public RichSelectOneChoice getSoc1() {
        return soc1;
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

    public void setD1(RichDocument d1) {
        this.d1 = d1;
    }

    public RichDocument getD1() {
        return d1;
    }
    public void valueChanged(ValueChangeEvent valueChangeEvent) {
        this.setValueToEL("#{bindings.CourtYear.inputValue}", valueChangeEvent.getNewValue()); //Updates the model
        System.out.println("\n******** Selected Value: "+resolveExpression("#{bindings.CourtYear.attributeValue}"));
        System.out.println("\n******** Display Value: "+resolveExpression("#{bindings.CourtYear.selectedValue ne ' ' ? bindings.CourtYear.selectedValue.attributeValues[0] : ''}"));
        
        BindingContext bindingctx = BindingContext.getCurrent();
                BindingContainer bindings = bindingctx.getCurrentBindingsEntry();
                DCBindingContainer bindingsImpl = (DCBindingContainer) bindings;
                DCIteratorBinding dciter = bindingsImpl.findIteratorBinding("CourtRollDates1Iterator");//access the iterator by its ID value in the PageDef file
                ViewObject vo =dciter.getViewObject();
                vo.setNamedWhereClauseParam("CourtYear",resolveExpression("#{bindings.CourtYear.attributeValue}"));//enter your value
                vo.executeQuery(); 
    //       YearNum = (oracle.jbo.domain.Number)resolveExpression("#{bindings.CourtYear.attributeValue}");
                
    
    }
    
    public void DatesvalueChanged(ValueChangeEvent valueChangeEvent) {
        this.setValueToEL("#{bindings.RollDate.inputValue}", valueChangeEvent.getNewValue()); //Updates the model
        System.out.println("\n******** Selected Value: "+resolveExpression("#{bindings.RollDate.attributeValue}"));
        System.out.println("\n******** Display Value: "+resolveExpression("#{bindings.RollDate.selectedValue ne ' ' ? bindings.CourtYear.selectedValue.attributeValues[0] : ''}"));
        
        BindingContext bindingctx = BindingContext.getCurrent();
                BindingContainer bindings = bindingctx.getCurrentBindingsEntry();
                DCBindingContainer bindingsImpl = (DCBindingContainer) bindings;
                DCIteratorBinding dciter = bindingsImpl.findIteratorBinding("CourtRollVO_SD1Iterator");//access the iterator by its ID value in the PageDef file
                ViewObject vo =dciter.getViewObject();
                vo.setNamedWhereClauseParam("RollDate",resolveExpression("#{bindings.RollDate.attributeValue}"));//enter your value
                vo.executeQuery(); 
    //       YearNum = (oracle.jbo.domain.Number)resolveExpression("#{bindings.CourtYear.attributeValue}");
                
    
    }
    public void StatusvalueChanged(ValueChangeEvent valueChangeEvent) {
        this.setValueToEL("#{bindings.RollStatus.inputValue}", valueChangeEvent.getNewValue()); //Updates the model
        System.out.println("\n******** Selected Value: "+resolveExpression("#{bindings.RollStatus.attributeValue}"));
        System.out.println("\n******** Display Value: "+resolveExpression("#{bindings.RollStatus.selectedValue ne ' ' ? bindings.CourtYear.selectedValue.attributeValues[0] : ''}"));
        
        BindingContext bindingctx = BindingContext.getCurrent();
                BindingContainer bindings = bindingctx.getCurrentBindingsEntry();
                DCBindingContainer bindingsImpl = (DCBindingContainer) bindings;
                DCIteratorBinding dciter = bindingsImpl.findIteratorBinding("CourtRollVO_SD1Iterator");//access the iterator by its ID value in the PageDef file
                ViewObject vo =dciter.getViewObject();
                vo.setNamedWhereClauseParam("RollStatus",resolveExpression("#{bindings.RollStatus.attributeValue}"));//enter your value
                vo.executeQuery(); 
    //       YearNum = (oracle.jbo.domain.Number)resolveExpression("#{bindings.CourtYear.attributeValue}");
    
    }
    public void TypevalueChanged(ValueChangeEvent valueChangeEvent) {
        this.setValueToEL("#{bindings.RollType.inputValue}", valueChangeEvent.getNewValue()); //Updates the model
        System.out.println("\n******** Selected Value: "+resolveExpression("#{bindings.RollType.attributeValue}"));
        System.out.println("\n******** Display Value: "+resolveExpression("#{bindings.RollType.selectedValue ne ' ' ? bindings.CourtYear.selectedValue.attributeValues[0] : ''}"));
        
        BindingContext bindingctx = BindingContext.getCurrent();
                BindingContainer bindings = bindingctx.getCurrentBindingsEntry();
                DCBindingContainer bindingsImpl = (DCBindingContainer) bindings;
                DCIteratorBinding dciter = bindingsImpl.findIteratorBinding("CourtRollVO_SD1Iterator");//access the iterator by its ID value in the PageDef file
                ViewObject vo =dciter.getViewObject();
                vo.setNamedWhereClauseParam("RollType",resolveExpression("#{bindings.RollType.attributeValue}"));//enter your value
                vo.executeQuery(); 
    //       YearNum = (oracle.jbo.domain.Number)resolveExpression("#{bindings.CourtYear.attributeValue}");
                
    
    }
    
    oracle.jbo.domain.Number YearNum;
    public oracle.jbo.domain.Number Year()
    {
       return YearNum;
        }
    public Object resolveExpression(String el) {      
        FacesContext facesContext = FacesContext.getCurrentInstance();
        ELContext elContext = facesContext.getELContext();
        ExpressionFactory expressionFactory =  facesContext.getApplication().getExpressionFactory();        
        ValueExpression valueExp = expressionFactory.createValueExpression(elContext,el,Object.class);
        return valueExp.getValue(elContext);
    }

    public void setValueToEL(String el, Object val) {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        ELContext elContext = facesContext.getELContext();
        ExpressionFactory expressionFactory = facesContext.getApplication().getExpressionFactory();
        ValueExpression exp = expressionFactory.createValueExpression(elContext, el, Object.class);
        exp.setValue(elContext, val);
    }

}
