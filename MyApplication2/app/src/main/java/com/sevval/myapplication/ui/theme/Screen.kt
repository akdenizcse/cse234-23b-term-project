package com.sevval.myapplication.ui.theme

sealed class Screen(val route: String) {
    data object HomeScreen: Screen("HomeScreen")
    data object Profile: Screen("Profile")
}