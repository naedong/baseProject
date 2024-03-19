package kr.io.sampling.presentation.model

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

/**
 * sampling
 * Created by Naedong
 * Date: 2024-03-16(016)
 * Time: 오후 6:18
 */
@HiltViewModel
class MainViewModel @Inject constructor(
//   private  val savedStateHandle: SavedStateHandle,
) : ViewModel() {


    val isDarkTheme : StateFlow<Boolean>
        get() = _isDarkTheme
    private var _isDarkTheme = MutableStateFlow(false)


    init {

    }

    fun settingTheme() {  _isDarkTheme.value = _isDarkTheme.value.not() }

}