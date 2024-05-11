package com.example.taskmate_new.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.taskmate_new.model.Note
import com.example.taskmate_new.repository.NoteRepository
import kotlinx.coroutines.launch

class NoteViewModel(app: Application, private val noteRepository: NoteRepository): AndroidViewModel(app) {

    fun addNote(note: Note) =
        viewModelScope.launch {
            noteRepository.insertNote(note) // this will launch in the background using coroutines
        }

    fun deleteNote(note: Note) =
        viewModelScope.launch {
            noteRepository.deleteNote(note) // this will launch in the background using coroutines
        }

    fun updateNote(note: Note) =
        viewModelScope.launch {
            noteRepository.updateNote(note) // this will launch in the background using coroutines
        }

    fun getAllNotes() = noteRepository.getAllNotes()

    fun searchNote(query: String?) =
        noteRepository.searchNote(query)

}

/*
ViewModel act as a bridge between view and model
 */

/*
launch : part of the coroutines , it ensures that the coroutines is cancelled when the associate view model
is cleared or destroyed. to prevent potential memory leaks
 */