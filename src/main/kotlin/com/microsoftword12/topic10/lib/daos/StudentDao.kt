package com.microsoftword12.topic10.lib.daos

import com.microsoftword12.topic10.lib.Student
import org.jetbrains.exposed.v1.core.dao.id.IntIdTable
import org.jetbrains.exposed.v1.core.eq
import org.jetbrains.exposed.v1.jdbc.select
import org.jetbrains.exposed.v1.jdbc.transactions.transaction

object StudentDao: IntIdTable() {
    val name = text("name")
    val course = text("course")

    fun getStudentByCourse(courseId: Int): Student? {
        transaction {
            val query = select(StudentDao.course.eq(courseId.toString()))
        }

        return null
    }
}