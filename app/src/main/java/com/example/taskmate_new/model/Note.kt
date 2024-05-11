package com.example.taskmate_new.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Entity(tableName = "notes")
@Parcelize
data class Note(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val noteTitle: String,
    val noteDesc: String
): Parcelable

//It will be difficult to transfer this type of data, in search cases we go for partialization
//Partialization is a mechanism that converts complex data objects into simple format that can be easily transfer between activities or fragments

