/*function test(){
	var name = document.getElementById("inputName").value;
	    $.ajax({ 
	    	async: true,
	        url: "http://localhost:8080/hello/getName",
	        type: "GET",
	        data: {name : name},
	        dataType:"json",  
	        success:function(user){  
	            $("#print").append("Hello, " + user.chinese + "!"); 
	        },  
	        error:function(error){  
	            alert("error"); 
	        }    
	    });  
}
*/
$(document).ready(function(){
	$("#btn").click(function(){
		var name = document.getElementById("inputName").value;
	    $.ajax({ 
	    	async: true,
	        url: "http://localhost:8080/hello/getName",
	        type: "GET",
	        data: {name : name},
	        dataType:"json",  
	        success:function(user){  
	            $("#print").append("Hello, " + user.chinese + "!"); 
	        },  
	        error:function(error){  
	            alert("error"); 
	        }    
	    });  
	});
});

