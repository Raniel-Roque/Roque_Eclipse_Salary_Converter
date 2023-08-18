//activity6
//Programmer: Raniel Christian B Roque
//Date: Oct 26 2022

let num1, op, num2, Cnum1, Cnum2

num1 = prompt("Enter First Number: ")
op = prompt("Enter an operator [+, -, *, /]: ")
num2 = prompt("Enter Second Number: ")

Cnum1 = Number(num1)
Cnum2 = Number(num2)

document.write("Enter First Number: " , num1 , "<br>")
document.write("Enter an operator [+, -, *, /]: " , op , "<br>")
document.write("Enter Second Number: " , num2 , "<br>" , "<br>")

if (op == "+") {
	document.write(num1, " ", op, " ", num2, " = " , (Cnum1 + Cnum2) )
} else if (op == "-") {
	document.write(num1, " ", op, " ", num2, " = " , (Cnum1 - Cnum2) )
} else if (op == "*") {
	document.write(num1, " ", op, " ", num2, " = " , (Cnum1 * Cnum2) )
} else {

	if (Cnum2 == 0) {
		document.write(num1, " ", op, " ", num2, " = " , "Cannot Divide By Zero")
	} else {
		document.write(num1, " ", op, " ", num2, " = " , (Cnum1 / Cnum2) )
	}
}

