# Groovy 'each' Method Unexpected Null Return

This example demonstrates a common pitfall in Groovy when using the `each` method.  Many developers expect `each` to modify the original list in place and return the modified list. However, it actually returns `null` unless the result is explicitly assigned.

## Problem
The `each` method iterates through the elements of a collection and applies a closure, but does not return the modified collection. This can lead to unexpected `null` values if the output isn't handled correctly.

## Solution
To obtain the transformed collection, use `collect` or assign the result of the transformation to a new list.