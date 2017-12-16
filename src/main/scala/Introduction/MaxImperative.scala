/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
val values = List(2, 5, 3, 2, 4, 1)

var max = values(0)
for (val value <- values) {                 
  max = Math.max(max, value)  
}

println("Maximum is " + max)