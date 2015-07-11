package scc.portal.view.backing;

import javax.faces.event.ActionEvent;

import oracle.adf.controller.TaskFlowId;
import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.nav.RichCommandLink;
import oracle.adf.view.rich.component.rich.output.RichOutputLabel;

import org.apache.myfaces.trinidad.component.UIXGroup;

public class PortalHome {
   
    private UIXGroup pt_g1;
    private RichPanelGroupLayout pt_pgl1;
    private UIXGroup pt_g111;
    private RichPanelGroupLayout pt_pg2l1;
    private RichOutputLabel lbl_curent_path;
    private RichCommandLink cl5;
    private RichCommandLink cl4;
    private RichCommandLink cl3;
    private RichCommandLink cl2;
    private RichCommandLink cl01;
    private RichCommandLink cl1;
    private RichForm f1;
    private RichDocument d1;
    public PortalHome() {}
    


    public void setPt_g1(UIXGroup pt_g1) {
        this.pt_g1 = pt_g1;
    }

    public UIXGroup getPt_g1() {
        return pt_g1;
    }

    public void setPt_pgl1(RichPanelGroupLayout pt_pgl1) {
        this.pt_pgl1 = pt_pgl1;
    }

    public RichPanelGroupLayout getPt_pgl1() {
        return pt_pgl1;
    }

    public void setPt_g111(UIXGroup pt_g111) {
        this.pt_g111 = pt_g111;
    }

    public UIXGroup getPt_g111() {
        return pt_g111;
    }

    public void setPt_pg2l1(RichPanelGroupLayout pt_pg2l1) {
        this.pt_pg2l1 = pt_pg2l1;
    }

    public RichPanelGroupLayout getPt_pg2l1() {
        return pt_pg2l1;
    }

    public void setLbl_curent_path(RichOutputLabel lbl_curent_path) {
        this.lbl_curent_path = lbl_curent_path;
    }

    public RichOutputLabel getLbl_curent_path() {
        return lbl_curent_path;
    }

    public void setCl5(RichCommandLink cl5) {
        this.cl5 = cl5;
    }

    public RichCommandLink getCl5() {
        return cl5;
    }

    public void setCl4(RichCommandLink cl4) {
        this.cl4 = cl4;
    }

    public RichCommandLink getCl4() {
        return cl4;
    }

    public void setCl3(RichCommandLink cl3) {
        this.cl3 = cl3;
    }

    public RichCommandLink getCl3() {
        return cl3;
    }

    public void setCl2(RichCommandLink cl2) {
        this.cl2 = cl2;
    }

    public RichCommandLink getCl2() {
        return cl2;
    }

    public void setCl01(RichCommandLink cl01) {
        this.cl01 = cl01;
    }

    public RichCommandLink getCl01() {
        return cl01;
    }

    public void setCl1(RichCommandLink cl1) {
        this.cl1 = cl1;
    }

    public RichCommandLink getCl1() {
        return cl1;
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
}
