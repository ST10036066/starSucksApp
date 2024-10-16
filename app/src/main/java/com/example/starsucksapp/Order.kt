package com.example.starsucksapp

class Order {
    lateinit var productName: String
    lateinit var customerName: String
    lateinit var customerCell: String
    lateinit var orderDate: String

    //secondary constructor
    // Primary constructor
    
    constructor()

    // Secondary constructor with one parameter
    constructor(pName: String) : this() {
        productName = pName
    }

    // Secondary constructor with 2 parameters
    constructor(pName: String, cName: String) : this() {
        productName = pName
        customerName = cName
    }

    // Secondary constructor with 3 parameters
    constructor(pName: String, cName: String, cCell: String) : this() {
        productName = pName
        customerName = cName
        customerCell = cCell
    }

    // Secondary constructor with all parameters
    constructor(pName: String, cName: String, cCell: String, oDate: String) : this() {
        productName = pName
        customerName = cName
        customerCell = cCell
        orderDate = oDate
    }
}


