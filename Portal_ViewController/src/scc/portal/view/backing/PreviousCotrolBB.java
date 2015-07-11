package scc.portal.view.backing;

import java.util.ArrayList;

import javax.el.ELContext;
import javax.el.ExpressionFactory;

import javax.faces.context.FacesContext;

import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.input.RichTextEditor;

public class PreviousCotrolBB {
    private RichTextEditor rot1;
    private RichForm f1;
    private RichDocument d1;

    public PreviousCotrolBB() {
    }
    public String getSomeHtml(){
           String str= "<table border=\"1\" width=\"63%\" id=\"table1\">\n" + 
           "	<tr>\n" + 
           "		<td align=\"center\" bgcolor=\"#996633\"><b>\n" + 
           "		<font face=\"Arial\" style=\"font-size: 12pt\">تاريخ القرار</font></b></td>\n" + 
           "		<td align=\"center\" bgcolor=\"#996633\"><b>\n" + 
           "		<font face=\"Arial\" style=\"font-size: 12pt\">منطوق القرار</font></b></td>\n" + 
           "	</tr>\n" + 
           "	<tr>\n" + 
           "		<td align=\"center\"><b>\n" + 
           "		<font face=\"Arial\" style=\"font-size: 12pt\">26/6/2005&nbsp;</font></b></td>\n" + 
           "		<td align=\"center\"><b>\n" + 
           "		<font face=\"Arial\" style=\"font-size: 12pt\">\n" + 
           "				<font face=\"Arial\">\n" + 
           "		<a href=\"../PreviousControl/26-6-2005.htm\">النص كاملاً</a></font></b></td>\n" + 
           "		</font>\n" + 
           "	</tr>\n" + 
           "	<tr>\n" + 
           "		<td align=\"center\"><b>\n" + 
           "		<font face=\"Arial\" style=\"font-size: 12pt\">17/1/2012&nbsp;</font></b></td>\n" + 
           "		<td align=\"center\"><b>\n" + 
           "		<font face=\"Arial\" style=\"font-size: 12pt\">\n" + 
           "		<a href=\"../PreviousControl/17-1-2012.htm\">النص كاملاً</a></font></b></td>\n" + 
           "	</tr>\n" + 
           "	<tr>\n" + 
           "		<td align=\"center\"><b>\n" + 
           "		<font face=\"Arial\" style=\"font-size: 12pt\">13/3/2012&nbsp;</font></b></td>\n" + 
           "		<td align=\"center\"><b>\n" + 
           "		<font face=\"Arial\" style=\"font-size: 12pt\">\n" + 
           "		<a href=\"../PreviousControl/13-3-2012.htm\">النص كاملاً</a></font></b></td>\n" + 
           "	</tr>\n" + 
           "	<tr>\n" + 
           "		<td align=\"center\"><b>\n" + 
           "		<font face=\"Arial\" style=\"font-size: 12pt\">21/4/2012&nbsp;</font></b></td>\n" + 
           "		<td align=\"center\"><b>\n" + 
           "		<font face=\"Arial\" style=\"font-size: 12pt\">\n" + 
           "		<a href=\"../PreviousControl/21-4-2012.htm\">النص كاملاً</a></font></b></td>\n" + 
           "	</tr>\n" + 
           "	<tr>\n" + 
           "		<td align=\"center\"><b>\n" + 
           "		<font face=\"Arial\" style=\"font-size: 12pt\">16/5/2012&nbsp;</font></b></td>\n" + 
           "		<td align=\"center\"><b>\n" + 
           "		<font face=\"Arial\" style=\"font-size: 12pt\">\n" + 
           "		<a href=\"../PreviousControl/16-5-2012.htm\">النص كاملاً</a></font></b></td>\n" + 
           "	</tr>\n" + 
           "	<tr>\n" + 
           "		<td align=\"center\"><b>\n" + 
           "		<font face=\"Arial\" style=\"font-size: 12pt\">17/2/2013&nbsp;</font></b></td>\n" + 
           "		<td align=\"center\"><b>\n" + 
           "		<font face=\"Arial\" style=\"font-size: 12pt\">\n" + 
           "		<a href=\"../PreviousControl/17-2-2013.htm\">النص كاملاً</a></font></b></td>\n" + 
           "	</tr>\n" + 
           "	<tr>\n" + 
           "		<td align=\"center\"><b>\n" + 
           "		<font face=\"Arial\" style=\"font-size: 12pt\">25/5/2013&nbsp;</font></b></td>\n" + 
           "		<td align=\"center\"><b>\n" + 
           "		<font face=\"Arial\" style=\"font-size: 12pt\">\n" + 
           "		<a href=\"../PreviousControl/25-5-2013.htm\">النص كاملاً</a></font></b></td>\n" + 
           "	</tr>\n" + 
           "	<tr>\n" + 
           "		<td align=\"center\"><b>\n" + 
           "		<font face=\"Arial\" style=\"font-size: 12pt\">25/5/2013&nbsp;</font></b></td>\n" + 
           "		<td align=\"center\"><b>\n" + 
           "		<font face=\"Arial\" style=\"font-size: 12pt\">\n" + 
           "		<a href=\"../PreviousControl/25-5-20132.htm\">النص كاملاً</a></font></b></td>\n" + 
           "	</tr>\n" + 
           "	</table>\n" + 
           "\n" + 
           "\n" + 
           "<p>&nbsp;</p>";   
               return str;
    }

    public void setRot1(RichTextEditor rot1) {
        this.rot1 = rot1;
    }

    public RichTextEditor getRot1() {
        return rot1;
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
