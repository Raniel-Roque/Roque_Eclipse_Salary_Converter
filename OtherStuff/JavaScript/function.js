/*let name = [], nameIn, UpName =  [], LowName = [];  

for (x = 0; x < 8; x++) { 
	nameIn = String(prompt("Enter your surname"))  
	name[x] = nameIn 
} 

for (x = 0; x <= name.length - 1; x++) {
	UpName[x] = name[x].toUpperCase()
} 

for (x = 0; x <= name.length - 1; x++) {
	LowName[x] = name[x].toLowerCase()
}


document.write("Surnames (Uppercase) <br><br>")

for (x = 0; x <= UpName.length - 1; x++) {
	document.write(UpName[x] , "<br>") 
}

document.write("<br>Surnames (Lowercase) <br><br>")

for (x = 0; x <= UpName.length - 1; x++) {
	document.write(LowName[x] , "<br>") 
} */

let flower = [], flowIn

for (x = 0; x < 5; x++) { 
	flowIn = String(prompt("Enter your Flower name"))  
	flower[x] = flowIn 
} 

for (x = 0; x <= flower.length - 1; x++) {
	document.write(flower[x] , " is at index " , x , "<br>") 
} 
