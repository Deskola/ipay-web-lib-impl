package com.example.libimp

val live = "1"
val oid = getRandomStrings(10)
val inv = "112020102292999"
val ttl = "900"
val tel = "256712375678"
val eml = "kajuej@gmailo.com"
val vid = "demo"
val curr = "UGX"//KES
val p1 = "airtel"
val p2 = "020102292999"
val p3 = ""
val p4 = "900"
val cbk = "https://b-ok.africa"
val cst = "1"
val crl = "2"
val mtn = "1"
val airtel = "1"
val hashKey = "demo"//demoCHANGED

//generating random alphanumeric for oid
//You could override this of cause
fun getRandomStrings(length: Int): String {
    val allowedChar = ('A'..'Z') + ('a'..'z') + ('0'..'9')
    return (1..length).map { allowedChar.random() }.joinToString("")
}