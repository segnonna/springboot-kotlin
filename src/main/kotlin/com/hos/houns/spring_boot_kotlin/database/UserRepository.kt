package com.hos.houns.spring_boot_kotlin.database

import com.hos.houns.spring_boot_kotlin.database.model.User
import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository

interface UserRepository: MongoRepository<User, ObjectId> {
    fun findByEmail(email: String): User?
}