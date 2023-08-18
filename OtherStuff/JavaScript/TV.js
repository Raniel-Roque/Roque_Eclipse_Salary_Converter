let time, APM

time = prompt("Enter your time: ")
APM = prompt("AM or PM?" )

if (time == "1:00"  && APM == "PM") {
	document.write("Lucifer is showing in 1:00pm - 2:00pm")
} else if (time == "3:00"  && APM == "AM") {
	document.write("Batman is showing in 3:00am - 4:00am")
} else if (time == "11:00"  && APM == "AM") {
	document.write("JavaDaHut is showing in 11:00am - 12:00pm")
} else {
	document.write("There is no TV program by this hour")
}