package com.raywenderlich.android.creaturemon.mvibase

import io.reactivex.Observable

interface MVIViewModel<I: MVIIntent, S: MVIViewState> {
    fun processIntents(intents: Observable<I>)
    fun states(): Observable<S>
}