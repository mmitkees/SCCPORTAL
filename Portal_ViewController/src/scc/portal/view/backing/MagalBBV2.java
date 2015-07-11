package scc.portal.view.backing;

import java.io.IOException;

import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.layout.RichPanelAccordion;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelSplitter;
import oracle.adf.view.rich.component.rich.layout.RichShowDetailItem;
import oracle.adf.view.rich.component.rich.nav.RichCommandLink;
import oracle.adf.view.rich.component.rich.output.RichInlineFrame;
import oracle.adf.view.rich.component.rich.output.RichMessages;

public class MagalBBV2 {
    private RichInlineFrame iframe_static_container_magala;
    private RichTable t1;
    private RichShowDetailItem sdi1;
    private RichPanelAccordion pa1;
    private RichPanelGroupLayout pgl1;
    private RichForm f1;
    private RichMessages m1;
    private RichDocument d1;
    private RichPanelSplitter ps1;

    public MagalBBV2() {
    }
    String path = "";
    RichCommandLink des;

    public void link_Click_action_listener(javax.faces.event.ActionEvent actionEvent) {
        // Add event code here...
        des = (RichCommandLink)actionEvent.getSource();
        path ="/Static_Content/ElMagala/HTML"+ des.getShortDesc();
    }

    public String Link_click_action() {
        iframe_static_container_magala.setSource(path);
        iframe_static_container_magala.setInlineStyle("width:580px; height:600px; direction:rtl; overflow:scroll;");
        return null;
    }

    public void setIframe_static_container_magala(RichInlineFrame iframe_static_container_magala) {
        this.iframe_static_container_magala = iframe_static_container_magala;
    }

    public RichInlineFrame getIframe_static_container_magala() {
        return iframe_static_container_magala;
    }

    public void setT1(RichTable t1) {
        this.t1 = t1;
    }

    public RichTable getT1() {
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

    public void setPgl1(RichPanelGroupLayout pgl1) {
        this.pgl1 = pgl1;
    }

    public RichPanelGroupLayout getPgl1() {
        return pgl1;
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

    public void setPs1(RichPanelSplitter ps1) {
        this.ps1 = ps1;
    }

    public RichPanelSplitter getPs1() {
        return ps1;
    }
}
