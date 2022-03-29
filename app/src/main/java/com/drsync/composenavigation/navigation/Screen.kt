package com.drsync.composenavigation.navigation

sealed class Screen(val  route: String){
    object Home: Screen(route = "home_screen")
    object Detail: Screen(route = "detail_screen?id={$ID_DETAIL}&name={$NAME_DETAIL}") {
        fun passNameAndId(
            id: Int = 0,
            name: String = "Benny Fajri"
        ): String {
            return "detail_screen?id=$id&name=$name"
        }
    }
    object Login: Screen(route = "login_screen")
    object SignUp: Screen(route = "sign_up_screen")


    /** REQUIRED ARGUMENTS */
//    object Detail: Screen(route = "detail_screen/{$ID_DETAIL}/{${NAME_DETAIL}}") {
//        fun passId(id: Int): String {
//            return route.replace("{$ID_DETAIL}", id.toString())
//        }
//        fun passNameAndId(
//            id: Int,
//            name: String
//        ): String {
//            return "detail_screen/$id/$name"
//        }
//    }
}

const val ID_DETAIL = "id"
const val NAME_DETAIL = "name"

const val AUTHENTICATION_ROUTE = "authentication"
const val HOME_ROUTE = "home"
const val ROOT_ROUTE = "root"
