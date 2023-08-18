let item, discount, dprice

item = Number(prompt("Enter the Price of the Item"))
discount = Number(prompt("Enter the Discount Rate of the Item"))

dprice = item - ( item * ( discount / 100))
document.write("The Original Price is: P" , item , "<br>")
document.write("The Discount Rate is: " , discount , "% <br>")
document.write("The Discounted Price is: P" , dprice.toFixed(2) , "<br>")