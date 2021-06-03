package com.imobile3.groovypayments.data

import com.imobile3.groovypayments.data.entities.UserEntity
import com.imobile3.groovypayments.data.model.LoggedInUser
import java.io.IOException

fun LoginDataSource.registerUser(newUser: UserEntity) : Result<Unit>{
    return try {
        DatabaseHelper.getInstance().database.userDao.insertUsers(newUser)
        Result.Success(Unit)
    } catch (e: Exception) {
        Result.Error(IOException("Error creating user", e))
    }
}