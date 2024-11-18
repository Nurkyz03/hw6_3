package com.geeks.hw6_3.ui.screens

sealed class Screens(val route: String) {

    data object CharacterScreen : Screens("CharacterScreen")
    data object EpisodeScreen : Screens("EpisodeScreen")
}