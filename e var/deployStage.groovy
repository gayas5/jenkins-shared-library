def call() {
    stage('Deploy') {
        echo "Deploy stage from Shared Library"
        sh 'sleep 3'
    }
}
