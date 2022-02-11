class Person(var name:String, var weight:Double, var height:Int) {
    fun BMI():Double {
        val heightInMeters = (height.toDouble()/100.0).toDouble()
        val bmi = weight.toDouble().div(heightInMeters * heightInMeters)
        return bmi
    }
}