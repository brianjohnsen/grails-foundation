//literals
def list = [1, 2, 3, 4]
def empty = []
assert list instanceof List
assert empty instanceof List

//methods
assert list.size() == 4
assert list.pop() == 4
assert list == [1, 2, 3]
assert list.sum() == 6

//lets play the name game...
def names = ['Johnny', 'Jens', 'Søren', 'Peter']
assert names.size() == 4
assert names.sort() == ['Jens', 'Johnny', 'Peter', 'Søren']

assert names.find { it.startsWith('P') } == 'Peter'

assert names.min() == 'Jens'
assert names.max() == 'Søren'
assert names.max { it.size() } == 'Johnny'

//add to list
names << 'Brian'
assert 'Brian' in names

//Maps
def beers = [carlsberg: 3, leffe: 4, chimay: 7]
assert beers instanceof Map
assert beers.size() == 3

//add new entries
beers.guinness = 2
assert beers.size() == 4
beers << ['erdinger': 6]
assert beers.size() == 5
println beers
println beers.sort()
println beers.sort { it.value }

