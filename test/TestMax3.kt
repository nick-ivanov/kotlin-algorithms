package org.borealis8.kotlinalgorithms

import org.junit.Test as test
import org.junit.Assert.*

class TestMax3 {
    @org.junit.Test fun testMax3SmallBiggerBig() {
        val max = Max3(10.0, 11.0, 12.0)
        assertEquals(max, 12.0, 0.1)
    }
}

