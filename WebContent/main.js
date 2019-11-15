function getCityName(){
	var d1=document.getElementById("s1");
	if(d1.value.length==3){
		var xhr=new XMLHttpRequest();
		var url= "http://localhost:8080/TheSmartChits/CityName?city="+d1.value;
		xhr.onreadystatechange=function(){
			console.log(xhr.readyState);
			if(xhr.readyState==4){
				if(xhr.status==200){
					displayCity(xhr.responseText);
					
				}
			}
		}
		xhr.open("GET",url, true);
		xhr.send();
	}
}
	 function displayCity(response){
		 var cityName= JSON.parse(response);
		 var city = document.getElementById("city");
		 cityName.forEach(cit =>{
		 var c = document.createElement("div");
		 c.innerHTML = cit;
		 city.appendChild(c);
		 });
}
