package dev.dash.objectflags

import kotlin.jvm.Throws

abstract class Flag<H>(
    val id: String
) {
    @Throws(FlagException::class)
    open fun execute(flag: H) : H? {
        return null
    }
}