package com.yujin.listview_210820.datas

class StudentData(
    val name : String,
    val birthYear : Int,
    val address : String) {

        fun getKoreanAgeByYear( year : Int) : Int {

            val age = year - this.birthYear + 1

            return age
        }
    }
