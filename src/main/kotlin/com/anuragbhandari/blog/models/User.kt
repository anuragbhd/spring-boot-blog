package com.anuragbhandari.blog.models

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "users")
data class User(
    @Id val login: String,
    val firstName: String? = null,
    val lastName: String? = null,
    val description: String? = null
)