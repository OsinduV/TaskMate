package com.example.taskmate_new.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.taskmate_new.model.Note

@Dao
interface NoteDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun InsertNote(note: Note)

/*
OnConflictStrategy.REPLACE : means if there is a conflict like, if same primary key already exist in tha table
old data will be replaced with the new data.
its basically safe way of writting code so that we don't face any error in the future.
 */

    @Update
    suspend fun updateNote(note: Note)

    @Delete
    suspend fun deleteNote(note: Note)

    @Query("SELECT * FROM NOTES ORDER BY id DESC")
    fun getAllNotes(): LiveData<List<Note>>


    @Query("SELECT * FROM NOTES WHERE noteTitle LIKE :query OR noteDesc Like :query")
    fun searchNote(query: String?): LiveData<List<Note>>

    //String? : can be null if no specific search criteria are provided


}