package com.gzeinnumer.unittestkotlin

object RegistrationUtil {

    //todo 1
    /**
     * the input is not valid if...
     * ...the username/password is empty
     * ...the user name is already token
     * ...the confirm passwrod is not the same as the real password
     * ...the password constains less than 2 digits
     */
    fun validateRegistrationInput(
        username: String,
        password: String,
        cPassword:String
    ):Boolean{
        if (username.isEmpty() || password.isEmpty()){
            return false;
        }
        if (username != "zein"){
            return false
        }
        if (password!=cPassword){
            return false
        }
        if (password.count(){it.isDigit()}<2){
            return false
        }
        return true
    }
}