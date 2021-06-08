fun main() {
    //  VARIABLE DECLARATION

    var txt1 : String = " hello world"

    var char1 : Char = 'a'

    var mybool : Boolean = true

    var mybool2 : Booolean = false

    var num1 : Double = 2.14

    var num2 : Int = 45

    var longnum : Long = 3_0000_45665376654

    var str : String = " text messages"


    // FUNCTIONS WITH NO RETURNS
     fun WhatIsLove() {
        println(" I LOVE YOU")}

    fun SayHi( x: String) {
        println(" hello world ")}

    fun print() = println ("hi")

    fun greeting() = println ("Good morning")

    fun testing ( ){
        println(" just testing ") }

    // FUNCTIONS WHICH RETURNS VALUES
    fun SI (P:Int, R: Double, T:Int):
            Double = (P*R*T) / 100

    fun area ( Y: Int, X:Int):
            Int = Y * X

    fun add (X: Int,  Q:Int  ) : {
        return  ( X*2) + ( Q * 2 )
    }

    fun welcome ( name: String): String {
        return name + " welcome back"
    }

    fun staysafe ( name: String ):
            String = "$name please remember to stay safe"

    // FUNCTIONS WHICH RECEIVE ARGUMENT

    fun  simpleI (P:Int = 10000, R: Double = 0.15, T:Int = 12 ):
            Double = (P*R*T) / 100
}
   fun safe ( name: String = " mike " ):
              String = "$name please remember to stay safe"

     fun   Areaofshape ( Y: Int, X:Int):
        Int = Y * X

  fun add( X : Double = 2345.4546,  Y: Double = 3.24) : Double {
      return X + Y
  }
      fun WELCOME ( name : String = " susan ") : String = name
      }

 fun