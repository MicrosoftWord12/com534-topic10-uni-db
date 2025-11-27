package com.microsoftword12.topic10.lib.daos.handlers

import com.microsoftword12.topic10.lib.daos.base.DriverManager
import java.sql.Connection

open class DaoHandler {

    fun getConn(): Connection {
        return DriverManager.get()
    }

}