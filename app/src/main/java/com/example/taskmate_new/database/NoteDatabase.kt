package com.example.taskmate_new.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.taskmate_new.model.Note

@Database(entities = [Note::class], version = 1)
abstract class NoteDatabase: RoomDatabase() {

    abstract fun getNoteDao(): NoteDao

    companion object{
        @Volatile
        private var instance: NoteDatabase? = null
        private var LOCK = Any()

        operator fun invoke(context: Context) = instance ?:
        synchronized(LOCK){
            instance ?:
            createDatabase(context).also{
                instance = it
            }
        }

        private fun createDatabase(context: Context) =
            Room.databaseBuilder(
                context.applicationContext,
                NoteDatabase::class.java,
                "note_db"
            ).build()
    }
    //whatever present inside companion object is static and can be accessed anywhere in the code using name then inside it it's mostly syntax only

}

/*
we will make this class as abstract class because we will be creating an abstract function in it.
 */

/*
volatile annotation ensures that changes made by one thread are immediately visible to other threads.

LOCK ensures that only one thread can execute the code inside the block at a time
 */

/*
operator fun invoke :
basically it allows you to create an instance of note database by calling  note database context
 */