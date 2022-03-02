package com.actechnologyl.beatbox

import androidx.databinding.BaseObservable

class SoundViewModel(private val beatBox: BeatBox) : BaseObservable() {
    fun onButtonClicked() {
        sound?.let {
            beatBox.play(it)
        }
    }

    var sound: Sound? = null
        set(sound) {
            field = sound
        }
    val title: String?
    get() = sound?.name
}