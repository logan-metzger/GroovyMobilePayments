package com.imobile3.groovypayments.data;

import androidx.annotation.NonNull;

import com.imobile3.groovypayments.data.entities.UserEntity;
import com.imobile3.groovypayments.data.model.LoggedInUser;

import java.io.IOException;
import java.util.Optional;

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
public class LoginDataSource {

    public Result<LoggedInUser> login(String username, String password) {

        try {
            // TODO: handle loggedInUser authentication
            LoggedInUser fakeUser =
                    new LoggedInUser(
                            java.util.UUID.randomUUID().toString(),
                            "Jane Doe", "0");
            return new Result.Success<>(fakeUser);
        } catch (Exception e) {
            return new Result.Error(new IOException("Error logging in", e));
        }
    }

    public void logout() {
        // TODO: revoke authentication
    }

    Result<Void> registerUser(UserEntity newUser){
         try {
            DatabaseHelper.getInstance().getDatabase().getUserDao().insertUsers(newUser);
            return new Result.Success<>(null);
        } catch (Exception e) {
            return new Result.Error<>(new IOException("Error creating user", e));
        }
    }
}
