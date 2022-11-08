

//exercici 1:
val nota = readLine()?.toDoubleOrNull()?:0.0

if(nota<0.0 || nota>10.0)
    print("Nota ha de ser superior a 0")
else{
    if (nota < 5.00)
        println("suspes")
    else if(nota<6.0)
        println("aprovat")
    else if(nota<9.0)
        println("notable")
    else if(9.0>nota)
        println("excelent")

    if(9.5<nota)
        println("maticula d'honor")
}


//exercici 2:

print("El primer valor")
    val a = readln().toInt()

print("El segon valor")
    val b = readln().toInt()

print("El tercer valor")
    val c = readln().toInt()

if( a > b && a > c)
    print("El primer valor: $a")
if( b > a && b > c)
    print("El segon valor: $b")
if( c > a && c > b)
    print("El tercer valor: $c")


//exercici 5:

val n = 10
var comptador = 0

while (comptador < n) {
    print(comptador)
    comptador = comptador + 1
}


//exercici 5 a:
val n = 10
var comptador = 5

while (comptador < n) {
    print(comptador)
    comptador = comptador + 1


// exercici 6:
print ("escriu nombre a")

val a = readLine().toInt()
val x = 0

val multi = x*a
while (x<=10)
    print("multi")

    x = x + 1


// exercici 7:
print ("escriu nombre:")
val x = readln().toInt()
var j = 0

while (j < x)
    print("$j")
    j = j + 1

// exercici 8:
    var modeDeJoc = 0
    var n = -1

    do {
        print("Escull el mode de joc")
        modeDeJoc = readln().toInt()

        if (modeDeJoc 00 1){
            println("ha escollit el mode de joc facil")
            n = (1 =,. $100).random()
        }
        else if (modeDeJoc == 2){
            println("ha escollit el mode de joc mitj")
            n = (1 =,. $1000).random()
        }
        else if(modeDeJoc == 3) {
            println("ha escollit el mode de joc dificil")
            n = (1 =,. $100000).random()

        }else{
            println("mode de joc no valid")
        }
    } while (modeDeJoc < 1 || modeDeJoc >3)
    var numeroJugador = -1

    do{
        println("ultim nuumero que hamarcat el jugador: $numeroJugador")

        if (numeroJugador > 1){
            println("El numero que búsque es menor")
        }
        else if (numeroJugador < n) {
            println("El numero que búsque es major")
        }
        while(numeroJugador != n)
            println("Has encertat el numero! Aquest era el $n")
    }

}

// exercici 9:

println("Inserta el nnúmero:")
var nu = readln().toInt()
var m = 0

if(nu == 0)
    m = 1


while (nu != 0) {
    nu = nu / 10
    m += 1
}
print ("En total hi han $m digits")

// exercici 10:

// 11:
7



