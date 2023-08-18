x = Number(prompt("Enter a number"))

if (x == 0) {
	document.write("Zero")
} else if ((x % 2) == 1 || (x % 2) == -1) {
	document.write("Odd cubed: " , (x ** 3))
} else if ((x % 2) == 0) {
	document.write("Even cubed: " , (x ** 2))
}