class Duck {
    def quack() {
        println "I am a Duck"
    }
}

class Frog {
    def quack() {
        println "I am a Frog"
    }
}

quackers = [new Duck(), new Frog()]
for (q in quackers) {
    q.quack()
}