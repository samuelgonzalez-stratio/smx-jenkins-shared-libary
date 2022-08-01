import smx.Util

def call() {
    println "Into the doSmux step.. [smx-jenkins-shared-library]"
    Util ut = new Util()
    echo "Sum 1 to 3 ="
    print ut.mySumOne(3)
}