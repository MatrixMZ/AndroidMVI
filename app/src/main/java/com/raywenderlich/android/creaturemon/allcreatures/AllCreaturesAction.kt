package com.raywenderlich.android.creaturemon.allcreatures

import com.raywenderlich.android.creaturemon.mvibase.MVIAction

sealed class AllCreaturesAction: MVIAction {
    object LoadAllCreaturesAction: AllCreaturesAction()
    object ClearAllCreaturesAction: AllCreaturesAction()
}
