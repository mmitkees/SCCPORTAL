package scc.portal.view.backing;

import java.util.Iterator;
import java.util.List;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.fragment.RichRegion;
import oracle.adf.view.rich.component.rich.layout.RichPanelAccordion;
import oracle.adf.view.rich.component.rich.layout.RichPanelBox;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelSplitter;
import oracle.adf.view.rich.component.rich.layout.RichShowDetailItem;
import oracle.adf.view.rich.component.rich.nav.RichCommandLink;
import oracle.adf.view.rich.component.rich.output.RichInlineFrame;
import oracle.adf.view.rich.component.rich.output.RichMessages;

import oracle.adf.view.rich.component.rich.output.RichPanelCollection;

import oracle.jbo.Key;
import oracle.jbo.Row;
import oracle.jbo.RowSetIterator;

import org.apache.myfaces.trinidad.event.SelectionEvent;
import org.apache.myfaces.trinidad.model.RowKeySet;

public class doctorv2 {
    private RichTable t5;
    private RichPanelGroupLayout pgl5;
    private RichShowDetailItem sdi5;
    private RichTable t4;
    private RichPanelGroupLayout pgl4;
    private RichShowDetailItem sdi4;
    private RichTable t3;
    private RichPanelGroupLayout pgl3;
    private RichShowDetailItem sdi3;
    private RichTable t2;
    private RichPanelGroupLayout pgl2;
    private RichShowDetailItem sdi2;
    private RichTable t1;
    private RichPanelGroupLayout pgl1;
    private RichShowDetailItem sdi1;
    private RichPanelAccordion pa1;
    private RichForm f1;
    private RichInlineFrame iframe_static_container_dostor;
    private RichMessages m1;
    private RichDocument d1;
    String path ="";
    private RichPanelSplitter ps1;
    private RichPanelBox pb1;
    private RichPanelBox pb2;
    private RichPanelCollection pc1;
    private RichPanelCollection pc2;
    private RichRegion r1;

    public doctorv2() {
    }

    public void setT5(RichTable t5) {
        this.t5 = t5;
    }

    public RichTable getT5() {
        return t5;
    }

    public void setPgl5(RichPanelGroupLayout pgl5) {
        this.pgl5 = pgl5;
    }

    public RichPanelGroupLayout getPgl5() {
        return pgl5;
    }
    public void setSdi5(RichShowDetailItem sdi5) {
        this.sdi5 = sdi5;
        
    }

    public RichShowDetailItem getSdi5() {
        return sdi5;
    }

    public void setT4(RichTable t4) {
        this.t4 = t4;
    }

    public RichTable getT4() {
        return t4;
    }

    public void setPgl4(RichPanelGroupLayout pgl4) {
        this.pgl4 = pgl4;
    }

    public RichPanelGroupLayout getPgl4() {
        return pgl4;
    }

    public void setSdi4(RichShowDetailItem sdi4) {
        this.sdi4 = sdi4;
    }

    public RichShowDetailItem getSdi4() {
        return sdi4;
    }

    public void setT3(RichTable t3) {
        this.t3 = t3;
    }

    public RichTable getT3() {
        return t3;
    }

    public void setPgl3(RichPanelGroupLayout pgl3) {
        this.pgl3 = pgl3;
    }

    public RichPanelGroupLayout getPgl3() {
        return pgl3;
    }

    public void setSdi3(RichShowDetailItem sdi3) {
        this.sdi3 = sdi3;
    }

    public RichShowDetailItem getSdi3() {
        return sdi3;
    }

    public void setT2(RichTable t2) {
        this.t2 = t2;
    }

    public RichTable getT2() {
        return t2;
    }

    public void setPgl2(RichPanelGroupLayout pgl2) {
        this.pgl2 = pgl2;
    }

    public RichPanelGroupLayout getPgl2() {
        return pgl2;
    }

    public void setSdi2(RichShowDetailItem sdi2) {
        this.sdi2 = sdi2;
    }

    public RichShowDetailItem getSdi2() {
        return sdi2;
    }

    public void setT1(RichTable t1) {
        this.t1 = t1;
    }

    public RichTable getT1() {
        return t1;
    }

    public void setPgl1(RichPanelGroupLayout pgl1) {
        this.pgl1 = pgl1;
    }

    public RichPanelGroupLayout getPgl1() {
        return pgl1;
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
    public void setiframe_static_container_dostor(RichInlineFrame iframe_static_container_dostor) {
        this.iframe_static_container_dostor = iframe_static_container_dostor;
    }

    public RichInlineFrame getiframe_static_container_dostor() {
        return iframe_static_container_dostor;
    }
    public void select_table_node(SelectionEvent selectionEvent) {
            RowKeySet selectedEmps =((RichTable)selectionEvent.getSource()).getSelectedRowKeys();    
            Iterator selectedEmpIter = selectedEmps.iterator();
            DCBindingContainer bindings =(DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
            DCIteratorBinding empIter=null;        
           
         if(selectionEvent.getSource().equals(t1))
        {
            empIter= bindings.findIteratorBinding("DostorPrevious1Iterator");
                              
        }
        else if(selectionEvent.getSource().equals(t2))
        {
            empIter= bindings.findIteratorBinding("DostorDeclarationVO_SD1Iterator");
                
            }
        else if(selectionEvent.getSource().equals(t5))
            {
             empIter= bindings.findIteratorBinding("HighDistoriaLaws1Iterator");
             }
            else if(selectionEvent.getSource().equals(t3))
                {
                 empIter= bindings.findIteratorBinding("DostorLaws1Iterator");
                 }
            RowSetIterator empRSIter = empIter.getRowSetIterator();
             while(selectedEmpIter.hasNext()){
               Key key = (Key)((List)selectedEmpIter.next()).get(0);
               Row currentRow = empRSIter.getRow(key);
                 currentRow.getAttributeNames(); /// oracle/oracleapp
                path ="/Static_Content/PDFViewer/web/viewer.html?file=Documents/Dostor_PDF/"+currentRow.getAttribute("Dpdffileurl");
                 iframe_static_container_dostor.setSource(path);
                                      
                }        
        }
  

    public void setPs1(RichPanelSplitter ps1) {
        
        this.ps1 = ps1;
    }

    public RichPanelSplitter getPs1() {
        return ps1;
    }

    public void setPb1(RichPanelBox pb1) {
        this.pb1 = pb1;
    }

    public RichPanelBox getPb1() {
        return pb1;
    }

    public void setPb2(RichPanelBox pb2) {
        this.pb2 = pb2;
    }

    public RichPanelBox getPb2() {
        return pb2;
    }

    public void setPc1(RichPanelCollection pc1) {
        this.pc1 = pc1;
    }

    public RichPanelCollection getPc1() {
        return pc1;
    }

    public void setPc2(RichPanelCollection pc2) {
        this.pc2 = pc2;
    }

    public RichPanelCollection getPc2() {
        return pc2;
    }

    public void setR1(RichRegion r1) {
        this.r1 = r1;
    }

    public RichRegion getR1() {
        return r1;
    }
}
