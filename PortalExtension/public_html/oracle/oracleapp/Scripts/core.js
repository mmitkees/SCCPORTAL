// Removes leading whitespaces
function Redirect(url) {
 
    if (navigator.userAgent.search("Firefox") > -1) {
        window.location = window.location.origin + url;
    }
    else if (navigator.userAgent.search("MSIE 8.0") > -1 || navigator.userAgent.search("MSIE 9.0") > -1) {
        window.location = url;
    }
    else
        window.location = window.location.origin + url;

}

function isnull(v) {
    if (v == "")
        return 0;
    else
        return parseFloat(v);
}
function openReport(Param) {
    detailedresults = window.open('../Reports/ReportsManager.aspx?' + Param);
}
function openPopup(url,width,height) {
    var WinSettings = "center:yes; resizable: no; dialogHeight:"+height+"px; dialogWidth:"+width+"px";
    return window.showModalDialog(url, null, WinSettings);
}
function ValidationConfirm(message, grop) {
            if (typeof (Page_Validators) == "undefined") {
                alert('undefined');
                return true;

            }

            if (grop != null&&grop != "") {
                var i;
                for (i = 0; i < Page_Validators.length; i++) {
                    ValidatorValidate(Page_Validators[i], grop, null);
                }
                ValidatorUpdateIsValid();
                ValidationSummaryOnSubmit(grop);
                Page_BlockSubmit = !Page_IsValid;
                if (Page_IsValid) {
                    if (message != '')
                        return window.confirm(message);
                    else return true;

                }
                return Page_IsValid;
            }
            else {

                if (message != '')
                    return window.confirm(message);
                else return true;
            }
        }


function TableHasElement(tbname, elemName) {
    var tb = GetControle(tbname);
    var items = tb.getElementsByTagName("*");
    for (var i = 0; i < items.length; i++) {
        if (items[i].id == elemName) {
            return true;
        }
    }
    return false;
}
function TableDeleteItem(tbname, ROWID) {
    var tb = GetControle(tbname);
    var row = document.getElementById(ROWID);
    tb.deleteRow(row.rowIndex);
}

function GetControle(name) {
    var chkList = document.getElementsByTagName('*');
    //alert(name);
    
    var chkAll;
    for (var i = 0; i < chkList.length; i++) {
        if (chkList[i].id.indexOf(name) != -1) {
            chkAll = chkList[i];
            break;
        }

    }
    return chkAll;
}
function GetControlesArray(name) {
    var chkList = document.getElementsByTagName('*');
    //alert(name);
    var ar=new Array();
    var ind=0;
    var chkAll;
    for (var i = 0; i < chkList.length; i++) {
        if (chkList[i].id.indexOf(name) != -1) {
            ar[ind]=chkList[i];
            ind++;
            chkAll = chkList[i];
            
        }

    }
    return ar;
}
function ddlSelectedText(ControlID) {
    var elem = ControlID;
    if (elem != null) {
        return elem.options[elem.selectedIndex].text;
    }
    return "";
}
function ddlSelectedValue(Control) {
    var elem = Control;
    if (elem != null) {
        return elem.options[elem.selectedIndex].value;
    }
    return "";
}
function GetScreenCordinates(obj) {
    var p = {};
    p.x = obj.offsetLeft;
    p.y = obj.offsetTop;
    while (obj.offsetParent) {
        p.x = p.x + obj.offsetParent.offsetLeft;
        p.y = p.y + obj.offsetParent.offsetTop;
        if (obj == document.getElementsByTagName("body")[0]) {
            break;
        }
        else {
            obj = obj.offsetParent;
        }
    }
    return p;
}
function roundNumber(num, dec) {
    var result = Math.round(num * Math.pow(10, dec)) / Math.pow(10, dec);
    return result;
}
function LTrim(value) {

    var re = /\s*((\S+\s*)*)/;
    return value.replace(re, "$1");

}


function IsDropDownListSelectedByZero(ControlID, msg) {
  
    Var_Empty = true;
    var elem = document.getElementById(ControlID);
    if (elem[0] != null) {
        if (elem.length > 0 && elem[0].selected == false)
            Var_Empty = false;
        else
            alert(msg);
        if (elem[0].Value == "-1")
            alert(msg);
    }
    else {
        Var_Empty = true;
        alert(msg);
    }
    return Var_Empty;
}
function IsListBoxempty(ControlID, msg) {
    Var_Empty = true;
    var elem = document.getElementById(ControlID);
    if (elem[0] != null) {
        Var_Empty = false;  

    }
    else {
        Var_Empty = true;
        alert(msg);
    }
    return Var_Empty;
}

function IsDropDownListEmpty(ControlID, msg) {
    
    Var_Empty = true;
    var elem = document.getElementById(ControlID);
    if (elem.length == 0) {
        alert(msg);
        return true;
    }

    return false;
}
function CompareDatesString(Dtstr1, Dstr2) {
    if (Dtstr1 == '#' || Dstr2 == '#')
        return '#';
    var date1 = new Date(convert_MDY_To_DMY(Dtstr1));
    var date2 = new Date(convert_MDY_To_DMY(Dstr2));
    if (date1 < date2)
        return -1;
    else if (date1 > date2)
        return 1;
    else
        return 0;

}
function CompareDatesStringG(Dtstr1, Dstr2) {
    if (Dtstr1 == '#' || Dstr2 == '#')
        return '#';
    var date1 = new Date(convert_MDY_To_DMY(Dtstr1));
    var date2 = new Date(convert_MDY_To_DMY(Dstr2));
     
      if (date1 > date2)
        return true;
    else
        return false;

}
function CompareDatesStringE(Dtstr1, Dstr2) {
    if (Dtstr1 == '#' || Dstr2 == '#')
        return '#';
    var date1 = new Date(convert_MDY_To_DMY(Dtstr1));
    var date2 = new Date(convert_MDY_To_DMY(Dstr2));
    if (date1 == date2)
        return true;   
    else
        return false;

}
function CompareDates(Control_Date1ID, Control_Date2ID) {
    if (Control_Date1ID == '#' || Control_Date2ID == '#')
        return '#';
    var date1 = new Date(convert_MDY_To_DMY(document.getElementById(Control_Date1ID).value));
    var date2 = new Date(convert_MDY_To_DMY(document.getElementById(Control_Date2ID).value));
    if (date1 < date2)
        return -1;
    else if (date1 > date2)
        return 1;
    else
        return 0;

}
function CompareDateYear(Control_Date1, Control_Date2) {
    if (Control_Date1 == '#' || Control_Date2 == '#')
        return '#';
    var date1 = new Date(convert_MDY_To_DMY(document.getElementById(Control_Date1).value));
    var temp = document.getElementById(Control_Date2).value;
    temp = '01/01/' + temp;

    var date2 = new Date(convert_MDY_To_DMY(temp));
    
    if (date1 < date2)
        return -1;
    else if (date1 > date2)
        return 1;
    else
        return 0;

}
function CompareIntegers(Control_Date1, Control_Date2) {
    if (Control_Date1 == '' || Control_Date2 == '')
        return '';
        var val1= document.getElementById(Control_Date1).value;
        var val2 = document.getElementById(Control_Date2).value;
        if (val1 == '' || val2 == '')
            return '';
        if (val1 < val2)
            return -1;
        else if (val1 > val2)
            return 1;
        else if (val1 == val2)
            return 0;
            
}
function IsControlEmpty(ControlID, msg) {
    var Var_Empty = true;
    if (Trim(document.getElementById(ControlID).value) != '')
        Var_Empty = false;
    else
        alert(msg);
    return Var_Empty;
}

function IsCheckBoxChecked(ControlID) {
    return document.getElementById(ControlID).checked;
}

// Removes ending whitespaces
function RTrim(value) {

    var re = /((\s*\S+)*)\s*/;
    return value.replace(re, "$1");

}
// prevent text at maxlength
// take 3 paramter client id and textbox pointer(text area) and length
// or 4 paramter that fourth paramter is error message
function Count(TextBoxclientid, long) {
    
    //var clientid = "<%= textBox.ClientID %>";
    var maxlength = new Number(long); // Change number to your max length.
    if (document.getElementById(TextBoxclientid).value.length > maxlength) {
        document.getElementById(TextBoxclientid).value = document.getElementById(TextBoxclientid).value.substring(0, maxlength);
        if (arguments.length == 2) {
            alert("عفوا لقد ادخلت بيانات حجمها اكبر من الحجم المسموح");
        }
        if (arguments.length == 3) {
            alert(arguments[3]);
        }
        
    }

}
// Removes leading and ending whitespaces
function Trim(value) {

    return LTrim(RTrim(value));

}

function convert_MDY_To_DMY(elem_date)
{
    var DaySlash=elem_date.toString().indexOf('/',0);
    var MonthSlash=elem_date.toString().indexOf('/',DaySlash+1);
    var str_date = elem_date.toString().substring(DaySlash + 1, MonthSlash + 1) + '/' + elem_date.toString().substring(0, DaySlash + 1) + '/' + elem_date.toString().substring(MonthSlash + 1, elem_date.toString().length);
    return str_date;
}
//------------------------------------------------------------------------------------

function IsAllTextBoxEmpty(Array_ControlID) {
    var Var_Empty = true;
    for (var i = 0; i < Array_ControlID.length; i++) {
        if (Trim(document.getElementById(Array_ControlID[i]).value) != '') {
            Var_Empty = false;
            break;
        }
    }
    return Var_Empty;
}



function IsAllDateTimeFromToEmpty(Array_ControlID) {
    var Var_Empty = true;
    for (var i = 0; i < Array_ControlID.length; i += 2) {
        if (Trim(document.getElementById(Array_ControlID[i]).value) != '' &&
           Trim(document.getElementById(Array_ControlID[i + 1]).value) != '') {
            Var_Empty = false;
            break;
        }
    }
    return Var_Empty;
}
function IsOneDateTimeNotComplete(Array_ControlID) {
    var NotComplete = false;
    for (var i = 0; i < Array_ControlID.length; i += 2) {
        if ((Trim(document.getElementById(Array_ControlID[i]).value) == '' &&
           Trim(document.getElementById(Array_ControlID[i + 1]).value) != '') ||
           (Trim(document.getElementById(Array_ControlID[i]).value) != '' &&
           Trim(document.getElementById(Array_ControlID[i + 1]).value) == '')) {
            NotComplete = true;
            break;
        }
    }
    return NotComplete;
}

function IsAllDropDownListSelectedByZero(Array_ControlID) {
    var index = 0;
    var Var_Empty = true;
    for (var i = 0; i < Array_ControlID.length; i++) {
        var elem = document.getElementById(Array_ControlID[i]);
        if (elem.length > index && elem[index].selected == false) {
            Var_Empty = false;
            break;
        }
    }
    return Var_Empty;
}
function IsOneFromDateLessThanToDate(Array_ControlID)
{
    var FormLassThanTo=false;
    for(var i=0; i<Array_ControlID.length; i+=2) 
    {
            var dateFrom = new Date(convert_MDY_To_DMY(document.getElementById(Array_ControlID[i]).value)); 
            var dateTo= new Date(convert_MDY_To_DMY(document.getElementById(Array_ControlID[i+1]).value)); 
            if(dateTo<dateFrom)
            {
                FormLassThanTo=true;
                break;
            }
       

    }
    return FormLassThanTo;
}
function IsControlListEmpty(TextBoxArr, DateTimeArr, DropDownList) {
    if (IsOneDateTimeNotComplete(DateTimeArr)) {
        alert("يجب ادخال (من : لى) لكل تاريخ محدد فى  عمليه البحث");
        return false;
    }
    else if (IsAllTextBoxEmpty(TextBoxArr) &&
            IsAllDateTimeFromToEmpty(DateTimeArr) &&
            IsAllDropDownListSelectedByZero(DropDownList)) {
        alert('يجب تحديد عنصر واحد على الاقل لاتمام عمليه البحث');
        return false;
    }
    else if (IsOneFromDateLessThanToDate(DateTimeArr)) {
        alert('لكل (من :الى) يجب ان يكون (الى) اكبر من او يساوى (من)');
        return false;
    }
    return true;
}





function CompareWithTodayDate(Control_Date) {
    var date2 = new Date();
    var date1 = new Date(convert_MDY_To_DMY(document.getElementById(Control_Date).value));

    if (date1 < date2)
        return -1;
    else if (date1 > date2)
        return 1;
    else
        return 0;
}
function Clear(id1, id2, id3, id4, id5, id6, id7, id8, id9, id10) {
    document.getElementById(id1).value = "";
    document.getElementById(id2).value = "";
    document.getElementById(id3).value = "";
    document.getElementById(id4).value = "";
    document.getElementById(id5).value = "";
    document.getElementById(id6).value = "";
    document.getElementById(id7).value = "";
    document.getElementById(id8).value = "";
    document.getElementById(id9).value = "";
    document.getElementById(id10).value = "";
}

function print(elemid) {
    elem = document.getElementById(elemid);
    Popup($(elem).html());
}

function Popup(data) {
    var mywindow = window.open('', 'my div', 'height=400,width=600');
    mywindow.document.write('<html><head><title>my div</title>');
    /*optional stylesheet*/ //mywindow.document.write('<link rel="stylesheet" href="main.css" type="text/css" />');
    mywindow.document.write('</head><body>');
    mywindow.document.write(data);
    mywindow.document.write('</body></html>');
    mywindow.print();
    mywindow.close();

    return true;
}