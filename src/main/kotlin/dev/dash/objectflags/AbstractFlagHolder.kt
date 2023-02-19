package dev.dash.objectflags

abstract class AbstractFlagHolder<O : Any> : FlagHolder<O> {

    var flags: MutableList<Flag<O>> = mutableListOf()

    override fun addFlag(flag: Flag<O>) {
        flags.add(flag)
    }

    override fun removeFlag(flag: Flag<O>) {
        flags.remove(flag)
    }
}