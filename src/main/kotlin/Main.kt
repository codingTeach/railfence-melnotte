package org.example
import org.apache.commons.math3.linear.Array2DRowRealMatrix
import org.apache.commons.math3.linear.LUDecomposition
import org.apache.commons.math3.linear.RealMatrix

/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
// //import org.apache.commons.math3.linear.*
fun determinante(array: Array<DoubleArray>):Double {



    val res:Double = (array[0][0]*array[1][1]*array[2][2] +
            array[0][1]*array[1][2]*array[2][0] +
            array[0][2]*array[1][0]*array[2][1]) -
            (array[0][2]*array[1][1]*array[2][0] +
                    array[0][1]*array[1][0]*array[2][2] +
                    array[0][0]*array[1][2]*array[2][1])
    return res


}

fun main() {

    val message:String="Este es el mensaje secreto el cual es muy largo"

    var con:Int=0
    var j:Int=0
    var i:Int=0
    for (g in message)
    {

        i=con/3
        j=con%3

        println("j$j [$i] [$j]  ")
        if (j%3!=0)
        {

            // print("\t$g.toInt()")


        }
        else
        {
            //  print("\n $g.toInt())")
        }
        con++

    }



    val triada= arrayOf(
        'C','O','N'
    )
    val triada2= arrayOf(
        'S','U','L'
    )

    for ( k  in triada )
    {
        println(k.toInt())
    }

    println(triada.contentToString())
    println(triada2.contentToString())

    val array = arrayOf(
        doubleArrayOf(5.0, 15.0, 18.0),
        doubleArrayOf(20.0, 0.0, 11.0),
        doubleArrayOf(4.0, 26.0, 0.0)
    )

    var resultado:Double=determinante(array)
    println("El determinante es $resultado")

    val matrix: RealMatrix = Array2DRowRealMatrix(array)

    // Calcular el determinante de la matriz
    val det = LUDecomposition(matrix).determinant

    // Mostrar el determinante
    println("Determinante: $det")
    //println(array[k].contentToString())


    // Crear una matriz real a partir del array

    print("Hello, world!!!")
}