package dev.dash.objectflags

interface FlagHolder<O : Any> {

    fun addFlag(flag: Flag<O>)
    fun removeFlag(flag: Flag<O>)
}