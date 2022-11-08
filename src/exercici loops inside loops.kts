// exercici 2:
println("Posa un nombre:")
val N = readln().toIntOrNull() ?: 0
var isNotPrime = false

for (i in 2 .. N -1){
    if (N % i ==0){
        println("NO és primer")
        isNotPrime = true
        break
    }
if (!isNotPrime) {
    println("NO es primer")
} else {
        println("Es primer")
    }

}

// exercici 2 b:

val k = readln().toIntOrNull() ?: 0
var x = 2
var noPrimer = false

while (x<k) {

    for (i in 2..x - 1) {
        if (x % k == 0)

            noPrimer = true
    }
    if (!noPrimer) {
        println("$x")
    }
}
    x=x+1
// exercici 4:
