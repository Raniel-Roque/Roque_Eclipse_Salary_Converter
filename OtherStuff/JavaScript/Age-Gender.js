let age = prompt("Enter your age: ")

document.write("You have entered your age as: " , age , "<br>")
if (age <=0){
	document.write("Not a valid number", "<br>")
} else if (age <=17){
	document.write("You are NOT eligible to vote" , "<br>")
} else {
	document.write("You are eligible to vote" , "<br>")
}

let gender = prompt("Enter your gender(M or F):")

if (gender == "M" || gender == "m"){
	document.write("You are Male", "<br>")
} else if (gender == "F" || gender == "f"){
	document.write("You are Female", "<br>")
} else {
	document.write("Invalid Gender", "<br>")
} 