package com.example.kotlinsyntax1

fun main(){


      //veri tipleri ve degiskenler

    //------INTEGER-------
      var x = 10 // degistirilebilir deger.
           // x=15    //hata vermez
      val y =50 // degistirilemez , yalnizca okunabilir deger!
           // y=20 //hata verir
      var z : Long = 150 //Eger long veya short gibi belirtmezsen otomatik integer olarak tanır

      var w : ULong/*UShort de yazılabilir*/ // unsigned sayiların tanımlanması
      var p =56u //Unsigned integer tanimlanması da bu sekilde

    //-----FLOAT&DOUBLE-------
    var a  =12.25
    var b :Float = 2.56f //  float tanımlarken sona f konulması gerekiyor


//------STRINGLER------
    var myString = "Merhabalar"
    println(myString)
    var strSayi= "20"
    println(strSayi.toInt() * 29)
//------DIZILER-----ARRAY---
    val isim = "Beyza"
    val benimDizim = arrayOf(isim,1,2,3,4,5,"Selman")//degiskenleri de diziye atayabilirsin
    println(benimDizim.get(4))//bunu kullanarak dizinin elemanını cagirabilirsin

    for (i in benimDizim){
        println(i)
    }
//-----------LISTELER-----ARRAYLIST----------
    val isimListesi = arrayListOf("selman","beyza","coki","fislama")
    println(isimListesi.size)
    isimListesi.add("lokumpsy")
    println(isimListesi.get(3))
    isimListesi.removeAt(0)//removeAt ile hem index hem eleman cıkarabilirsin
    isimListesi.remove("coki")//remove ile sadece eleman cıkarabilirsn
    println(isimListesi[0])
    val numaraListesi= arrayListOf<Int>()//listeyi bos tanımlayıp elemanları sonradan ekleyebilmek icinlistenin tipini belirlemek gerekli
    val numaraListesi2 = ArrayList<Int>()//iki farkli liste tanımlama
    //listeyi hem bos tanımlamak hem de listenin farklı türde veritipi alabilmesi icin
    val karisikBosListe = arrayListOf<Any>()//Bu formatı kullanarak listeyi bos tanımlayıp sonradan eleman ekleyebilirim
//------------SET-----------------
    val setOrnek = setOf(1,1,2,4,5)// set'teki 1 degerlerinden yalnızca bir tanesini gorecek yani dizinin eleman sayisi 4
    //setlerde index yok unordered elemanlar.
    println("${isimListesi[0]}'in adi") //farkli bi kullanım alakasiz


//------------------MAP-------------------
    //C++ daki pair'a benziyor sanirim
    val foodsAndCalories= hashMapOf<String,Int>()
    foodsAndCalories.put("elma",100)//Bu fonksiyonu kullanarak map'e deger ataması yapılır
    foodsAndCalories.put("armut",200)
    println("elmanin kalorisi : "+foodsAndCalories["elma"])
    println("armutun karoisi : "+foodsAndCalories["armut"])

//----------------IF-KONTROL---------------
    if(true){
        //bla bla bla
    }
//----------------WHEN------------------------
//Mantıgı switch-case 'e benziyor
    when(/*kosul*/)){
        //durum1 ->
        //durum2 ->
        //else -> switch'teki default
    }


//---------------WHILE-------------------
while (/*kosul*/){
    //islemler
}

//---------------FOR---------------------
    for(i in numaraListesi){
        //liste ici dongu
    }
    for(num in 0..9) {
    //iki deger arası dongu
    }
    numaraListesi2.forEach {
        i-> // for(i in numaralistesi2 ile aynı zimbirti
        //liste icinde gezmenin farkli bir yolu
    }

    }


