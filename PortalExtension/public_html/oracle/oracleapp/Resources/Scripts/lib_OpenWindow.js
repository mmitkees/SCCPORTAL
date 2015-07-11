//function to Open New Window contains Detailes
function OpenWindow(href,name)
{
	//window.print();
	//alert(href);
	//alert(name);
	
	var width=10;
	var height=10;
	var left = (window.screen.width-width)/4;
	var top = (window.screen.height-height)/4;
	//alert(left);
	//alert(top);
	var width=(window.screen.width-width)/2;
	var height=(window.screen.width-width)/2;
	var features = 'menubar=0,toolbar=0,scrollbars=0,status=0,resizable=0' +
				   ',width=' + width + ',height=' + height + ',left=' + left + ',top=' + top;
    
   	window.open(href, name, features)
									
}

function OpenWindowNews(href,name)
{
	//window.print();
	//alert(href);
	//alert(name);
	
	var width=80;
	var height=250;
	var left = (window.screen.width-width)/4;
	var top = (window.screen.height-height)/4;
	//alert(left);
	//alert(height);
	var width=(window.screen.width-width)/2;
	var height=(window.screen.height-height)/2;
	var features = 'menubar=0,toolbar=0,scrollbars=1,status=0,resizable=0' +
				   ',width=' + width + ',height=' + height + ',left=' + left + ',top=' + top;
    
   	window.open(href, name, features)
									
}
