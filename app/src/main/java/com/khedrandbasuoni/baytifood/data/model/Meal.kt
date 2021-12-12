package com.khedrandbasuoni.baytifood.data.model

import java.util.ArrayList

class Meal(
    var name: String,
    var image: Int,
    var price: Double,
    var details: String,
    var ratings: Double
) {
    var images: List<Int> = ArrayList()
    var sizes: List<Double> = ArrayList()
}