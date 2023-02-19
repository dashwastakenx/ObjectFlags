import dev.dash.objectflags.AbstractFlagHolder
import dev.dash.objectflags.FlagException

class Folder : AbstractFlagHolder<Folder>() {
    fun open() {
        flags.forEach { flag ->
            try {
                flag.execute(this)
            } catch (exception: FlagException) {
                println(exception.message)
            }
        }
    }
}