class Slikpose {
    int stykker

    def plus(Slikpose slikpose) {
        new Slikpose(stykker: this.stykker + slikpose.stykker)
    }

    def leftShift(int antal) {
        new Slikpose(stykker: this.stykker + antal)
    }
}


def pose = new Slikpose(stykker: 10)
def nypose = new Slikpose(stykker: 5)

def samlet = pose + nypose
assert samlet.stykker == 15

samlet = pose << 3
assert samlet.stykker == 13
