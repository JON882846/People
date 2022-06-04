package ru.netology


fun main() {
    val likes = 141
    var remainderLikes: Int

    if(likes > 1|| likes < 99){

        remainderLikes = likes % 10

        if(remainderLikes!=1){
            println("Понравилось $likes людям")
        }else{
            println("Понравилось $likes человеку")
        }
    }else {
        if(likes > 99|| likes < 999){

            remainderLikes = likes % 100
            remainderLikes %= 10

            if(remainderLikes!=1){
                println("Понравилось $likes людям")
            }else{
                println("Понравилось $likes человеку")
            }
        }
    }
}