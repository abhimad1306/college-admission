
function validate1(){
			var fname = document.getElementById("fname1").value;   
            var lname = document.getElementById("lname1").value;   
            var address = document.getElementById("address1").value;
            var gender = document.getElementById("gender1").value;
            var email = document.getElementById("email1").value;   
            var mobile = document.getElementById("mobile1").value;   
            var course = document.getElementById("course1").value;   
			var city = document.getElementById("city1").value; 
			var pincode = document.getElementById("pincode1").value; 
			var state = document.getElementById("state1").value; 
			var letters = /^[A-Za-z]+$/;
			if (fname.length <= 0) {    
                alert("Name is required");    
                if(fname.value.match(letters))
				{
				return true;
				}
				else
				{
				alert("firstname must have alphabet characters only");
 
				}    
                    
            }    
            else if (lname.length <= 0) {    
                alert("Last Name is required");    
                    
            }    
            else if (address.length <= 0) {    
                alert("Address is required");    
                  
            }    
              
           else if (email.length <= 0) {    
                alert("Email Id is required");    
                  
            }    
            else if (mobile.length <= 0) {    
                alert("Mobile number is required");    
                  
            }    
            
			else if (city.length <=0) {    
                alert("city is required");    
                   
            } 
			else if (state.length <=0) {    
                alert("state is required");    
                   
            } 
			else if (pincode.length <=0) {    
                alert("pincode is required");    
                    
            } 
			else{
			window.location = "payment.html";
			return false;
			}
			
           
}
function pay(){
	window.location = "Success.html";
	return false;
	
}