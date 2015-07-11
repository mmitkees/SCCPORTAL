/////////////////////////////////////
function ValidateUName(uname)
{
	var UnameCount = 0;
	var MyStrUname = uname;
	var MyErr;
	var NotAccepted = 0 ;

	for (var i=0;i<MyStrUname.length;i++)
	{
		var Str = MyStrUname.charAt(i);
		if((Str=="'")||(Str=="/")||(Str=="\\")||(Str=="\"")||(Str=="$"))
			UnameCount = UnameCount+1;
		if
		(
		//(Str!="a")&&(Str!="b")&&(Str!="c")&&(Str!="d")&&(Str!="e")&&
		//(Str!="f")&&(Str!="g")&&(Str!="h")&&(Str!="i")&&(Str!="j")&&
		//(Str!="k")&&(Str!="l")&&(Str!="m")&&(Str!="n")&&(Str!="o")&&
		//(Str!="p")&&(Str!="q")&&(Str!="r")&&(Str!="s")&&(Str!="t")&&
		//(Str!="u")&&(Str!="v")&&(Str!="w")&&(Str!="x")&&(Str!="y")&&
		//(Str!="z")&&
		//(Str!="A")&&(Str!="B")&&(Str!="C")&&(Str!="D")&&(Str!="E")&&
		//(Str!="F")&&(Str!="G")&&(Str!="H")&&(Str!="I")&&(Str!="J")&&
		//(Str!="K")&&(Str!="L")&&(Str!="M")&&(Str!="N")&&(Str!="O")&&
		//(Str!="P")&&(Str!="Q")&&(Str!="R")&&(Str!="S")&&(Str!="T")&&
		//(Str!="U")&&(Str!="V")&&(Str!="W")&&(Str!="X")&&(Str!="Y")&&
		//(Str!="Z")&&
		(Str!="0")&&(Str!="1")&&(Str!="2")&&(Str!="3")&&(Str!="4")&&
		(Str!="5")&&(Str!="6")&&(Str!="7")&&(Str!="8")&&(Str!="9")&&
		(Str!="_")&&(Str!="-")&&(Str!="^")
		)
		{
			NotAccepted = 0;
		}
	}

	if (MyStrUname == "")
	{
		MyErr = 1;
		return(MyErr);
	}	

	if (MyStrUname.length == UnameCount)
	{
		MyErr = 2;
		return(MyErr);
	}	

	if (UnameCount != 0)
	{
		MyErr = 3;
		return(MyErr);
	}	

	if (MyStrUname.length > 150)
	{
		MyErr = 4;
		return(MyErr);
	}	

	if (NotAccepted == 1)
	{
		MyErr = 5;
		return(MyErr);
	}	
	
	MyErr = 0;
	return(MyErr);
}

function checkRequired(objContainer)
{
	var i;
	for(i = 0; i < objContainer.length; i++)
	{
		var obj = objContainer[i];
		if(obj.Required)
		{
			if(!obj.disabled)
			{
				if(isEmptyString(obj.value))
				{
					alert(obj.Required)
					obj.focus();
					return false;
				}
			}
		}
	}
	return true
}

function isEmptyString(str)
{
	var ret = true;
	if('' != str)
	{
		ret = (str.length + 1 == str.split(' ').length);
	}
	return ret;
}


function isInteger(val)
{
	var ret = false;
	if(!isEmptyString(val))
	{
		ret = !isNaN(val);
	}
	return ret;
}

function isFloat(val)
{
	var ret = false;
	if(!isEmptyString(val))
	{
		ret = !isNaN(val);
	}
	return ret;
}


//***---  This function is used to check if the field is empty  ---***//
	function isEmpty(strField)
	{
		var bRetVal=true;
		if('' != strField)
		{
			bRetVal = (strField.length + 1 == strField.split(' ').length);
		}
		return bRetVal;	
	}	

//***--- This function is used to check the e-mail address {@,.} ---***//
	function isEmail(strEmail)
	{
		var bRetVal,strText,i,j;
	
		bRetVal = true ;
		strText = new String(strEmail);
		i = strText.indexOf("@");
		j = strText.indexOf(".");
		if (i==-1 || j==-1)
		{
			bRetVal = false;
		}	
		return bRetVal;
	}
//***--- This function is used to check the URL of a web site {.,.} ---***//
	function checkURL(strField)
	{
		var bRetVal,strURL,nPos1,nPos2;
		
		bRetVal=true;
		strURL = new String(strField);
		nPos1 = strURL.indexOf(".",0)
		if (nPos1>-1)
		{
			nPos2 = strURL.indexOf(".",nPos1+1)
		}	
		else
		{
			nPos2 = -1;
		}		
		if (strURL=="" || strURL=="http://")
		{
			bRetVal=false;
		}
		if (nPos2 == -1 && bRetVal==true) 
		{
			bRetVal=false
		}
			
		return bRetVal;			
	}
//***--- This function is used to check the length of any string ---***//
	function isValidLength(strField,nLength)
	{
		var bRetVal;
		bRetVal=true;
		strText = new String(strField);
		if (strText.length<nLength)
		{
			 bRetVal=false;
		}
		return bRetVal;
	}
//***--- This function is used to check the selected value of combo ---***//
	function isValidSelection(nSelVal,nRefVal)
	{
		var bRetVal;
		bRetVal = true;
		if (nSelVal==nRefVal)
		{
			 bRetVal=false;
		}
		if (isNaN(nSelVal)==true)	 
		{
			bRetVal=false;
		}
		return bRetVal;
	}
//***--- This function is used to check if the field is Number ---***//
	function isNumber(strField)
	{
		var bRetVal,bTempVal;
		bRetVal = true;
		bTempVal = isNaN(strField)
		if (bTempVal==true)
		{
			 bRetVal = false;
		}
			 
		return bRetVal;
	}
//***---  This function is used to check if the date is correct  ---***//
	function isDate(day,month,year) 
	{
		if (day < 1 || day > 31) 
		{
	//	    alert("„‰ ›÷·ﬂ : ·«»œ √‰ ÌﬂÊ‰ «·ÌÊ„ „‰ 1 ≈·Ï 31");
		    return false;
		}
		if (month < 1 || month > 12) 
		{ 
	//	    alert("„‰ ›÷·ﬂ : ·«»œ √‰ ÌﬂÊ‰ «·‘Â— „‰ 1 ≈·Ï 12");
		    return false;
		}
		if ((month==4 || month==6 || month==9 || month==11) && day==31) 
		{
	//	    alert("‘Â— "+month+" ·« ÌÕ ÊÏ ⁄·Ï 31 ÌÊ„ !")
		    return false;
		}
		if (month == 2) 
		{ 
		    var isleap = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
		    if (day > 29 || (day==29 && !isleap)) 
		    {
	//	        alert("›»—«Ì— " + year + " ·« ÌÕ ÊÏ ⁄·Ï " + day + " ÌÊ„!");
		        return false;
		    }
		}
		if (year < 1) 
		{ 
	//	    alert("„‰ ›÷·ﬂ : ≈Œ — «·”‰…");
		    return false;
		}
		return true; 
	}
//***---  This function is used to check the date interval is correct  ---***//
	function getDateDiff(start,end,interval,rounding) 
	{
	    var iOut = 0;
	    // Create 2 error messages, 1 for each argument. 
	    var startMsg = "„‰ ›÷·ﬂ  √ﬂœ „‰  «—ÌŒ «·»œ«Ì… Ê«·‰Â«Ì…"
	    var bufferA = Date.parse( start ) ;
	    var bufferB = Date.parse( end ) ;
	    // check that the start parameter is a valid Date. 
	    if ( isNaN (bufferA) || isNaN (bufferB) ) 
	    {
	  //    alert( startMsg ) ;
	        return null ;
	    }
		// check that an interval parameter was not numeric. 
	    if ( interval.charAt == 'undefined' ) 
	    {
	        // the user specified an incorrect interval, handle the error. 
	  //    alert( intervalMsg ) ;
	        return null ;
	    }
	    var number = bufferB-bufferA ;
	    // what kind of add to do? 
	    switch (interval.charAt(0))
	    {
	        case 'd': case 'D': 
	            iOut = parseInt(number / 86400000) ;
	            if(rounding) iOut += parseInt((number % 86400000)/43200001) ;
	            break ;
	        case 'h': case 'H':
	            iOut = parseInt(number / 3600000 ) ;
	            if(rounding) iOut += parseInt((number % 3600000)/1800001) ;
	            break ;
	        case 'm': case 'M':
	            iOut = parseInt(number / 60000 ) ;
	            if(rounding) iOut += parseInt((number % 60000)/30001) ;
	            break ;
	        case 's': case 'S':
	            iOut = parseInt(number / 1000 ) ;
	            if(rounding) iOut += parseInt((number % 1000)/501) ;
	            break ;
	        default:
			   return null ;
	    }
	    return iOut ;
	}
//***--- Check a certain date is within a certain interval ---***//
	function checkDateBoundry(strdate,start,end) 
	{
	    var nTemp1;
	    var nTemp2;
	    nTemp1 = getDateDiff(start,strdate,'d',true);
	    nTemp2 = getDateDiff(strdate,end,'d',true);
	    if (nTemp1 != null && nTemp2 != null && nTemp1>=0 && nTemp2>=0)
	    {
			return true;
	    }
	    return false;
	}
//***--- add a certain interval to a specified date ---***//

function DateAdd(startDate, numDays, numMonths, numYears)
{
	var returnDate = new Date(startDate.getTime());
	var yearsToAdd = numYears;
	var month = returnDate.getMonth()	+ numMonths;
	if (month > 11)
	{
		yearsToAdd = Math.floor((month+1)/12);
		month -= 12*yearsToAdd;
		yearsToAdd += numYears;
	}
	returnDate.setMonth(month);
	returnDate.setFullYear(returnDate.getFullYear()	+ yearsToAdd);
	returnDate.setTime(returnDate.getTime()+60000*60*24*numDays);
	return returnDate;
}

//***--- replace a string with another string ---***//

function replaceChar(strSource,strOut,strIn) 
{
	var strTemp;
	var nPos;
	var strReturn;
	strTemp = "" + strSource; 
	while (strTemp.indexOf(strOut)>-1) 
	{
		nPos = strTemp.indexOf(strOut);
		strTemp = ""      + (strTemp.substring(0, nPos) + strIn + 							strTemp.substring((nPos+strOut.length),strTemp.length));
	}
	strReturn = strTemp;
	return strReturn;
}