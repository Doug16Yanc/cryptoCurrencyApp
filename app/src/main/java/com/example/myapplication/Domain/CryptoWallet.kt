package com.example.myapplication.Domain

class CryptoWallet {
    lateinit var cryptoSymbol : String
    lateinit var picUrl : String
    var changeParcent : Double = 0.0
    var propertyAmount : Double = 0.0
    var cryptoBalance : Double = 0.0

    constructor(
        cryptoSymbol: String,
        picUrl: String,
        changeParcent: Double,
        propertyAmount: Double,
        cryptoBalance: Double
    ) {
        this.cryptoSymbol = cryptoSymbol
        this.picUrl = picUrl
        this.changeParcent = changeParcent
        this.propertyAmount = propertyAmount
        this.cryptoBalance = cryptoBalance
    }

}