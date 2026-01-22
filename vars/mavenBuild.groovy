def call(String dir = '.') {
    echo "Running Maven build in directory: ${dir}"

    dir(dir) {
        withMaven(maven: 'maven-3') {
            sh 'mvn clean package'
        }
    }
}
