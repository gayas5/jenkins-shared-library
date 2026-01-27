// vars/checkFileExists.groovy
def call(String fileName) {
    if (fileExists(fileName)) {
        echo "File '$fileName' exists."
        return true
    } else {
        echo "File '$fileName' does NOT exist."
        return false
    }
}
