import dev.dash.objectflags.Flag

class FolderLockedFlag : Flag<Folder>("locked") {
    override fun execute(flag: Folder): Folder = throw FolderLockedFlagException()
}