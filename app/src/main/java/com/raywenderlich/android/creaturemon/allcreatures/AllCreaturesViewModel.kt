package com.raywenderlich.android.creaturemon.allcreatures

import androidx.lifecycle.ViewModel
import com.raywenderlich.android.creaturemon.mvibase.MVIViewModel
import io.reactivex.Observable
import io.reactivex.functions.BiFunction


class AllCreaturesViewModel(
        private val actionProcessorHolder: AllCreaturesProcessorHolder
): ViewModel(), MVIViewModel<AllCreaturesIntent, AllCreaturesViewState> {
    override fun processIntents(intents: Observable<AllCreaturesIntent>) {
        TODO("Not yet implemented")
    }

    override fun states(): Observable<AllCreaturesViewState> {
        TODO("Not yet implemented")
    }

    companion object {
        private val reducer = BiFunction {previousState: AllCreaturesViewState, result: AllCreaturesResult ->
            when (result) {
                is AllCreaturesResult.LoadAllCreaturesResult -> when (result) {
                    is AllCreaturesResult.LoadAllCreaturesResult.Success -> {
                        previousState.copy(isLoading = false, creatures = result.creatures)
                    }
                    is AllCreaturesResult.LoadAllCreaturesResult.Failure -> previousState.copy(isLoading = false, error = result.error)
                    is AllCreaturesResult.LoadAllCreaturesResult.Loading -> previousState.copy(isLoading = true)
                }
                is AllCreaturesResult.ClearAllCreaturesResult -> when (result) {
                    is AllCreaturesResult.ClearAllCreaturesResult.Success -> {
                        previousState.copy(isLoading = false, creatures = emptyList())
                    }
                    is AllCreaturesResult.ClearAllCreaturesResult.Failure -> previousState.copy(isLoading = false, error = result.error)
                    is AllCreaturesResult.ClearAllCreaturesResult.Clearing -> previousState.copy(isLoading = true)
                }
            }
        }
    }

}