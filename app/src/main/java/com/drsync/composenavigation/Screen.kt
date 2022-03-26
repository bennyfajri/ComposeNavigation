package com.drsync.composenavigation

sealed class Screen(val  route: String){
    object Home: Screen(route = "home_screen")
    object Detail: Screen(route = "detail_screen?id={$ID_DETAIL}&name={$NAME_DETAIL}") {
//        fun passId(id: Int = 0): String {
//            return "detail_screen?id=$id"
//        }

        fun passNameAndId(
            id: Int = 0,
            name: String = "Benny Fajri"
        ): String {
            return "detail_screen?id=$id&name=$name"
        }
    }


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
