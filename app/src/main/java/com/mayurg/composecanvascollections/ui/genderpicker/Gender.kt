package com.mayurg.composecanvascollections.ui.genderpicker

/**
 * Created On 29/09/2021
 * @author Mayur Gajra
 */
sealed class Gender {
    object Male : Gender()
    object Female : Gender()
}
