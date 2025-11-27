package com.microsoftword12.topic10.lib.daos.base

import java.sql.Connection
import java.sql.DriverManager

object DriverManager {
    val jdbcUrl = "jdbc:sqlite:src/jvmMain/kotlin/com/microsoftword12/topic10/data/database.db"
    val databaseLink: Connection = DriverManager.getConnection(jdbcUrl)

    fun get(): Connection {
        return this.databaseLink
    }
}