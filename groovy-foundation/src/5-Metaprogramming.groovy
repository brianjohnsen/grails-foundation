//every object has a metaclass
println "a string".metaClass
println 42.metaClass

//Add method to string
String.metaClass.methodMissing = { name, args ->
    if (name == 'gr8') {
        delegate += ' thats GR8!'
    }
}

println "Groovy".gr8()