package com.handsome.module.login.bean

data class LoginBean(
    val status_code: Int,
    val status_msg: String,
    val token: String,
    val user_id: Long
)