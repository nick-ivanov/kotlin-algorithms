package org.borealis8.kotlinalgorithms

fun Max3(num1: Double, num2: Double, num3: Double) : Double {
    val max = if(num1 > num2) {
        if(num3 > num1) {
            num3
        } else {
            num1
        }
    } else {
        if(num3 > num2) {
            num3
        } else {
            num2
        }
    }

    return max
}