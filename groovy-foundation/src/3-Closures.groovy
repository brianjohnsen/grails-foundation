//blocks of code you can pass around
def sqrt = { x -> x * x }
assert sqrt instanceof Closure
5.times {
    println "The square of $it is ${sqrt(it)}"
}

println "-" * 30

//passing the closure to a method
def method(i, func) {
    func(i)
}

(5..10).each {
    println "The square of $it is ${method(it, sqrt)}"
}
