package com.example.firstprototype.models

import com.google.firebase.database.ServerValue

data class Comment(public var content: String="",public var uImg: String="",public var uName: String="") {
    private var timeStamp: Any = ServerValue.TIMESTAMP

    fun getTimeStamp(): Any {
        return timeStamp
    }

}