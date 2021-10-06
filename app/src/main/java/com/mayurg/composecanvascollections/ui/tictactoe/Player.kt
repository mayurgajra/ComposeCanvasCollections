package com.mayurg.composecanvascollections.ui.tictactoe

/**
 * Created On 06/10/2021
 * @author Mayur Gajra
 */
sealed class Player(val symbol: Char) {
    object X : Player('X')
    object O : Player('O')

    operator fun not(): Player {
        return if (this is X) O else X
    }
}