// vars/logMessage.groovy
def call(String message, String level = "INFO") {
    echo "[$level] $message"
}
