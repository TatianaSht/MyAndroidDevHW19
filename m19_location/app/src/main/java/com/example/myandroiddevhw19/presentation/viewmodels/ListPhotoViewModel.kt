package com.example.myandroiddevhw19.presentation.viewmodels

import androidx.lifecycle.ViewModel
import com.example.myandroiddevhw19.data.db.Repository
import javax.inject.Inject

class ListPhotoViewModel @Inject constructor(private val repository: Repository) : ViewModel() {
    val listPhotos = repository.getAllData()
}
