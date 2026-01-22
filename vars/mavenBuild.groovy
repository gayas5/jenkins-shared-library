def call() {
    echo "Starting Maven Build using Jenkins Maven Tool"

    withMaven(maven: 'maven-3') {
        sh 'mvn clean package'
    }
}
