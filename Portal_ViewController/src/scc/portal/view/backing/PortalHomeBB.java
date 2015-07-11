package scc.portal.view.backing;

import javax.faces.event.ActionEvent;

import oracle.adf.controller.TaskFlowId;
import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.fragment.RichRegion;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.nav.RichCommandLink;
import oracle.adf.view.rich.component.rich.output.RichOutputLabel;

import org.apache.myfaces.trinidad.component.UIXGroup;

public class PortalHomeBB {
    private RichForm f2;
    private UIXGroup pt_g1;
    private RichPanelGroupLayout pt_pgl1;
    private UIXGroup pt_g111;
    private RichPanelGroupLayout pt_pg2l1;
    private RichOutputLabel lbl_curent_path;
    private RichCommandLink cl23;
    private RichCommandLink cl22;
    private RichCommandLink cl181;
    private RichCommandLink cl180;
    private RichCommandLink cl18;
    private RichCommandLink cl17;
    private RichCommandLink cl16;
    private RichCommandLink cl15;
    private RichCommandLink cl14;
    private RichCommandLink cl13;
    private RichCommandLink cl12;
    private RichCommandLink cl11;
    private RichCommandLink cl10;
    private RichCommandLink cl9;
    private RichCommandLink cl8;
    private RichCommandLink cl71;
    private RichCommandLink cl7;
    private RichCommandLink cl55;
    private RichCommandLink cl5;
    private RichCommandLink cl4;
    private RichCommandLink cl3;
    private RichCommandLink cl2;
    private RichCommandLink cl01;
    private RichCommandLink cl1;
    private RichCommandLink cl03;
    private RichCommandLink cl04;
    private RichCommandLink cl06;
    private RichCommandLink cl07;
    private RichCommandLink cl02;
    private RichCommandLink cl00;
    private RichDocument d1;
    private String Next_Nav;
    private String taskFlowId = "/PortalFragments/Welcome.xml#Welcome";
    private RichForm f1;
    private RichCommandLink cl6;
    private RichCommandLink cl19;
    private RichCommandLink cl20;
    private RichCommandLink cl21;
    private RichCommandLink cl24;
    private RichCommandLink cl25;
    private RichCommandLink cl26;
    private RichCommandLink cl27;
    private RichCommandLink cl28;
    private RichCommandLink cl29;
    private RichCommandLink cl30;
    private RichCommandLink cl31;
    private RichCommandLink cl32;
    private RichCommandLink cl33;
    private RichCommandLink cl34;
    private RichCommandLink cl35;
    private RichCommandLink cl36;
    private RichCommandLink cl37;
    private RichCommandLink cl38;
    private RichCommandLink cl39;
    private RichCommandLink cl40;
    private RichCommandLink cl41;
    private RichCommandLink cl42;
    private RichCommandLink cl43;
    private RichCommandLink cl44;
    private RichCommandLink cl45;
    private RichCommandLink cl46;
    private RichCommandLink cl47;
    private RichCommandLink cl48;
    private RichCommandLink cl49;
    private RichOutputLabel ol1;
    private RichPanelGroupLayout pgl1;
    private UIXGroup g1;
    private RichPanelGroupLayout pgl2;
    private UIXGroup g2;
    private RichRegion r1;

    public PortalHomeBB()
    {
        
    }
    
    public void Nav_Listener(ActionEvent actionEvent) {
               RichCommandLink lnk=(RichCommandLink)actionEvent.getSource();
                Next_Nav=lnk.getShortDesc();
        }
    public String Nav_Action() {
           taskFlowId =Next_Nav;
           return null;
       }

    public void setF2(RichForm f2) {
        this.f2 = f2;
    }

    public RichForm getF2() {
        return f2;
    }

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

    public void setCl23(RichCommandLink cl23) {
        this.cl23 = cl23;
    }

    public RichCommandLink getCl23() {
        return cl23;
    }

    public void setCl22(RichCommandLink cl22) {
        this.cl22 = cl22;
    }

    public RichCommandLink getCl22() {
        return cl22;
    }

    public void setCl181(RichCommandLink cl181) {
        this.cl181 = cl181;
    }

    public RichCommandLink getCl181() {
        return cl181;
    }

    public void setCl180(RichCommandLink cl180) {
        this.cl180 = cl180;
    }

    public RichCommandLink getCl180() {
        return cl180;
    }

    public void setCl18(RichCommandLink cl18) {
        this.cl18 = cl18;
    }

    public RichCommandLink getCl18() {
        return cl18;
    }

    public void setCl17(RichCommandLink cl17) {
        this.cl17 = cl17;
    }

    public RichCommandLink getCl17() {
        return cl17;
    }

    public void setCl16(RichCommandLink cl16) {
        this.cl16 = cl16;
    }

    public RichCommandLink getCl16() {
        return cl16;
    }

    public void setCl15(RichCommandLink cl15) {
        this.cl15 = cl15;
    }

    public RichCommandLink getCl15() {
        return cl15;
    }

    public void setCl14(RichCommandLink cl14) {
        this.cl14 = cl14;
    }

    public RichCommandLink getCl14() {
        return cl14;
    }

    public void setCl13(RichCommandLink cl13) {
        this.cl13 = cl13;
    }

    public RichCommandLink getCl13() {
        return cl13;
    }

    public void setCl12(RichCommandLink cl12) {
        this.cl12 = cl12;
    }

    public RichCommandLink getCl12() {
        return cl12;
    }

    public void setCl11(RichCommandLink cl11) {
        this.cl11 = cl11;
    }

    public RichCommandLink getCl11() {
        return cl11;
    }

    public void setCl10(RichCommandLink cl10) {
        this.cl10 = cl10;
    }

    public RichCommandLink getCl10() {
        return cl10;
    }

    public void setCl9(RichCommandLink cl9) {
        this.cl9 = cl9;
    }

    public RichCommandLink getCl9() {
        return cl9;
    }

    public void setCl8(RichCommandLink cl8) {
        this.cl8 = cl8;
    }

    public RichCommandLink getCl8() {
        return cl8;
    }

    public void setCl71(RichCommandLink cl71) {
        this.cl71 = cl71;
    }

    public RichCommandLink getCl71() {
        return cl71;
    }

    public void setCl7(RichCommandLink cl7) {
        this.cl7 = cl7;
    }

    public RichCommandLink getCl7() {
        return cl7;
    }

    public void setCl55(RichCommandLink cl55) {
        this.cl55 = cl55;
    }

    public RichCommandLink getCl55() {
        return cl55;
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

    public void setCl03(RichCommandLink cl03) {
        this.cl03 = cl03;
    }

    public RichCommandLink getCl03() {
        return cl03;
    }

    public void setCl04(RichCommandLink cl04) {
        this.cl04 = cl04;
    }

    public RichCommandLink getCl04() {
        return cl04;
    }

    public void setCl06(RichCommandLink cl06) {
        this.cl06 = cl06;
    }

    public RichCommandLink getCl06() {
        return cl06;
    }

    public void setCl07(RichCommandLink cl07) {
        this.cl07 = cl07;
    }

    public RichCommandLink getCl07() {
        return cl07;
    }

    public void setCl02(RichCommandLink cl02) {
        this.cl02 = cl02;
    }

    public RichCommandLink getCl02() {
        return cl02;
    }

    public void setCl00(RichCommandLink cl00) {
        this.cl00 = cl00;
    }

    public RichCommandLink getCl00() {
        return cl00;
    }

    public void setD1(RichDocument d1) {
        this.d1 = d1;
    }

    public RichDocument getD1() {
        return d1;
    }

    public TaskFlowId getDynamicTaskFlowId() {
        return TaskFlowId.parse(taskFlowId);
    }

    public void setF1(RichForm f1) {
        this.f1 = f1;
    }

    public RichForm getF1() {
        return f1;
    }

    public void setCl6(RichCommandLink cl6) {
        this.cl6 = cl6;
    }

    public RichCommandLink getCl6() {
        return cl6;
    }

    public void setCl19(RichCommandLink cl19) {
        this.cl19 = cl19;
    }

    public RichCommandLink getCl19() {
        return cl19;
    }

    public void setCl20(RichCommandLink cl20) {
        this.cl20 = cl20;
    }

    public RichCommandLink getCl20() {
        return cl20;
    }

    public void setCl21(RichCommandLink cl21) {
        this.cl21 = cl21;
    }

    public RichCommandLink getCl21() {
        return cl21;
    }

    public void setCl24(RichCommandLink cl24) {
        this.cl24 = cl24;
    }

    public RichCommandLink getCl24() {
        return cl24;
    }

    public void setCl25(RichCommandLink cl25) {
        this.cl25 = cl25;
    }

    public RichCommandLink getCl25() {
        return cl25;
    }

    public void setCl26(RichCommandLink cl26) {
        this.cl26 = cl26;
    }

    public RichCommandLink getCl26() {
        return cl26;
    }

    public void setCl27(RichCommandLink cl27) {
        this.cl27 = cl27;
    }

    public RichCommandLink getCl27() {
        return cl27;
    }

    public void setCl28(RichCommandLink cl28) {
        this.cl28 = cl28;
    }

    public RichCommandLink getCl28() {
        return cl28;
    }

    public void setCl29(RichCommandLink cl29) {
        this.cl29 = cl29;
    }

    public RichCommandLink getCl29() {
        return cl29;
    }

    public void setCl30(RichCommandLink cl30) {
        this.cl30 = cl30;
    }

    public RichCommandLink getCl30() {
        return cl30;
    }

    public void setCl31(RichCommandLink cl31) {
        this.cl31 = cl31;
    }

    public RichCommandLink getCl31() {
        return cl31;
    }

    public void setCl32(RichCommandLink cl32) {
        this.cl32 = cl32;
    }

    public RichCommandLink getCl32() {
        return cl32;
    }

    public void setCl33(RichCommandLink cl33) {
        this.cl33 = cl33;
    }

    public RichCommandLink getCl33() {
        return cl33;
    }

    public void setCl34(RichCommandLink cl34) {
        this.cl34 = cl34;
    }

    public RichCommandLink getCl34() {
        return cl34;
    }

    public void setCl35(RichCommandLink cl35) {
        this.cl35 = cl35;
    }

    public RichCommandLink getCl35() {
        return cl35;
    }

    public void setCl36(RichCommandLink cl36) {
        this.cl36 = cl36;
    }

    public RichCommandLink getCl36() {
        return cl36;
    }

    public void setCl37(RichCommandLink cl37) {
        this.cl37 = cl37;
    }

    public RichCommandLink getCl37() {
        return cl37;
    }

    public void setCl38(RichCommandLink cl38) {
        this.cl38 = cl38;
    }

    public RichCommandLink getCl38() {
        return cl38;
    }

    public void setCl39(RichCommandLink cl39) {
        this.cl39 = cl39;
    }

    public RichCommandLink getCl39() {
        return cl39;
    }

    public void setCl40(RichCommandLink cl40) {
        this.cl40 = cl40;
    }

    public RichCommandLink getCl40() {
        return cl40;
    }

    public void setCl41(RichCommandLink cl41) {
        this.cl41 = cl41;
    }

    public RichCommandLink getCl41() {
        return cl41;
    }

    public void setCl42(RichCommandLink cl42) {
        this.cl42 = cl42;
    }

    public RichCommandLink getCl42() {
        return cl42;
    }

    public void setCl43(RichCommandLink cl43) {
        this.cl43 = cl43;
    }

    public RichCommandLink getCl43() {
        return cl43;
    }

    public void setCl44(RichCommandLink cl44) {
        this.cl44 = cl44;
    }

    public RichCommandLink getCl44() {
        return cl44;
    }

    public void setCl45(RichCommandLink cl45) {
        this.cl45 = cl45;
    }

    public RichCommandLink getCl45() {
        return cl45;
    }

    public void setCl46(RichCommandLink cl46) {
        this.cl46 = cl46;
    }

    public RichCommandLink getCl46() {
        return cl46;
    }

    public void setCl47(RichCommandLink cl47) {
        this.cl47 = cl47;
    }

    public RichCommandLink getCl47() {
        return cl47;
    }

    public void setCl48(RichCommandLink cl48) {
        this.cl48 = cl48;
    }

    public RichCommandLink getCl48() {
        return cl48;
    }

    public void setCl49(RichCommandLink cl49) {
        this.cl49 = cl49;
    }

    public RichCommandLink getCl49() {
        return cl49;
    }

    public void setOl1(RichOutputLabel ol1) {
        this.ol1 = ol1;
    }

    public RichOutputLabel getOl1() {
        return ol1;
    }

    public void setPgl1(RichPanelGroupLayout pgl1) {
        this.pgl1 = pgl1;
    }

    public RichPanelGroupLayout getPgl1() {
        return pgl1;
    }

    public void setG1(UIXGroup g1) {
        this.g1 = g1;
    }

    public UIXGroup getG1() {
        return g1;
    }

    public void setPgl2(RichPanelGroupLayout pgl2) {
        this.pgl2 = pgl2;
    }

    public RichPanelGroupLayout getPgl2() {
        return pgl2;
    }

    public void setG2(UIXGroup g2) {
        this.g2 = g2;
    }

    public UIXGroup getG2() {
        return g2;
    }

    public void setR1(RichRegion r1) {
        this.r1 = r1;
    }

    public RichRegion getR1() {
        return r1;
    }


}
