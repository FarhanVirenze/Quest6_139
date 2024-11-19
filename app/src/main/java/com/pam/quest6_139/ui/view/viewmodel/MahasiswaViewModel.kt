package com.pam.quest6_139.ui.view.viewmodel

import androidx.lifecycle.ViewModel
import com.pam.quest6_139.ui.model.Mahasiswa
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class MahasiswaViewModel: ViewModel(){

    private val _statusUI = MutableStateFlow(Mahasiswa())

    val statusUI: StateFlow<Mahasiswa> = _statusUI.asStateFlow()

    fun setMahasiswa(ls: MutableList<String>){
        _statusUI.update { statusSaatIni ->
            statusSaatIni.copy(
                nim = ls[0],
                nama = ls[1],
                email = ls[2]
            )
        }
    }
    fun setMatakuliah(ls: MutableList<String>){
        _statusUI.update { statusSaatIni ->
            statusSaatIni.copy(
                namaMatakuliah = ls[0],
                kelas = ls[1],
            )
        }
    }
}