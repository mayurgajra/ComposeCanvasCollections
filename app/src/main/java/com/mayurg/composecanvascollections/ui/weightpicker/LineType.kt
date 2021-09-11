package com.mayurg.composecanvascollections.ui.weightpicker

/**
 * Created On 11/09/2021
 * @author Mayur Gajra
 */
sealed class LineType{
    object Normal: LineType()
    object FiveStep : LineType()
    object TenStep : LineType()
}
