//activity5
//Programmer: Raniel Christian B Roque
//Date: Oct 26 2022

let num1, num2, num3, num4, num5, num6

num1 = prompt("Enter First Number: ")
num2 = prompt("Enter Second Number: ")
num3 = prompt("Enter Third Number: ")

document.write("Enter First Number: " , num1 , "<br>")
document.write("Enter Second Number: " , num2 , "<br>")
document.write("Enter Third Number: " , num3 , "<br>" , "<br>") 


num4 = Number(num1)
num5 = Number(num2)
num6 = Number(num3)

if (num4 <= num5 && num5 <= num6) {

	document.write(num4 , " " , num5 , " " , num6)

} else if (num4 <= num6 && num6 <= num5) {

	document.write(num4 , " " , num6 , " " , num5)

} else if (num6 <= num4 && num4 <= num5) {

	document.write(num6 , " " , num4 , " " , num5)

} else if (num6 <= num5 && num5 <= num4) {

	document.write(num6 , " " , num5 , " " , num4)

} else if (num5 <= num6 && num6 <= num4) {

	document.write(num5 , " " , num6 , " " , num4)

} else if (num5 <= num4 && num4 <= num6) {

	document.write(num5 , " " , num4 , " " , num6)

} 
