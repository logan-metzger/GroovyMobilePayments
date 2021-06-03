package com.imobile3.groovypayments.data

import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase

val Migration1To2 = object : Migration(1, 2) {
    override fun migrate(database: SupportSQLiteDatabase) {
        database.execSQL(
            "ALTER TABLE user ADD COLUMN time_logged_in TEXT DEFAULT 0"
        )
    }
}
