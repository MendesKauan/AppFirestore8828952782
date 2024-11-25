package br.edu.up.AppFirestore8828952782.viewmodel

import androidx.lifecycle.ViewModel
import br.edu.up.AppFirestore8828952782.Filters


/**
 * ViewModel for [br.edu.up.AppFirestore8828952782.MainActivity].
 */

class MainActivityViewModel : ViewModel() {

    var isSigningIn: Boolean = false
    var filters: Filters = Filters.default
}
