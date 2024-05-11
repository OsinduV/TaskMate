package com.example.taskmate_new.viewmodel

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.taskmate_new.repository.NoteRepository

class NoteViewModelFactory(val app: Application, private val noteRepository: NoteRepository) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return NoteViewModel(app, noteRepository) as T
    }

}

/*
ViewModelFactory is a class that instantiate and return view model
*/

/*
override fun <T : ViewModel> create(modelClass: Class<T>): T
this function required to create an instance of the view model class, basically it overrides the
create method from viewModelProvider factory interface.
inside it, it returns new instance of the noteViewModel by passing application and noteRepository
 */