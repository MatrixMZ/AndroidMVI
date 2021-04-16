package com.raywenderlich.android.creaturemon.allcreatures

import com.raywenderlich.android.creaturemon.mvibase.MVIIntent

sealed class AllCreaturesIntent: MVIIntent {
    object LoadAllCreaturesIntent: AllCreaturesIntent()
    object ClearAllCreaturesIntent: AllCreaturesIntent()
}