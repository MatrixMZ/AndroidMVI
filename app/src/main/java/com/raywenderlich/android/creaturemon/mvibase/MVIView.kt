package com.raywenderlich.android.creaturemon.mvibase

import io.reactivex.Observable

interface MVIView<I: MVIIntent, S: MVIViewState> {
    fun intents(): Observable<I>
    fun render(state: S)

}