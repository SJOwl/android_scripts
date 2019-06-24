package au.sjowl.scripts

import java.io.File

fun File.children(): Sequence<File> {
    return walkTopDown()
        .filter { this.path != it.path }
}

fun formatFile(f: File) {
    val lines = f.readLines()
    val strings = lines.subList(1, lines.size - 1).sorted()
    f.writeText(lines[0])
    f.appendText("\n")
    f.appendText(strings.joinToString("\n"))
    f.appendText("\n")
    f.appendText(lines[lines.size - 1])
}

File("../").children()
    .filter { it.name == "strings.xml" }
    .forEach {
        formatFile(it)
    }