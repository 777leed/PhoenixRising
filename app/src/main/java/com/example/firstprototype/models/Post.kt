package com.example.firstprototype.models

import com.google.firebase.database.ServerValue

data class Post(
    public var title: String="",
    public var description: String="",
    public var picture: String="",
    public var userPhoto: String=""

)

{


    private var timeStamp: Any = ServerValue.TIMESTAMP
    private lateinit var postKey : String

    fun getPostKey(): String {
        return postKey
    }
    fun setPostKey(postKey : String){
        this.postKey = postKey
    }

    fun getTimeStamp(): Any {
        return timeStamp
    }

}