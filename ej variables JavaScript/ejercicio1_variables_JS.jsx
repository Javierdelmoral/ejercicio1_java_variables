//FASE 1

var name = "Javier ";
var lastName1 = "del Moral ";
var lastName2 = "Asensio";

var day = 26;
var month = 02;
var year = 1988;

    //print
    console.log(lastName1 + lastName2 + ", " + name);

    console.log(day + "/" + month + "/" + year);

    
    console.log("/////////////////////////////////////////////////////////////////////////////////////////////////")


//FASE 2

//First leap year we take
const initLeap = 1948;

//When we have a leap year? 
Boolean = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));

//How many leap years?
var leapYears = (year - initLeap) / 4;

    console.log ("Anys de traspás desde " + initLeap + " fins " + year + ": " + leapYears);

    console.log("/////////////////////////////////////////////////////////////////////////////////////////////////")



//FASE 3

var LeapYears = initLeap;

Boolean2 = ((LeapYears % 4 == 0) && (LeapYears % 100 != 0) || (LeapYears % 400 == 0));

//for loop

for (var i = 1948; i < year; i += 4) {

    if (Boolean2 == true) {

        console.log("L'any " + i + " és un any de traspás!");

    }

}


if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {

    console.log("El meu any de naixement (" + year + ") es de traspás!");

} else {

    console.log("El meu any de naixement (" + year + ") NO es de traspás!");
}

    console.log("/////////////////////////////////////////////////////////////////////////////////////////////////")

    
//FASE 4

var fullName = name + lastName1 + lastName2;

var birthDate = day + "/" + month + "/" + year;


console.log("El meu nom és " + fullName);

console.log("Vaig neixer el " + birthDate);


if (Boolean == true) {

    console.log("El meu any de naixement es de traspás!");

} else {

    console.log("El meu any de naixement NO es de traspás!");
}







