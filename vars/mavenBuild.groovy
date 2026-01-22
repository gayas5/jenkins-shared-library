def call() {
    echo "Building using Jenkins Maven Tool"

    withMaven(maven: 'maven-3') {
        sh 'mvn clean package'
    }
}
