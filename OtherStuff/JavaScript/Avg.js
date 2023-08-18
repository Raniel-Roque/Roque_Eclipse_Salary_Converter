//activity1
//Programmer: Raniel Christian B Roque 
//Date: Oct 26 2022

let prelim, midterm, final, avg

prelim = Number(prompt("Enter Prelim Grade:" ))
midterm = Number(prompt("Enter Midterm Grade:" ))
final = Number(prompt("Enter Final Grade:" ))

document.write("Enter Prelim Grade: " , prelim , "<br>")
document.write("Enter Midterm Grade: " , midterm , "<br>")
document.write("Enter Finals Grade: " , final , "<br>" , "<br>")

avg = (prelim + midterm + final) / 3
document.write("The average grade is: " , avg.toFixed(2) ) 

