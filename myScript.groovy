def buildApp() {
    echo "Building..."
}

def testApp() {
    echo "Testing..."
}

def deployApp() {
    echo "Deploying..."
    echo "Deploying version: ${params.VERSION}"
    echo "Deploying with ${SERVER_CREDENTIALS}"

}

return this
