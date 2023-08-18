let num1, num2, num3, num4, numcheck1, numcheck2, operand, rem, demPlace, demPlaceNum, demPlaceCheck, divans, divans2

num1 = prompt("Enter your first number: ")
op = prompt("Enter your Operand ( + - * / ): ")
num2 = prompt("Enter your second number: ")

num3 = Number(num1)
num4 = Number(num2)

numcheck1 = String(num3)
numcheck2 = String(num4)

if (numcheck1 == "NaN" && numcheck2 == "NaN") {
	document.write("Invalid Input (Not A Number)")
} else {
	if (op == "+") {
		document.write("Your inputted equation: " , num1 , " " , op , " " , num2 , " = ? <br>")
		document.write("It equates to: " , (num3 + num4))
	} else if (op == "-") {
		document.write("Your inputted equation: " , num1 , " " , op , " " , num2 , " = ? <br>")
		document.write("It equates to: " , (num3 - num4))
	} else if (op == "*") {
		document.write("Your inputted equation: " , num1 , " " , op , " " , num2 , " = ? <br>")
		document.write("It equates to: " , (num3 * num4))
	} else if (op == "/") {
		rem = prompt("Do you want the remainder to show? (Y or N): ")
		demPlace = prompt("How many decimal places would you like? ")

		demPlaceNum = Number(demPlace)
		demPlaceCheck = String(demPlaceNum)
		
		if (demPlaceCheck == "NaN"){
			document.write("Invalid Input (Not A Number) for decimal place")
		} else {
			if (rem == "Y" || rem == "y") {

				if (num4 == 0) {

					document.write("Your inputted equation: " , num1 , " " , op , " " , num2 , " = ? <br>")
					document.write("It equates to: Cannot Divide By Zero" , "<br>")
			
				} else {
				
				divans = num3 / num4
				divans2 = divans.toFixed(demPlaceNum)
				
				document.write("Your inputted equation: " , num1 , " " , op , " " , num2 , " = ? <br>")
				document.write("It equates to: " , divans2 , "<br>")
				document.write("Remainder: " , (num3 % num4))
				}

			} else if (rem == "N" || rem == "n") {

				if (num4 == 0) {

					document.write("Your inputted equation: " , num1 , " " , op , " " , num2 , " = ? <br>")
					document.write("It equates to: Cannot Divide By Zero" , "<br>")
			
				} else {

				divans = num3 / num4
				divans2 = divans.toFixed(demPlaceNum)
	
				document.write("Your inputted equation: " , num1 , " " , op , " " , num2 , " = ? <br>")
				document.write("It equates to: " , divans2 , "<br>")
				}

			} else {
				document.write("Invalid Response")
			}
		}
	} else {
		document.write("Invalid Operand")
	}
}