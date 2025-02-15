def list = [1, 2, 3, 4, 5]

// Correct way to get the transformed list
def doubledList = list.collect { it * 2 }
println doubledList // Output: [2, 4, 6, 8, 10]

//Alternative using each and a new list
def doubledList2 = []
list.each { doubledList2 << it * 2 }
println doubledList2 // Output: [2, 4, 6, 8, 10]